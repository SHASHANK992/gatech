import chord.project.Chord;
import joeq.Compiler.Quad.RegisterFactory.Register;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import chord.project.analyses.JavaAnalysis;
import chord.project.Chord;
import chord.program.Program;

import joeq.Class.jq_Method;
import joeq.Compiler.Quad.ControlFlowGraph;
import joeq.Compiler.Quad.BasicBlock;
import joeq.Compiler.Quad.Quad;

@Chord(name="liveness")
public class LivenessAnalysis extends DataflowAnalysis<Register> {
	@Override
	public void doAnalysis() {
		// Implement your liveness dataflow analysis here. 
		//
		// File DataflowAnalysis.java defines instance fields main, inMap, and
		// outMap, which will serve as the inputs and outputs of your analysis:
		//
		// INPUT: Method main.
		//
		// OUTPUT: Populate maps inMap and outMap with the results of your
		// liveness analysis of method main.
		//
		// Specifically, for each Quad q in the control-flow graph of main,
		// inMap(q) and outMap(q) must contain the sets of all Registers that
		// may be live on entry and on exit, respectively, of q.  You can leave
		// a set either null or empty if it does not contain any registers.
		//
		// Your analysis will be graded for the following aspects in decreasing
		// order of importance:
		// 1. Correctness of the results produced by the analysis.
		// 2. Efficiency of the analysis, in particular, the number of times you
		// revisit each quad. 
		//
		// Add helper instance methods to this class if necessary.  All your
		// code must be in this class itself, and it must be written in Java.
		//
		// Note: This is a single procedure analysis; you do not need to
		// consult any pointer analysis, call graph, or any method of the given
		// program besides the provided main method.
		
		
		// Live variable analysis is a backwards, MAY analysis
		// Begins with both the IN and OUT sets being empty
		ControlFlowGraph liveCFG = main.getCFG();
		
		// Work backwards, so reverse iterator
		liveCFG.reversePostOrderIterator();
		
		// Get the last Basic Block, which is just an IN
		EntryOrExitBasicBlock exitBlock = liveCFG.exit();
		
		// Get the quad of this block and add it to the 
		// IN map
		Quad q = exitBlock.getQuad(0);
		// TODO: How do I find the registers associated with this quad?
		// I think I need to use the RegisterFactory somehow
		// At least for this first one I know it is the empty set
		Set<Register> temp = new HashSet<Register>();
		inMap.put(q, temp);
		
		boolean somethingChanged = false;
		
		do
		{
		    somethingChanged = ParseCFG(exitBlock, inMap, outMap);
		} while(somethingChanged);
		
	}
	
	
	// This helper function can be recursively called on the tree to update the in and
	// out sets. The in and out sets are passed by reference so they are updated by
	// default. This will return true if either set was updated during processing. 
	// Otherwise it returns false.
	private boolean ParseCFG(BasicBlock b, Map<Quad, Set<T>> in, Map<Quad, Set<T>> out)
	{
	    
	}
}

