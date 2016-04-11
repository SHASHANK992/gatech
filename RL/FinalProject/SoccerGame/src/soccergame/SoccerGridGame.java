/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soccergame;

import java.io.*;
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

import soccergame.SoccerGameMechanics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Jacob
 */
public class SoccerGridGame implements DomainGenerator {

    /**
     * A constant for the name of the x position attribute
     */
    public static final String ATTX = "x";

    /**
     * A constant for the name of the y position attribute
     */
    public static final String ATTY = "y";

    /**
     * A constant for the name of the player number attribute. The first player
     * number is 0.
     */
    public static final String ATTPN = "playerNum";

    /**
     * A constant for the name of the goal type attribute. Type 0 corresponds to
     * a universal goal. Type i corresponds to a personal goal for player i-1.
     */
    public static final String ATTGT = "gt";

    /**
     * A constant for the name of the first wall end position attribute. For a
     * horizontal wall, this attribute represents the left end point; for a
     * vertical wall, the bottom end point.
     */
    public static final String ATTE1 = "end1";

    /**
     * A constant for the name of the second wall end position attribute. For a
     * horizontal wall, this attribute represents the right end point; for a
     * vertical wall, the top end point.
     */
    public static final String ATTE2 = "end2";

    /**
     * A constant for the name of the attribute for defining the walls position
     * along its orthogonal direction. For a horizontal wall, this attribute
     * represents the y position of the wall; for a vertical wall, the x
     * position.
     */
    public static final String ATTP = "pos";

    /**
     * A constant for the name of the wall type attribute.
     */
    public static final String ATTWT = "wallType";

    /**
     * A constant for the name of owner of the soccer ball
     * The number appended to the end defines who owns the soccer ball
     */
    public static final String ATTOB = "ownsSoccerBall";
    
    /**
     * A constant for the name of the agent class.
     */
    public static final String CLASSAGENT = "agent";

    /**
     * A constant for the name of the goal class.
     */
    public static final String CLASSGOAL = "goal";

    /**
     * A constant for the name of the horizontal wall class.
     */
    public static final String CLASSDIMHWALL = "dimensionlessHorizontalWall";

    /**
     * A constant for the name of the vertical wall class.
     */
    public static final String CLASSDIMVWALL = "dimensionlessVerticalWall";

    /**
     * A constant for the name of the north action.
     */
    public static final String ACTIONNORTH = "north";

    /**
     * A constant for the name of the south action.
     */
    public static final String ACTIONSOUTH = "south";

    /**
     * A constant for the name of the east action.
     */
    public static final String ACTIONEAST = "east";
    /**
     * A constant for the name of the west action.
     */
    public static final String ACTIONWEST = "west";

    /**
     * A constant for the name of the no operation (do nothing) action.
     */
    public static final String ACTIONNOOP = "noop";

    /**
     * A constant for the name of a propositional function that evaluates
     * whether an agent is in a universal goal location.
     */
    public static final String PFINUGOAL = "agentInUniversalGoal";

    /**
     * A constant for the name of a propositional function that evaluates
     * whether an agent is in a personal goal location for just them.
     */
    public static final String PFINPGOAL = "agentInPersonalGoal";

    /**
     * The width and height of the world.
     */
    protected int maxDim = 50;

    /**
     * The maximum number of players that can be in the game
     */
    protected int maxPlyrs = 10;

    /**
     * The number of goal types
     */
    protected int maxGT = maxPlyrs + 1;

    /**
     * The number of wall types
     */
    protected int maxWT = 2;

    /**
     * Returns the maximum dimension of the world; it's width and height.
     *
     * @return the maximum dimension of the world; it's width and height.
     */
    public int getMaxDim() {
        return maxDim;
    }

    /**
     * Sets the maximum dimension of the world; it's width and height.
     *
     * @param maxDim the maximum dimension of the world; it's width and height.
     */
    public void setMaxDim(int maxDim) {
        this.maxDim = maxDim;
    }

