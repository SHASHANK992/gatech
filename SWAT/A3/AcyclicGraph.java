import korat.finitization.*;
import korat.finitization.impl.*;
import java.util.*;

public class AcyclicGraph {
    Vertex root;
    public static class Vertex {
        Vertex[] outgoingEdges;
    }

    //************************
    // Determine if the test case is valid
    //************************
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
        boolean result = HasCycle(root, visiting);     
        
        return !result;               
    }
    
    // Returns true if the subgraph of node has a cycle
    private boolean HasCycle(Vertex node, Hashtable<Vertex, Boolean> visiting)
    {                          
        // If the current node isn't even in the dictionary,
        // we know we haven't been here before
        if (!visiting.containsKey(node))
        {
            // We are now in the process of traversing the subtree
            // for this node
            visiting.put(node, true);
            
            // In a normal DAG, there can be multiple links between the same nodes
            // That is not the case for this assignment
            // Need to make sure that none of the children are visited multiple times
            HashSet<Vertex> visitedChildren = new HashSet<Vertex>();
            
            // Go through all the children of this node
            for(int i = 0; i < node.outgoingEdges.length; i++)
            {              
                Vertex child = node.outgoingEdges[i];
                
                // Add the child to the set of visited children   
                if(visitedChildren.add(child))
                {                       
                    // When we check the cycles of this subtree, if it
                    // returns true, we have found a cycle
                    // This needs to be reflected globally
                    if(HasCycle(child, visiting))
                    {
                        return true;
                    }
                }
                else
                {
                    // The child has been visited previously
                    // A cycle might not exist, but we can't have more than
                    // one edge between two nodes
                    return true;
                }
            }
        } 
        else if(visiting.get(node))
        {
            // If in the process of traversing the subtrees we
            // encounter a node we are still in the process
            // of visiting, we have found a cycle
            return true; 
        }       
        
        // Otherwise we have fully traversed the subtree
        // Mark the node as visited. Return false since
        // no cycles found
        visiting.put(node, false);
        return false;
    }
        
    /*
    Finitization method
    */
    public static IFinitization finAcyclicGraph(int nodesNum) {
        // complete this method
        
        // Create the finitization object
        IFinitization f = FinitizationFactory.create(AcyclicGraph.class);
        
        // Finitize root
        // Null should be included in the set of finitized nodes (last argument)
        IObjSet vertices = f.createObjSet(Vertex.class, nodesNum, true);
        f.set("root", vertices);
        
        // Finitize the Vertex class
        // For the length of the array, remember to exclude the root
        // I need to break this into cases because otherwise I get a 
        // negative array length exception
        int num = 0;
        if(nodesNum > 0)
        {
            num = nodesNum-1;
        }
        IIntSet arrayLength = f.createIntSet(0, nodesNum);
        
        // I need to exclude null from the remainder of the vertices
        // It causes duplication problems if I leave null there
        vertices = f.createObjSet(Vertex.class, nodesNum, false);
        
        // The values the array can take is the set of vertices
        // I need to create nodesNum arrays because there needs to be one array for each node/vertex     
        IArraySet arrays = f.createArraySet(Vertex[].class, arrayLength, vertices, nodesNum);
        
        f.set("Vertex.outgoingEdges", arrays);
        
        return f;
    }
}
