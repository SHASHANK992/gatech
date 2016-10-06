import chord.project.Chord;
import joeq.Compiler.Quad.RegisterFactory.Register;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.List;
import java.util.Iterator;

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
		
		// Get the last Basic Block
		// This block has no quads
		BasicBlock exitBlock = liveCFG.exit();
		
		// Parse the control flow graph according to the rules for
		// live variable analysis
		boolean somethingChanged = false;
		
		somethingChanged = ParseCFG(exitBlock, inMap, outMap);
		
		/*	
		do
		{
		    somethingChanged = ParseCFG(exitBlock, inMap, outMap);
		} while(somethingChanged);
		*/
	}
	
	
	// This helper function can be recursively called on the tree to update the in and
	// out sets. The in and out sets are passed by reference so they are updated by
	// default. This will return true if either set was updated during processing. 
	// Otherwise it returns false.
	private boolean ParseCFG(BasicBlock b, Map<Quad, Set<Register>> in, Map<Quad, Set<Register>> out)
	{
	    // Live analysis works in reverse
	    
	    boolean somethingChanged = false;
	    
	    // Work backwards through the quads in this block
	    int numQuads = b.size();
	    for(int index = numQuads-1; index >= 0; index--)
	    {
	        Quad q = b.getQuad(index);
	        somethingChanged = somethingChanged || InUpdate(q, in);
	        somethingChanged = somethingChanged || OutUpdate(q, out);
	    }
	    
	    // Once all the quads have been checked, find the 
	    // preceding blocks
	    List<BasicBlock> preds = b.getPredecessors();
	    
	    // Parse these blocks just like you parsed the current block
	    for(Iterator i = preds.iterator(); i.hasNext(); )
	    {
            BasicBlock block = (BasicBlock) i.next();
   	        somethingChanged = somethingChanged || ParseCFG(block, in, out);
	    }
	    
	    return somethingChanged;
	}
	
	private boolean InUpdate(Quad q, Map<Quad, Set<Register>> in)
	{
	    return false;
	}
	
	private boolean OutUpdate(Quad q, Map<Quad, Set<Register>> out)
	{
	    return false;
	}
}

