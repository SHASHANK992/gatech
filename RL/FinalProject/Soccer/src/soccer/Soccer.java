/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import burlap.behavior.valuefunction.ValueFunctionInitialization.ConstantValueFunctionInitialization;
import burlap.behavior.stochasticgames.madynamicprogramming.backupOperators.MaxQ;
import burlap.behavior.stochasticgames.madynamicprogramming.backupOperators.CoCoQ;
import burlap.behavior.stochasticgames.madynamicprogramming.backupOperators.MinMaxQ;

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
    
    // Might need to override standardMechanics to account for soccer ball
    public Soccer()
    {
        gg = new GridGame();
        
        // Generate domain
        d = (SGDomain)gg.generateDomain();
        
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
        
        // For Corr Q learning
        // Agent map
        agentDefinitions = new HashMap<String, SGAgentType>();
        agentDefinitions.put(A, GridGame.getStandardGridGameAgentType(d));
        agentDefinitions.put(B, GridGame.getStandardGridGameAgentType(d));
        
        // Q value map
        qSourceMapping = new HashMap<String, HashBackedQSource>();
        qSourceMapping.put(A, new HashBackedQSource(new SimpleHashableStateFactory(), new ConstantValueFunctionInitialization()));
        qSourceMapping.put(B, new HashBackedQSource(new SimpleHashableStateFactory(), new ConstantValueFunctionInitialization()));
        
        qSourceMap = new HashMapAgentQSourceMap(qSourceMapping);
        
        // Correlated Q learner
        cq = new CorrelatedQ(CorrelatedEquilibriumSolver.CorrelatedEquilibriumObjective.UTILITARIAN);
        
        // How do I set up soccer ball dynamics?
        // I think I want to put it in the transition dynamics
        // Player B starts with ball always. If collision with Player A
        // and A is stationary, ball switches to A. Just have boolean flag
        // for whether player has ball or not
        
        // Will also need to modify reward and terminal functions to account for
        // whether player has ball or not
    }
    
    private double solveCorrQ()
    {
        double val = 0.0;
        //val = cq.performBackup(s, A, agentDefinitions, qSourceMap);
        
        //MaxQ mq = new MaxQ();
        //val = mq.performBackup(s, A, agentDefinitions, qSourceMap);
        
        //CoCoQ ccq = new CoCoQ();
        //val = ccq.performBackup(s, A, agentDefinitions, qSourceMap);
        
        MinMaxQ mmq = new MinMaxQ();
        val = mmq.performBackup(s, A, agentDefinitions, qSourceMap);
        
        return val;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // Create instance of Soccer game
        
        // Learn game with Correlated Q
        
        // Learn game with 
        System.out.println("hello");
        
        //GridGame.main(args);
        
        Soccer futbol = new Soccer();  
        
        System.out.println(futbol.solveCorrQ());
        System.out.println(futbol.solveCorrQ());
    }
    
    
    // Implement 4 different learners
    // Correlated Q
    // Friend Q
    // Foe Q
    // Q learning (for multi-agent scenario)
}
