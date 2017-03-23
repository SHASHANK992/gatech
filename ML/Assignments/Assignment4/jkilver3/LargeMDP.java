import java.awt.Color;
import java.util.List;
import java.io.*;

import burlap.behavior.singleagent.*;
import burlap.domain.singleagent.gridworld.*;
import burlap.oomdp.core.*;
import burlap.oomdp.singleagent.*;
import burlap.oomdp.singleagent.common.*;
import burlap.behavior.statehashing.DiscreteStateHashFactory;
import burlap.behavior.singleagent.learning.*;
import burlap.behavior.singleagent.learning.tdmethods.*;
import burlap.behavior.singleagent.planning.*;
import burlap.behavior.singleagent.planning.commonpolicies.GreedyQPolicy;
import burlap.behavior.singleagent.planning.deterministic.*;
import burlap.behavior.singleagent.planning.deterministic.informed.Heuristic;
import burlap.behavior.singleagent.planning.stochastic.valueiteration.ValueIteration;
import burlap.behavior.singleagent.planning.stochastic.policyiteration.PolicyIteration;
import burlap.oomdp.visualizer.Visualizer;
import burlap.oomdp.auxiliary.StateGenerator;
import burlap.oomdp.auxiliary.StateParser;
import burlap.oomdp.auxiliary.common.ConstantStateGenerator;
import burlap.behavior.singleagent.EpisodeSequenceVisualizer;
import burlap.behavior.singleagent.auxiliary.StateReachability;
import burlap.behavior.singleagent.auxiliary.performance.LearningAlgorithmExperimenter;
import burlap.behavior.singleagent.auxiliary.performance.PerformanceMetric;
import burlap.behavior.singleagent.auxiliary.performance.TrialMode;
import burlap.behavior.singleagent.auxiliary.valuefunctionvis.ValueFunctionVisualizerGUI;
import burlap.behavior.singleagent.auxiliary.valuefunctionvis.common.*;
import burlap.behavior.singleagent.auxiliary.valuefunctionvis.common.PolicyGlyphPainter2D.PolicyGlyphRenderStyle;
import burlap.oomdp.singleagent.common.VisualActionObserver;

public class LargeMDP {	
	
	GridWorldDomain 			gwdg;
	Domain						domain;
	StateParser 				sp;
	GridWorldRewardFunction 	rf;
	GridWorldTerminalFunction	tf;
	StateConditionTest			goalCondition;
	State 						initialState;
	DiscreteStateHashFactory	hashingFactory;
	static PrintWriter                 writer;
	
	public static void main(String[] args) {
		
		
		LargeMDP example = new LargeMDP();
		String outputPath = "output/"; 
			
		try
		{
			writer = new PrintWriter("steps.txt", "UTF-8");
					
			//uncomment the example you want to see (and comment-out the rest)

			//example.ValueIterationExample(outputPath);
			//example.PolicyIterationExample(outputPath);
			example.QLearningExample(outputPath);
			//example.experimenterAndPlotter();
		
			//run the visualizer (only use if you don't use the experiment plotter example)
			example.visualize(outputPath);
			writer.close();
		}
		catch(Exception ex){};
	}
	
	public LargeMDP(){
	
		//create the domain
		gwdg = new GridWorldDomain(50, 50);
		SetToLargeMDP();
		gwdg.setProbSucceedTransitionDynamics(0.8);
		domain = gwdg.generateDomain();
		
		//create the state parser
		sp = new GridWorldStateParser(domain); 
		
		//define the task
		// my code
		tf = new GridWorldTerminalFunction();
		tf.markAsTerminalPosition(49, 0);
		tf.markAsTerminalPosition(0, 49);
		tf.markAsTerminalPosition(31, 41);
		rf = new GridWorldRewardFunction(domain, -1.0);
		rf.setReward(31, 41, 5000.0);
		
		// original code
		//goalCondition = new TFGoalCondition(tf);
		
		//set up the initial state of the task
		initialState = GridWorldDomain.getOneAgentNLocationState(domain,3);
		GridWorldDomain.setAgent(initialState, 0, 0);
		GridWorldDomain.setLocation(initialState, 0, 49, 0);
		GridWorldDomain.setLocation(initialState, 1, 0, 49);
		GridWorldDomain.setLocation(initialState, 2, 31, 41);
		
		
		//set up the state hashing system
		hashingFactory = new DiscreteStateHashFactory();
		hashingFactory.setAttributesForClass(GridWorldDomain.CLASSAGENT, 
				domain.getObjectClass(GridWorldDomain.CLASSAGENT).attributeList); 
				
				
		//add visual observer
		VisualActionObserver observer = new VisualActionObserver(domain, 
			GridWorldVisualizer.getVisualizer(/*domain,*/ gwdg.getMap()));
		((SADomain)this.domain).setActionObserverForAllAction(observer);
		observer.initGUI();				
	}	
	
	public void SetToLargeMDP()
	{
		gwdg.makeEmptyMap();
		
		gwdg.horizontalWall(2, 20, 20);
		gwdg.verticalWall(2, 20, 20);
		
		gwdg.verticalWall(40, 49, 30);
		gwdg.horizontalWall(30, 32, 40);
		gwdg.verticalWall(40, 45, 32);
		gwdg.horizontalWall(32, 40, 45);
	}
	
