package soccer;


import java.io.*;
import java.lang.Math;
import java.util.Map;
import java.util.HashMap;

import burlap.domain.stochasticgames.gridgame.GridGame; 
import burlap.oomdp.auxiliary.DomainGenerator;
import burlap.oomdp.core.*;
import burlap.oomdp.core.objects.MutableObjectInstance;
import burlap.oomdp.core.objects.ObjectInstance;
import burlap.oomdp.core.states.MutableState;
import burlap.oomdp.core.states.State;
import burlap.oomdp.stochasticgames.JointAction;
import burlap.oomdp.stochasticgames.JointReward;
import burlap.oomdp.stochasticgames.SGAgentType;
import burlap.oomdp.stochasticgames.SGDomain;
import burlap.oomdp.stochasticgames.agentactions.SimpleSGAgentAction;
import burlap.behavior.stochasticgames.madynamicprogramming.backupOperators.CorrelatedQ;
import burlap.behavior.stochasticgames.solvers.CorrelatedEquilibriumSolver;
import burlap.behavior.stochasticgames.solvers.CorrelatedEquilibriumSolver.CorrelatedEquilibriumObjective;
import burlap.oomdp.stochasticgames.SGAgentType;
import burlap.behavior.stochasticgames.madynamicprogramming.AgentQSourceMap.HashMapAgentQSourceMap;
import burlap.behavior.stochasticgames.madynamicprogramming.QSourceForSingleAgent.HashBackedQSource;
import burlap.oomdp.statehashing.SimpleHashableStateFactory;
import burlap.oomdp.statehashing.HashableStateFactory;
import burlap.behavior.valuefunction.ValueFunctionInitialization.ConstantValueFunctionInitialization;
import burlap.behavior.stochasticgames.madynamicprogramming.backupOperators.MaxQ;
import burlap.behavior.stochasticgames.madynamicprogramming.backupOperators.CoCoQ;
import burlap.behavior.stochasticgames.madynamicprogramming.backupOperators.MinMaxQ;
import burlap.oomdp.stochasticgames.World;
import burlap.behavior.stochasticgames.madynamicprogramming.dpplanners.MAValueIteration;
import burlap.behavior.stochasticgames.madynamicprogramming.policies.EGreedyMaxWellfare;
import burlap.behavior.stochasticgames.agents.madp.MultiAgentDPPlanningAgent;
import burlap.behavior.stochasticgames.agents.maql.MultiAgentQLearning;
import burlap.behavior.stochasticgames.GameAnalysis;
import burlap.behavior.stochasticgames.PolicyFromJointPolicy;
import burlap.debugtools.DPrint;
import burlap.behavior.stochasticgames.madynamicprogramming.*;
import burlap.behavior.stochasticgames.madynamicprogramming.JAQValue;


/**
 *
 * @author Jacob
 */
public class Soccer 
{
    GridGame gg;
    SGDomain d;
    State s;
    Map agentDefinitions;
    HashMapAgentQSourceMap qSourceMap;
    Map qSourceMapping;
    CorrelatedQ cq;
    String A = "agent0";
    String B = "agent1";
    HashableStateFactory hashingFactory;
    World w;
    double discount = 0.9;
    double learningRate = 0.001;
    double epsilon = 0.1;
    MultiAgentQLearning a0;
    MultiAgentQLearning a1;
    EGreedyMaxWellfare ja0;
    EGreedyMaxWellfare ja1;
    
    // Might need to override standardMechanics to account for soccer ball
    public Soccer()
    {
        gg = new GridGame();
        
        // Generate domain
        d = (SGDomain)gg.generateDomain();
        
        // Get hashing factory?
        hashingFactory = new SimpleHashableStateFactory();
        
        // Generate a clean state
        // The walls must include the boundary walls
        s = GridGame.getCleanState(d, 2, 4, 2, 2, 4, 2);
        
        // Init agents
        // A
        GridGame.setAgent(s, 0, 2, 1, 0);
        // B
        GridGame.setAgent(s, 1, 1, 1, 1);
        
        // Init goals
        GridGame.setGoal(s, 0, 0, 0, 0);
        GridGame.setGoal(s, 1, 0, 1, 0);
        GridGame.setGoal(s, 2, 4, 0, 1);
        GridGame.setGoal(s, 3, 4, 1, 1);
        
        // Set up boundary walls    
        GridGame.setBoundaryWalls(s, 4, 2);
        
        // I think everything up until now is good
        
        HashMap goals = new HashMap<Integer, Double>();
        goals.put(0, 100.0);
        goals.put(1, 100.0);
        JointReward rf = new GridGame.GGJointRewardFunction(d, 0, 0, false, goals);
        TerminalFunction tf = new GridGame.GGTerminalFunction(d);
        SGAgentType at = GridGame.getStandardGridGameAgentType(d);
        
        w = new World(d, rf, tf, s);
        
        double defaultQ = 100;
                
        // Correlated Q learner
        cq = new CorrelatedQ(CorrelatedEquilibriumSolver.CorrelatedEquilibriumObjective.UTILITARIAN);
        
        a0 = new MultiAgentQLearning(d, discount, learningRate, hashingFactory, defaultQ, cq, true);
        a1 = new MultiAgentQLearning(d, discount, learningRate, hashingFactory, defaultQ, cq, true);
            
        a0.joinWorld(w, at);
        a1.joinWorld(w, at);
        
        // Define the policy
        //set their policies to be a epsilon greedy maxwelfare (which CoCo-Q uses) policy over the joint actions
        //with ties broken randomly
        ja0 = new EGreedyMaxWellfare(a0, epsilon);
        ja1 = new EGreedyMaxWellfare(a1, epsilon);
        ja0.setBreakTiesRandomly(true);
        ja1.setBreakTiesRandomly(true);

        a0.setLearningPolicy(new PolicyFromJointPolicy(a0.getAgentName(), ja0));
        a1.setLearningPolicy(new PolicyFromJointPolicy(a1.getAgentName(), ja1));
        
        
        //don't have the world print out debug info (comment out if you want to see it!)
        DPrint.toggleCode(w.getDebugId(), false);
        // How do I set up soccer ball dynamics?
        // I think I want to put it in the transition dynamics
        // Player B starts with ball always. If collision with Player A
        // and A is stationary, ball switches to A. Just have boolean flag
        // for whether player has ball or not
        
        // Will also need to modify reward and terminal functions to account for
        // whether player has ball or not
    }
    
    private void playSoccer()
    {
        // Take world and run game
        int ngames = 1000;
        for(int i = 0; i < ngames; i++)
        {
            GameAnalysis ga = w.runGame();
            JointAction ja = w.getLastJointAction();
            QSourceForSingleAgent q_a0 = a0.getMyQSource();
            JAQValue jaq_a0 = q_a0.getQValueFor(s, ja);
            System.out.println(jaq_a0.q);
            //System.out.println(ga.maxTimeStep());
        }
        
        // Try using evaluateBehavior from EGreedyMaxWellfare for Q values....
        
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // Create instance of Soccer game
        
        // Learn game with Correlated Q
        
        Soccer futbol = new Soccer();  
        
        futbol.playSoccer();
    }
    
    
    // Implement 4 different learners
    // Correlated Q
    // Friend Q
    // Foe Q
    // Q learning (for multi-agent scenario)
}