    @Override
    public Domain generateDomain() {

        SGDomain domain = new SGDomain();

        Attribute xatt = new Attribute(domain, ATTX, Attribute.AttributeType.INT);
        xatt.setLims(0, maxDim);

        Attribute yatt = new Attribute(domain, ATTY, Attribute.AttributeType.INT);
        yatt.setLims(0, maxDim);

        Attribute e1att = new Attribute(domain, ATTE1, Attribute.AttributeType.INT);
        e1att.setLims(0, maxDim);

        Attribute e2att = new Attribute(domain, ATTE2, Attribute.AttributeType.INT);
        e2att.setLims(0, maxDim);

        Attribute patt = new Attribute(domain, ATTP, Attribute.AttributeType.INT);
        patt.setLims(0, maxDim);

        Attribute pnatt = new Attribute(domain, ATTPN, Attribute.AttributeType.INT);
        patt.setLims(0, maxPlyrs);

        Attribute gtatt = new Attribute(domain, ATTGT, Attribute.AttributeType.INT);
        gtatt.setLims(0, maxGT);

        Attribute wtatt = new Attribute(domain, ATTWT, Attribute.AttributeType.INT);
        wtatt.setLims(0, maxWT);
        
        Attribute obatt = new Attribute(domain, ATTOB, Attribute.AttributeType.BOOLEAN);

        ObjectClass agentClass = new ObjectClass(domain, CLASSAGENT);
        agentClass.addAttribute(xatt);
        agentClass.addAttribute(yatt);
        agentClass.addAttribute(pnatt);
        agentClass.addAttribute(obatt);

        ObjectClass goalClass = new ObjectClass(domain, CLASSGOAL);
        goalClass.addAttribute(xatt);
        goalClass.addAttribute(yatt);
        goalClass.addAttribute(gtatt);

        ObjectClass horWall = new ObjectClass(domain, CLASSDIMHWALL);
        horWall.addAttribute(e1att);
        horWall.addAttribute(e2att);
        horWall.addAttribute(patt);
        horWall.addAttribute(wtatt);

        ObjectClass vertWall = new ObjectClass(domain, CLASSDIMVWALL);
        vertWall.addAttribute(e1att);
        vertWall.addAttribute(e2att);
        vertWall.addAttribute(patt);
        vertWall.addAttribute(wtatt);

        new SimpleSGAgentAction(domain, ACTIONNORTH);
        new SimpleSGAgentAction(domain, ACTIONSOUTH);
        new SimpleSGAgentAction(domain, ACTIONEAST);
        new SimpleSGAgentAction(domain, ACTIONWEST);
        new SimpleSGAgentAction(domain, ACTIONNOOP);

        new AgentInPGoal(PFINPGOAL, domain);

        domain.setJointActionModel(new SoccerGameMechanics(domain));

        return domain;
    }

    /**
     * Returns a state with with the specified number of objects for each object
     * class and with the specified boundary of the playing area. The number of
     * walls *MUST* include the world boundary walls; that is, there must be at
     * least 2 horizontal walls and 2 vertical walls.
     *
     * @param d the domain object of the grid world
     * @param na the number of agents/players
     * @param ng the number of goal objects
     * @param nhw the number of horizontal walls
     * @param nvw the number of vertical walls
     * @param width the width of the playing area
     * @param height the height of the playing area
     * @return A state with the specified number of objects
     */
    public static State getCleanState(Domain d, int na, int ng, int nhw, int nvw, int width, int height) {

        State s = new MutableState();
        addNObjects(d, s, CLASSGOAL, ng);
        addNObjects(d, s, CLASSAGENT, na);
        addNObjects(d, s, CLASSDIMHWALL, nhw);
        addNObjects(d, s, CLASSDIMVWALL, nvw);

        setBoundaryWalls(s, width, height);

        return s;
    }

    /**
     * AddsN objects of a specific object class to a state object
     *
     * @param d the domain of the object classes
     * @param s the state to which the objects of the specified class should be
     * added
     * @param className the name of the object class for which to create object
     * instances
     * @param n the number of object instances to create
     */
    protected static void addNObjects(Domain d, State s, String className, int n) {
        for (int i = 0; i < n; i++) {
            ObjectInstance o = new MutableObjectInstance(d.getObjectClass(className), className + i);
            s.addObject(o);
        }
    }

    /**
     * Sets an agent's attribute values
     *
     * @param s the state in which the agent exists
     * @param i indicates the ith agent object whose values should be set
     * @param x the x position of the agent
     * @param y the y position of the agent
     * @param pn the player number of the agent
     * @param ownsBall true if the player owns the ball
     */
    public static void setAgent(State s, int i, int x, int y, int pn, boolean ownsBall) {
        ObjectInstance agent = s.getObjectsOfClass(CLASSAGENT).get(i);
        agent.setValue(ATTX, x);
        agent.setValue(ATTY, y);
        agent.setValue(ATTPN, pn);
        agent.setValue(ATTOB, ownsBall);
    }

