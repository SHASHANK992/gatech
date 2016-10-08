import chord.project.Chord;
import chord.util.tuple.object.Pair;

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

@Chord(name="reachdef")
public class ReachDefAnalysis extends DataflowAnalysis<Pair<Quad, Register>> {
	@Override
	public void doAnalysis() {
		// Implement your reaching definitions dataflow analysis here. 
		//
		// File DataflowAnalysis.java defines instance fields main, inMap, and
		// outMap, which will serve as the inputs and outputs of your analysis:
		//
		// INPUT: Method main.
		//
		// OUTPUT: Populate maps inMap and outMap with the results of your
		// reaching definitions analysis of method main.
		//
		// Specifically, for each Quad q in the control-flow graph of main,
		// inMap(q) and outMap(q) must contain the sets of all <Quad, Register>
		// definitions that may reach the entry and the exit, respectively, of
		// q.  You can leave a set either null or empty if it does not contain
		// any reaching definitions.
		//
		// Your analysis will be graded for the following aspects in decreasing
		// order of importance:
		//
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
		
		// Reach definition is a forward, MAY analysis
		// Begin with IN and OUT sets being empty
		
		ControlFlowGraph reachCFG = main.getCFG();
		
		// Get first Basic Block
		// This block has no quads
		// Note: This is currently unused, but may be used later
		BasicBlock startBlock = reachCFG.entry();
		
		// Parse the control flow graph according to the rules for
		// reaching definition analysis
		ParseCFG(reachCFG, inMap, outMap);	
	}
	
	private void ParseCFG(ControlFlowGraph cfg, Map<Quad, Set<Pair<Quad, Register>>> in, Map<Quad, Set<Pair<Quad,Register>>> out)
	{
	    // Reaching analysis works forward, but I am not sure how well I can leverage
	    // that here
	    // Get list of blocks in CFG
	    List<BasicBlock> bList = cfg.reversePostOrder();
	    
	    boolean setsEqual = false;
	    
	    do
	    {
	        // Keep a copy of the in and out sets
	        Map<Quad, Set<Pair<Quad, Register>>> inPrime = DeepCopy(in);
	        Map<Quad, Set<Pair<Quad, Register>>> outPrime = DeepCopy(out);
	        
	        for(BasicBlock block : bList)
	        {
	            // Parse the quads in forward order
	            int numQuads = block.size();
	        
	            for(int index=0; index < numQuads; index++)
	            {	     
	                Quad q = block.getQuad(index);
	                           
	                //********************************
	                // Update the IN set
	                //*********************************
	                // The union of all the predecessor quads OUT sets
	                Set<Pair<Quad, Register>> predOutSet = new HashSet<Pair<Quad, Register>>();
	                if(index == 0)
	                {
	                    // If this is the first quad of the block, need to find
	                    // the last quad of all the preceding blocks
	                    List<BasicBlock> predBlocks = block.getPredecessors();
	                    
	                    for(BasicBlock predBlock : predBlocks)
	                    {
	                        // Get the last quad if it exists
	                        if(predBlock.size() > 0)
	                        {
	                            Quad lastQuad = predBlock.getLastQuad();
	                            
	                            if(out.get(lastQuad) != null)
	                            {
	                                for(Pair<Quad, Register> p : out.get(lastQuad))
	                                {
	                                    predOutSet.add(p);
	                                }
	                            }
	                        }
	                    }	                    
	                }
	                else
	                {
	                    // If this is not the first quad, there is only
	                    // one predecessor to this quad
	                    Quad predecessor = block.getQuad(index-1);
	                    
	                    if(out.get(predecessor) != null)
	                    {
	                        predOutSet = out.get(predecessor);
	                        /*
	                        for(Register r : out.get(predecessor))
	                        {
	                            predOutSet.add(r);
	                        }
	                        */
	                    }
	                }
	                
	                InUpdate(q, in, out, predOutSet);
	               
	                //***************************************
	                // Update the OUT set 
	                //***************************************
	                // Get the used and defined registers
	                List<RegisterOperand> usedRegOps = q.getUsedRegisters();
	                List<RegisterOperand> defRegOps = q.getDefinedRegisters();
	                
	                // Convert the register operands to registers
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
	                
	                OutUpdate(q, in, out, usedRegisters, defRegisters);            
	            }
	        }	        
	        
	        // Compare sets from before to after
	        setsEqual = (in.equals(inPrime) && out.equals(outPrime));	    
	    } while(!setsEqual);
	
	}
	
	private void InUpdate(Quad q, Map<Quad, Set<Pair<Quad, Register>>> in, Map<Quad, Set<Pair<Quad,Register>>> out, Set<Pair<Quad,Register>> predOutSet)
	{
	    in.put(q, predOutSet);
	}
	
	private void OutUpdate(Quad q, Map<Quad, Set<Pair<Quad, Register>>> in, Map<Quad, Set<Pair<Quad, Register>>> out, List<Register> use, List<Register> def)
	{
	    // My update seems a little weird. I am not sure if it is just the
	    // way we have the problem set up (registers) instead of (register, quad) pairs
	
	    // Remove from the IN set all the <Quad, Register> Pairs that use registers defined by the DEF set
	    Set<Pair<Quad, Register>> temp = in.get(q);
	    if(temp == null)
	    {
	        temp = new HashSet<Pair<Quad, Register>>();
	    }
	    
	    for(Register r : def)
	    {
	        for(Pair<Quad, Register> p : temp)
	        {
	            if(p.val1.equals(r))
	            {
	                temp.remove(p);
	            }
	        }	        
	    }
	    
	    // Add in all the <Quad, Register> pairs for the registers defined
	    for(Register r : def)
	    {
	        temp.add(new Pair<Quad, Register>(q,r));
	    }
	    
	    out.put(q, temp);
	}
	
	
	// Perform a deep copy for the in and out sets
	public static Map<Quad, Set<Pair<Quad,Register>>> DeepCopy( Map<Quad, Set<Pair<Quad,Register>>> original )
	{
	    Map<Quad, Set<Pair<Quad, Register>>> copy = new HashMap<Quad, Set<Pair<Quad, Register>>>();
	    
	    for(Entry<Quad, Set<Pair<Quad, Register>>> entry : original.entrySet())
	    {
	        copy.put(entry.getKey(), new HashSet<Pair<Quad, Register>>(entry.getValue()));
	    }
	    
	    return copy;
	}
	
}

