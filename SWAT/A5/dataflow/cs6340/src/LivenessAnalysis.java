import chord.project.Chord;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.List;
import java.util.ListIterator;
import java.util.Iterator;
import java.util.Map.Entry;

import chord.project.analyses.JavaAnalysis;
import chord.project.Chord;
import chord.program.Program;

import joeq.Class.jq_Method;
import joeq.Compiler.Quad.ControlFlowGraph;
import joeq.Compiler.Quad.BasicBlock;
import joeq.Compiler.Quad.Quad;
import joeq.Compiler.Quad.RegisterFactory.Register;
import joeq.Compiler.Quad.Operand.RegisterOperand;

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
		// Note: This is currently unused, but may be used later
		BasicBlock exitBlock = liveCFG.exit();
		
		// Parse the control flow graph according to the rules for
		// live variable analysis
		ParseCFG(liveCFG, inMap, outMap);
	}
	
	
	// This helper function can be recursively called on the tree to update the in and
	// out sets. The in and out sets are passed by reference so they are updated by
	// default. This will return true if either set was updated during processing. 
	// Otherwise it returns false.
	private void ParseCFG(ControlFlowGraph cfg, Map<Quad, Set<Register>> in, Map<Quad, Set<Register>> out)
	{	    
	    // Live analysis works in reverse, but I am not sure how well I can leverage that here
	    // Get list of blocks in CFG
	    List<BasicBlock> bList = cfg.reversePostOrder();
	    
	    boolean setsEqual = false;
	    do
	    {
	        // Parse by block, which consists of a set of 
	        // quads (which is what I really want)
	        
	        // Keep a copy of the in and out sets
	        Map<Quad, Set<Register>> inPrime = DeepCopy(in);
	        Map<Quad, Set<Register>> outPrime = DeepCopy(out);
	        
	        // For every block of the graph
	        for(BasicBlock block : bList)
	        {
	            // Parse the quads in reverse order
	            int numQuads = block.size();
	            
	            for(int index=numQuads-1; index >=0; index--)
	            {	                
	                Quad q = block.getQuad(index);
	                
	                // Update the IN set
	                // Pass in the USE and DEF sets for the current quad
	                // Get the register operands
	                List<RegisterOperand> usedRegOps = q.getUsedRegisters();
	                List<RegisterOperand> defRegOps = q.getDefinedRegisters();
	                
	                // Convert the operands to registers
	                List<Register> usedRegisters = new LinkedList<Register>();
	                List<Register> defRegisters = new LinkedList<Register>();
	                
	                for(RegisterOperand ro : usedRegOps)
	                {
	                    usedRegisters.add(ro.getRegister());
	                }
	                
	                for(RegisterOperand ro : defRegOps)
	                {
	                    defRegisters.add(ro.getRegister());
	                }   
	                
	                InUpdate(q, in, out, usedRegisters, defRegisters);
                
	                // The OUT set of the current quad is the union of all
	                // the immediate successor quads' IN sets
	                // Unless this is the last quad of the block, there can be only one successor
	                // to this quad
	                Set<Register> succInSet = new HashSet<Register>();
	                if(index == numQuads-1)
	                {
	                    // Find all the successor blocks
	                    List<BasicBlock> succBlocks = block.getSuccessors();
	                    	                    
	                    // Get the first quads from all the successor blocks
	                    for(BasicBlock succBlock : succBlocks)
	                    {	                        
	                        // Get the first quad if it exists
	                        if(succBlock.size() > 0)
	                        {
	                            Quad firstQuad = succBlock.getQuad(0);
	                            
	                            // Get the IN set for this quad	
	                            if( in.get(firstQuad) != null)
	                            {
	                                for(Register r : in.get(firstQuad))
	                                {
	                                    succInSet.add(r);
	                                }
	                            }	                            
	                        }
	                    }                    
	                }
	                else
	                {	                    
	                    // Get the quad for the sole immediate successor
	                    Quad successor = block.getQuad(index+1);
	                    
	                    // Get the in set
	                    if( in.get(successor) != null)
	                    {
	                        for(Register r : in.get(successor))
	                        {
	                            succInSet.add(r);
	                        }
	                    }           
	                }
	                	                	                
	                OutUpdate(q, in, out, succInSet);
	            }
	        }	        	        
	        
	        // Compare the initial sets to the new sets to see if anything changed
	        setsEqual = (in.equals(inPrime) && out.equals(outPrime));
	    } while(!setsEqual);
	    
	}
	
	// I have hopes to turn this into a more efficient parsing, but I will have to 
	// see if I can get to it
	private void ParseCFG(BasicBlock b, Map<Quad, Set<Register>> in, Map<Quad, Set<Register>> out)
	{
	
	}
	
	private void InUpdate(Quad q, Map<Quad, Set<Register>> in, Map<Quad, Set<Register>> out, List<Register> use, List<Register> def)
	{
	    // The in set of the given quad is (OUT[q] - DEF[q]) UNION USE[q]
	    
	    // Find the difference between the OUT set and the DEF set
	    // I am a bit worried about copying in Java. I will force a 
	    // deep copy here
	    Set<Register> op1 = new HashSet<Register>();
	    if(out.get(q) != null)
	    {
	        for(Register r : out.get(q))
	        {
	            op1.add(r);
	        }
	    }
	    
	    for(Register r : def)
	    {
	        op1.remove(r);
	    }
	    
	    for(Register r : use)
	    {
	        op1.add(r);
	    }
	    
	    in.put(q, op1);
	}
	
	private void OutUpdate(Quad q, Map<Quad, Set<Register>> in, Map<Quad, Set<Register>> out, Set<Register> succInSet)
	{
	    out.put(q, succInSet);
	}
	
	
	// Perform a deep copy for the in and out sets
	public static Map<Quad, Set<Register>> DeepCopy( Map<Quad, Set<Register>> original )
	{
	    Map<Quad, Set<Register>> copy = new HashMap<Quad, Set<Register>>();
	    
	    for(Entry<Quad, Set<Register>> entry : original.entrySet())
	    {
	        copy.put(entry.getKey(), new HashSet<Register>(entry.getValue()));
	    }
	    
	    return copy;
	}
}

