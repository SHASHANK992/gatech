package opt.test;

import dist.*;
import opt.*;
import opt.example.*;
import opt.ga.*;
import shared.*;
import func.nn.backprop.*;

import java.util.*;
import java.io.*;
import java.text.*;

/**
 * Implementation of randomized hill climbing, simulated annealing, and genetic algorithm to
 * find optimal weights to a neural network that is classifying whether a bank note is authentic
 * or not
 *
 * @author Jacob Kilver
 * @version 1.0
 */
public class NNTest {
    private static Instance[] instances = initializeInstances();

    private static int inputLayer = 7, hiddenLayer = 2, outputLayer = 1, maxTrainingIterations = 500, trainingIterations=0;
    private static BackPropagationNetworkFactory factory = new BackPropagationNetworkFactory();
    
    private static ErrorMeasure measure = new SumOfSquaresError();

    private static DataSet set = new DataSet(instances);

    private static BackPropagationNetwork networks[] = new BackPropagationNetwork[3];
    private static NeuralNetworkOptimizationProblem[] nnop = new NeuralNetworkOptimizationProblem[3];

    private static OptimizationAlgorithm[] oa = new OptimizationAlgorithm[3];
    private static String[] oaNames = {"RHC", "SA", "GA"};
    private static String results = "";

    private static DecimalFormat df = new DecimalFormat("0.000");

    public static void main(String[] args) {	
        for(int i = 0; i < oa.length; i++) {
            networks[i] = factory.createClassificationNetwork(
                new int[] {inputLayer, hiddenLayer, outputLayer});
            nnop[i] = new NeuralNetworkOptimizationProblem(set, networks[i], measure);
        }

        oa[0] = new RandomizedHillClimbing(nnop[0]);
        oa[1] = new SimulatedAnnealing(1E11, .95, nnop[1]);
        oa[2] = new StandardGeneticAlgorithm(200, 100, 10, nnop[2]);

		// for each algorithm of the three algorithms
		for(int i = 0; i < oa.length; i++) {
			try {
				// Open file to save results
				String filename = oaNames[i] + "_results.txt";
				File resultsFile = new File(filename);
				BufferedWriter fileoutput = new BufferedWriter(new FileWriter(resultsFile));
				
				System.out.println(oaNames[i]);
				
				// Train until no classification errors, but have a number of runs to average it out
				for(int run=0; run < 25; run++)
				{
					if(i==0)
					{
						oa[0] = new RandomizedHillClimbing(nnop[0]);
					}
					else if(i==1)
					{
						oa[1] = new SimulatedAnnealing(1E11, .95, nnop[1]);
					}
					else if(i==2)
					{
						oa[2] = new StandardGeneticAlgorithm(200, 100, 10, nnop[2]);
					}
				
					System.out.println("***********Run: " + run + "*******************");
					double correct = 0, incorrect = 0, trainingTime, testingTime;
					trainingIterations=0;
					BackPropagationNetwork neuralNetwork = new BackPropagationNetwork();
					neuralNetwork = factory.createClassificationNetwork(new int[] {inputLayer, hiddenLayer, outputLayer});
					
					do{
						trainingIterations+=10;
						System.out.println("Iterations: " + trainingIterations);
						
						double start = System.nanoTime(), end;
						correct = 0;
						incorrect = 0;
						train(oa[i], neuralNetwork, oaNames[i]); //trainer.train();
						end = System.nanoTime();
						trainingTime = end - start;
						trainingTime /= Math.pow(10,9);

						Instance optimalInstance = oa[i].getOptimal();
						neuralNetwork.setWeights(optimalInstance.getData());

						double predicted, actual;
						start = System.nanoTime();
						for(int j = 0; j < instances.length; j++) {
							neuralNetwork.setInputValues(instances[j].getData());
							neuralNetwork.run();

							predicted = Double.parseDouble(instances[j].getLabel().toString());
							actual = Double.parseDouble(neuralNetwork.getOutputValues().toString());

							double trash = Math.abs(predicted - actual) < 0.5 ? correct++ : incorrect++;

						}
						end = System.nanoTime();
						testingTime = end - start;
						testingTime /= Math.pow(10,9);
					} while (incorrect != 0 && trainingIterations <= maxTrainingIterations);

					results =  "\nResults for " + oaNames[i] + ": \nCorrectly classified " + correct + " instances." +
								"\nIncorrectly classified " + incorrect + " instances.\nPercent correctly classified: "
								+ df.format(correct/(correct+incorrect)*100) + "%\nTraining time: " + df.format(trainingTime)
								+ " seconds\nTesting time: " + df.format(testingTime) + " seconds\n Iterations: " + trainingIterations;
					System.out.println(results);
					
					// Save results to file				
					fileoutput.write(trainingIterations + ", " + trainingTime + ", " + testingTime + ", " + df.format(incorrect/(correct+incorrect)*100));
					fileoutput.newLine();
				}
				fileoutput.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
    }

    private static void train(OptimizationAlgorithm oa, BackPropagationNetwork network, String oaName) {
        //System.out.println("\nError results for " + oaName + "\n---------------------------");
		for(int i = 0; i < trainingIterations; i++) {
			oa.train();

			double error = 0;
			for(int j = 0; j < instances.length; j++) {
				network.setInputValues(instances[j].getData());
				network.run();

				Instance output = instances[j].getLabel(), example = new Instance(network.getOutputValues());
				example.setLabel(new Instance(Double.parseDouble(network.getOutputValues().toString())));
				error += measure.value(output, example);
			}

			//System.out.println("Error = " + df.format(error));
		}
    }

    private static Instance[] initializeInstances() {

        double[][][] attributes = new double[1372][][];

        try {
            BufferedReader br = new BufferedReader(new FileReader(new File("src/opt/test/data_banknote_authentication.txt")));

            for(int i = 0; i < attributes.length; i++) {
                Scanner scan = new Scanner(br.readLine());
                scan.useDelimiter(",");

                attributes[i] = new double[2][];
                attributes[i][0] = new double[4]; // 4 attributes
                attributes[i][1] = new double[1];

                for(int j = 0; j < 4; j++)
                    attributes[i][0][j] = Double.parseDouble(scan.next());

                attributes[i][1][0] = Double.parseDouble(scan.next());
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }

        Instance[] instances = new Instance[attributes.length];

        for(int i = 0; i < instances.length; i++) {
            instances[i] = new Instance(attributes[i][0]);
            // classifications range from 0 to 30; split into 0 - 14 and 15 - 30
            instances[i].setLabel(new Instance(attributes[i][1][0] == 0 ? 0 : 1));
        }

        return instances;
    }
}
