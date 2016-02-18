import java.util.List;
import java.util.Map;
import java.io.*;
import java.lang.Math;

import burlap.behavior.singleagent.planning.stochastic.valueiteration.ValueIteration;
import burlap.oomdp.statehashing.DiscretizingHashableStateFactory;
import burlap.oomdp.statehashing.HashableState;
import burlap.oomdp.core.states.MutableState;
import burlap.domain.singleagent.graphdefined.GraphDefinedDomain;
import burlap.oomdp.auxiliary.DomainGenerator;
import burlap.oomdp.auxiliary.common.NullTermination;
import burlap.domain.singleagent.graphdefined.GraphTF;
import burlap.oomdp.core.*;
import burlap.oomdp.singleagent.GroundedAction;
import burlap.oomdp.singleagent.RewardFunction;
import burlap.domain.singleagent.graphdefined.GraphRF;
// TDLamba is a critic for the actorCritic stuff. I am guessing that
// my BoundedRandomWalk class will be what the actor uses
import burlap.behavior.singleagent.learning.actorcritic.critics.TDLambda;
import burlap.behavior.singleagent.learning.actorcritic.actor.BoltzmannActor;
import burlap.behavior.singleagent.learning.actorcritic.ActorCritic;

// implement ActorCritic class and then run planFromState

public class BoundedRandomWalk
{
    DomainGenerator          dg;
    Domain                   domain;
    MutableState            initState;
    BRWRewardFunction        rf;
    TerminalFunction         tf;
    DiscretizingHashableStateFactory hashFactory;
    BoltzmannActor           boltActor;
    TDLambda                 tdl;
    ActorCritic              ac;
    
    MutableState[] states;
        
    int numStates;
    double[] stateValues;
    double gamma;
    double lr;
    double lambda;
    
    public static void main(String[] args)
    {
        double[] lambdas = new double[7];
        lambdas[0] = 0.0;
        lambdas[1] = 0.1;
        lambdas[2] = 0.3;
        lambdas[3] = 0.5;
        lambdas[4] = 0.7;
        lambdas[5] = 0.9;
        lambdas[6] = 1.0;
        
        BoundedRandomWalk.Experiment1(lambdas);
        
        BoundedRandomWalk.Experiment2(lambdas);
        
    }
    
    
    public BoundedRandomWalk( double gamma, double learningRate, double lamda, int numEpisodes )
    {
        // Bounded random walk to be modelled:
        //                        Start here 
        //                             |
        //  A  <-->  B  <-->  C  <-->  D  <-->  E  <-->  F  <-->  G
        //  0        1        2        3        4        5        6
        //
        // There is a 50% chance of moving in either direction
        // Terminal state A has an outcome of 0
        // Terminal state G has an outcome of 1
        // Values for non terminal states in order are
        // 1/6, 1/3, 1/2, 2/3, 5/6
        // Use these for error calculations
        stateValues = new double[7];
        stateValues[0] = 0.0;
        stateValues[1] = 1.0/6.0;
        stateValues[2] = 1.0/3.0;
        stateValues[3] = 1.0/2.0;
        stateValues[4] = 2.0/3.0;
        stateValues[5] = 5.0/6.0;
        stateValues[6] = 1.0;
              
                				
        // Create new domain generator
        numStates = 7;        
        this.dg = new GraphDefinedDomain(numStates);
        
        // Define new transitions
        // SetTransition(startState, actionID, destination state, probability)
        //Actions from state 0
        ((GraphDefinedDomain)this.dg).setTransition( 0, 0, 0, 1.0);
                
        //Actions from state 1
        ((GraphDefinedDomain)this.dg).setTransition( 1, 0, 0, 0.5);
        ((GraphDefinedDomain)this.dg).setTransition( 1, 0, 2, 0.5);
        
        //Actions from state 2
        ((GraphDefinedDomain)this.dg).setTransition( 2, 0, 1, 0.5);
        ((GraphDefinedDomain)this.dg).setTransition( 2, 0, 3, 0.5);
        
        //Actions from state 3
        ((GraphDefinedDomain)this.dg).setTransition( 3, 0, 2, 0.5);
        ((GraphDefinedDomain)this.dg).setTransition( 3, 0, 4, 0.5);
        //Actions from state 4
        ((GraphDefinedDomain)this.dg).setTransition( 4, 0, 3, 0.5);
        ((GraphDefinedDomain)this.dg).setTransition( 4, 0, 5, 0.5);
        //Actions from state 5
        ((GraphDefinedDomain)this.dg).setTransition( 5, 0, 4, 0.5);
        ((GraphDefinedDomain)this.dg).setTransition( 5, 0, 6, 0.5);
        //Actions from state 6
        ((GraphDefinedDomain)this.dg).setTransition( 6, 0, 6, 1.0);
                
        // Create actual domain
        this.domain = this.dg.generateDomain();        
        this.initState = (MutableState)GraphDefinedDomain.getState(this.domain, 3); // Initial state is the middle one
        states = new MutableState[7];
        states[0] = (MutableState)GraphDefinedDomain.getState(this.domain, 0);
        states[1] = (MutableState)GraphDefinedDomain.getState(this.domain, 1);
        states[2] = (MutableState)GraphDefinedDomain.getState(this.domain, 2);
        states[3] = (MutableState)GraphDefinedDomain.getState(this.domain, 3);
        states[4] = (MutableState)GraphDefinedDomain.getState(this.domain, 4);
        states[5] = (MutableState)GraphDefinedDomain.getState(this.domain, 5);
        states[6] = (MutableState)GraphDefinedDomain.getState(this.domain, 6);
        
        // Define reward function, terminal states, and state hash factory
        this.rf = new BRWRewardFunction();
        this.tf = new GraphTF(0, 6);        
        this.hashFactory = new DiscretizingHashableStateFactory(2.5); // Not sure what this value does
                        
        // Set up TD Lambda
        this.gamma = gamma;
        this.lr = learningRate;
        this.lambda = lambda;
        double vinit = 0.5;
        this.tdl = new TDLambda(this.rf, this.tf, this.gamma, this.hashFactory, this.lr, vinit, this.lambda);
        
        // Set up actor
        this.boltActor = new BoltzmannActor( this.domain, this.hashFactory, this.lr );
        
        // Set up actor/critic
        this.ac = new ActorCritic(this.domain, this.gamma, this.boltActor, this.tdl );
        this.ac.initializeForPlanning(this.rf, this.tf, numEpisodes);
    }
    