    /**
     * Sets a goal objects attribute values
     *
     * @param s the state in which the goal exists
     * @param i indicates the ith goal object whose values should be set
     * @param x the x position of the goal
     * @param y the y position of the goal
     * @param gt the goal type
     */
    public static void setGoal(State s, int i, int x, int y, int gt) {
        ObjectInstance goal = s.getObjectsOfClass(CLASSGOAL).get(i);
        goal.setValue(ATTX, x);
        goal.setValue(ATTY, y);
        goal.setValue(ATTGT, gt);
    }

    /**
     * Sets boundary walls of a domain. This method will add 4 solid walls (top
     * left bottom right) to create a playing field in which the agents can
     * interact.
     *
     * @param s the state in which the walls should be added
     * @param w the width of the playing field
     * @param h the height of the playing field
     */
    public static void setBoundaryWalls(State s, int w, int h) {

        List<ObjectInstance> verticalWalls = s.getObjectsOfClass(CLASSDIMVWALL);
        List<ObjectInstance> horizontalWalls = s.getObjectsOfClass(CLASSDIMHWALL);

        ObjectInstance leftWall = verticalWalls.get(0);
        ObjectInstance rightWall = verticalWalls.get(1);

        ObjectInstance bottomWall = horizontalWalls.get(0);
        ObjectInstance topWall = horizontalWalls.get(1);

        setWallInstance(leftWall, 0, 0, h - 1, 0);
        setWallInstance(rightWall, w, 0, h - 1, 0);
        setWallInstance(bottomWall, 0, 0, w - 1, 0);
        setWallInstance(topWall, h, 0, w - 1, 0);

    }

    /**
     * Sets the attribute values for a wall instance
     *
     * @param w the wall instance to set
     * @param p the orthogonal position of the wall instance
     * @param e1 the first end point of the wall
     * @param e2 the second end point of the wall
     * @param wt the type of the wall
     */
    public static void setWallInstance(ObjectInstance w, int p, int e1, int e2, int wt) {
        w.setValue(ATTP, p);
        w.setValue(ATTE1, e1);
        w.setValue(ATTE2, e2);
        w.setValue(ATTWT, wt);
    }

    /**
     * Creates and returns a standard
     * {@link burlap.oomdp.stochasticgames.SGAgentType} for grid games. This
     * {@link burlap.oomdp.stochasticgames.SGAgentType} is assigned the type
     * name "agent", grid game OO-MDP object class for "agent", and has its
     * action space set to all possible actions in the grid game domain.
     * Typically, all agents in a grid game should be assigned to the same type.
     *
     * @param domain the domain object of the grid game.
     * @return An {@link burlap.oomdp.stochasticgames.SGAgentType} that
     * typically all {@link burlap.oomdp.stochasticgames.SGAgent}'s of the grid
     * game should play as.
     */
    public static SGAgentType getStandardGridGameAgentType(Domain domain) {
        return new SGAgentType(SoccerGridGame.CLASSAGENT, domain.getObjectClass(SoccerGridGame.CLASSAGENT), domain.getAgentActions());
    }

    /**
     * Defines a propositional function that evaluates to true when a given
     * agent is in any of its personal goals
     *
     * @author James MacGlashan
     *
     */
    static class AgentInPGoal extends PropositionalFunction {

        /**
         * Initializes with the given name and domain and is set to evaluate on
         * agent objects
         *
         * @param name the name of the propositional function
         * @param domain the domain for this propositional function
         */
        public AgentInPGoal(String name, Domain domain) {
            super(name, domain, new String[]{CLASSAGENT});
        }

        @Override
        public boolean isTrue(State s, String... params) {

            ObjectInstance agent = s.getObject(params[0]);
            int ax = agent.getIntValForAttribute(ATTX);
            int ay = agent.getIntValForAttribute(ATTY);
            int apn = agent.getIntValForAttribute(ATTPN);
            boolean aob = agent.getBooleanValForAttribute(ATTOB);
            
            //find all personal goals
            // TODO - DONE?
            // THIS NEEDS TO BE MODIFIED TO BE A GOAL ONLY WHEN THE AGENT
            // HAS THE SOCCER BALL AND IS A GOAL.
            List<ObjectInstance> goals = s.getObjectsOfClass(CLASSGOAL);
            for (ObjectInstance goal : goals) {
                /*
                int gt = goal.getIntValForAttribute(ATTGT);
                if (gt == apn + 1) {
                    int gx = goal.getIntValForAttribute(ATTX);
                    int gy = goal.getIntValForAttribute(ATTY);
                    if (gx == ax && gy == ay && aob) {
                        return true;
                    }
                }
                */
                
                int gx = goal.getIntValForAttribute(ATTX);
                int gy = goal.getIntValForAttribute(ATTY);
                if( gx == ax && gy == ay && aob )
                {
                    return true;
                }
            }

            return false;
        }
    }

