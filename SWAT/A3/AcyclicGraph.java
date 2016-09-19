import korat.finitization.*;
import korat.finitization.impl.*;
import java.util.*;

public class AcyclicGraph {
    Vertex root;
    public static class Vertex {
        Vertex[] outgoingEdges;
    }

    public boolean repOK() {
        // returns true if and if only the graph reachable from "root" is a directed acyclic graph
        // complete this method
        
        // Graphs with a null root are valid
        if(root == null)
        {
            return true;
        }        
        
        // Now comes the hard part
        // I need to traverse the entire graph and determine
        // if there are any cycles
        // Try a depth first search approach
        // https://en.wikipedia.org/wiki/Topological_sorting
        
        // I need a way to keep track of the nodes I have marked as
        // having visited. I would prefer a dictionary, but Java only
        // defines this as an abstract class. Using a Hashtable instead.
        // - True means that we are in the process of going through the subtree
        // - False means we are done traversing the subtree
        // - If the node is not present at all, that means it has never been visited
        Hashtable<Vertex, Boolean> visiting =  new Hashtable<Vertex, Boolean>();
        boolean result = HasCycles(root, visiting);       
        
        if( result == true )
        {
            return false;
        }
        else
        {        
            return true;        
        }               
    }
    
    private boolean HasCycles(Vertex node, Hashtable<Vertex, Boolean> visiting)
    {
        //System.out.println(node.outgoingEdges.length);
        // If the current node isn't even in the dictionary,
        // we know we haven't been here before
        if (!visiting.containsKey(node))
        {
            // We are now in the process of traversing the subtree
            // for this node
            visiting.put(node, true);
            
            // Go through all the children of this node
            for(int i = 0; i < node.outgoingEdges.length; i++)
            {
                Vertex child = node.outgoingEdges[i];
                
                // When we check the cycles of this subtree, if it
                // returns true, we have found a cycle
                // This needs to be reflected globally
                //System.out.println("Recursively calling HasCycles");
                if(HasCycles(child, visiting))
                {
                    return true;
                }
            }
        }
        else if(visiting.get(node))
        {
            // If in the process of traversing the subtrees we
            // encounter a node we are still in the process
            // of visiting, we have found a cycle
            //System.out.println("Found cycle!!!");
            return true;
        }
        
        // Otherwise we have fully traversed the subtree
        // Mark the node as visited. Return false since
        // no cycles found
        visiting.put(node, false);
        return false;
    }
    
    
    public static IFinitization finAcyclicGraph(int nodesNum) {
        // complete this method
        
        // Create the finitization object
        IFinitization f = FinitizationFactory.create(AcyclicGraph.class);
        
        // Finitize root
        IObjSet vertices = f.createObjSet(Vertex.class, nodesNum, false);
        f.set("root", vertices);
        
        
        // Finitize the Vertex class
        // For the length of the array, the number of nodes does not seem to
        // include the root
        IIntSet arrayLength = f.createIntSet(0, nodesNum);
        
        // I am not sure that there are any restrictions on the contents (max value) of the
        // array. The only restriction is on the size       
        IArraySet arrays = f.createArraySet(Vertex[].class, arrayLength, vertices, nodesNum);
        
        f.set("Vertex.outgoingEdges", arrays);
        
        return f;
    }
}