    public static class BRWRewardFunction extends GraphRF
    {
        int ts1 = 0;
        int ts2 = 6;
                     
        // Implement reward method
        public double reward(int s, int a, int sprime)
        {
           double r = 0.0;
            
            if(sprime == ts2)
            {
                r = 1.0;
            }
            
            return r;
        }
    }    
    
    
    private static void Experiment1(double[] lambdas)
    {
        double[] oldVal = new double[5];
        double[] newVal = new double[5];
        
        double gamma = 0.7;
        double learning_rate = 0.1;
        int numberOfEpisodes = 10;
        
        PrintWriter writer;
        
        oldVal[0] = 0.0;
        oldVal[1] = 0.0;
        oldVal[2] = 0.0;
        oldVal[3] = 0.0;
        oldVal[4] = 0.0;
        
        newVal[0] = 0.5;
        newVal[1] = 0.5;
        newVal[2] = 0.5;
        newVal[3] = 0.5;
        newVal[4] = 0.5;
        
        try
        {
            writer = new PrintWriter("Experiment1Output.txt", "UTF-8");
            
            // For each value of lambda
            for(int l_index=0; l_index <7; l_index++)
            {
                double error_sum = 0.0;
                
                // For 100 training sets
                for(int i=0; i<100; i++)
                {
                    // Create a new bounded random walk with the given value of lambda and using number of episodes set to 10
                    // (10 sequences at a time, then update weights)
                    BoundedRandomWalk brw = new BoundedRandomWalk(gamma, learning_rate, lambdas[l_index], numberOfEpisodes);
                    
                    // Apply training set until convergence
                    /* 
                    TODO
                    Most of this code is correct. I go over all the lambdas for 100 training sets. The problem is that I do not have a 
                    actual static training sets. I simply use "plan from state" which I am not really sure how it works. I think I need to 
                    generate a static training set to use for all cases. As it stands right now I get basically the same values no matter what
                    my value for lambda is. They all converge to about the same error
                    */
                    do
                    {
                        oldVal[0] = newVal[0]; oldVal[1] = newVal[1]; oldVal[2] = newVal[2];
                        oldVal[3] = newVal[3]; oldVal[4] = newVal[4];
                        
                        brw.ac.planFromState(brw.initState);
                        
                        newVal[0] = brw.tdl.value(brw.states[1]);
                        newVal[1] = brw.tdl.value(brw.states[2]);
                        newVal[2] = brw.tdl.value(brw.states[3]);
                        newVal[3] = brw.tdl.value(brw.states[1]);
                        newVal[4] = brw.tdl.value(brw.states[5]);
                        
                    } while(brw.stateValueDifferences(oldVal, newVal) > 0.01);
                    
                    // Save RMS error as running sum
                    error_sum += brw.computeRMSError(newVal);
                    
                    // Reset old value
                    oldVal[0] = 0.0;
                    oldVal[1] = 0.0;
                    oldVal[2] = 0.0;
                    oldVal[3] = 0.0;
                    oldVal[4] = 0.0;
                    
                    // Resetting the BoundedRandomWalk is not necessary since I create a new one for each training set
                }
                
                // Save average RMS error to file
                writer.println( lambdas[l_index] + "," + error_sum/100.0);
            }
            writer.close();
        }
        catch(Exception ex)
        {
            System.out.println("Exception!");
        }
    }
    
