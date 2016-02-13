import burlap.domain.singleagent.graphdefined.GraphDefinedDomain;
import burlap.oomdp.auxiliary.DomainGenerator;
import burlap.oomdp.auxiliary.common.NullTermination;
import burlap.oomdp.core.*;
import burlap.oomdp.singleagent.GroundedAction;
import burlap.oomdp.singleagent.RewardFunction;


public class BoundedRandomWalk
{
    DomainGenerator  dg;
    Domain           domain;
    State            initState;
    RewardFunction   rf;
    TerminalFunction tf;
    
    
    public BoundedRandomWalk()
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
				
        // Create new domain generator
        int numStates = 7;        
        this.dg = new GraphDefinedDomain(numStates);
        
        // Define new transitions
        // SetTransition(startState, actionID, destination state, probability)
        //Actions from state 0
        ((GraphDefinedDomain)this.dg).setTransitions( 0, 0, , 1.0);
                
        //Actions from state 1
        ((GraphDefinedDomain)this.dg).setTransitions( 1, 0, 0, 0.5);
        ((GraphDefinedDomain)this.dg).setTransitions( 1, 0, 2, 0.5);
        
        //Actions from state 2
        ((GraphDefinedDomain)this.dg).setTransitions( 2, 0, 1, 0.5);
        ((GraphDefinedDomain)this.dg).setTransitions( 2, 0, 3, 0.5);
        
        //Actions from state 3
        ((GraphDefinedDomain)this.dg).setTransitions( 3, 0, 2, 0.5);
        ((GraphDefinedDomain)this.dg).setTransitions( 3, 0, 4, 0.5);
        //Actions from state 4
        ((GraphDefinedDomain)this.dg).setTransitions( 4, 0, 3, 0.5);
        ((GraphDefinedDomain)this.dg).setTransitions( 4, 0, 5, 0.5);
        //Actions from state 5
        ((GraphDefinedDomain)this.dg).setTransitions( 5, 0, 4, 0.5);
        ((GraphDefinedDomain)this.dg).setTransitions( 5, 0, 6, 0.5);
        //Actions from state 6
        ((GraphDefinedDomain)this.dg).setTransitions( 6, 0, 6, 1.0);
                
        // Create actual domain
        this.domain = this.dg.generateDomain();        
        this.initState = GraphDefinedDomain.getState(this.domain, 3); // Initial state is the middle one
        
        this.rf = new BRWRewardFunction();
        this.tf = new NullTermination();
    }
    
    public static class BRWRewardFunction implements RewardFunction
    {
        int ts1 = 0;
        int ts2 = 6;
        
        public BRWRewardFunction()
        {
            // nothing to do?
        }
        
        @Override
        // Override reward method
        public double reward(State s, GroundedAction a, State sprime)
        {
            int stateID = GraphDefinedDomain.getNodeId(s);
            double r = 0;
            
            if(stateID == ts2)
            {
                r = 1;
            }
            
            return r;
        }
    }
}