    /**
     * Specifies goal rewards and default rewards for agents. Defaults rewards
     * to 0 reward everywhere except transition to universal or personal goals
     * which return a reward 1.
     *
     * @author James MacGlashan
     *
     */
    public static class SGGJointRewardFunction implements JointReward {

        PropositionalFunction agentInPersonalGoal;

        double stepCost = 0.;
        double pGoalReward = 100.;
        boolean noopIncursCost = false;
        Map<Integer, Double> personalGoalRewards = null;

        /**
         * Initializes for a given domain. Defaults rewards to 0 reward
         * everywhere except transition to universal or personal goals which
         * return a reward 1.
         *
         * @param ggDomain the domain
         */
        public SGGJointRewardFunction(Domain ggDomain) {
            agentInPersonalGoal = ggDomain.getPropFunction(SoccerGridGame.PFINPGOAL);
        }

        /**
         * Initializes for a given domain, step cost reward and goal reward.
         *
         * @param ggDomain the domain
         * @param stepCost the reward returned for all transitions except
         * transtions to goal locations
         * @param goalReward the reward returned for transitioning to a personal
         * or universal goal
         * @param noopIncursStepCost if true, then noop actions also incur the
         * stepCost reward; if false, then noops always return 0 reward.
         */
        public SGGJointRewardFunction(Domain ggDomain, double stepCost, double goalReward, boolean noopIncursStepCost) {
            agentInPersonalGoal = ggDomain.getPropFunction(SoccerGridGame.PFINPGOAL);
            
            this.stepCost = stepCost;
            this.pGoalReward = goalReward;
            this.noopIncursCost = noopIncursStepCost;
        }

        
        /**
         * Initializes for a given domain, step cost reward, personal goal
         * reward, and universal goal reward.
         *
         * @param ggDomain the domain
         * @param stepCost the reward returned for all transitions except
         * transtions to goal locations
         * @param personalGoalReward the reward returned for transitions to a
         * personal goal
         * @param universalGoalReward the reward returned for transitions to a
         * universal goal
         * @param noopIncursStepCost if true, then noop actions also incur the
         * stepCost reward; if false, then noops always return 0 reward.
         */
        /*
        public SGJointRewardFunction(Domain ggDomain, double stepCost, double personalGoalReward, boolean noopIncursStepCost) {
            agentInPersonalGoal = ggDomain.getPropFunction(SoccerGridGame.PFINPGOAL);
            
            this.stepCost = stepCost;
            this.pGoalReward = personalGoalReward;
            
            this.noopIncursCost = noopIncursStepCost;
        }
        */

        /**
         * Initializes for a given domain, step cost reward, universal goal
         * reward, and unique personal goal reward for each player.
         *
         * @param ggDomain the domain
         * @param stepCost the reward returned for all transitions except
         * transtions to goal locations
         * @param noopIncursStepCost if true, then noop actions also incur the
         * stepCost reward; if false, then noops always return 0 reward.
         * @param personalGoalRewards a map from player numbers to their
         * personal goal reward (the first player number is 0)
         */
        public SGGJointRewardFunction(Domain ggDomain, double stepCost, boolean noopIncursStepCost, Map<Integer, Double> personalGoalRewards) {

            agentInPersonalGoal = ggDomain.getPropFunction(SoccerGridGame.PFINPGOAL);
            
            this.stepCost = stepCost;
            
            this.noopIncursCost = noopIncursStepCost;
            this.personalGoalRewards = personalGoalRewards;

        }

