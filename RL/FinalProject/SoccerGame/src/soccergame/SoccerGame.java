package soccergame;

import java.io.*;
import java.util.Map;
import java.util.HashMap;

import soccergame.SoccerGridGame;
import soccergame.SoccerGameMechanics;
import burlap.oomdp.core.*;
import burlap.oomdp.stochasticgames.SGDomain;
import burlap.oomdp.core.states.State;
import burlap.oomdp.stochasticgames.JointReward;
import burlap.oomdp.stochasticgames.JointAction;
import burlap.behavior.stochasticgames.madynamicprogramming.backupOperators.MaxQ;
import burlap.behavior.stochasticgames.madynamicprogramming.backupOperators.CoCoQ;
import burlap.behavior.stochasticgames.madynamicprogramming.backupOperators.MinMaxQ;
import burlap.behavior.stochasticgames.solvers.CorrelatedEquilibriumSolver;
import burlap.behavior.stochasticgames.solvers.CorrelatedEquilibriumSolver.CorrelatedEquilibriumObjective;
import burlap.behavior.stochasticgames.madynamicprogramming.policies.ECorrelatedQJointPolicy;
import burlap.behavior.stochasticgames.madynamicprogramming.policies.EMinMaxPolicy;
import burlap.behavior.stochasticgames.madynamicprogramming.policies.EGreedyJointPolicy;
import burlap.behavior.stochasticgames.madynamicprogramming.policies.EGreedyMaxWellfare;
import burlap.oomdp.stochasticgames.World;
import burlap.oomdp.statehashing.HashableStateFactory;
import burlap.behavior.stochasticgames.madynamicprogramming.backupOperators.CorrelatedQ;
import burlap.behavior.stochasticgames.madynamicprogramming.backupOperators.MaxQ;
import burlap.behavior.stochasticgames.madynamicprogramming.backupOperators.MinMaxQ;
import burlap.behavior.stochasticgames.madynamicprogramming.*;
import burlap.behavior.stochasticgames.agents.maql.MultiAgentQLearning;
import burlap.oomdp.statehashing.SimpleHashableStateFactory;
import burlap.behavior.stochasticgames.PolicyFromJointPolicy;
import burlap.oomdp.stochasticgames.SGAgentType;
import burlap.behavior.stochasticgames.GameAnalysis;
import burlap.behavior.stochasticgames.madynamicprogramming.*;
import burlap.oomdp.core.objects.ObjectInstance;
import burlap.oomdp.stochasticgames.agentactions.SimpleSGAgentAction;
import burlap.oomdp.stochasticgames.agentactions.SimpleGroundedSGAgentAction;
import burlap.oomdp.stochasticgames.agentactions.GroundedSGAgentAction;
import burlap.behavior.learningrate.*;
import burlap.behavior.learningrate.ExponentialDecayLR;
import burlap.behavior.valuefunction.ValueFunctionInitialization.ConstantValueFunctionInitialization;
import burlap.debugtools.DPrint;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jacob
 */
public class SoccerGame {

    SoccerGridGame soccerGridGame;
    SGDomain d;
    State s;
    JointReward rf;
    TerminalFunction tf;
    String A = "agent0";
    String B = "agent1";
    World w;
    HashableStateFactory hashingFactory;
    double discount = 0.9;
    double learningRate = 0.05;
    LearningRate LR;
    double epsilon = 0.5;
    ConstantValueFunctionInitialization vInit;

    MultiAgentQLearning a0;
    MultiAgentQLearning a1;
    ObjectInstance agent0;
    ObjectInstance agent1;