    private double stateValueDifferences( double[] oldVal, double[] newVal )
    {
        // Use RMS here to compute differences between the weights as a whole
        double[] diff = new double[5];
        
        diff[0] = java.lang.Math.pow(oldVal[0] - newVal[0], 2);
        diff[1] = java.lang.Math.pow(oldVal[1] - newVal[1], 2);
        diff[2] = java.lang.Math.pow(oldVal[2] - newVal[2], 2);
        diff[3] = java.lang.Math.pow(oldVal[3] - newVal[3], 2);
        diff[4] = java.lang.Math.pow(oldVal[4] - newVal[4], 2);
        
        double diff_sum = diff[0] + diff[1] + diff[2] + diff[3] + diff[4];
        
        return java.lang.Math.pow(diff_sum, 0.5);
    }
    
    private double computeRMSError(double[] computedStateVals )
    {
        double[] diff = new double[5];
        
        diff[0] = java.lang.Math.pow(computedStateVals[0] - this.stateValues[1], 2);
        diff[1] = java.lang.Math.pow(computedStateVals[1] - this.stateValues[2], 2);
        diff[2] = java.lang.Math.pow(computedStateVals[2] - this.stateValues[3], 2);
        diff[3] = java.lang.Math.pow(computedStateVals[3] - this.stateValues[4], 2);
        diff[4] = java.lang.Math.pow(computedStateVals[4] - this.stateValues[5], 2);
        
        double diff_sum = diff[0] + diff[1] + diff[2] + diff[3] + diff[4];
        
        return java.lang.Math.pow(diff_sum, 0.5);
    }
    
    public static void Experiment2(double[] lambdas)
    {
        double gamma = 0.7;
        int numberOfEpisodes = 1;
        try
        {
            PrintWriter writer = new PrintWriter("Experiment2Output.txt", "UTF-8");
            
            for(int lambda_idx=0; lambda_idx < 7; lambda_idx++)
            {
                for(double learning_rate=0.1; learning_rate <= 0.7; learning_rate+= 0.1)
                {
                    // Keep track of RMS error for this combo of lambda and learning rate
                    double error_sum = 0.0;
                    
                    // For each of 100 training sets
                    for(int i=0; i<100; i++)
                    {
                        // Create a new bounded random walk object
                        BoundedRandomWalk brw = new BoundedRandomWalk(gamma, learning_rate, lambdas[lambda_idx], numberOfEpisodes);
                        
                        // For each training set of 10 sequences
                        for(int j=0; j<10; j++)
                        {
                            // Run the sequence (episode) and update the weights
                            brw.ac.planFromState(brw.initState);
                        }
                        
                        // Get state values
                        double[] computedStateVals = new double[5];
                        computedStateVals[0] = brw.tdl.value(brw.states[1]);
                        computedStateVals[1] = brw.tdl.value(brw.states[2]);
                        computedStateVals[2] = brw.tdl.value(brw.states[3]);
                        computedStateVals[3] = brw.tdl.value(brw.states[4]);
                        computedStateVals[4] = brw.tdl.value(brw.states[5]);
                        
                        // Find the RMS error of this training set (of 10 sequences)                        
                        // Add to running sum
                        error_sum += brw.computeRMSError(computedStateVals);
                    }
                    
                    // Compute average error                    
                    // Save average error to file
                    writer.println( lambdas[lambda_idx] + "," + learning_rate + "," + error_sum/100.0);
                }
                
            }
            
            writer.close();
        }
        catch(Exception ex)
        {
            System.out.println("Exception!");
        }
        
        
    }
    

    
    // 100 training sets, each with 10 sequences
    // Is each sequence a path through the random walk? So I need 1000 sequences?
    // Maybe more like 2 loops. Outer one is 100, inner one is 10. For each value of lambda, run 100 iterations with 10 sequences in
    // each iteration
    
    // Experiment 1
    // For figure 3, weights (i.e., state values) were not updated until the entire training set (of 10 sequences) was presented. 
    // Each training set was presented repeatedly until the procedure no longer produced any significant changes to the weight vector
    // "Repeated presentations" paradigm
    
    
    // Experiment 2, figure 4
    // Concerns question of learning rate when training set is presented only once (not repeatedly until convergence)
    // Training set presented only once
    // Weights updated after each sequence, not at the end of each training set
    // 100 training sets
    // A range of learning rates (alpha) were used
    // All weights (state values) were started with 0.5 to avoid bias
    // lambda = same as above (0.0, 0.1, 0.3, 0.5, 0.7, 0.9, 1.0)
    // alpha = increments of 0.02 starting at 0.1 to 0.7
    
    // Experiment 3, figure 5
    // Best error level for each lambda value (uses optimal learning rate alpha)
    // Use alphas from Figure 4 for each of the prior lambdas
    // So experiment 4 should output the best alpha for each lambda
    // This experiment just re-displays those results
    
}