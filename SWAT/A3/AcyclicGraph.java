import korat.finitization.*;
import korat.finitization.impl.*;

public class AcyclicGraph {
    Vertex root;
    public static class Vertex {
        Vertex[] outgoingEdges;
    }

    public boolean repOK() {
        // returns true if and if only the graph reachable from "root" is a directed acyclic graph
        // complete this method
        
        
        return true;        
    }
    public static IFinitization finAcyclicGraph(int nodesNum) {
        // complete this method
        
        // Finitize root
        IFinitization f = FinitizationFactory.create(AcyclicGraph.class);
        IObjSet vertices = f.createObjSet(Vertex.class, nodesNum, false);
        f.set("root", vertices);
        
        // Vertex array
        // I am thinking that I get to define what values the array should have
        // -1 is null, 0 is in, 1 is out
        //IIntSet arrayValues = f.createIntSet(-1, 0, 1);
        
        // For the length of the array, I need to account for the root
        IIntSet arrayLength = f.createIntSet(0, nodesNum-1);
        
        // I am not sure that there are any restrictions on the contents of the
        // array. The only restriction is on the size       
        IArraySet arrays = f.createArraySet(Vertex[].class, arrayLength, vertices, nodesNum);
        
        return f;
    }
}