    public SoccerGame(String learner) {
        LR = new ExponentialDecayLR(learningRate, 0.99); 
        
        soccerGridGame = new SoccerGridGame();

        d = (SGDomain) soccerGridGame.generateDomain();

        // Get hashing factory?
        hashingFactory = new SimpleHashableStateFactory();

        // Generate a clean state
        s = SoccerGridGame.getCleanState(d, 2, 4, 2, 2, 4, 2);

        // Init agents
        // A
        SoccerGridGame.setAgent(s, 0, 2, 1, 0, false);
        // B
        SoccerGridGame.setAgent(s, 1, 1, 1, 1, true);

        // Init goals
        SoccerGridGame.setGoal(s, 0, 0, 0, 0);
        SoccerGridGame.setGoal(s, 1, 0, 1, 0);
        SoccerGridGame.setGoal(s, 2, 3, 0, 1);
        SoccerGridGame.setGoal(s, 3, 3, 1, 1);

        HashMap goals = new HashMap<Integer, Double>();
        goals.put(0, 100.0);
        goals.put(1, 100.0);

        rf = new SoccerGridGame.SGGJointRewardFunction(d, 0, false, goals);
        tf = new SoccerGridGame.SGGTerminalFunction(d);
        SGAgentType at = SoccerGridGame.getStandardGridGameAgentType(d);

        w = new World(d, rf, tf, s);

        double defaultQ = -100.0;
        vInit = new ConstantValueFunctionInitialization(defaultQ);

        if (learner.equals("CorrQ")) {
            // Correlated Q learner
            CorrelatedQ cq = new CorrelatedQ(CorrelatedEquilibriumSolver.CorrelatedEquilibriumObjective.UTILITARIAN);

            // Agents
            //a0 = new MultiAgentQLearning(d, discount, learningRate, hashingFactory, defaultQ, cq, false);
            //a1 = new MultiAgentQLearning(d, discount, learningRate, hashingFactory, defaultQ, cq, false);

            a0 = new MultiAgentQLearning(d, discount, LR, hashingFactory, vInit, cq, false);
            a1 = new MultiAgentQLearning(d, discount, LR, hashingFactory, vInit, cq, false);
            
            a0.joinWorld(w, at);
            a1.joinWorld(w, at);

            // Define the policy
            ECorrelatedQJointPolicy ja0 = new ECorrelatedQJointPolicy(CorrelatedEquilibriumSolver.CorrelatedEquilibriumObjective.UTILITARIAN, epsilon);
            ECorrelatedQJointPolicy ja1 = new ECorrelatedQJointPolicy(CorrelatedEquilibriumSolver.CorrelatedEquilibriumObjective.UTILITARIAN, epsilon);

            a0.setLearningPolicy(new PolicyFromJointPolicy(a0.getAgentName(), ja0));
            a1.setLearningPolicy(new PolicyFromJointPolicy(a1.getAgentName(), ja1));
        } else if (learner.equals("FriendQ")) {
            MaxQ mq = new MaxQ();

            //a0 = new MultiAgentQLearning(d, discount, learningRate, hashingFactory, defaultQ, mq, false);
            //a1 = new MultiAgentQLearning(d, discount, learningRate, hashingFactory, defaultQ, mq, false);
            
            a0 = new MultiAgentQLearning(d, discount, LR, hashingFactory, vInit, mq, false);
            a1 = new MultiAgentQLearning(d, discount, LR, hashingFactory, vInit, mq, false);

            a0.joinWorld(w, at);
            a1.joinWorld(w, at);

            // Define the policy
            EGreedyJointPolicy ja0 = new EGreedyJointPolicy(a0, epsilon);
            EGreedyJointPolicy ja1 = new EGreedyJointPolicy(a1, epsilon);

            a0.setLearningPolicy(new PolicyFromJointPolicy(a0.getAgentName(), ja0));
            a1.setLearningPolicy(new PolicyFromJointPolicy(a1.getAgentName(), ja1));
        } else if (learner.equals("FoeQ")) {
            MinMaxQ mmq = new MinMaxQ();

            a0 = new MultiAgentQLearning(d, discount, learningRate, hashingFactory, defaultQ, mmq, false);
            a1 = new MultiAgentQLearning(d, discount, learningRate, hashingFactory, defaultQ, mmq, false);
            
            //a0 = new MultiAgentQLearning(d, discount, LR, hashingFactory, vInit, mmq, false);
            //a1 = new MultiAgentQLearning(d, discount, LR, hashingFactory, vInit, mmq, false);

            a0.joinWorld(w, at);
            a1.joinWorld(w, at);

            // Define the policy
            EMinMaxPolicy ja0 = new EMinMaxPolicy(a0, epsilon);
            EMinMaxPolicy ja1 = new EMinMaxPolicy(a1, epsilon);

            a0.setLearningPolicy(new PolicyFromJointPolicy(a0.getAgentName(), ja0));
            a1.setLearningPolicy(new PolicyFromJointPolicy(a1.getAgentName(), ja1));
        } else // This should be regular Q learning. I am not sure how to implement this
        {

        }

        agent0 = s.getObject(A);
        agent1 = s.getObject(B);

        DPrint.toggleCode(w.getDebugId(), false);
    }