        @Override
        public Map<String, Double> reward(State s, JointAction ja, State sp) {

            Map<String, Double> rewards = new HashMap<String, Double>();

            //get all agents and initialize reward to default
            List<ObjectInstance> obs = sp.getObjectsOfClass(SoccerGridGame.CLASSAGENT);
            for (ObjectInstance o : obs) {
                rewards.put(o.getName(), this.defaultCost(o.getName(), ja));
            }

            //check for any agents that reached a personal goal location and give them a goal reward if they did
            // Also, give negative reward to agent not in personal goal
            List<GroundedProp> ipgps = agentInPersonalGoal.getAllGroundedPropsForState(sp);
            for (GroundedProp gp : ipgps) {
                String agentName = gp.params[0];
                // This returns true if an agent is in a goal with a ball
                // The reward function needs to determine what the reward should be
                if (gp.isTrue(sp)) {
                    ObjectInstance a0 = sp.getObject("agent0");
                    ObjectInstance a1 = sp.getObject("agent1");
                    int a0x = a0.getIntValForAttribute(ATTX);
                    int a1x = a1.getIntValForAttribute(ATTX);
                    boolean a0HasBall = a0.getBooleanValForAttribute(ATTOB);
                    boolean a1HasBall = a1.getBooleanValForAttribute(ATTOB);                   
                    
                    // Positive rewards for agent with ball
                    if(a0HasBall && a0x == 0)
                    {
                        rewards.put("agent0", 100.0);
                        rewards.put("agent1", -100.0);
                    }
                    else if(a1HasBall && a1x == 3)
                    {
                        rewards.put("agent1", 100.0);
                        rewards.put("agent0", -100.0);
                    }
                    // Negative rewards for agent with ball
                    else if(a0HasBall && a0x == 3)
                    {
                        rewards.put("agent0", -100.0);
                        rewards.put("agent1", 100.0);
                    }
                    else if(a1HasBall && a1x == 0)
                    {
                        rewards.put("agent1", -100.0);
                        rewards.put("agent0", 100.0);
                    }
                    
                    /*
                    rewards.put(agentName, this.getPersonalGoalReward(sp, agentName));
                    
                    // Give negative reward to other agent
                    if("agent0".equals(agentName)) {
                        rewards.put("agent1", -1*this.getPersonalGoalReward(sp, agentName));
                    }
                    else if("agent1".equals(agentName)) {
                        rewards.put("agent0", -1*this.getPersonalGoalReward(sp, agentName));
                    }
                    */
                }
            }

            return rewards;

        }

        /**
         * Returns a default cost for an agent assuming the agent didn't
         * transition to a goal state. If noops incur step cost, then this is
         * always the step cost. If noops do not incur step costs and the agent
         * took a noop, then 0 is returned.
         *
         * @param aname the name of the agent for which the default reward
         * should be returned.
         * @param ja the joint action set
         * @return the default reward; either step cost or 0.
         */
        protected double defaultCost(String aname, JointAction ja) {
            if (this.noopIncursCost) {
                return this.stepCost;
            } else if (ja.action(aname) == null || ja.action(aname).action.actionName.equals(SoccerGridGame.ACTIONNOOP)) {
                return 0.;
            }
            return this.stepCost;
        }

        /**
         * Returns the personal goal rewards. If a single common personal goal
         * reward was set then that is returned. If different personal goal
         * rewards were defined for each player number, then that is queried and
         * returned instead.
         *
         * @param s the state in which the agent player numbers are defined
         * @param agentName the agent name for which the person goal reward is
         * to be returned
         * @return the personal goal reward for the specified agent.
         */
        protected double getPersonalGoalReward(State s, String agentName) {
            if (this.personalGoalRewards == null) {
                return this.pGoalReward;
            }

            int pn = s.getObject(agentName).getIntValForAttribute(SoccerGridGame.ATTPN);
            return this.personalGoalRewards.get(pn);

        }

    }

    /**
     * Causes termination when any agent reaches a personal or universal goal
     * location.
     *
     * @author James MacGlashan
     *
     */
    public static class SGGTerminalFunction implements TerminalFunction {

        PropositionalFunction agentInPersonalGoal;

        /**
         * Initializes for the given domain
         *
         * @param ggDomain the specific grid world domain.
         */
        public SGGTerminalFunction(Domain ggDomain) {
            agentInPersonalGoal = ggDomain.getPropFunction(SoccerGridGame.PFINPGOAL);
        }

        @Override
        public boolean isTerminal(State s) {

            //check personal goals; if anyone reached their personal goal, it's game over
            // For the soccer game, this will be true if the agent is in their goal and
            // has the soccer ball
            List<GroundedProp> ipgps = agentInPersonalGoal.getAllGroundedPropsForState(s);
            for (GroundedProp gp : ipgps) {
                if (gp.isTrue(s)) {
                    return true;
                }
            }

            return false;
        }
    }

}
