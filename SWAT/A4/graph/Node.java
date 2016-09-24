public class Node {
    private Graph owner;
    private String name;

    public Node(String name) {
        this.name = name;
    }

    public void setOwner(Graph a) {
        this.owner = a;
    }

    public void addEdge(Node n) {
        owner.addEdge(this, n);
    }

    public int getDegree() {
        if( owner != null)
        {
            return owner.getDegree(this);
        }
        else
        {
            // If there is no graph, we have no edges
            return 0;
        }
    }

    public void thisIsNotCalled() {
        getDegree();
    }

    // tests the fact that mutating a field is like mutating its own
    // state (for propagation)
    public void setOwnerName(String name) {
        owner.setName(name);
    }

    // tests the fact that mutating a field is like mutating its own
    // state (for simple analysis)
    public void setOwnerNameDirectly(String name) {
        // owner can be null
        if(owner != null)
        {
            owner.name = name;
        }
    }
}