    private void playSoccer(String filename) {
        
        List<GroundedSGAgentAction> actions = new ArrayList<GroundedSGAgentAction>();
        SimpleSGAgentAction actionA = new SimpleSGAgentAction(this.d, SoccerGridGame.ACTIONSOUTH);
        SimpleGroundedSGAgentAction gaA = new SimpleGroundedSGAgentAction("agent0", actionA);
        actions.add(gaA);
        SimpleSGAgentAction actionB = new SimpleSGAgentAction(this.d, SoccerGridGame.ACTIONNOOP);
        SimpleGroundedSGAgentAction gaB = new SimpleGroundedSGAgentAction("agent1", actionB);
        actions.add(gaB);
        JointAction ja = new JointAction(actions);
        //System.out.println(ja.toString());
        //System.out.println(ja.action("agent0"));
        //System.out.println(ja.action("agent1"));
        // Take world and run game
        int ngames = 5000;
        double prevQ = 0.0;
        try (PrintWriter out = new PrintWriter(filename)) {
            for (int i = 0; i < ngames; i++) {
                // Run game
                GameAnalysis ga = w.runGame();
                JointAction lastJA = w.getLastJointAction();
                List<JointAction> jaList = ga.getJointActions();
                
                /*
                for(JointAction jointAction : jaList)
                {
                    System.out.println(jointAction.toString());
                }
                */
                
                
                // Get Q value
                QSourceForSingleAgent q_a0 = a0.getMyQSource();
                JAQValue jaq_a0 = q_a0.getQValueFor(s, ja);
                double qVal = jaq_a0.q;
                //System.out.println(qVal);
                
                // Get rewards
                Map<String, Double> lastRewards = new HashMap<String, Double>();
                lastRewards = w.getLastRewards();
                //System.out.println("Agent 0 reward: " + lastRewards.get("agent0") + " Agent 1 Reward: " + lastRewards.get("agent1"));
                
                // Write to file if difference is not zero
                double diff = qVal - prevQ;
                if(i > 5000)
                {
                    out.println(i + "," + diff);
                }
                else if(diff != 0.0)
                {
                    out.println(i + "," + diff);
                }

                if( (i % 100)==0 )
                {
                    System.out.println(diff);
                }
                //System.out.println(diff);
                
                // Update previous Q value
                prevQ = qVal;
            }
        }
        catch(Exception ex)
        {
            System.out.println("File Exception");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    /*
        System.out.println("Playing corrQ soccer");
        SoccerGame soccerCorrQ = new SoccerGame("CorrQ");
        soccerCorrQ.playSoccer("corrQ.txt");
        
        System.out.println("Playing Friend Q soccer");
        SoccerGame soccerFriendQ = new SoccerGame("FriendQ");
        soccerFriendQ.playSoccer("friendQ.txt");
*/
    
        System.out.println("Playing FoeQ soccer");
        SoccerGame soccerFoeQ = new SoccerGame("FoeQ");
        soccerFoeQ.playSoccer("foeQ.txt");

    }

}
