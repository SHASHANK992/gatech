import korat.finitization.*;
import korat.finitization.impl.*;
import java.util.*;

public class AcyclicGraph {
    Vertex root;
    public static class Vertex {
        Vertex[] outgoingEdges;
    }

    //************************
    // 
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
        boolean result = HasCycles(root, visiting); 
        if(!result)
        {
            PrintGraph(root);
        }     
        
        return !result;               
    }
    
    // Returns true if the subgraph of node has a cycle
    private boolean HasCycles(Vertex node, Hashtable<Vertex, Boolean> visiting)
    {
        // If the node is null, it can't have any children
        // Can't be added to the dictionary, though. 
        if(node == null)
        {
            return false;
        }
        else
        {
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
        }
        
        // Otherwise we have fully traversed the subtree
        // Mark the node as visited. Return false since
        // no cycles found
        visiting.put(node, false);
        return false;
    }
    
    private void PrintGraph(Vertex root)
    {
        System.out.println("Root: " + root);
        for(int i = 0; i < root.outgoingEdges.length; i++)
        {
            Vertex child = root.outgoingEdges[i];
            System.out.println("Child: " + child);
            
            if(child != null)
            {
                for(int j = 0; j < child.outgoingEdges.length; j++)
                {
                    Vertex grandchild = child.outgoingEdges[j];
                    System.out.println("Grandchild: " + grandchild);
                } 
            }           
        }
        
        
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
        IIntSet arrayLength = f.createIntSet(0, num);
        
        // I need to exclude null from the remainder of the vertices
        // It causes duplication problems if I leave null there
        vertices = f.createObjSet(Vertex.class, num, false);
        
        // The values the array can take is the set of vertices
        // I need to create nodesNum arrays because there needs to be one array for each node/vertex     
        IArraySet arrays = f.createArraySet(Vertex[].class, arrayLength, vertices, nodesNum);
        
        f.set("Vertex.outgoingEdges", arrays);
        
        return f;
    }
}
