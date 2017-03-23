package opt.test;

import java.util.Arrays;
import java.lang.*;
import java.io.*;

import dist.DiscreteDependencyTree;
import dist.DiscreteUniformDistribution;
import dist.Distribution;

import opt.DiscreteChangeOneNeighbor;
import opt.EvaluationFunction;
import opt.GenericHillClimbingProblem;
import opt.HillClimbingProblem;
import opt.NeighborFunction;
import opt.RandomizedHillClimbing;
import opt.SimulatedAnnealing;
import opt.example.*;
import opt.ga.CrossoverFunction;
import opt.ga.DiscreteChangeOneMutation;
import opt.ga.SingleCrossOver;
import opt.ga.GenericGeneticAlgorithmProblem;
import opt.ga.GeneticAlgorithmProblem;
import opt.ga.MutationFunction;
import opt.ga.StandardGeneticAlgorithm;
import opt.prob.GenericProbabilisticOptimizationProblem;
import opt.prob.MIMIC;
import opt.prob.ProbabilisticOptimizationProblem;
import shared.FixedIterationTrainer;

/**
 * Copied from ContinuousPeaksTest
 * @version 1.0
 */
public class FitnessFunctionTest {
    /** The n value */
    private static final int N = 50;
    
    public static void main(String[] args) {
        int[] ranges = new int[N];
        Arrays.fill(ranges, 2);
        EvaluationFunction ef = new JRKFitnessFunctionFour();
        Distribution odd = new DiscreteUniformDistribution(ranges);
        NeighborFunction nf = new DiscreteChangeOneNeighbor(ranges);
        MutationFunction mf = new DiscreteChangeOneMutation(ranges);
        CrossoverFunction cf = new SingleCrossOver();
        Distribution df = new DiscreteDependencyTree(.1, ranges); 
        HillClimbingProblem hcp = new GenericHillClimbingProblem(ef, odd, nf);
        GeneticAlgorithmProblem gap = new GenericGeneticAlgorithmProblem(ef, odd, mf, cf);
        ProbabilisticOptimizationProblem pop = new GenericProbabilisticOptimizationProblem(ef, odd, df);
		
		// Open files for writing
        try
		{
			File SAfile = new File("SA_fitness.txt");
			File GAfile = new File("GA_fitness.txt");
			File MIMICfile = new File("MIMIC_fitness.txt");
			
			BufferedWriter SAfileoutput = new BufferedWriter(new FileWriter(SAfile));
			BufferedWriter GAfileoutput = new BufferedWriter(new FileWriter(GAfile));
			BufferedWriter MIMICfileoutput = new BufferedWriter(new FileWriter(MIMICfile));
		
			int numOfRuns = 50;
			for(int count=0; count < numOfRuns; count++)
			{    
				long startTime, stopTime;
				
				// SIMULATED ANNEALING
				int iterations = 1000;
				SimulatedAnnealing sa = new SimulatedAnnealing(1E11, .95, hcp);
				do {
					iterations += 1000;
					FixedIterationTrainer fit = new FixedIterationTrainer(sa, iterations);
					startTime = System.nanoTime();
					fit.train();
					stopTime = System.nanoTime();
					System.out.println("Iterations: " + iterations + " SA: " + ef.value(sa.getOptimal()) + " Time: " + (stopTime-startTime));	
				}while(ef.value(sa.getOptimal()) < 2*N && iterations < 75000 );
				SAfileoutput.write(iterations + ", " + (stopTime-startTime));
				SAfileoutput.newLine();
				
				// GENETIC ALGORITHM
				iterations = 0;
				StandardGeneticAlgorithm ga = new StandardGeneticAlgorithm(4*N, 3*N, N/2, gap);
				do{
					iterations +=1000;
					FixedIterationTrainer fit = new FixedIterationTrainer(ga, iterations);
					startTime = System.nanoTime();
					fit.train();
					stopTime = System.nanoTime();
					System.out.println("Iterations: " + iterations + " GA: " + ef.value(ga.getOptimal()) + " Time: " + (stopTime-startTime));
				}while(ef.value(ga.getOptimal()) < 2*N && iterations < 50000);
				GAfileoutput.write(iterations + ", " + (stopTime-startTime));
				GAfileoutput.newLine();
				
				// MIMIC
				iterations = 0;
				MIMIC mimic = new MIMIC(N, N/5, pop);
				do{	
					iterations+=10;
					FixedIterationTrainer fit = new FixedIterationTrainer(mimic, iterations);
					startTime = System.nanoTime();
					fit.train();
					stopTime = System.nanoTime();
					System.out.println("Iterations: " + iterations + " MIMIC: " + ef.value(mimic.getOptimal()) + " Time: " + (stopTime-startTime));
				}while(ef.value(mimic.getOptimal()) < 2*N && iterations < 1000);
				MIMICfileoutput.write(iterations + ", " + (stopTime-startTime));
				MIMICfileoutput.newLine();		
			}
			SAfileoutput.close();
			GAfileoutput.close();
			MIMICfileoutput.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