	public void visualize(String outputPath){
		Visualizer v = GridWorldVisualizer.getVisualizer(/*domain,*/ gwdg.getMap());
		EpisodeSequenceVisualizer evis = new EpisodeSequenceVisualizer(v, 
								domain, sp, outputPath);
	}
		
	public void ValueIterationExample(String outputPath){
		
		if(!outputPath.endsWith("/")){
			outputPath = outputPath + "/";
		}
		
		
		OOMDPPlanner planner = new ValueIteration(domain, rf, tf, 0.99, hashingFactory,
								0.001, 100);
		planner.planFromState(initialState);
		
		//create a Q-greedy policy from the planner
		Policy p = new GreedyQPolicy((QComputablePlanner)planner);
		
		//record the plan results to a file
		p.evaluateBehavior(initialState, rf, tf).writeToFile(outputPath + "planResult", sp);
		
		//visualize the value function and policy
		this.valueFunctionVisualize((QComputablePlanner)planner, p);
		
	}
	
	public void PolicyIterationExample(String outputPath)
	{
		if(!outputPath.endsWith("/"))
		{
			outputPath = outputPath + "/";
		}
		
		OOMDPPlanner planner = new PolicyIteration(domain, rf, tf, 0.99, hashingFactory, 0.001, 100, 100);
		planner.planFromState(initialState);
		
		//create a Q-greedy policy from the planner
		Policy p = new GreedyQPolicy((QComputablePlanner)planner);
		
		//record the plan results to a file
		p.evaluateBehavior(initialState, rf, tf).writeToFile(outputPath + "planResult", sp);
		
		//visualize the value function and policy
		this.valueFunctionVisualize((QComputablePlanner)planner, p);
	}
		
	
	public void QLearningExample(String outputPath){
		
		if(!outputPath.endsWith("/")){
			outputPath = outputPath + "/";
		}
		
		double discount= 0.99; double initialQ=0.0; double learning_rate=0.5;
		LearningAgent agent = new QLearning(domain, rf, tf, discount, hashingFactory, initialQ, learning_rate);
		
		//run learning for a number of episodes
		for(int i = 0; i < 2000; i++){
			EpisodeAnalysis ea = agent.runLearningEpisodeFrom(initialState);
			ea.writeToFile(String.format("%se%03d", outputPath, i), sp); 
			System.out.println(i + ": " + ea.numTimeSteps() );
			writer.println(i + ": " + ea.numTimeSteps() );
		}
		
	}
		
	public void valueFunctionVisualize(QComputablePlanner planner, Policy p){
		List <State> allStates = StateReachability.getReachableStates(initialState, 
			(SADomain)domain, hashingFactory);
		LandmarkColorBlendInterpolation rb = new LandmarkColorBlendInterpolation();
		rb.addNextLandMark(0., Color.RED);
		rb.addNextLandMark(1., Color.BLUE);
		
		StateValuePainter2D svp = new StateValuePainter2D(rb);
		svp.setXYAttByObjectClass(GridWorldDomain.CLASSAGENT, GridWorldDomain.ATTX, 
			GridWorldDomain.CLASSAGENT, GridWorldDomain.ATTY);
		
		PolicyGlyphPainter2D spp = new PolicyGlyphPainter2D();
		spp.setXYAttByObjectClass(GridWorldDomain.CLASSAGENT, GridWorldDomain.ATTX, 
			GridWorldDomain.CLASSAGENT, GridWorldDomain.ATTY);
		spp.setActionNameGlyphPainter(GridWorldDomain.ACTIONNORTH, new ArrowActionGlyph(0));
		spp.setActionNameGlyphPainter(GridWorldDomain.ACTIONSOUTH, new ArrowActionGlyph(1));
		spp.setActionNameGlyphPainter(GridWorldDomain.ACTIONEAST, new ArrowActionGlyph(2));
		spp.setActionNameGlyphPainter(GridWorldDomain.ACTIONWEST, new ArrowActionGlyph(3));
		spp.setRenderStyle(PolicyGlyphRenderStyle.DISTSCALED);
		
		ValueFunctionVisualizerGUI gui = new ValueFunctionVisualizerGUI(allStates, svp, planner);
		gui.setSpp(spp);
		gui.setPolicy(p);
		gui.setBgColor(Color.GRAY);
		gui.initGUI();
	}



	public void experimenterAndPlotter(){
		
		//custom reward function for more interesting results
		//final RewardFunction rf = new GoalBasedRF(this.goalCondition, 5., -0.1);

		/**
		 * Create factories for Q-learning agent and SARSA agent to compare
		 */

		LearningAgentFactory qLearningFactory = new LearningAgentFactory() {
			
			@Override
			public String getAgentName() {
				return "Q-learning";
			}
			
			@Override
			public LearningAgent generateAgent() {
				return new QLearning(domain, rf, tf, 0.99, hashingFactory, 0.3, 0.1);
			}
		};


		StateGenerator sg = new ConstantStateGenerator(this.initialState);

		LearningAlgorithmExperimenter exp = new LearningAlgorithmExperimenter((SADomain)this.domain, 
			rf, sg, 10, 100, qLearningFactory);

		exp.setUpPlottingConfiguration(500, 250, 2, 1000, 
			TrialMode.MOSTRECENTANDAVERAGE, 
			PerformanceMetric.CUMULATIVESTEPSPEREPISODE, 
			PerformanceMetric.AVERAGEEPISODEREWARD);

		exp.startExperiment();

		exp.writeStepAndEpisodeDataToCSV("expData");
	}
}