
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test001"); }


    Node node1 = new Node("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.setOwnerNameDirectly("");

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test002"); }


    Node node1 = new Node("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i2 = node1.getDegree();

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test003"); }


    Graph graph0 = new Graph();
    Node node2 = new Node("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i3 = graph0.getDegree(node2);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test004"); }


    Node node1 = new Node("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i2 = node1.getDegree();

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test005"); }


    Node node1 = new Node("hi!");
    Graph graph2 = new Graph();
    node1.setOwner(graph2);
    graph2.setName("");
    java.lang.String str6 = graph2.name;
    Node node8 = new Node("hi!");
    Node node10 = new Node("hi!");
    Graph graph11 = new Graph();
    node10.setOwner(graph11);
    graph11.setName("");
    node8.setOwner(graph11);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph2.addNode(node8);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test006"); }


    Node node1 = new Node("hi!");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    graph4.setName("");
    node1.setOwner(graph4);
    Node node10 = new Node("hi!");
    Graph graph11 = new Graph();
    node10.setOwner(graph11);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node10);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test007"); }


    Node node1 = new Node("hi!");
    Graph graph2 = new Graph();
    node1.setOwner(graph2);
    graph2.setName("");
    graph2.setName("");
    Node node9 = new Node("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph2.addNode(node9);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test008"); }


    Node node1 = new Node("hi!");
    Node node3 = new Node("hi!");
    Node node5 = new Node("hi!");
    Graph graph6 = new Graph();
    node5.setOwner(graph6);
    graph6.setName("");
    node3.setOwner(graph6);
    node3.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node3);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test009"); }


    Graph graph0 = new Graph();
    Node node2 = new Node("");
    Node node4 = new Node("hi!");
    Graph graph5 = new Graph();
    node4.setOwner(graph5);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node2, node4);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test010"); }


    Node node1 = new Node("hi!");
    Graph graph2 = new Graph();
    node1.setOwner(graph2);
    Node node5 = new Node("hi!");
    Node node7 = new Node("hi!");
    Graph graph8 = new Graph();
    node7.setOwner(graph8);
    graph8.setName("");
    node5.setOwner(graph8);
    node5.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node5);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test011"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Node node10 = new Node("hi!");
    Graph graph11 = new Graph();
    node10.setOwner(graph11);
    graph11.setName("");
    node8.setOwner(graph11);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node8);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test012"); }


    Node node1 = new Node("hi!");
    Graph graph2 = new Graph();
    node1.setOwner(graph2);
    graph2.setName("");
    graph2.setName("");
    Node node9 = new Node("hi!");
    Node node11 = new Node("hi!");
    Graph graph12 = new Graph();
    node11.setOwner(graph12);
    graph12.setName("");
    node9.setOwner(graph12);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph2.addNode(node9);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test013"); }


    Node node1 = new Node("hi!");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    graph4.setName("");
    node1.setOwner(graph4);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i9 = node1.getDegree();

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test014"); }


    Node node1 = new Node("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.setOwnerNameDirectly("");

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test015"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("");
    Node node10 = new Node("");
    Node node12 = new Node("hi!");
    Graph graph13 = new Graph();
    node12.setOwner(graph13);
    node10.setOwner(graph13);
    Node node17 = new Node("hi!");
    Graph graph18 = new Graph();
    node17.setOwner(graph18);
    graph18.setName("");
    java.lang.String str22 = graph18.name;
    node10.setOwner(graph18);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph4.addEdge(node8, node10);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test016"); }


    Node node1 = new Node("hi!");
    Graph graph2 = new Graph();
    node1.setOwner(graph2);
    graph2.setName("");
    graph2.setName("");
    Node node9 = new Node("hi!");
    Graph graph10 = new Graph();
    node9.setOwner(graph10);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i12 = graph2.getDegree(node9);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test017"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Node node10 = new Node("hi!");
    Graph graph11 = new Graph();
    node10.setOwner(graph11);
    graph11.setName("");
    node8.setOwner(graph11);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph4.addNode(node8);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test018"); }


    Node node1 = new Node("hi!");
    Graph graph2 = new Graph();
    node1.setOwner(graph2);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test019"); }


    Graph graph0 = Graph.generateGraph();
    java.lang.String str1 = graph0.name;
    graph0.init();
    Node node4 = new Node("hi!");
    Graph graph5 = new Graph();
    node4.setOwner(graph5);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i7 = graph0.getDegree(node4);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test020"); }


    Node node1 = new Node("hi!");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    graph4.setName("");
    node1.setOwner(graph4);
    Node node10 = new Node("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node10);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test021"); }


    Node node1 = new Node("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.setOwnerNameDirectly("[graph]");

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test022"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test023"); }


    Node node1 = new Node("hi!");
    Graph graph2 = new Graph();
    node1.setOwner(graph2);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = node1.getDegree();

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test024"); }


    Node node1 = new Node("hi!");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    graph4.setName("");
    node1.setOwner(graph4);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test025"); }


    Node node1 = new Node("hi!");
    Graph graph2 = new Graph();
    node1.setOwner(graph2);
    graph2.setName("");
    graph2.setName("");
    graph2.setName("");
    graph2.setName("[graph]");
    Node node13 = new Node("");
    Graph graph14 = Graph.generateGraph();
    java.lang.String str15 = graph14.name;
    node13.setOwner(graph14);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph2.addNode(node13);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test026"); }


    Node node1 = new Node("hi!");
    Graph graph2 = new Graph();
    node1.setOwner(graph2);
    graph2.setName("");
    Node node7 = new Node("hi!");
    Node node9 = new Node("hi!");
    Graph graph10 = new Graph();
    node9.setOwner(graph10);
    graph10.setName("");
    node7.setOwner(graph10);
    node7.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i17 = graph2.getDegree(node7);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test027"); }


    Node node1 = new Node("hi!");
    Graph graph2 = new Graph();
    node1.setOwner(graph2);
    graph2.setName("");
    graph2.setName("");
    Node node9 = new Node("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i10 = graph2.getDegree(node9);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test028"); }


    Node node1 = new Node("hi!");
    Graph graph2 = new Graph();
    node1.setOwner(graph2);
    graph2.setName("");
    Node node7 = new Node("");
    Node node9 = new Node("hi!");
    Graph graph10 = new Graph();
    node9.setOwner(graph10);
    node7.setOwner(graph10);
    Node node14 = new Node("hi!");
    Graph graph15 = new Graph();
    node14.setOwner(graph15);
    graph15.setName("");
    java.lang.String str19 = graph15.name;
    node7.setOwner(graph15);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph2.addNode(node7);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test029"); }


    Graph graph0 = Graph.generateGraph();
    java.lang.String str1 = graph0.name;
    graph0.init();
    Node node4 = new Node("");
    Node node6 = new Node("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node4, node6);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test030"); }


    Node node1 = new Node("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test031"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i17 = node1.getDegree();

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test032"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i7 = node1.getDegree();

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test033"); }


    Graph graph0 = new Graph();
    graph0.init();
    Node node3 = new Node("");
    Graph graph4 = Graph.generateGraph();
    java.lang.String str5 = graph4.name;
    node3.setOwner(graph4);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i7 = graph0.getDegree(node3);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test034"); }


    Node node1 = new Node("hi!");
    Graph graph2 = new Graph();
    node1.setOwner(graph2);
    Node node5 = new Node("");
    Node node7 = new Node("hi!");
    Graph graph8 = new Graph();
    node7.setOwner(graph8);
    node5.setOwner(graph8);
    Node node12 = new Node("hi!");
    Graph graph13 = new Graph();
    node12.setOwner(graph13);
    graph13.setName("");
    java.lang.String str17 = graph13.name;
    node5.setOwner(graph13);
    node5.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i21 = graph2.getDegree(node5);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test035"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    Node node16 = new Node("");
    Graph graph17 = Graph.generateGraph();
    java.lang.String str18 = graph17.name;
    node16.setOwner(graph17);
    Graph graph20 = new Graph();
    node16.setOwner(graph20);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i22 = graph9.getDegree(node16);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test036"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    graph2.init();
    node1.setOwner(graph2);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i6 = node1.getDegree();

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test037"); }


    Graph graph0 = new Graph();
    Node node2 = new Node("");
    Node node4 = new Node("hi!");
    Graph graph5 = new Graph();
    node4.setOwner(graph5);
    node2.setOwner(graph5);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i8 = graph0.getDegree(node2);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test038"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("");
    Graph graph9 = Graph.generateGraph();
    java.lang.String str10 = graph9.name;
    node8.setOwner(graph9);
    Graph graph12 = new Graph();
    node8.setOwner(graph12);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph4.addNode(node8);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test039"); }


    Node node1 = new Node("hi!");
    Graph graph2 = new Graph();
    node1.setOwner(graph2);
    graph2.setName("");
    graph2.setName("");
    graph2.setName("");
    graph2.setName("[graph]");
    Node node13 = new Node("hi!");
    Node node15 = new Node("hi!");
    Graph graph16 = new Graph();
    node15.setOwner(graph16);
    graph16.setName("");
    node13.setOwner(graph16);
    Graph graph21 = new Graph();
    graph21.init();
    graph21.setName("");
    Node node26 = new Node("");
    graph21.addNode(node26);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph2.addEdge(node13, node26);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test040"); }


    Node node1 = new Node("hi!");
    Graph graph2 = new Graph();
    node1.setOwner(graph2);
    graph2.setName("");
    graph2.setName("");
    Node node9 = new Node("hi!");
    Node node11 = new Node("hi!");
    Graph graph12 = new Graph();
    node11.setOwner(graph12);
    graph12.setName("");
    node9.setOwner(graph12);
    Node node18 = new Node("hi!");
    Node node20 = new Node("hi!");
    Graph graph21 = new Graph();
    node20.setOwner(graph21);
    graph21.setName("");
    node18.setOwner(graph21);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph2.addEdge(node9, node18);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test041"); }


    Node node1 = new Node("hi!");
    Graph graph2 = new Graph();
    node1.setOwner(graph2);
    Node node5 = new Node("hi!");
    Node node7 = new Node("hi!");
    Graph graph8 = new Graph();
    node7.setOwner(graph8);
    graph8.setName("");
    node5.setOwner(graph8);
    node5.setOwnerNameDirectly("hi!");
    node5.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph2.addNode(node5);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test042"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test043"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test044"); }


    Node node1 = new Node("hi!");
    Graph graph2 = new Graph();
    node1.setOwner(graph2);
    graph2.setName("");
    java.lang.String str6 = graph2.name;
    Node node8 = new Node("");
    Node node10 = new Node("hi!");
    Graph graph11 = new Graph();
    node10.setOwner(graph11);
    node8.setOwner(graph11);
    Node node15 = new Node("hi!");
    Graph graph16 = new Graph();
    node15.setOwner(graph16);
    graph16.setName("");
    java.lang.String str20 = graph16.name;
    node8.setOwner(graph16);
    node8.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph2.addNode(node8);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test045"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerName("hi!");
    Graph graph17 = new Graph();
    graph17.init();
    node1.setOwner(graph17);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test046"); }


    Graph graph0 = Graph.generateGraph();
    java.lang.String str1 = graph0.name;
    graph0.init();
    Graph graph3 = Graph.generateGraph();
    Node node5 = new Node("");
    Node node7 = new Node("hi!");
    Graph graph8 = new Graph();
    node7.setOwner(graph8);
    node5.setOwner(graph8);
    Node node12 = new Node("hi!");
    Graph graph13 = new Graph();
    node12.setOwner(graph13);
    graph13.setName("");
    java.lang.String str17 = graph13.name;
    node5.setOwner(graph13);
    node5.setOwnerNameDirectly("hi!");
    graph3.addNode(node5);
    node5.setOwnerNameDirectly("hi!");
    node5.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i26 = graph0.getDegree(node5);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test047"); }


    Graph graph0 = Graph.generateGraph();
    java.lang.String str1 = graph0.name;
    graph0.name = "";
    java.lang.String str4 = graph0.name;
    Node node6 = new Node("");
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    node6.setOwner(graph9);
    Node node13 = new Node("hi!");
    Graph graph14 = new Graph();
    node13.setOwner(graph14);
    graph14.setName("");
    java.lang.String str18 = graph14.name;
    node6.setOwner(graph14);
    node6.setOwnerName("hi!");
    Graph graph22 = new Graph();
    graph22.init();
    node6.setOwner(graph22);
    Node node26 = new Node("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node6, node26);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test048"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    graph2.init();
    node1.setOwner(graph2);
    Graph graph6 = new Graph();
    graph6.init();
    graph6.setName("");
    Node node11 = new Node("");
    graph6.addNode(node11);
    Graph graph13 = new Graph();
    graph13.init();
    graph13.setName("");
    Node node18 = new Node("");
    graph13.addNode(node18);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph2.addEdge(node11, node18);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test049"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    Node node16 = new Node("");
    Node node18 = new Node("hi!");
    Graph graph19 = new Graph();
    node18.setOwner(graph19);
    node16.setOwner(graph19);
    Node node23 = new Node("hi!");
    Graph graph24 = new Graph();
    node23.setOwner(graph24);
    graph24.setName("");
    java.lang.String str28 = graph24.name;
    node16.setOwner(graph24);
    node16.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph9.addNode(node16);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test050"); }


    Node node1 = new Node("hi!");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    graph4.setName("");
    node1.setOwner(graph4);
    Node node10 = new Node("");
    Node node12 = new Node("hi!");
    Graph graph13 = new Graph();
    node12.setOwner(graph13);
    node10.setOwner(graph13);
    Node node17 = new Node("hi!");
    Graph graph18 = new Graph();
    node17.setOwner(graph18);
    graph18.setName("");
    java.lang.String str22 = graph18.name;
    node10.setOwner(graph18);
    node10.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node10);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test051"); }


    Graph graph0 = Graph.generateGraph();
    Node node2 = new Node("");
    Node node4 = new Node("hi!");
    Graph graph5 = new Graph();
    node4.setOwner(graph5);
    node2.setOwner(graph5);
    Node node9 = new Node("hi!");
    Graph graph10 = new Graph();
    node9.setOwner(graph10);
    graph10.setName("");
    java.lang.String str14 = graph10.name;
    node2.setOwner(graph10);
    node2.setOwnerNameDirectly("hi!");
    graph0.addNode(node2);
    node2.setOwnerName("hi!");
    Node node22 = new Node("");
    Graph graph23 = Graph.generateGraph();
    java.lang.String str24 = graph23.name;
    graph23.init();
    node22.setOwner(graph23);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node2.addEdge(node22);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test052"); }


    Graph graph0 = Graph.generateGraph();
    java.lang.String str1 = graph0.name;
    Node node3 = new Node("");
    Graph graph4 = Graph.generateGraph();
    java.lang.String str5 = graph4.name;
    node3.setOwner(graph4);
    Graph graph7 = new Graph();
    node3.setOwner(graph7);
    Node node10 = new Node("");
    Graph graph11 = Graph.generateGraph();
    java.lang.String str12 = graph11.name;
    node10.setOwner(graph11);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node3, node10);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test053"); }


    Graph graph0 = Graph.generateGraph();
    Node node2 = new Node("");
    Node node4 = new Node("hi!");
    Graph graph5 = new Graph();
    node4.setOwner(graph5);
    node2.setOwner(graph5);
    Node node9 = new Node("hi!");
    Graph graph10 = new Graph();
    node9.setOwner(graph10);
    graph10.setName("");
    java.lang.String str14 = graph10.name;
    node2.setOwner(graph10);
    node2.setOwnerNameDirectly("hi!");
    graph0.addNode(node2);
    node2.setOwnerNameDirectly("hi!");
    node2.setOwnerNameDirectly("hi!");
    node2.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node2.thisIsNotCalled();

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test054"); }


    Graph graph0 = new Graph();
    graph0.name = "";
    Node node4 = new Node("");
    Graph graph5 = Graph.generateGraph();
    java.lang.String str6 = graph5.name;
    graph5.init();
    node4.setOwner(graph5);
    graph5.name = "hi!";
    Graph graph11 = new Graph();
    graph11.init();
    graph11.setName("");
    Node node16 = new Node("");
    graph11.addNode(node16);
    graph5.addNode(node16);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addNode(node16);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test055"); }


    Graph graph0 = new Graph();
    graph0.init();
    java.lang.String str2 = graph0.name;
    Node node4 = new Node("");
    Node node6 = new Node("hi!");
    Graph graph7 = new Graph();
    node6.setOwner(graph7);
    node4.setOwner(graph7);
    Node node11 = new Node("hi!");
    Graph graph12 = new Graph();
    node11.setOwner(graph12);
    graph12.setName("");
    java.lang.String str16 = graph12.name;
    node4.setOwner(graph12);
    node4.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i20 = graph0.getDegree(node4);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test056"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    Node node16 = new Node("");
    Graph graph17 = Graph.generateGraph();
    java.lang.String str18 = graph17.name;
    node16.setOwner(graph17);
    node16.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node16);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test057"); }


    Node node1 = new Node("hi!");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    graph4.setName("");
    node1.setOwner(graph4);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test058"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    java.lang.String str15 = graph9.name;
    Node node17 = new Node("[graph]");
    Graph graph18 = Graph.generateGraph();
    Node node20 = new Node("");
    Node node22 = new Node("hi!");
    Graph graph23 = new Graph();
    node22.setOwner(graph23);
    node20.setOwner(graph23);
    Node node27 = new Node("hi!");
    Graph graph28 = new Graph();
    node27.setOwner(graph28);
    graph28.setName("");
    java.lang.String str32 = graph28.name;
    node20.setOwner(graph28);
    node20.setOwnerNameDirectly("hi!");
    graph18.addNode(node20);
    node20.setOwnerNameDirectly("hi!");
    node20.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph9.addEdge(node17, node20);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test059"); }


    Node node1 = new Node("hi!");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    graph4.setName("");
    node1.setOwner(graph4);
    Node node10 = new Node("");
    Node node12 = new Node("hi!");
    Graph graph13 = new Graph();
    node12.setOwner(graph13);
    node10.setOwner(graph13);
    Node node17 = new Node("hi!");
    Graph graph18 = new Graph();
    node17.setOwner(graph18);
    graph18.setName("");
    java.lang.String str22 = graph18.name;
    node10.setOwner(graph18);
    node10.setOwnerName("hi!");
    node10.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node10);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test060"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    node1.setOwner(graph2);
    Graph graph5 = new Graph();
    node1.setOwner(graph5);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i7 = node1.getDegree();

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test061"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    java.lang.String str15 = graph9.name;
    Node node17 = new Node("");
    Node node19 = new Node("hi!");
    Graph graph20 = new Graph();
    node19.setOwner(graph20);
    node17.setOwner(graph20);
    Node node24 = new Node("hi!");
    Graph graph25 = new Graph();
    node24.setOwner(graph25);
    graph25.setName("");
    java.lang.String str29 = graph25.name;
    node17.setOwner(graph25);
    node17.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph9.addNode(node17);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test062"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    node1.setOwner(graph2);
    Graph graph5 = new Graph();
    node1.setOwner(graph5);
    Node node8 = new Node("hi!");
    Node node10 = new Node("hi!");
    Graph graph11 = new Graph();
    node10.setOwner(graph11);
    graph11.setName("");
    node8.setOwner(graph11);
    java.lang.String str16 = graph11.name;
    node1.setOwner(graph11);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test063"); }


    Graph graph0 = Graph.generateGraph();
    Node node2 = new Node("");
    Node node4 = new Node("hi!");
    Graph graph5 = new Graph();
    node4.setOwner(graph5);
    node2.setOwner(graph5);
    Node node9 = new Node("hi!");
    Graph graph10 = new Graph();
    node9.setOwner(graph10);
    graph10.setName("");
    java.lang.String str14 = graph10.name;
    node2.setOwner(graph10);
    node2.setOwnerNameDirectly("hi!");
    graph0.addNode(node2);
    Graph graph19 = Graph.generateGraph();
    node2.setOwner(graph19);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node2.thisIsNotCalled();

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test064"); }


    Graph graph0 = Graph.generateGraph();
    Node node2 = new Node("");
    Node node4 = new Node("hi!");
    Graph graph5 = new Graph();
    node4.setOwner(graph5);
    node2.setOwner(graph5);
    Node node9 = new Node("hi!");
    Graph graph10 = new Graph();
    node9.setOwner(graph10);
    graph10.setName("");
    java.lang.String str14 = graph10.name;
    node2.setOwner(graph10);
    node2.setOwnerNameDirectly("hi!");
    graph0.addNode(node2);
    Node node20 = new Node("");
    Node node22 = new Node("hi!");
    Graph graph23 = new Graph();
    node22.setOwner(graph23);
    node20.setOwner(graph23);
    Node node27 = new Node("hi!");
    Graph graph28 = new Graph();
    node27.setOwner(graph28);
    graph28.setName("");
    java.lang.String str32 = graph28.name;
    node20.setOwner(graph28);
    node20.setOwnerNameDirectly("[graph]");
    Graph graph36 = Graph.generateGraph();
    Node node38 = new Node("");
    Node node40 = new Node("hi!");
    Graph graph41 = new Graph();
    node40.setOwner(graph41);
    node38.setOwner(graph41);
    Node node45 = new Node("hi!");
    Graph graph46 = new Graph();
    node45.setOwner(graph46);
    graph46.setName("");
    java.lang.String str50 = graph46.name;
    node38.setOwner(graph46);
    node38.setOwnerNameDirectly("hi!");
    graph36.addNode(node38);
    node38.setOwnerNameDirectly("hi!");
    node38.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node20, node38);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test065"); }


    Node node1 = new Node("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.setOwnerName("[graph]");

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test066"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerNameDirectly("hi!");
    Graph graph17 = Graph.generateGraph();
    Node node19 = new Node("");
    Node node21 = new Node("hi!");
    Graph graph22 = new Graph();
    node21.setOwner(graph22);
    node19.setOwner(graph22);
    Node node26 = new Node("hi!");
    Graph graph27 = new Graph();
    node26.setOwner(graph27);
    graph27.setName("");
    java.lang.String str31 = graph27.name;
    node19.setOwner(graph27);
    node19.setOwnerNameDirectly("hi!");
    graph17.addNode(node19);
    node19.setOwnerNameDirectly("hi!");
    node19.setOwnerNameDirectly("hi!");
    node19.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node19);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test067"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    graph2.init();
    node1.setOwner(graph2);
    graph2.name = "hi!";
    Graph graph8 = new Graph();
    graph8.init();
    graph8.setName("");
    Node node13 = new Node("");
    graph8.addNode(node13);
    graph2.addNode(node13);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i16 = node13.getDegree();

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test068"); }


    Graph graph0 = Graph.generateGraph();
    Node node2 = new Node("");
    Node node4 = new Node("hi!");
    Graph graph5 = new Graph();
    node4.setOwner(graph5);
    node2.setOwner(graph5);
    Node node9 = new Node("hi!");
    Graph graph10 = new Graph();
    node9.setOwner(graph10);
    graph10.setName("");
    java.lang.String str14 = graph10.name;
    node2.setOwner(graph10);
    node2.setOwnerNameDirectly("hi!");
    graph0.addNode(node2);
    Graph graph19 = Graph.generateGraph();
    node2.setOwner(graph19);
    node2.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node2.thisIsNotCalled();

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test069"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerName("hi!");
    Graph graph17 = new Graph();
    graph17.init();
    node1.setOwner(graph17);
    Graph graph20 = Graph.generateGraph();
    Node node22 = new Node("");
    Node node24 = new Node("hi!");
    Graph graph25 = new Graph();
    node24.setOwner(graph25);
    node22.setOwner(graph25);
    Node node29 = new Node("hi!");
    Graph graph30 = new Graph();
    node29.setOwner(graph30);
    graph30.setName("");
    java.lang.String str34 = graph30.name;
    node22.setOwner(graph30);
    node22.setOwnerNameDirectly("hi!");
    graph20.addNode(node22);
    node22.setOwnerNameDirectly("hi!");
    Node node42 = new Node("");
    Graph graph43 = Graph.generateGraph();
    Node node45 = new Node("");
    Node node47 = new Node("hi!");
    Graph graph48 = new Graph();
    node47.setOwner(graph48);
    node45.setOwner(graph48);
    Node node52 = new Node("hi!");
    Graph graph53 = new Graph();
    node52.setOwner(graph53);
    graph53.setName("");
    java.lang.String str57 = graph53.name;
    node45.setOwner(graph53);
    node45.setOwnerNameDirectly("hi!");
    graph43.addNode(node45);
    graph43.name = "";
    node42.setOwner(graph43);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph17.addEdge(node22, node42);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test070"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    Graph graph15 = Graph.generateGraph();
    Node node17 = new Node("");
    Node node19 = new Node("hi!");
    Graph graph20 = new Graph();
    node19.setOwner(graph20);
    node17.setOwner(graph20);
    Node node24 = new Node("hi!");
    Graph graph25 = new Graph();
    node24.setOwner(graph25);
    graph25.setName("");
    java.lang.String str29 = graph25.name;
    node17.setOwner(graph25);
    node17.setOwnerNameDirectly("hi!");
    graph15.addNode(node17);
    Graph graph34 = Graph.generateGraph();
    node17.setOwner(graph34);
    node17.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node17);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test071"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerNameDirectly("hi!");
    Graph graph17 = Graph.generateGraph();
    Node node19 = new Node("");
    Node node21 = new Node("hi!");
    Graph graph22 = new Graph();
    node21.setOwner(graph22);
    node19.setOwner(graph22);
    Node node26 = new Node("hi!");
    Graph graph27 = new Graph();
    node26.setOwner(graph27);
    graph27.setName("");
    java.lang.String str31 = graph27.name;
    node19.setOwner(graph27);
    node19.setOwnerNameDirectly("hi!");
    graph17.addNode(node19);
    node1.setOwner(graph17);
    graph17.name = "";
    Node node40 = new Node("");
    Graph graph41 = Graph.generateGraph();
    java.lang.String str42 = graph41.name;
    node40.setOwner(graph41);
    Graph graph44 = new Graph();
    node40.setOwner(graph44);
    Graph graph46 = Graph.generateGraph();
    Node node48 = new Node("");
    Node node50 = new Node("hi!");
    Graph graph51 = new Graph();
    node50.setOwner(graph51);
    node48.setOwner(graph51);
    Node node55 = new Node("hi!");
    Graph graph56 = new Graph();
    node55.setOwner(graph56);
    graph56.setName("");
    java.lang.String str60 = graph56.name;
    node48.setOwner(graph56);
    node48.setOwnerNameDirectly("hi!");
    graph46.addNode(node48);
    Graph graph65 = Graph.generateGraph();
    node48.setOwner(graph65);
    Node node68 = new Node("hi!");
    Node node70 = new Node("hi!");
    Graph graph71 = new Graph();
    node70.setOwner(graph71);
    graph71.setName("");
    node68.setOwner(graph71);
    graph65.addNode(node68);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph17.addEdge(node40, node68);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test072"); }


    Graph graph0 = Graph.generateGraph();
    java.lang.String str1 = graph0.name;
    graph0.name = "";
    Node node5 = new Node("");
    Node node7 = new Node("hi!");
    Graph graph8 = new Graph();
    node7.setOwner(graph8);
    node5.setOwner(graph8);
    Node node12 = new Node("hi!");
    Graph graph13 = new Graph();
    node12.setOwner(graph13);
    graph13.setName("");
    java.lang.String str17 = graph13.name;
    node5.setOwner(graph13);
    node5.setOwnerNameDirectly("hi!");
    Node node22 = new Node("hi!");
    Node node24 = new Node("hi!");
    Graph graph25 = new Graph();
    node24.setOwner(graph25);
    graph25.setName("");
    node22.setOwner(graph25);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node5, node22);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test073"); }


    Node node1 = new Node("hi!");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    graph4.setName("");
    node1.setOwner(graph4);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i13 = node1.getDegree();

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test074"); }


    Node node1 = new Node("hi!");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    graph4.setName("");
    node1.setOwner(graph4);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i13 = node1.getDegree();

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test075"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    Node node4 = new Node("");
    Node node6 = new Node("hi!");
    Graph graph7 = new Graph();
    node6.setOwner(graph7);
    node4.setOwner(graph7);
    Node node11 = new Node("hi!");
    Graph graph12 = new Graph();
    node11.setOwner(graph12);
    graph12.setName("");
    java.lang.String str16 = graph12.name;
    node4.setOwner(graph12);
    node4.setOwnerNameDirectly("hi!");
    graph2.addNode(node4);
    node4.setOwnerNameDirectly("hi!");
    node4.setOwnerNameDirectly("hi!");
    node4.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node4);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test076"); }


    Node node1 = new Node("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test077"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerNameDirectly("hi!");
    Graph graph17 = Graph.generateGraph();
    Node node19 = new Node("");
    Node node21 = new Node("hi!");
    Graph graph22 = new Graph();
    node21.setOwner(graph22);
    node19.setOwner(graph22);
    Node node26 = new Node("hi!");
    Graph graph27 = new Graph();
    node26.setOwner(graph27);
    graph27.setName("");
    java.lang.String str31 = graph27.name;
    node19.setOwner(graph27);
    node19.setOwnerNameDirectly("hi!");
    graph17.addNode(node19);
    node1.setOwner(graph17);
    Node node38 = new Node("hi!");
    Graph graph39 = new Graph();
    node38.setOwner(graph39);
    graph39.setName("");
    graph39.setName("");
    node1.setOwner(graph39);
    Graph graph46 = Graph.generateGraph();
    Node node48 = new Node("");
    Node node50 = new Node("hi!");
    Graph graph51 = new Graph();
    node50.setOwner(graph51);
    node48.setOwner(graph51);
    Node node55 = new Node("hi!");
    Graph graph56 = new Graph();
    node55.setOwner(graph56);
    graph56.setName("");
    java.lang.String str60 = graph56.name;
    node48.setOwner(graph56);
    node48.setOwnerNameDirectly("hi!");
    graph46.addNode(node48);
    node48.setOwnerNameDirectly("hi!");
    node48.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node48);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test078"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    Node node16 = new Node("");
    Node node18 = new Node("hi!");
    Graph graph19 = new Graph();
    node18.setOwner(graph19);
    node16.setOwner(graph19);
    Node node23 = new Node("hi!");
    Graph graph24 = new Graph();
    node23.setOwner(graph24);
    graph24.setName("");
    java.lang.String str28 = graph24.name;
    node16.setOwner(graph24);
    node16.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node16);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test079"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i17 = node1.getDegree();

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test080"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    graph2.init();
    node1.setOwner(graph2);
    java.lang.String str6 = graph2.name;
    graph2.init();
    Node node9 = new Node("");
    Node node11 = new Node("hi!");
    Graph graph12 = new Graph();
    node11.setOwner(graph12);
    node9.setOwner(graph12);
    Node node16 = new Node("hi!");
    Graph graph17 = new Graph();
    node16.setOwner(graph17);
    graph17.setName("");
    java.lang.String str21 = graph17.name;
    node9.setOwner(graph17);
    node9.setOwnerNameDirectly("hi!");
    graph2.addNode(node9);
    Graph graph26 = Graph.generateGraph();
    Node node28 = new Node("");
    Node node30 = new Node("hi!");
    Graph graph31 = new Graph();
    node30.setOwner(graph31);
    node28.setOwner(graph31);
    Node node35 = new Node("hi!");
    Graph graph36 = new Graph();
    node35.setOwner(graph36);
    graph36.setName("");
    java.lang.String str40 = graph36.name;
    node28.setOwner(graph36);
    node28.setOwnerNameDirectly("hi!");
    graph26.addNode(node28);
    node28.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node9.addEdge(node28);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test081"); }


    Node node1 = new Node("hi!");
    Graph graph2 = new Graph();
    node1.setOwner(graph2);
    Graph graph4 = new Graph();
    graph4.init();
    graph4.setName("");
    Node node9 = new Node("");
    graph4.addNode(node9);
    Graph graph11 = Graph.generateGraph();
    Node node13 = new Node("");
    Node node15 = new Node("hi!");
    Graph graph16 = new Graph();
    node15.setOwner(graph16);
    node13.setOwner(graph16);
    Node node20 = new Node("hi!");
    Graph graph21 = new Graph();
    node20.setOwner(graph21);
    graph21.setName("");
    java.lang.String str25 = graph21.name;
    node13.setOwner(graph21);
    node13.setOwnerNameDirectly("hi!");
    graph11.addNode(node13);
    Graph graph30 = Graph.generateGraph();
    node13.setOwner(graph30);
    Node node33 = new Node("hi!");
    Node node35 = new Node("hi!");
    Graph graph36 = new Graph();
    node35.setOwner(graph36);
    graph36.setName("");
    node33.setOwner(graph36);
    graph30.addNode(node33);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph2.addEdge(node9, node33);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test082"); }


    Graph graph0 = Graph.generateGraph();
    Node node2 = new Node("");
    Node node4 = new Node("hi!");
    Graph graph5 = new Graph();
    node4.setOwner(graph5);
    node2.setOwner(graph5);
    Node node9 = new Node("hi!");
    Graph graph10 = new Graph();
    node9.setOwner(graph10);
    graph10.setName("");
    java.lang.String str14 = graph10.name;
    node2.setOwner(graph10);
    node2.setOwnerNameDirectly("hi!");
    graph0.addNode(node2);
    Graph graph19 = Graph.generateGraph();
    node2.setOwner(graph19);
    Node node22 = new Node("");
    Graph graph23 = Graph.generateGraph();
    java.lang.String str24 = graph23.name;
    node22.setOwner(graph23);
    Graph graph26 = new Graph();
    node22.setOwner(graph26);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i28 = graph19.getDegree(node22);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test083"); }


    Graph graph0 = Graph.generateGraph();
    Node node2 = new Node("");
    Node node4 = new Node("hi!");
    Graph graph5 = new Graph();
    node4.setOwner(graph5);
    node2.setOwner(graph5);
    Node node9 = new Node("hi!");
    Graph graph10 = new Graph();
    node9.setOwner(graph10);
    graph10.setName("");
    java.lang.String str14 = graph10.name;
    node2.setOwner(graph10);
    node2.setOwnerNameDirectly("hi!");
    graph0.addNode(node2);
    Node node20 = new Node("");
    Graph graph21 = Graph.generateGraph();
    java.lang.String str22 = graph21.name;
    graph21.init();
    node20.setOwner(graph21);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node2.addEdge(node20);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test084"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    graph2.init();
    node1.setOwner(graph2);
    graph2.name = "hi!";
    Graph graph8 = new Graph();
    graph8.init();
    graph8.setName("");
    Node node13 = new Node("");
    graph8.addNode(node13);
    graph2.addNode(node13);
    Graph graph16 = Graph.generateGraph();
    Node node18 = new Node("");
    Node node20 = new Node("hi!");
    Graph graph21 = new Graph();
    node20.setOwner(graph21);
    node18.setOwner(graph21);
    Node node25 = new Node("hi!");
    Graph graph26 = new Graph();
    node25.setOwner(graph26);
    graph26.setName("");
    java.lang.String str30 = graph26.name;
    node18.setOwner(graph26);
    node18.setOwnerNameDirectly("hi!");
    graph16.addNode(node18);
    node18.setOwnerNameDirectly("hi!");
    node18.setOwnerNameDirectly("hi!");
    Graph graph39 = Graph.generateGraph();
    Node node41 = new Node("");
    Node node43 = new Node("hi!");
    Graph graph44 = new Graph();
    node43.setOwner(graph44);
    node41.setOwner(graph44);
    Node node48 = new Node("hi!");
    Graph graph49 = new Graph();
    node48.setOwner(graph49);
    graph49.setName("");
    java.lang.String str53 = graph49.name;
    node41.setOwner(graph49);
    node41.setOwnerNameDirectly("hi!");
    graph39.addNode(node41);
    Graph graph58 = Graph.generateGraph();
    node41.setOwner(graph58);
    Node node61 = new Node("");
    Graph graph62 = Graph.generateGraph();
    java.lang.String str63 = graph62.name;
    node61.setOwner(graph62);
    Graph graph65 = new Graph();
    node61.setOwner(graph65);
    Node node68 = new Node("hi!");
    Node node70 = new Node("hi!");
    Graph graph71 = new Graph();
    node70.setOwner(graph71);
    graph71.setName("");
    node68.setOwner(graph71);
    java.lang.String str76 = graph71.name;
    node61.setOwner(graph71);
    Node node79 = new Node("");
    Graph graph80 = Graph.generateGraph();
    java.lang.String str81 = graph80.name;
    graph80.init();
    node79.setOwner(graph80);
    java.lang.String str84 = graph80.name;
    node61.setOwner(graph80);
    graph80.name = "";
    node41.setOwner(graph80);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph2.addEdge(node18, node41);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test085"); }


    Graph graph0 = new Graph();
    graph0.init();
    java.lang.String str2 = graph0.name;
    graph0.init();
    graph0.name = "hi!";
    graph0.setName("hi!");
    Node node9 = new Node("");
    Node node11 = new Node("hi!");
    Graph graph12 = new Graph();
    node11.setOwner(graph12);
    node9.setOwner(graph12);
    Node node16 = new Node("hi!");
    Graph graph17 = new Graph();
    node16.setOwner(graph17);
    graph17.setName("");
    java.lang.String str21 = graph17.name;
    node9.setOwner(graph17);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i23 = graph0.getDegree(node9);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test086"); }


    Graph graph0 = Graph.generateGraph();
    Node node2 = new Node("");
    Node node4 = new Node("hi!");
    Graph graph5 = new Graph();
    node4.setOwner(graph5);
    node2.setOwner(graph5);
    Node node9 = new Node("hi!");
    Graph graph10 = new Graph();
    node9.setOwner(graph10);
    graph10.setName("");
    java.lang.String str14 = graph10.name;
    node2.setOwner(graph10);
    node2.setOwnerNameDirectly("hi!");
    graph0.addNode(node2);
    node2.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node2.thisIsNotCalled();

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test087"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    Node node4 = new Node("");
    Node node6 = new Node("hi!");
    Graph graph7 = new Graph();
    node6.setOwner(graph7);
    node4.setOwner(graph7);
    Node node11 = new Node("hi!");
    Graph graph12 = new Graph();
    node11.setOwner(graph12);
    graph12.setName("");
    java.lang.String str16 = graph12.name;
    node4.setOwner(graph12);
    node4.setOwnerNameDirectly("hi!");
    graph2.addNode(node4);
    graph2.name = "";
    node1.setOwner(graph2);
    Node node25 = new Node("hi!");
    Graph graph26 = new Graph();
    node25.setOwner(graph26);
    graph2.addNode(node25);
    Node node30 = new Node("hi!");
    Node node32 = new Node("hi!");
    Graph graph33 = new Graph();
    node32.setOwner(graph33);
    graph33.setName("");
    node30.setOwner(graph33);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node25.addEdge(node30);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test088"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    node1.setOwner(graph2);
    Graph graph5 = new Graph();
    node1.setOwner(graph5);
    Node node8 = new Node("hi!");
    Node node10 = new Node("hi!");
    Graph graph11 = new Graph();
    node10.setOwner(graph11);
    graph11.setName("");
    node8.setOwner(graph11);
    java.lang.String str16 = graph11.name;
    node1.setOwner(graph11);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i18 = node1.getDegree();

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test089"); }


    Graph graph0 = Graph.generateGraph();
    java.lang.String str1 = graph0.name;
    Node node3 = new Node("");
    Node node5 = new Node("hi!");
    Graph graph6 = new Graph();
    node5.setOwner(graph6);
    node3.setOwner(graph6);
    Node node10 = new Node("hi!");
    Graph graph11 = new Graph();
    node10.setOwner(graph11);
    graph11.setName("");
    java.lang.String str15 = graph11.name;
    node3.setOwner(graph11);
    node3.setOwnerNameDirectly("[graph]");
    node3.setOwnerName("");
    Node node22 = new Node("");
    Node node24 = new Node("hi!");
    Graph graph25 = new Graph();
    node24.setOwner(graph25);
    node22.setOwner(graph25);
    Node node29 = new Node("hi!");
    Graph graph30 = new Graph();
    node29.setOwner(graph30);
    graph30.setName("");
    java.lang.String str34 = graph30.name;
    node22.setOwner(graph30);
    node22.setOwnerName("hi!");
    node22.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node3, node22);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test090"); }


    Node node1 = new Node("hi!");
    Graph graph2 = new Graph();
    node1.setOwner(graph2);
    node1.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test091"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerName("hi!");
    Graph graph17 = new Graph();
    graph17.init();
    node1.setOwner(graph17);
    Node node21 = new Node("");
    Node node23 = new Node("hi!");
    Graph graph24 = new Graph();
    node23.setOwner(graph24);
    node21.setOwner(graph24);
    Node node28 = new Node("hi!");
    Graph graph29 = new Graph();
    node28.setOwner(graph29);
    graph29.setName("");
    java.lang.String str33 = graph29.name;
    node21.setOwner(graph29);
    node21.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i37 = graph17.getDegree(node21);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test092"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    node1.setOwner(graph2);
    Graph graph5 = new Graph();
    node1.setOwner(graph5);
    Node node8 = new Node("");
    Graph graph9 = Graph.generateGraph();
    java.lang.String str10 = graph9.name;
    node8.setOwner(graph9);
    node8.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node8);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test093"); }


    Graph graph0 = Graph.generateGraph();
    Node node2 = new Node("");
    Node node4 = new Node("hi!");
    Graph graph5 = new Graph();
    node4.setOwner(graph5);
    node2.setOwner(graph5);
    Node node9 = new Node("hi!");
    Graph graph10 = new Graph();
    node9.setOwner(graph10);
    graph10.setName("");
    java.lang.String str14 = graph10.name;
    node2.setOwner(graph10);
    node2.setOwnerNameDirectly("hi!");
    graph0.addNode(node2);
    Graph graph19 = Graph.generateGraph();
    node2.setOwner(graph19);
    Node node22 = new Node("hi!");
    Node node24 = new Node("hi!");
    Graph graph25 = new Graph();
    node24.setOwner(graph25);
    graph25.setName("");
    node22.setOwner(graph25);
    graph19.addNode(node22);
    Node node32 = new Node("");
    Graph graph33 = Graph.generateGraph();
    Node node35 = new Node("");
    Node node37 = new Node("hi!");
    Graph graph38 = new Graph();
    node37.setOwner(graph38);
    node35.setOwner(graph38);
    Node node42 = new Node("hi!");
    Graph graph43 = new Graph();
    node42.setOwner(graph43);
    graph43.setName("");
    java.lang.String str47 = graph43.name;
    node35.setOwner(graph43);
    node35.setOwnerNameDirectly("hi!");
    graph33.addNode(node35);
    graph33.name = "";
    node32.setOwner(graph33);
    Node node56 = new Node("hi!");
    Graph graph57 = new Graph();
    node56.setOwner(graph57);
    graph33.addNode(node56);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i60 = graph19.getDegree(node56);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test094"); }


    Node node1 = new Node("hi!");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    graph4.setName("");
    node1.setOwner(graph4);
    graph4.setName("");
    Node node12 = new Node("hi!");
    Graph graph13 = new Graph();
    node12.setOwner(graph13);
    Node node16 = new Node("");
    Graph graph17 = Graph.generateGraph();
    Node node19 = new Node("");
    Node node21 = new Node("hi!");
    Graph graph22 = new Graph();
    node21.setOwner(graph22);
    node19.setOwner(graph22);
    Node node26 = new Node("hi!");
    Graph graph27 = new Graph();
    node26.setOwner(graph27);
    graph27.setName("");
    java.lang.String str31 = graph27.name;
    node19.setOwner(graph27);
    node19.setOwnerNameDirectly("hi!");
    graph17.addNode(node19);
    graph17.name = "";
    node16.setOwner(graph17);
    Node node40 = new Node("hi!");
    Graph graph41 = new Graph();
    node40.setOwner(graph41);
    graph17.addNode(node40);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph4.addEdge(node12, node40);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test095"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    java.lang.String str15 = graph9.name;
    graph9.setName("");
    graph9.setName("");
    Node node21 = new Node("");
    Graph graph22 = Graph.generateGraph();
    java.lang.String str23 = graph22.name;
    node21.setOwner(graph22);
    Node node26 = new Node("");
    Node node28 = new Node("hi!");
    Graph graph29 = new Graph();
    node28.setOwner(graph29);
    node26.setOwner(graph29);
    Node node33 = new Node("hi!");
    Graph graph34 = new Graph();
    node33.setOwner(graph34);
    graph34.setName("");
    java.lang.String str38 = graph34.name;
    node26.setOwner(graph34);
    node26.setOwnerNameDirectly("hi!");
    Graph graph42 = Graph.generateGraph();
    Node node44 = new Node("");
    Node node46 = new Node("hi!");
    Graph graph47 = new Graph();
    node46.setOwner(graph47);
    node44.setOwner(graph47);
    Node node51 = new Node("hi!");
    Graph graph52 = new Graph();
    node51.setOwner(graph52);
    graph52.setName("");
    java.lang.String str56 = graph52.name;
    node44.setOwner(graph52);
    node44.setOwnerNameDirectly("hi!");
    graph42.addNode(node44);
    node26.setOwner(graph42);
    node26.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph9.addEdge(node21, node26);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test096"); }


    Graph graph0 = Graph.generateGraph();
    Node node2 = new Node("");
    Node node4 = new Node("hi!");
    Graph graph5 = new Graph();
    node4.setOwner(graph5);
    node2.setOwner(graph5);
    Node node9 = new Node("hi!");
    Graph graph10 = new Graph();
    node9.setOwner(graph10);
    graph10.setName("");
    java.lang.String str14 = graph10.name;
    node2.setOwner(graph10);
    node2.setOwnerNameDirectly("hi!");
    graph0.addNode(node2);
    node2.setOwnerName("hi!");
    Node node22 = new Node("hi!");
    Graph graph23 = new Graph();
    node22.setOwner(graph23);
    graph23.setName("");
    graph23.setName("");
    graph23.setName("");
    node2.setOwner(graph23);
    Node node33 = new Node("hi!");
    Graph graph34 = new Graph();
    node33.setOwner(graph34);
    node33.setOwnerName("[graph]");
    Node node39 = new Node("");
    Node node41 = new Node("hi!");
    Graph graph42 = new Graph();
    node41.setOwner(graph42);
    node39.setOwner(graph42);
    Node node46 = new Node("hi!");
    Graph graph47 = new Graph();
    node46.setOwner(graph47);
    graph47.setName("");
    java.lang.String str51 = graph47.name;
    node39.setOwner(graph47);
    node39.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph23.addEdge(node33, node39);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test097"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    graph2.init();
    node1.setOwner(graph2);
    graph2.name = "hi!";
    Node node9 = new Node("");
    Graph graph10 = Graph.generateGraph();
    java.lang.String str11 = graph10.name;
    node9.setOwner(graph10);
    Graph graph13 = new Graph();
    node9.setOwner(graph13);
    Node node16 = new Node("");
    Node node18 = new Node("hi!");
    Graph graph19 = new Graph();
    node18.setOwner(graph19);
    node16.setOwner(graph19);
    Node node23 = new Node("hi!");
    Graph graph24 = new Graph();
    node23.setOwner(graph24);
    graph24.setName("");
    java.lang.String str28 = graph24.name;
    node16.setOwner(graph24);
    node16.setOwnerName("hi!");
    node16.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph2.addEdge(node9, node16);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test098"); }


    Graph graph0 = new Graph();
    graph0.init();
    graph0.setName("");
    Node node5 = new Node("");
    graph0.addNode(node5);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node5.setOwnerNameDirectly("[graph]");

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test099"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerNameDirectly("hi!");
    Graph graph17 = Graph.generateGraph();
    Node node19 = new Node("");
    Node node21 = new Node("hi!");
    Graph graph22 = new Graph();
    node21.setOwner(graph22);
    node19.setOwner(graph22);
    Node node26 = new Node("hi!");
    Graph graph27 = new Graph();
    node26.setOwner(graph27);
    graph27.setName("");
    java.lang.String str31 = graph27.name;
    node19.setOwner(graph27);
    node19.setOwnerNameDirectly("hi!");
    graph17.addNode(node19);
    node1.setOwner(graph17);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test100"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerName("hi!");
    Graph graph17 = new Graph();
    graph17.init();
    node1.setOwner(graph17);
    Node node21 = new Node("");
    graph17.addNode(node21);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node21.setOwnerNameDirectly("");

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test101"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerName("hi!");
    node1.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i19 = node1.getDegree();

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test102"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerNameDirectly("[graph]");
    Graph graph17 = Graph.generateGraph();
    Node node19 = new Node("");
    Node node21 = new Node("hi!");
    Graph graph22 = new Graph();
    node21.setOwner(graph22);
    node19.setOwner(graph22);
    Node node26 = new Node("hi!");
    Graph graph27 = new Graph();
    node26.setOwner(graph27);
    graph27.setName("");
    java.lang.String str31 = graph27.name;
    node19.setOwner(graph27);
    node19.setOwnerNameDirectly("hi!");
    graph17.addNode(node19);
    node1.setOwner(graph17);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test103"); }


    Node node1 = new Node("hi!");
    Graph graph2 = new Graph();
    node1.setOwner(graph2);
    node1.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i6 = node1.getDegree();

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test104"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    java.lang.String str15 = graph9.name;
    graph9.setName("");
    graph9.name = "";
    Node node21 = new Node("");
    Graph graph22 = Graph.generateGraph();
    java.lang.String str23 = graph22.name;
    graph22.init();
    node21.setOwner(graph22);
    java.lang.String str26 = graph22.name;
    graph22.init();
    Node node29 = new Node("");
    Node node31 = new Node("hi!");
    Graph graph32 = new Graph();
    node31.setOwner(graph32);
    node29.setOwner(graph32);
    Node node36 = new Node("hi!");
    Graph graph37 = new Graph();
    node36.setOwner(graph37);
    graph37.setName("");
    java.lang.String str41 = graph37.name;
    node29.setOwner(graph37);
    node29.setOwnerNameDirectly("hi!");
    graph22.addNode(node29);
    Node node47 = new Node("hi!");
    Node node49 = new Node("hi!");
    Graph graph50 = new Graph();
    node49.setOwner(graph50);
    graph50.setName("");
    node47.setOwner(graph50);
    node47.setOwnerNameDirectly("hi!");
    node47.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph9.addEdge(node29, node47);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test105"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    graph2.init();
    node1.setOwner(graph2);
    java.lang.String str6 = graph2.name;
    graph2.init();
    Node node9 = new Node("");
    Node node11 = new Node("hi!");
    Graph graph12 = new Graph();
    node11.setOwner(graph12);
    node9.setOwner(graph12);
    Node node16 = new Node("hi!");
    Graph graph17 = new Graph();
    node16.setOwner(graph17);
    graph17.setName("");
    java.lang.String str21 = graph17.name;
    node9.setOwner(graph17);
    node9.setOwnerNameDirectly("hi!");
    graph2.addNode(node9);
    Node node27 = new Node("");
    Graph graph28 = Graph.generateGraph();
    java.lang.String str29 = graph28.name;
    node27.setOwner(graph28);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i31 = graph2.getDegree(node27);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test106"); }


    Node node1 = new Node("hi!");
    Graph graph2 = new Graph();
    node1.setOwner(graph2);
    graph2.setName("");
    graph2.setName("[graph]");
    Node node9 = new Node("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph2.addNode(node9);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test107"); }


    Graph graph0 = Graph.generateGraph();
    Node node2 = new Node("");
    Node node4 = new Node("hi!");
    Graph graph5 = new Graph();
    node4.setOwner(graph5);
    node2.setOwner(graph5);
    Node node9 = new Node("hi!");
    Graph graph10 = new Graph();
    node9.setOwner(graph10);
    graph10.setName("");
    java.lang.String str14 = graph10.name;
    node2.setOwner(graph10);
    node2.setOwnerNameDirectly("hi!");
    graph0.addNode(node2);
    Graph graph19 = Graph.generateGraph();
    node2.setOwner(graph19);
    Node node22 = new Node("");
    Graph graph23 = Graph.generateGraph();
    java.lang.String str24 = graph23.name;
    node22.setOwner(graph23);
    Graph graph26 = new Graph();
    node22.setOwner(graph26);
    Node node29 = new Node("hi!");
    Node node31 = new Node("hi!");
    Graph graph32 = new Graph();
    node31.setOwner(graph32);
    graph32.setName("");
    node29.setOwner(graph32);
    java.lang.String str37 = graph32.name;
    node22.setOwner(graph32);
    Node node40 = new Node("");
    Graph graph41 = Graph.generateGraph();
    java.lang.String str42 = graph41.name;
    graph41.init();
    node40.setOwner(graph41);
    java.lang.String str45 = graph41.name;
    node22.setOwner(graph41);
    graph41.name = "";
    node2.setOwner(graph41);
    Graph graph50 = Graph.generateGraph();
    Node node52 = new Node("");
    Node node54 = new Node("hi!");
    Graph graph55 = new Graph();
    node54.setOwner(graph55);
    node52.setOwner(graph55);
    Node node59 = new Node("hi!");
    Graph graph60 = new Graph();
    node59.setOwner(graph60);
    graph60.setName("");
    java.lang.String str64 = graph60.name;
    node52.setOwner(graph60);
    node52.setOwnerNameDirectly("hi!");
    graph50.addNode(node52);
    Graph graph69 = Graph.generateGraph();
    node52.setOwner(graph69);
    graph41.addNode(node52);
    Node node73 = new Node("");
    Node node75 = new Node("hi!");
    Graph graph76 = new Graph();
    node75.setOwner(graph76);
    node73.setOwner(graph76);
    Node node80 = new Node("hi!");
    Graph graph81 = new Graph();
    node80.setOwner(graph81);
    graph81.setName("");
    java.lang.String str85 = graph81.name;
    node73.setOwner(graph81);
    node73.setOwnerNameDirectly("hi!");
    Node node90 = new Node("hi!");
    Node node92 = new Node("hi!");
    Graph graph93 = new Graph();
    node92.setOwner(graph93);
    graph93.setName("");
    node90.setOwner(graph93);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph41.addEdge(node73, node90);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test108"); }


    Graph graph0 = Graph.generateGraph();
    java.lang.String str1 = graph0.name;
    graph0.name = "";
    graph0.name = "[graph]";
    Node node7 = new Node("hi!");
    Node node9 = new Node("hi!");
    Graph graph10 = new Graph();
    node9.setOwner(graph10);
    graph10.setName("");
    node7.setOwner(graph10);
    node7.setOwnerNameDirectly("hi!");
    node7.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i19 = graph0.getDegree(node7);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test109"); }


    Graph graph0 = Graph.generateGraph();
    Node node2 = new Node("");
    Node node4 = new Node("hi!");
    Graph graph5 = new Graph();
    node4.setOwner(graph5);
    node2.setOwner(graph5);
    Node node9 = new Node("hi!");
    Graph graph10 = new Graph();
    node9.setOwner(graph10);
    graph10.setName("");
    java.lang.String str14 = graph10.name;
    node2.setOwner(graph10);
    node2.setOwnerNameDirectly("hi!");
    graph0.addNode(node2);
    Graph graph19 = Graph.generateGraph();
    node2.setOwner(graph19);
    Node node22 = new Node("");
    Graph graph23 = Graph.generateGraph();
    java.lang.String str24 = graph23.name;
    node22.setOwner(graph23);
    Graph graph26 = new Graph();
    node22.setOwner(graph26);
    Node node29 = new Node("hi!");
    Node node31 = new Node("hi!");
    Graph graph32 = new Graph();
    node31.setOwner(graph32);
    graph32.setName("");
    node29.setOwner(graph32);
    java.lang.String str37 = graph32.name;
    node22.setOwner(graph32);
    Node node40 = new Node("");
    Graph graph41 = Graph.generateGraph();
    java.lang.String str42 = graph41.name;
    graph41.init();
    node40.setOwner(graph41);
    java.lang.String str45 = graph41.name;
    node22.setOwner(graph41);
    graph41.name = "";
    node2.setOwner(graph41);
    Graph graph50 = Graph.generateGraph();
    Node node52 = new Node("");
    Node node54 = new Node("hi!");
    Graph graph55 = new Graph();
    node54.setOwner(graph55);
    node52.setOwner(graph55);
    Node node59 = new Node("hi!");
    Graph graph60 = new Graph();
    node59.setOwner(graph60);
    graph60.setName("");
    java.lang.String str64 = graph60.name;
    node52.setOwner(graph60);
    node52.setOwnerNameDirectly("hi!");
    graph50.addNode(node52);
    Graph graph69 = Graph.generateGraph();
    node52.setOwner(graph69);
    graph41.addNode(node52);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node52.thisIsNotCalled();

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test110"); }


    Graph graph0 = Graph.generateGraph();
    Node node2 = new Node("");
    Node node4 = new Node("hi!");
    Graph graph5 = new Graph();
    node4.setOwner(graph5);
    node2.setOwner(graph5);
    Node node9 = new Node("hi!");
    Graph graph10 = new Graph();
    node9.setOwner(graph10);
    graph10.setName("");
    java.lang.String str14 = graph10.name;
    node2.setOwner(graph10);
    node2.setOwnerNameDirectly("hi!");
    graph0.addNode(node2);
    node2.setOwnerNameDirectly("hi!");
    Graph graph21 = new Graph();
    graph21.init();
    java.lang.String str23 = graph21.name;
    Node node25 = new Node("");
    Graph graph26 = Graph.generateGraph();
    java.lang.String str27 = graph26.name;
    node25.setOwner(graph26);
    graph21.addNode(node25);
    node2.setOwner(graph21);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i31 = node2.getDegree();

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test111"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    node1.setOwner(graph2);
    Graph graph5 = new Graph();
    node1.setOwner(graph5);
    node1.setOwnerNameDirectly("hi!");
    Graph graph9 = Graph.generateGraph();
    Node node11 = new Node("");
    Node node13 = new Node("hi!");
    Graph graph14 = new Graph();
    node13.setOwner(graph14);
    node11.setOwner(graph14);
    Node node18 = new Node("hi!");
    Graph graph19 = new Graph();
    node18.setOwner(graph19);
    graph19.setName("");
    java.lang.String str23 = graph19.name;
    node11.setOwner(graph19);
    node11.setOwnerNameDirectly("hi!");
    graph9.addNode(node11);
    Graph graph28 = Graph.generateGraph();
    node11.setOwner(graph28);
    Node node31 = new Node("");
    Graph graph32 = Graph.generateGraph();
    java.lang.String str33 = graph32.name;
    node31.setOwner(graph32);
    Graph graph35 = new Graph();
    node31.setOwner(graph35);
    Node node38 = new Node("hi!");
    Node node40 = new Node("hi!");
    Graph graph41 = new Graph();
    node40.setOwner(graph41);
    graph41.setName("");
    node38.setOwner(graph41);
    java.lang.String str46 = graph41.name;
    node31.setOwner(graph41);
    Node node49 = new Node("");
    Graph graph50 = Graph.generateGraph();
    java.lang.String str51 = graph50.name;
    graph50.init();
    node49.setOwner(graph50);
    java.lang.String str54 = graph50.name;
    node31.setOwner(graph50);
    graph50.name = "";
    node11.setOwner(graph50);
    Graph graph59 = Graph.generateGraph();
    Node node61 = new Node("");
    Node node63 = new Node("hi!");
    Graph graph64 = new Graph();
    node63.setOwner(graph64);
    node61.setOwner(graph64);
    Node node68 = new Node("hi!");
    Graph graph69 = new Graph();
    node68.setOwner(graph69);
    graph69.setName("");
    java.lang.String str73 = graph69.name;
    node61.setOwner(graph69);
    node61.setOwnerNameDirectly("hi!");
    graph59.addNode(node61);
    Graph graph78 = Graph.generateGraph();
    node61.setOwner(graph78);
    graph50.addNode(node61);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node61);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test112"); }


    Node node1 = new Node("hi!");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    graph4.setName("");
    node1.setOwner(graph4);
    graph4.setName("");
    java.lang.String str11 = graph4.name;
    Node node13 = new Node("");
    Node node15 = new Node("hi!");
    Graph graph16 = new Graph();
    node15.setOwner(graph16);
    node13.setOwner(graph16);
    Node node20 = new Node("hi!");
    Graph graph21 = new Graph();
    node20.setOwner(graph21);
    graph21.setName("");
    java.lang.String str25 = graph21.name;
    node13.setOwner(graph21);
    node13.setOwnerNameDirectly("hi!");
    Graph graph29 = Graph.generateGraph();
    Node node31 = new Node("");
    Node node33 = new Node("hi!");
    Graph graph34 = new Graph();
    node33.setOwner(graph34);
    node31.setOwner(graph34);
    Node node38 = new Node("hi!");
    Graph graph39 = new Graph();
    node38.setOwner(graph39);
    graph39.setName("");
    java.lang.String str43 = graph39.name;
    node31.setOwner(graph39);
    node31.setOwnerNameDirectly("hi!");
    graph29.addNode(node31);
    node13.setOwner(graph29);
    Node node50 = new Node("hi!");
    Graph graph51 = new Graph();
    node50.setOwner(graph51);
    graph51.setName("");
    graph51.setName("");
    node13.setOwner(graph51);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i58 = graph4.getDegree(node13);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test113"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    node1.setOwner(graph2);
    Graph graph5 = new Graph();
    node1.setOwner(graph5);
    Node node8 = new Node("hi!");
    Node node10 = new Node("hi!");
    Graph graph11 = new Graph();
    node10.setOwner(graph11);
    graph11.setName("");
    node8.setOwner(graph11);
    java.lang.String str16 = graph11.name;
    node1.setOwner(graph11);
    Node node19 = new Node("");
    Graph graph20 = Graph.generateGraph();
    java.lang.String str21 = graph20.name;
    graph20.init();
    node19.setOwner(graph20);
    java.lang.String str24 = graph20.name;
    node1.setOwner(graph20);
    graph20.init();
    Graph graph27 = Graph.generateGraph();
    Node node29 = new Node("");
    Node node31 = new Node("hi!");
    Graph graph32 = new Graph();
    node31.setOwner(graph32);
    node29.setOwner(graph32);
    Node node36 = new Node("hi!");
    Graph graph37 = new Graph();
    node36.setOwner(graph37);
    graph37.setName("");
    java.lang.String str41 = graph37.name;
    node29.setOwner(graph37);
    node29.setOwnerNameDirectly("hi!");
    graph27.addNode(node29);
    node29.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i48 = graph20.getDegree(node29);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test114"); }


    Graph graph0 = Graph.generateGraph();
    Node node2 = new Node("");
    Node node4 = new Node("hi!");
    Graph graph5 = new Graph();
    node4.setOwner(graph5);
    node2.setOwner(graph5);
    Node node9 = new Node("hi!");
    Graph graph10 = new Graph();
    node9.setOwner(graph10);
    graph10.setName("");
    java.lang.String str14 = graph10.name;
    node2.setOwner(graph10);
    node2.setOwnerNameDirectly("hi!");
    graph0.addNode(node2);
    node2.setOwnerName("hi!");
    Node node22 = new Node("hi!");
    Graph graph23 = new Graph();
    node22.setOwner(graph23);
    graph23.setName("");
    graph23.setName("");
    graph23.setName("");
    node2.setOwner(graph23);
    Node node33 = new Node("");
    Graph graph34 = Graph.generateGraph();
    java.lang.String str35 = graph34.name;
    node33.setOwner(graph34);
    Graph graph37 = new Graph();
    node33.setOwner(graph37);
    Node node40 = new Node("hi!");
    Node node42 = new Node("hi!");
    Graph graph43 = new Graph();
    node42.setOwner(graph43);
    graph43.setName("");
    node40.setOwner(graph43);
    java.lang.String str48 = graph43.name;
    node33.setOwner(graph43);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node2.addEdge(node33);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test115"); }


    Node node1 = new Node("hi!");
    Graph graph2 = new Graph();
    node1.setOwner(graph2);
    graph2.setName("");
    Node node7 = new Node("");
    Graph graph8 = Graph.generateGraph();
    java.lang.String str9 = graph8.name;
    node7.setOwner(graph8);
    Graph graph11 = new Graph();
    node7.setOwner(graph11);
    Node node14 = new Node("hi!");
    Node node16 = new Node("hi!");
    Graph graph17 = new Graph();
    node16.setOwner(graph17);
    graph17.setName("");
    node14.setOwner(graph17);
    java.lang.String str22 = graph17.name;
    node7.setOwner(graph17);
    Node node25 = new Node("");
    Graph graph26 = Graph.generateGraph();
    java.lang.String str27 = graph26.name;
    graph26.init();
    node25.setOwner(graph26);
    java.lang.String str30 = graph26.name;
    node7.setOwner(graph26);
    Node node33 = new Node("");
    Node node35 = new Node("hi!");
    Graph graph36 = new Graph();
    node35.setOwner(graph36);
    node33.setOwner(graph36);
    Node node40 = new Node("hi!");
    Graph graph41 = new Graph();
    node40.setOwner(graph41);
    graph41.setName("");
    java.lang.String str45 = graph41.name;
    node33.setOwner(graph41);
    node33.setOwnerNameDirectly("[graph]");
    node33.setOwnerName("");
    node33.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph2.addEdge(node7, node33);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test116"); }


    Graph graph0 = Graph.generateGraph();
    Node node2 = new Node("");
    Node node4 = new Node("hi!");
    Graph graph5 = new Graph();
    node4.setOwner(graph5);
    node2.setOwner(graph5);
    Node node9 = new Node("hi!");
    Graph graph10 = new Graph();
    node9.setOwner(graph10);
    graph10.setName("");
    java.lang.String str14 = graph10.name;
    node2.setOwner(graph10);
    node2.setOwnerNameDirectly("hi!");
    graph0.addNode(node2);
    node2.setOwnerNameDirectly("hi!");
    Graph graph21 = new Graph();
    graph21.init();
    java.lang.String str23 = graph21.name;
    Node node25 = new Node("");
    Graph graph26 = Graph.generateGraph();
    java.lang.String str27 = graph26.name;
    node25.setOwner(graph26);
    graph21.addNode(node25);
    node2.setOwner(graph21);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node2.thisIsNotCalled();

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test117"); }


    Node node1 = new Node("hi!");
    Graph graph2 = new Graph();
    node1.setOwner(graph2);
    node1.setOwnerName("[graph]");
    Node node7 = new Node("");
    Node node9 = new Node("hi!");
    Graph graph10 = new Graph();
    node9.setOwner(graph10);
    node7.setOwner(graph10);
    Node node14 = new Node("hi!");
    Graph graph15 = new Graph();
    node14.setOwner(graph15);
    graph15.setName("");
    java.lang.String str19 = graph15.name;
    node7.setOwner(graph15);
    node1.setOwner(graph15);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i22 = node1.getDegree();

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test118"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    graph2.init();
    node1.setOwner(graph2);
    java.lang.String str6 = graph2.name;
    graph2.name = "[graph]";
    graph2.name = "hi!";
    Node node12 = new Node("");
    Node node14 = new Node("hi!");
    Graph graph15 = new Graph();
    node14.setOwner(graph15);
    node12.setOwner(graph15);
    Node node19 = new Node("hi!");
    Graph graph20 = new Graph();
    node19.setOwner(graph20);
    graph20.setName("");
    java.lang.String str24 = graph20.name;
    node12.setOwner(graph20);
    node12.setOwnerNameDirectly("hi!");
    Graph graph28 = Graph.generateGraph();
    Node node30 = new Node("");
    Node node32 = new Node("hi!");
    Graph graph33 = new Graph();
    node32.setOwner(graph33);
    node30.setOwner(graph33);
    Node node37 = new Node("hi!");
    Graph graph38 = new Graph();
    node37.setOwner(graph38);
    graph38.setName("");
    java.lang.String str42 = graph38.name;
    node30.setOwner(graph38);
    node30.setOwnerNameDirectly("hi!");
    graph28.addNode(node30);
    node12.setOwner(graph28);
    node12.setOwnerNameDirectly("");
    Graph graph50 = Graph.generateGraph();
    Node node52 = new Node("");
    Node node54 = new Node("hi!");
    Graph graph55 = new Graph();
    node54.setOwner(graph55);
    node52.setOwner(graph55);
    Node node59 = new Node("hi!");
    Graph graph60 = new Graph();
    node59.setOwner(graph60);
    graph60.setName("");
    java.lang.String str64 = graph60.name;
    node52.setOwner(graph60);
    node52.setOwnerNameDirectly("hi!");
    graph50.addNode(node52);
    Graph graph69 = Graph.generateGraph();
    node52.setOwner(graph69);
    node52.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph2.addEdge(node12, node52);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test119"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerNameDirectly("[graph]");
    node1.setOwnerName("");
    Graph graph19 = new Graph();
    graph19.init();
    graph19.setName("");
    java.lang.String str23 = graph19.name;
    node1.setOwner(graph19);
    Node node26 = new Node("hi!");
    Node node28 = new Node("hi!");
    Graph graph29 = new Graph();
    node28.setOwner(graph29);
    graph29.setName("");
    node26.setOwner(graph29);
    node26.setOwnerNameDirectly("hi!");
    node26.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i38 = graph19.getDegree(node26);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test120"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    Node node4 = new Node("");
    Node node6 = new Node("hi!");
    Graph graph7 = new Graph();
    node6.setOwner(graph7);
    node4.setOwner(graph7);
    Node node11 = new Node("hi!");
    Graph graph12 = new Graph();
    node11.setOwner(graph12);
    graph12.setName("");
    java.lang.String str16 = graph12.name;
    node4.setOwner(graph12);
    node4.setOwnerNameDirectly("hi!");
    graph2.addNode(node4);
    graph2.name = "";
    node1.setOwner(graph2);
    Node node25 = new Node("");
    Graph graph26 = Graph.generateGraph();
    Node node28 = new Node("");
    Node node30 = new Node("hi!");
    Graph graph31 = new Graph();
    node30.setOwner(graph31);
    node28.setOwner(graph31);
    Node node35 = new Node("hi!");
    Graph graph36 = new Graph();
    node35.setOwner(graph36);
    graph36.setName("");
    java.lang.String str40 = graph36.name;
    node28.setOwner(graph36);
    node28.setOwnerNameDirectly("hi!");
    graph26.addNode(node28);
    graph26.name = "";
    node25.setOwner(graph26);
    Node node49 = new Node("hi!");
    Graph graph50 = new Graph();
    node49.setOwner(graph50);
    graph26.addNode(node49);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node49);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test121"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    graph4.name = "";
    Graph graph9 = Graph.generateGraph();
    Node node11 = new Node("");
    Node node13 = new Node("hi!");
    Graph graph14 = new Graph();
    node13.setOwner(graph14);
    node11.setOwner(graph14);
    Node node18 = new Node("hi!");
    Graph graph19 = new Graph();
    node18.setOwner(graph19);
    graph19.setName("");
    java.lang.String str23 = graph19.name;
    node11.setOwner(graph19);
    node11.setOwnerNameDirectly("hi!");
    graph9.addNode(node11);
    node11.setOwnerName("hi!");
    Node node31 = new Node("hi!");
    Graph graph32 = new Graph();
    node31.setOwner(graph32);
    graph32.setName("");
    graph32.setName("");
    graph32.setName("");
    node11.setOwner(graph32);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i41 = graph4.getDegree(node11);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test122"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    java.lang.String str15 = graph9.name;
    Graph graph16 = Graph.generateGraph();
    Node node18 = new Node("");
    Node node20 = new Node("hi!");
    Graph graph21 = new Graph();
    node20.setOwner(graph21);
    node18.setOwner(graph21);
    Node node25 = new Node("hi!");
    Graph graph26 = new Graph();
    node25.setOwner(graph26);
    graph26.setName("");
    java.lang.String str30 = graph26.name;
    node18.setOwner(graph26);
    node18.setOwnerNameDirectly("hi!");
    graph16.addNode(node18);
    Graph graph35 = Graph.generateGraph();
    node18.setOwner(graph35);
    Node node38 = new Node("");
    Graph graph39 = Graph.generateGraph();
    java.lang.String str40 = graph39.name;
    node38.setOwner(graph39);
    Graph graph42 = new Graph();
    node38.setOwner(graph42);
    Node node45 = new Node("hi!");
    Node node47 = new Node("hi!");
    Graph graph48 = new Graph();
    node47.setOwner(graph48);
    graph48.setName("");
    node45.setOwner(graph48);
    java.lang.String str53 = graph48.name;
    node38.setOwner(graph48);
    Node node56 = new Node("");
    Graph graph57 = Graph.generateGraph();
    java.lang.String str58 = graph57.name;
    graph57.init();
    node56.setOwner(graph57);
    java.lang.String str61 = graph57.name;
    node38.setOwner(graph57);
    graph57.name = "";
    node18.setOwner(graph57);
    Node node67 = new Node("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph9.addEdge(node18, node67);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test123"); }


    Node node1 = new Node("hi!");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    graph4.setName("");
    node1.setOwner(graph4);
    java.lang.String str9 = graph4.name;
    graph4.setName("hi!");
    Node node13 = new Node("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph4.addNode(node13);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test124"); }


    Node node1 = new Node("hi!");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    graph4.setName("");
    node1.setOwner(graph4);
    java.lang.String str9 = graph4.name;
    graph4.name = "hi!";
    Node node13 = new Node("");
    Graph graph14 = Graph.generateGraph();
    java.lang.String str15 = graph14.name;
    node13.setOwner(graph14);
    Graph graph17 = new Graph();
    node13.setOwner(graph17);
    Node node20 = new Node("hi!");
    Node node22 = new Node("hi!");
    Graph graph23 = new Graph();
    node22.setOwner(graph23);
    graph23.setName("");
    node20.setOwner(graph23);
    java.lang.String str28 = graph23.name;
    node13.setOwner(graph23);
    Node node31 = new Node("");
    Graph graph32 = Graph.generateGraph();
    java.lang.String str33 = graph32.name;
    graph32.init();
    node31.setOwner(graph32);
    java.lang.String str36 = graph32.name;
    node13.setOwner(graph32);
    Node node39 = new Node("hi!");
    Node node41 = new Node("hi!");
    Graph graph42 = new Graph();
    node41.setOwner(graph42);
    graph42.setName("");
    node39.setOwner(graph42);
    node39.setOwnerNameDirectly("hi!");
    graph32.addNode(node39);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i50 = graph4.getDegree(node39);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test125"); }


    Node node1 = new Node("hi!");
    Graph graph2 = new Graph();
    node1.setOwner(graph2);
    graph2.setName("");
    graph2.init();
    Graph graph7 = Graph.generateGraph();
    Node node9 = new Node("");
    Node node11 = new Node("hi!");
    Graph graph12 = new Graph();
    node11.setOwner(graph12);
    node9.setOwner(graph12);
    Node node16 = new Node("hi!");
    Graph graph17 = new Graph();
    node16.setOwner(graph17);
    graph17.setName("");
    java.lang.String str21 = graph17.name;
    node9.setOwner(graph17);
    node9.setOwnerNameDirectly("hi!");
    graph7.addNode(node9);
    Graph graph26 = Graph.generateGraph();
    node9.setOwner(graph26);
    node9.setOwnerName("hi!");
    Node node31 = new Node("hi!");
    Graph graph32 = new Graph();
    node31.setOwner(graph32);
    graph32.setName("");
    graph32.setName("[graph]");
    node9.setOwner(graph32);
    Node node40 = new Node("");
    Node node42 = new Node("hi!");
    Graph graph43 = new Graph();
    node42.setOwner(graph43);
    node40.setOwner(graph43);
    Node node47 = new Node("hi!");
    Graph graph48 = new Graph();
    node47.setOwner(graph48);
    graph48.setName("");
    java.lang.String str52 = graph48.name;
    node40.setOwner(graph48);
    node40.setOwnerNameDirectly("hi!");
    Graph graph56 = Graph.generateGraph();
    Node node58 = new Node("");
    Node node60 = new Node("hi!");
    Graph graph61 = new Graph();
    node60.setOwner(graph61);
    node58.setOwner(graph61);
    Node node65 = new Node("hi!");
    Graph graph66 = new Graph();
    node65.setOwner(graph66);
    graph66.setName("");
    java.lang.String str70 = graph66.name;
    node58.setOwner(graph66);
    node58.setOwnerNameDirectly("hi!");
    graph56.addNode(node58);
    node40.setOwner(graph56);
    Node node77 = new Node("hi!");
    Graph graph78 = new Graph();
    node77.setOwner(graph78);
    graph78.setName("");
    graph78.setName("");
    node40.setOwner(graph78);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph2.addEdge(node9, node40);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test126"); }


    Node node1 = new Node("hi!");
    Graph graph2 = new Graph();
    node1.setOwner(graph2);
    graph2.setName("");
    graph2.setName("");
    graph2.init();
    Node node10 = new Node("");
    Graph graph11 = Graph.generateGraph();
    java.lang.String str12 = graph11.name;
    graph11.init();
    node10.setOwner(graph11);
    graph11.name = "hi!";
    Graph graph17 = new Graph();
    graph17.init();
    graph17.setName("");
    Node node22 = new Node("");
    graph17.addNode(node22);
    graph11.addNode(node22);
    graph2.addNode(node22);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i26 = node22.getDegree();

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test127"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerName("hi!");
    node1.setOwnerName("hi!");
    node1.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test128"); }


    Graph graph0 = Graph.generateGraph();
    Node node2 = new Node("");
    Node node4 = new Node("hi!");
    Graph graph5 = new Graph();
    node4.setOwner(graph5);
    node2.setOwner(graph5);
    Node node9 = new Node("hi!");
    Graph graph10 = new Graph();
    node9.setOwner(graph10);
    graph10.setName("");
    java.lang.String str14 = graph10.name;
    node2.setOwner(graph10);
    node2.setOwnerNameDirectly("hi!");
    graph0.addNode(node2);
    node2.setOwnerNameDirectly("hi!");
    node2.setOwnerNameDirectly("hi!");
    node2.setOwnerNameDirectly("[graph]");
    Node node26 = new Node("");
    Node node28 = new Node("hi!");
    Graph graph29 = new Graph();
    node28.setOwner(graph29);
    node26.setOwner(graph29);
    Node node33 = new Node("hi!");
    Graph graph34 = new Graph();
    node33.setOwner(graph34);
    graph34.setName("");
    java.lang.String str38 = graph34.name;
    node26.setOwner(graph34);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node2.addEdge(node26);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test129"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    graph2.init();
    node1.setOwner(graph2);
    java.lang.String str6 = graph2.name;
    graph2.name = "[graph]";
    graph2.name = "hi!";
    Node node12 = new Node("hi!");
    Node node14 = new Node("hi!");
    Graph graph15 = new Graph();
    node14.setOwner(graph15);
    graph15.setName("");
    node12.setOwner(graph15);
    Node node21 = new Node("hi!");
    Node node23 = new Node("hi!");
    Graph graph24 = new Graph();
    node23.setOwner(graph24);
    graph24.setName("");
    node21.setOwner(graph24);
    node21.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph2.addEdge(node12, node21);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test130"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    node1.setOwner(graph2);
    Graph graph5 = new Graph();
    node1.setOwner(graph5);
    Node node8 = new Node("hi!");
    Node node10 = new Node("hi!");
    Graph graph11 = new Graph();
    node10.setOwner(graph11);
    graph11.setName("");
    node8.setOwner(graph11);
    java.lang.String str16 = graph11.name;
    node1.setOwner(graph11);
    Node node19 = new Node("");
    Graph graph20 = Graph.generateGraph();
    java.lang.String str21 = graph20.name;
    graph20.init();
    node19.setOwner(graph20);
    java.lang.String str24 = graph20.name;
    node1.setOwner(graph20);
    Node node27 = new Node("hi!");
    Node node29 = new Node("hi!");
    Graph graph30 = new Graph();
    node29.setOwner(graph30);
    graph30.setName("");
    node27.setOwner(graph30);
    node27.setOwnerNameDirectly("hi!");
    graph20.addNode(node27);
    Node node39 = new Node("");
    Node node41 = new Node("hi!");
    Graph graph42 = new Graph();
    node41.setOwner(graph42);
    node39.setOwner(graph42);
    Node node46 = new Node("hi!");
    Graph graph47 = new Graph();
    node46.setOwner(graph47);
    graph47.setName("");
    java.lang.String str51 = graph47.name;
    node39.setOwner(graph47);
    node39.setOwnerNameDirectly("[graph]");
    node39.setOwnerName("");
    Graph graph57 = new Graph();
    graph57.init();
    graph57.setName("");
    java.lang.String str61 = graph57.name;
    node39.setOwner(graph57);
    Graph graph63 = Graph.generateGraph();
    Node node65 = new Node("");
    Node node67 = new Node("hi!");
    Graph graph68 = new Graph();
    node67.setOwner(graph68);
    node65.setOwner(graph68);
    Node node72 = new Node("hi!");
    Graph graph73 = new Graph();
    node72.setOwner(graph73);
    graph73.setName("");
    java.lang.String str77 = graph73.name;
    node65.setOwner(graph73);
    node65.setOwnerNameDirectly("hi!");
    graph63.addNode(node65);
    node65.setOwnerNameDirectly("hi!");
    node65.setOwnerNameDirectly("hi!");
    node65.setOwnerNameDirectly("[graph]");
    graph57.addNode(node65);
    Node node90 = new Node("");
    Graph graph91 = Graph.generateGraph();
    java.lang.String str92 = graph91.name;
    node90.setOwner(graph91);
    Graph graph94 = new Graph();
    node90.setOwner(graph94);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph20.addEdge(node65, node90);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test131"); }


    Graph graph0 = Graph.generateGraph();
    Node node2 = new Node("");
    Node node4 = new Node("hi!");
    Graph graph5 = new Graph();
    node4.setOwner(graph5);
    node2.setOwner(graph5);
    Node node9 = new Node("hi!");
    Graph graph10 = new Graph();
    node9.setOwner(graph10);
    graph10.setName("");
    java.lang.String str14 = graph10.name;
    node2.setOwner(graph10);
    node2.setOwnerNameDirectly("hi!");
    graph0.addNode(node2);
    Graph graph19 = Graph.generateGraph();
    node2.setOwner(graph19);
    Node node22 = new Node("");
    Node node24 = new Node("hi!");
    Graph graph25 = new Graph();
    node24.setOwner(graph25);
    node22.setOwner(graph25);
    Node node29 = new Node("hi!");
    Graph graph30 = new Graph();
    node29.setOwner(graph30);
    graph30.setName("");
    java.lang.String str34 = graph30.name;
    node22.setOwner(graph30);
    node22.setOwnerName("hi!");
    node22.setOwnerName("hi!");
    node22.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i42 = graph19.getDegree(node22);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test132"); }


    Graph graph0 = new Graph();
    graph0.init();
    graph0.setName("");
    Node node5 = new Node("");
    graph0.addNode(node5);
    Node node8 = new Node("hi!");
    Node node10 = new Node("hi!");
    Graph graph11 = new Graph();
    node10.setOwner(graph11);
    graph11.setName("");
    node8.setOwner(graph11);
    node8.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node5.addEdge(node8);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test133"); }


    Graph graph0 = Graph.generateGraph();
    Node node2 = new Node("");
    Node node4 = new Node("hi!");
    Graph graph5 = new Graph();
    node4.setOwner(graph5);
    node2.setOwner(graph5);
    Node node9 = new Node("hi!");
    Graph graph10 = new Graph();
    node9.setOwner(graph10);
    graph10.setName("");
    java.lang.String str14 = graph10.name;
    node2.setOwner(graph10);
    node2.setOwnerNameDirectly("hi!");
    graph0.addNode(node2);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node2.thisIsNotCalled();

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test134"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerNameDirectly("hi!");
    Graph graph17 = Graph.generateGraph();
    Node node19 = new Node("");
    Node node21 = new Node("hi!");
    Graph graph22 = new Graph();
    node21.setOwner(graph22);
    node19.setOwner(graph22);
    Node node26 = new Node("hi!");
    Graph graph27 = new Graph();
    node26.setOwner(graph27);
    graph27.setName("");
    java.lang.String str31 = graph27.name;
    node19.setOwner(graph27);
    node19.setOwnerNameDirectly("hi!");
    graph17.addNode(node19);
    node1.setOwner(graph17);
    node1.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i39 = node1.getDegree();

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test135"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    node1.setOwner(graph2);
    Graph graph5 = new Graph();
    node1.setOwner(graph5);
    node1.setOwnerNameDirectly("[graph]");
    Node node10 = new Node("hi!");
    Graph graph11 = new Graph();
    node10.setOwner(graph11);
    graph11.setName("");
    graph11.setName("");
    graph11.init();
    Node node19 = new Node("");
    Graph graph20 = Graph.generateGraph();
    java.lang.String str21 = graph20.name;
    graph20.init();
    node19.setOwner(graph20);
    graph20.name = "hi!";
    Graph graph26 = new Graph();
    graph26.init();
    graph26.setName("");
    Node node31 = new Node("");
    graph26.addNode(node31);
    graph20.addNode(node31);
    graph11.addNode(node31);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node31);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test136"); }


    Node node1 = new Node("hi!");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    graph4.setName("");
    node1.setOwner(graph4);
    Node node10 = new Node("");
    Graph graph11 = Graph.generateGraph();
    java.lang.String str12 = graph11.name;
    node10.setOwner(graph11);
    node10.setOwnerNameDirectly("");
    node10.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node10);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test137"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    node1.setOwner(graph2);
    Graph graph5 = new Graph();
    node1.setOwner(graph5);
    node1.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i9 = node1.getDegree();

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test138"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    node1.setOwner(graph2);
    Graph graph5 = new Graph();
    node1.setOwner(graph5);
    Node node8 = new Node("hi!");
    Node node10 = new Node("hi!");
    Graph graph11 = new Graph();
    node10.setOwner(graph11);
    graph11.setName("");
    node8.setOwner(graph11);
    java.lang.String str16 = graph11.name;
    node1.setOwner(graph11);
    Node node19 = new Node("");
    Graph graph20 = Graph.generateGraph();
    java.lang.String str21 = graph20.name;
    graph20.init();
    node19.setOwner(graph20);
    java.lang.String str24 = graph20.name;
    node1.setOwner(graph20);
    Node node27 = new Node("hi!");
    Node node29 = new Node("hi!");
    Graph graph30 = new Graph();
    node29.setOwner(graph30);
    graph30.setName("");
    node27.setOwner(graph30);
    node27.setOwnerNameDirectly("hi!");
    graph20.addNode(node27);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node27.thisIsNotCalled();

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test139"); }


    Node node1 = new Node("hi!");
    Graph graph2 = new Graph();
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i6 = node1.getDegree();

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test140"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerNameDirectly("hi!");
    Graph graph17 = Graph.generateGraph();
    Node node19 = new Node("");
    Node node21 = new Node("hi!");
    Graph graph22 = new Graph();
    node21.setOwner(graph22);
    node19.setOwner(graph22);
    Node node26 = new Node("hi!");
    Graph graph27 = new Graph();
    node26.setOwner(graph27);
    graph27.setName("");
    java.lang.String str31 = graph27.name;
    node19.setOwner(graph27);
    node19.setOwnerNameDirectly("hi!");
    graph17.addNode(node19);
    node19.setOwnerNameDirectly("hi!");
    node19.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node19);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test141"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    node1.setOwner(graph2);
    Graph graph5 = new Graph();
    node1.setOwner(graph5);
    Node node8 = new Node("hi!");
    Node node10 = new Node("hi!");
    Graph graph11 = new Graph();
    node10.setOwner(graph11);
    graph11.setName("");
    node8.setOwner(graph11);
    java.lang.String str16 = graph11.name;
    node1.setOwner(graph11);
    Node node19 = new Node("");
    Graph graph20 = Graph.generateGraph();
    java.lang.String str21 = graph20.name;
    graph20.init();
    node19.setOwner(graph20);
    java.lang.String str24 = graph20.name;
    node1.setOwner(graph20);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i26 = node1.getDegree();

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test142"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    Node node4 = new Node("");
    Node node6 = new Node("hi!");
    Graph graph7 = new Graph();
    node6.setOwner(graph7);
    node4.setOwner(graph7);
    Node node11 = new Node("hi!");
    Graph graph12 = new Graph();
    node11.setOwner(graph12);
    graph12.setName("");
    java.lang.String str16 = graph12.name;
    node4.setOwner(graph12);
    node4.setOwnerNameDirectly("hi!");
    graph2.addNode(node4);
    graph2.name = "";
    node1.setOwner(graph2);
    Node node25 = new Node("hi!");
    Graph graph26 = new Graph();
    node25.setOwner(graph26);
    graph2.addNode(node25);
    node25.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i31 = node25.getDegree();

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test143"); }


    Graph graph0 = Graph.generateGraph();
    Node node2 = new Node("");
    Node node4 = new Node("hi!");
    Graph graph5 = new Graph();
    node4.setOwner(graph5);
    node2.setOwner(graph5);
    Node node9 = new Node("hi!");
    Graph graph10 = new Graph();
    node9.setOwner(graph10);
    graph10.setName("");
    java.lang.String str14 = graph10.name;
    node2.setOwner(graph10);
    node2.setOwnerNameDirectly("hi!");
    graph0.addNode(node2);
    Graph graph19 = Graph.generateGraph();
    node2.setOwner(graph19);
    Node node22 = new Node("");
    Graph graph23 = Graph.generateGraph();
    java.lang.String str24 = graph23.name;
    node22.setOwner(graph23);
    Graph graph26 = new Graph();
    node22.setOwner(graph26);
    Node node29 = new Node("hi!");
    Node node31 = new Node("hi!");
    Graph graph32 = new Graph();
    node31.setOwner(graph32);
    graph32.setName("");
    node29.setOwner(graph32);
    java.lang.String str37 = graph32.name;
    node22.setOwner(graph32);
    Node node40 = new Node("");
    Graph graph41 = Graph.generateGraph();
    java.lang.String str42 = graph41.name;
    graph41.init();
    node40.setOwner(graph41);
    java.lang.String str45 = graph41.name;
    node22.setOwner(graph41);
    graph41.name = "";
    node2.setOwner(graph41);
    node2.setOwnerNameDirectly("hi!");
    Node node53 = new Node("");
    Node node55 = new Node("hi!");
    Graph graph56 = new Graph();
    node55.setOwner(graph56);
    node53.setOwner(graph56);
    Node node60 = new Node("hi!");
    Graph graph61 = new Graph();
    node60.setOwner(graph61);
    graph61.setName("");
    java.lang.String str65 = graph61.name;
    node53.setOwner(graph61);
    Node node68 = new Node("");
    Graph graph69 = Graph.generateGraph();
    java.lang.String str70 = graph69.name;
    node68.setOwner(graph69);
    graph69.setName("");
    java.lang.String str74 = graph69.name;
    node53.setOwner(graph69);
    node2.setOwner(graph69);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i77 = node2.getDegree();

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test144"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    node1.setOwner(graph2);
    Graph graph5 = new Graph();
    node1.setOwner(graph5);
    node1.setOwnerNameDirectly("[graph]");
    Node node10 = new Node("");
    Node node12 = new Node("hi!");
    Graph graph13 = new Graph();
    node12.setOwner(graph13);
    node10.setOwner(graph13);
    Node node17 = new Node("hi!");
    Graph graph18 = new Graph();
    node17.setOwner(graph18);
    graph18.setName("");
    java.lang.String str22 = graph18.name;
    node10.setOwner(graph18);
    node10.setOwnerNameDirectly("[graph]");
    node10.setOwnerName("");
    node10.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node10);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test145"); }


    Node node1 = new Node("hi!");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    graph4.setName("");
    node1.setOwner(graph4);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerNameDirectly("[graph]");
    Node node14 = new Node("");
    Graph graph15 = Graph.generateGraph();
    java.lang.String str16 = graph15.name;
    graph15.init();
    node14.setOwner(graph15);
    java.lang.String str19 = graph15.name;
    graph15.init();
    node1.setOwner(graph15);
    Node node23 = new Node("hi!");
    Node node25 = new Node("hi!");
    Graph graph26 = new Graph();
    node25.setOwner(graph26);
    graph26.setName("");
    node23.setOwner(graph26);
    node23.setOwnerNameDirectly("hi!");
    node23.setOwnerNameDirectly("[graph]");
    Node node36 = new Node("");
    Graph graph37 = Graph.generateGraph();
    java.lang.String str38 = graph37.name;
    graph37.init();
    node36.setOwner(graph37);
    java.lang.String str41 = graph37.name;
    graph37.init();
    node23.setOwner(graph37);
    graph15.addNode(node23);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node23.thisIsNotCalled();

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test146"); }


    Graph graph0 = Graph.generateGraph();
    Graph graph1 = Graph.generateGraph();
    Node node3 = new Node("");
    Node node5 = new Node("hi!");
    Graph graph6 = new Graph();
    node5.setOwner(graph6);
    node3.setOwner(graph6);
    Node node10 = new Node("hi!");
    Graph graph11 = new Graph();
    node10.setOwner(graph11);
    graph11.setName("");
    java.lang.String str15 = graph11.name;
    node3.setOwner(graph11);
    node3.setOwnerNameDirectly("hi!");
    graph1.addNode(node3);
    graph1.name = "";
    graph1.init();
    Node node24 = new Node("");
    Node node26 = new Node("hi!");
    Graph graph27 = new Graph();
    node26.setOwner(graph27);
    node24.setOwner(graph27);
    Node node31 = new Node("hi!");
    Graph graph32 = new Graph();
    node31.setOwner(graph32);
    graph32.setName("");
    java.lang.String str36 = graph32.name;
    node24.setOwner(graph32);
    node24.setOwnerNameDirectly("[graph]");
    Node node41 = new Node("");
    Node node43 = new Node("hi!");
    Graph graph44 = new Graph();
    node43.setOwner(graph44);
    node41.setOwner(graph44);
    Node node48 = new Node("hi!");
    Graph graph49 = new Graph();
    node48.setOwner(graph49);
    graph49.setName("");
    java.lang.String str53 = graph49.name;
    node41.setOwner(graph49);
    node41.setOwnerNameDirectly("hi!");
    Graph graph57 = Graph.generateGraph();
    Node node59 = new Node("");
    Node node61 = new Node("hi!");
    Graph graph62 = new Graph();
    node61.setOwner(graph62);
    node59.setOwner(graph62);
    Node node66 = new Node("hi!");
    Graph graph67 = new Graph();
    node66.setOwner(graph67);
    graph67.setName("");
    java.lang.String str71 = graph67.name;
    node59.setOwner(graph67);
    node59.setOwnerNameDirectly("hi!");
    graph57.addNode(node59);
    node41.setOwner(graph57);
    graph57.name = "";
    node24.setOwner(graph57);
    node24.setOwnerNameDirectly("");
    node24.setOwnerNameDirectly("hi!");
    graph1.addNode(node24);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i85 = graph0.getDegree(node24);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test147"); }


    Graph graph0 = Graph.generateGraph();
    Node node2 = new Node("");
    Node node4 = new Node("hi!");
    Graph graph5 = new Graph();
    node4.setOwner(graph5);
    node2.setOwner(graph5);
    Node node9 = new Node("hi!");
    Graph graph10 = new Graph();
    node9.setOwner(graph10);
    graph10.setName("");
    java.lang.String str14 = graph10.name;
    node2.setOwner(graph10);
    node2.setOwnerNameDirectly("hi!");
    graph0.addNode(node2);
    graph0.name = "";
    graph0.init();
    Node node23 = new Node("");
    Node node25 = new Node("hi!");
    Graph graph26 = new Graph();
    node25.setOwner(graph26);
    node23.setOwner(graph26);
    Node node30 = new Node("hi!");
    Graph graph31 = new Graph();
    node30.setOwner(graph31);
    graph31.setName("");
    java.lang.String str35 = graph31.name;
    node23.setOwner(graph31);
    node23.setOwnerNameDirectly("[graph]");
    Node node40 = new Node("");
    Node node42 = new Node("hi!");
    Graph graph43 = new Graph();
    node42.setOwner(graph43);
    node40.setOwner(graph43);
    Node node47 = new Node("hi!");
    Graph graph48 = new Graph();
    node47.setOwner(graph48);
    graph48.setName("");
    java.lang.String str52 = graph48.name;
    node40.setOwner(graph48);
    node40.setOwnerNameDirectly("hi!");
    Graph graph56 = Graph.generateGraph();
    Node node58 = new Node("");
    Node node60 = new Node("hi!");
    Graph graph61 = new Graph();
    node60.setOwner(graph61);
    node58.setOwner(graph61);
    Node node65 = new Node("hi!");
    Graph graph66 = new Graph();
    node65.setOwner(graph66);
    graph66.setName("");
    java.lang.String str70 = graph66.name;
    node58.setOwner(graph66);
    node58.setOwnerNameDirectly("hi!");
    graph56.addNode(node58);
    node40.setOwner(graph56);
    graph56.name = "";
    node23.setOwner(graph56);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i79 = graph0.getDegree(node23);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test148"); }


    Node node1 = new Node("hi!");
    Graph graph2 = new Graph();
    node1.setOwner(graph2);
    graph2.setName("");
    graph2.setName("");
    graph2.init();
    graph2.setName("hi!");
    Node node12 = new Node("");
    Node node14 = new Node("hi!");
    Graph graph15 = new Graph();
    node14.setOwner(graph15);
    node12.setOwner(graph15);
    Node node19 = new Node("hi!");
    Graph graph20 = new Graph();
    node19.setOwner(graph20);
    graph20.setName("");
    java.lang.String str24 = graph20.name;
    node12.setOwner(graph20);
    node12.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i28 = graph2.getDegree(node12);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test149"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    Node node16 = new Node("");
    Graph graph17 = Graph.generateGraph();
    java.lang.String str18 = graph17.name;
    node16.setOwner(graph17);
    graph17.setName("");
    java.lang.String str22 = graph17.name;
    node1.setOwner(graph17);
    java.lang.String str24 = graph17.name;
    Node node26 = new Node("");
    Node node28 = new Node("hi!");
    Graph graph29 = new Graph();
    node28.setOwner(graph29);
    node26.setOwner(graph29);
    Node node33 = new Node("hi!");
    Graph graph34 = new Graph();
    node33.setOwner(graph34);
    graph34.setName("");
    java.lang.String str38 = graph34.name;
    node26.setOwner(graph34);
    node26.setOwnerName("hi!");
    Graph graph42 = new Graph();
    graph42.init();
    node26.setOwner(graph42);
    Graph graph45 = new Graph();
    graph45.init();
    graph45.setName("");
    Node node50 = new Node("");
    graph45.addNode(node50);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph17.addEdge(node26, node50);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test150"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("");
    node1.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test151"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerNameDirectly("[graph]");
    Node node18 = new Node("");
    Node node20 = new Node("hi!");
    Graph graph21 = new Graph();
    node20.setOwner(graph21);
    node18.setOwner(graph21);
    Node node25 = new Node("hi!");
    Graph graph26 = new Graph();
    node25.setOwner(graph26);
    graph26.setName("");
    java.lang.String str30 = graph26.name;
    node18.setOwner(graph26);
    node18.setOwnerNameDirectly("[graph]");
    node18.setOwnerName("");
    node18.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node18);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test152"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerNameDirectly("[graph]");
    Node node18 = new Node("");
    Node node20 = new Node("hi!");
    Graph graph21 = new Graph();
    node20.setOwner(graph21);
    node18.setOwner(graph21);
    Node node25 = new Node("hi!");
    Graph graph26 = new Graph();
    node25.setOwner(graph26);
    graph26.setName("");
    java.lang.String str30 = graph26.name;
    node18.setOwner(graph26);
    node18.setOwnerNameDirectly("hi!");
    Graph graph34 = Graph.generateGraph();
    Node node36 = new Node("");
    Node node38 = new Node("hi!");
    Graph graph39 = new Graph();
    node38.setOwner(graph39);
    node36.setOwner(graph39);
    Node node43 = new Node("hi!");
    Graph graph44 = new Graph();
    node43.setOwner(graph44);
    graph44.setName("");
    java.lang.String str48 = graph44.name;
    node36.setOwner(graph44);
    node36.setOwnerNameDirectly("hi!");
    graph34.addNode(node36);
    node18.setOwner(graph34);
    graph34.name = "";
    node1.setOwner(graph34);
    node1.setOwnerName("");
    node1.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i61 = node1.getDegree();

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test153"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerNameDirectly("[graph]");
    Node node18 = new Node("");
    Node node20 = new Node("hi!");
    Graph graph21 = new Graph();
    node20.setOwner(graph21);
    node18.setOwner(graph21);
    Node node25 = new Node("hi!");
    Graph graph26 = new Graph();
    node25.setOwner(graph26);
    graph26.setName("");
    java.lang.String str30 = graph26.name;
    node18.setOwner(graph26);
    node18.setOwnerNameDirectly("hi!");
    Graph graph34 = Graph.generateGraph();
    Node node36 = new Node("");
    Node node38 = new Node("hi!");
    Graph graph39 = new Graph();
    node38.setOwner(graph39);
    node36.setOwner(graph39);
    Node node43 = new Node("hi!");
    Graph graph44 = new Graph();
    node43.setOwner(graph44);
    graph44.setName("");
    java.lang.String str48 = graph44.name;
    node36.setOwner(graph44);
    node36.setOwnerNameDirectly("hi!");
    graph34.addNode(node36);
    node18.setOwner(graph34);
    graph34.name = "";
    node1.setOwner(graph34);
    node1.setOwnerName("");
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test154"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    Node node4 = new Node("");
    Node node6 = new Node("hi!");
    Graph graph7 = new Graph();
    node6.setOwner(graph7);
    node4.setOwner(graph7);
    Node node11 = new Node("hi!");
    Graph graph12 = new Graph();
    node11.setOwner(graph12);
    graph12.setName("");
    java.lang.String str16 = graph12.name;
    node4.setOwner(graph12);
    node4.setOwnerNameDirectly("hi!");
    graph2.addNode(node4);
    graph2.name = "";
    node1.setOwner(graph2);
    Node node25 = new Node("hi!");
    Graph graph26 = new Graph();
    node25.setOwner(graph26);
    graph2.addNode(node25);
    node25.setOwnerName("");
    Node node32 = new Node("");
    Graph graph33 = Graph.generateGraph();
    Node node35 = new Node("");
    Node node37 = new Node("hi!");
    Graph graph38 = new Graph();
    node37.setOwner(graph38);
    node35.setOwner(graph38);
    Node node42 = new Node("hi!");
    Graph graph43 = new Graph();
    node42.setOwner(graph43);
    graph43.setName("");
    java.lang.String str47 = graph43.name;
    node35.setOwner(graph43);
    node35.setOwnerNameDirectly("hi!");
    graph33.addNode(node35);
    graph33.name = "";
    node32.setOwner(graph33);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node25.addEdge(node32);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test155"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    graph2.init();
    node1.setOwner(graph2);
    java.lang.String str6 = graph2.name;
    graph2.name = "[graph]";
    graph2.name = "";
    Graph graph11 = Graph.generateGraph();
    Node node13 = new Node("");
    Node node15 = new Node("hi!");
    Graph graph16 = new Graph();
    node15.setOwner(graph16);
    node13.setOwner(graph16);
    Node node20 = new Node("hi!");
    Graph graph21 = new Graph();
    node20.setOwner(graph21);
    graph21.setName("");
    java.lang.String str25 = graph21.name;
    node13.setOwner(graph21);
    node13.setOwnerNameDirectly("hi!");
    graph11.addNode(node13);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i30 = graph2.getDegree(node13);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test156"); }


    Node node1 = new Node("hi!");
    Graph graph2 = new Graph();
    node1.setOwner(graph2);
    Graph graph4 = Graph.generateGraph();
    Node node6 = new Node("");
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    node6.setOwner(graph9);
    Node node13 = new Node("hi!");
    Graph graph14 = new Graph();
    node13.setOwner(graph14);
    graph14.setName("");
    java.lang.String str18 = graph14.name;
    node6.setOwner(graph14);
    node6.setOwnerNameDirectly("hi!");
    graph4.addNode(node6);
    node6.setOwnerName("hi!");
    Node node26 = new Node("hi!");
    Graph graph27 = new Graph();
    node26.setOwner(graph27);
    graph27.setName("");
    graph27.setName("");
    graph27.setName("");
    node6.setOwner(graph27);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph2.addNode(node6);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test157"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i7 = node1.getDegree();

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test158"); }


    Graph graph0 = Graph.generateGraph();
    Node node2 = new Node("");
    Node node4 = new Node("hi!");
    Graph graph5 = new Graph();
    node4.setOwner(graph5);
    node2.setOwner(graph5);
    Node node9 = new Node("hi!");
    Graph graph10 = new Graph();
    node9.setOwner(graph10);
    graph10.setName("");
    java.lang.String str14 = graph10.name;
    node2.setOwner(graph10);
    node2.setOwnerNameDirectly("hi!");
    graph0.addNode(node2);
    Graph graph19 = Graph.generateGraph();
    node2.setOwner(graph19);
    node2.setOwnerName("hi!");
    Node node24 = new Node("");
    Graph graph25 = Graph.generateGraph();
    Node node27 = new Node("");
    Node node29 = new Node("hi!");
    Graph graph30 = new Graph();
    node29.setOwner(graph30);
    node27.setOwner(graph30);
    Node node34 = new Node("hi!");
    Graph graph35 = new Graph();
    node34.setOwner(graph35);
    graph35.setName("");
    java.lang.String str39 = graph35.name;
    node27.setOwner(graph35);
    node27.setOwnerNameDirectly("hi!");
    graph25.addNode(node27);
    graph25.name = "";
    node24.setOwner(graph25);
    Node node48 = new Node("hi!");
    Graph graph49 = new Graph();
    node48.setOwner(graph49);
    graph25.addNode(node48);
    Node node53 = new Node("");
    Graph graph54 = Graph.generateGraph();
    java.lang.String str55 = graph54.name;
    graph54.init();
    node53.setOwner(graph54);
    java.lang.String str58 = graph54.name;
    graph54.init();
    graph54.setName("");
    node48.setOwner(graph54);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node2.addEdge(node48);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test159"); }


    Node node1 = new Node("hi!");
    Node node3 = new Node("");
    Node node5 = new Node("hi!");
    Graph graph6 = new Graph();
    node5.setOwner(graph6);
    node3.setOwner(graph6);
    Node node10 = new Node("hi!");
    Graph graph11 = new Graph();
    node10.setOwner(graph11);
    graph11.setName("");
    java.lang.String str15 = graph11.name;
    node3.setOwner(graph11);
    graph11.init();
    graph11.init();
    Node node20 = new Node("");
    Node node22 = new Node("hi!");
    Graph graph23 = new Graph();
    node22.setOwner(graph23);
    node20.setOwner(graph23);
    Node node27 = new Node("hi!");
    Graph graph28 = new Graph();
    node27.setOwner(graph28);
    graph28.setName("");
    java.lang.String str32 = graph28.name;
    node20.setOwner(graph28);
    node20.setOwnerNameDirectly("[graph]");
    node20.setOwnerName("");
    node20.setOwnerName("[graph]");
    graph11.addNode(node20);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node20);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test160"); }


    Graph graph0 = Graph.generateGraph();
    Node node2 = new Node("");
    Node node4 = new Node("hi!");
    Graph graph5 = new Graph();
    node4.setOwner(graph5);
    node2.setOwner(graph5);
    Node node9 = new Node("hi!");
    Graph graph10 = new Graph();
    node9.setOwner(graph10);
    graph10.setName("");
    java.lang.String str14 = graph10.name;
    node2.setOwner(graph10);
    node2.setOwnerNameDirectly("hi!");
    graph0.addNode(node2);
    graph0.name = "";
    graph0.init();
    Node node23 = new Node("");
    Node node25 = new Node("hi!");
    Graph graph26 = new Graph();
    node25.setOwner(graph26);
    node23.setOwner(graph26);
    Node node30 = new Node("hi!");
    Graph graph31 = new Graph();
    node30.setOwner(graph31);
    graph31.setName("");
    java.lang.String str35 = graph31.name;
    node23.setOwner(graph31);
    node23.setOwnerNameDirectly("[graph]");
    Node node40 = new Node("");
    Node node42 = new Node("hi!");
    Graph graph43 = new Graph();
    node42.setOwner(graph43);
    node40.setOwner(graph43);
    Node node47 = new Node("hi!");
    Graph graph48 = new Graph();
    node47.setOwner(graph48);
    graph48.setName("");
    java.lang.String str52 = graph48.name;
    node40.setOwner(graph48);
    node40.setOwnerNameDirectly("hi!");
    Graph graph56 = Graph.generateGraph();
    Node node58 = new Node("");
    Node node60 = new Node("hi!");
    Graph graph61 = new Graph();
    node60.setOwner(graph61);
    node58.setOwner(graph61);
    Node node65 = new Node("hi!");
    Graph graph66 = new Graph();
    node65.setOwner(graph66);
    graph66.setName("");
    java.lang.String str70 = graph66.name;
    node58.setOwner(graph66);
    node58.setOwnerNameDirectly("hi!");
    graph56.addNode(node58);
    node40.setOwner(graph56);
    graph56.name = "";
    node23.setOwner(graph56);
    node23.setOwnerNameDirectly("");
    node23.setOwnerNameDirectly("hi!");
    graph0.addNode(node23);
    Node node85 = new Node("hi!");
    Graph graph86 = new Graph();
    node85.setOwner(graph86);
    node85.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node23.addEdge(node85);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test161"); }


    Node node1 = new Node("hi!");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    graph4.setName("");
    node1.setOwner(graph4);
    node1.setOwnerNameDirectly("hi!");
    Node node12 = new Node("hi!");
    Graph graph13 = new Graph();
    node12.setOwner(graph13);
    graph13.setName("");
    graph13.setName("");
    graph13.setName("hi!");
    graph13.init();
    graph13.setName("[graph]");
    node1.setOwner(graph13);
    Node node26 = new Node("");
    Node node28 = new Node("hi!");
    Graph graph29 = new Graph();
    node28.setOwner(graph29);
    node26.setOwner(graph29);
    Node node33 = new Node("hi!");
    Graph graph34 = new Graph();
    node33.setOwner(graph34);
    graph34.setName("");
    java.lang.String str38 = graph34.name;
    node26.setOwner(graph34);
    node26.setOwnerName("hi!");
    node26.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node26);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test162"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    graph2.init();
    node1.setOwner(graph2);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test163"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerNameDirectly("[graph]");
    Node node18 = new Node("");
    Node node20 = new Node("hi!");
    Graph graph21 = new Graph();
    node20.setOwner(graph21);
    node18.setOwner(graph21);
    Node node25 = new Node("hi!");
    Graph graph26 = new Graph();
    node25.setOwner(graph26);
    graph26.setName("");
    java.lang.String str30 = graph26.name;
    node18.setOwner(graph26);
    node18.setOwnerNameDirectly("hi!");
    Graph graph34 = Graph.generateGraph();
    Node node36 = new Node("");
    Node node38 = new Node("hi!");
    Graph graph39 = new Graph();
    node38.setOwner(graph39);
    node36.setOwner(graph39);
    Node node43 = new Node("hi!");
    Graph graph44 = new Graph();
    node43.setOwner(graph44);
    graph44.setName("");
    java.lang.String str48 = graph44.name;
    node36.setOwner(graph44);
    node36.setOwnerNameDirectly("hi!");
    graph34.addNode(node36);
    node18.setOwner(graph34);
    graph34.name = "";
    node1.setOwner(graph34);
    node1.setOwnerName("");
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("[graph]");
    Node node64 = new Node("hi!");
    Graph graph65 = new Graph();
    node64.setOwner(graph65);
    graph65.setName("");
    graph65.setName("");
    graph65.init();
    Node node73 = new Node("");
    Graph graph74 = Graph.generateGraph();
    java.lang.String str75 = graph74.name;
    graph74.init();
    node73.setOwner(graph74);
    graph74.name = "hi!";
    Graph graph80 = new Graph();
    graph80.init();
    graph80.setName("");
    Node node85 = new Node("");
    graph80.addNode(node85);
    graph74.addNode(node85);
    graph65.addNode(node85);
    node1.setOwner(graph65);
    node1.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i92 = node1.getDegree();

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test164"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    node1.setOwner(graph2);
    Graph graph5 = new Graph();
    node1.setOwner(graph5);
    Node node8 = new Node("hi!");
    Node node10 = new Node("hi!");
    Graph graph11 = new Graph();
    node10.setOwner(graph11);
    graph11.setName("");
    node8.setOwner(graph11);
    java.lang.String str16 = graph11.name;
    node1.setOwner(graph11);
    Node node19 = new Node("");
    Graph graph20 = Graph.generateGraph();
    java.lang.String str21 = graph20.name;
    graph20.init();
    node19.setOwner(graph20);
    java.lang.String str24 = graph20.name;
    node1.setOwner(graph20);
    Node node27 = new Node("");
    Graph graph28 = Graph.generateGraph();
    java.lang.String str29 = graph28.name;
    node27.setOwner(graph28);
    Node node32 = new Node("");
    Graph graph33 = Graph.generateGraph();
    java.lang.String str34 = graph33.name;
    node32.setOwner(graph33);
    Graph graph36 = new Graph();
    node32.setOwner(graph36);
    Node node39 = new Node("hi!");
    Node node41 = new Node("hi!");
    Graph graph42 = new Graph();
    node41.setOwner(graph42);
    graph42.setName("");
    node39.setOwner(graph42);
    java.lang.String str47 = graph42.name;
    node32.setOwner(graph42);
    Node node50 = new Node("");
    Graph graph51 = Graph.generateGraph();
    java.lang.String str52 = graph51.name;
    graph51.init();
    node50.setOwner(graph51);
    java.lang.String str55 = graph51.name;
    node32.setOwner(graph51);
    Node node58 = new Node("hi!");
    Node node60 = new Node("hi!");
    Graph graph61 = new Graph();
    node60.setOwner(graph61);
    graph61.setName("");
    node58.setOwner(graph61);
    node58.setOwnerNameDirectly("hi!");
    graph51.addNode(node58);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph20.addEdge(node27, node58);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test165"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    node1.setOwner(graph2);
    Graph graph5 = new Graph();
    node1.setOwner(graph5);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test166"); }


    Node node1 = new Node("hi!");
    Graph graph2 = new Graph();
    node1.setOwner(graph2);
    graph2.setName("");
    graph2.setName("");
    graph2.setName("hi!");
    Node node11 = new Node("");
    Node node13 = new Node("hi!");
    Graph graph14 = new Graph();
    node13.setOwner(graph14);
    node11.setOwner(graph14);
    Node node18 = new Node("hi!");
    Graph graph19 = new Graph();
    node18.setOwner(graph19);
    graph19.setName("");
    java.lang.String str23 = graph19.name;
    node11.setOwner(graph19);
    node11.setOwnerName("hi!");
    Graph graph27 = new Graph();
    graph27.init();
    node11.setOwner(graph27);
    node11.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i32 = graph2.getDegree(node11);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test167"); }


    Node node1 = new Node("hi!");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    graph4.setName("");
    node1.setOwner(graph4);
    node1.setOwnerNameDirectly("hi!");
    Node node12 = new Node("hi!");
    Graph graph13 = new Graph();
    node12.setOwner(graph13);
    graph13.setName("");
    graph13.setName("");
    graph13.setName("hi!");
    graph13.init();
    graph13.setName("[graph]");
    node1.setOwner(graph13);
    Graph graph25 = Graph.generateGraph();
    Node node27 = new Node("");
    Node node29 = new Node("hi!");
    Graph graph30 = new Graph();
    node29.setOwner(graph30);
    node27.setOwner(graph30);
    Node node34 = new Node("hi!");
    Graph graph35 = new Graph();
    node34.setOwner(graph35);
    graph35.setName("");
    java.lang.String str39 = graph35.name;
    node27.setOwner(graph35);
    node27.setOwnerNameDirectly("hi!");
    graph25.addNode(node27);
    node27.setOwnerNameDirectly("hi!");
    node27.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i48 = graph13.getDegree(node27);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test168"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    Node node16 = new Node("");
    Graph graph17 = Graph.generateGraph();
    Node node19 = new Node("");
    Node node21 = new Node("hi!");
    Graph graph22 = new Graph();
    node21.setOwner(graph22);
    node19.setOwner(graph22);
    Node node26 = new Node("hi!");
    Graph graph27 = new Graph();
    node26.setOwner(graph27);
    graph27.setName("");
    java.lang.String str31 = graph27.name;
    node19.setOwner(graph27);
    node19.setOwnerNameDirectly("hi!");
    graph17.addNode(node19);
    graph17.name = "";
    node16.setOwner(graph17);
    Node node40 = new Node("hi!");
    Graph graph41 = new Graph();
    node40.setOwner(graph41);
    graph17.addNode(node40);
    node40.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i46 = graph9.getDegree(node40);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test169"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    node1.setOwner(graph2);
    Graph graph5 = new Graph();
    node1.setOwner(graph5);
    node1.setOwnerNameDirectly("[graph]");
    node1.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i11 = node1.getDegree();

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test170"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    Node node4 = new Node("");
    Node node6 = new Node("hi!");
    Graph graph7 = new Graph();
    node6.setOwner(graph7);
    node4.setOwner(graph7);
    Node node11 = new Node("hi!");
    Graph graph12 = new Graph();
    node11.setOwner(graph12);
    graph12.setName("");
    java.lang.String str16 = graph12.name;
    node4.setOwner(graph12);
    node4.setOwnerNameDirectly("hi!");
    graph2.addNode(node4);
    graph2.name = "";
    node1.setOwner(graph2);
    Node node25 = new Node("hi!");
    Graph graph26 = new Graph();
    node25.setOwner(graph26);
    graph2.addNode(node25);
    Node node30 = new Node("");
    Graph graph31 = Graph.generateGraph();
    java.lang.String str32 = graph31.name;
    graph31.init();
    node30.setOwner(graph31);
    java.lang.String str35 = graph31.name;
    graph31.init();
    graph31.setName("");
    node25.setOwner(graph31);
    Node node41 = new Node("");
    Node node43 = new Node("hi!");
    Graph graph44 = new Graph();
    node43.setOwner(graph44);
    node41.setOwner(graph44);
    Node node48 = new Node("hi!");
    Graph graph49 = new Graph();
    node48.setOwner(graph49);
    graph49.setName("");
    java.lang.String str53 = graph49.name;
    node41.setOwner(graph49);
    graph49.init();
    graph49.init();
    Node node58 = new Node("");
    Node node60 = new Node("hi!");
    Graph graph61 = new Graph();
    node60.setOwner(graph61);
    node58.setOwner(graph61);
    Node node65 = new Node("hi!");
    Graph graph66 = new Graph();
    node65.setOwner(graph66);
    graph66.setName("");
    java.lang.String str70 = graph66.name;
    node58.setOwner(graph66);
    node58.setOwnerNameDirectly("[graph]");
    node58.setOwnerName("");
    node58.setOwnerName("[graph]");
    graph49.addNode(node58);
    Node node80 = new Node("");
    Node node82 = new Node("hi!");
    Graph graph83 = new Graph();
    node82.setOwner(graph83);
    node80.setOwner(graph83);
    Node node87 = new Node("hi!");
    Graph graph88 = new Graph();
    node87.setOwner(graph88);
    graph88.setName("");
    java.lang.String str92 = graph88.name;
    node80.setOwner(graph88);
    node80.setOwnerName("hi!");
    node80.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph31.addEdge(node58, node80);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test171"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test172"); }


    Graph graph0 = new Graph();
    graph0.init();
    java.lang.String str2 = graph0.name;
    Node node4 = new Node("");
    Graph graph5 = Graph.generateGraph();
    java.lang.String str6 = graph5.name;
    node4.setOwner(graph5);
    graph0.addNode(node4);
    Graph graph9 = Graph.generateGraph();
    Node node11 = new Node("");
    Node node13 = new Node("hi!");
    Graph graph14 = new Graph();
    node13.setOwner(graph14);
    node11.setOwner(graph14);
    Node node18 = new Node("hi!");
    Graph graph19 = new Graph();
    node18.setOwner(graph19);
    graph19.setName("");
    java.lang.String str23 = graph19.name;
    node11.setOwner(graph19);
    node11.setOwnerNameDirectly("hi!");
    graph9.addNode(node11);
    Graph graph28 = Graph.generateGraph();
    node11.setOwner(graph28);
    Node node31 = new Node("");
    Graph graph32 = Graph.generateGraph();
    java.lang.String str33 = graph32.name;
    node31.setOwner(graph32);
    Graph graph35 = new Graph();
    node31.setOwner(graph35);
    Node node38 = new Node("hi!");
    Node node40 = new Node("hi!");
    Graph graph41 = new Graph();
    node40.setOwner(graph41);
    graph41.setName("");
    node38.setOwner(graph41);
    java.lang.String str46 = graph41.name;
    node31.setOwner(graph41);
    Node node49 = new Node("");
    Graph graph50 = Graph.generateGraph();
    java.lang.String str51 = graph50.name;
    graph50.init();
    node49.setOwner(graph50);
    java.lang.String str54 = graph50.name;
    node31.setOwner(graph50);
    graph50.name = "";
    node11.setOwner(graph50);
    node11.setOwnerNameDirectly("hi!");
    node11.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i63 = graph0.getDegree(node11);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test173"); }


    Node node1 = new Node("hi!");
    Graph graph2 = new Graph();
    node1.setOwner(graph2);
    graph2.setName("");
    graph2.setName("");
    graph2.setName("hi!");
    graph2.name = "[graph]";
    java.lang.String str12 = graph2.name;
    Graph graph13 = Graph.generateGraph();
    Node node15 = new Node("");
    Node node17 = new Node("hi!");
    Graph graph18 = new Graph();
    node17.setOwner(graph18);
    node15.setOwner(graph18);
    Node node22 = new Node("hi!");
    Graph graph23 = new Graph();
    node22.setOwner(graph23);
    graph23.setName("");
    java.lang.String str27 = graph23.name;
    node15.setOwner(graph23);
    node15.setOwnerNameDirectly("hi!");
    graph13.addNode(node15);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i32 = graph2.getDegree(node15);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test174"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    graph2.init();
    node1.setOwner(graph2);
    Node node7 = new Node("");
    Graph graph8 = Graph.generateGraph();
    java.lang.String str9 = graph8.name;
    node7.setOwner(graph8);
    Graph graph11 = new Graph();
    node7.setOwner(graph11);
    Node node14 = new Node("hi!");
    Node node16 = new Node("hi!");
    Graph graph17 = new Graph();
    node16.setOwner(graph17);
    graph17.setName("");
    node14.setOwner(graph17);
    java.lang.String str22 = graph17.name;
    node7.setOwner(graph17);
    Node node25 = new Node("");
    Graph graph26 = Graph.generateGraph();
    java.lang.String str27 = graph26.name;
    graph26.init();
    node25.setOwner(graph26);
    java.lang.String str30 = graph26.name;
    node7.setOwner(graph26);
    Node node33 = new Node("hi!");
    Node node35 = new Node("hi!");
    Graph graph36 = new Graph();
    node35.setOwner(graph36);
    graph36.setName("");
    node33.setOwner(graph36);
    node33.setOwnerNameDirectly("hi!");
    graph26.addNode(node33);
    Node node45 = new Node("");
    Node node47 = new Node("hi!");
    Graph graph48 = new Graph();
    node47.setOwner(graph48);
    node45.setOwner(graph48);
    Node node52 = new Node("hi!");
    Graph graph53 = new Graph();
    node52.setOwner(graph53);
    graph53.setName("");
    java.lang.String str57 = graph53.name;
    node45.setOwner(graph53);
    node45.setOwnerName("hi!");
    node45.setOwnerName("hi!");
    node45.setOwnerNameDirectly("");
    Node node66 = new Node("");
    Node node68 = new Node("hi!");
    Graph graph69 = new Graph();
    node68.setOwner(graph69);
    node66.setOwner(graph69);
    Node node73 = new Node("hi!");
    Graph graph74 = new Graph();
    node73.setOwner(graph74);
    graph74.setName("");
    java.lang.String str78 = graph74.name;
    node66.setOwner(graph74);
    java.lang.String str80 = graph74.name;
    graph74.setName("");
    graph74.setName("");
    node45.setOwner(graph74);
    node45.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph2.addEdge(node33, node45);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test175"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerNameDirectly("[graph]");
    node1.setOwnerName("");
    Graph graph19 = new Graph();
    graph19.init();
    graph19.setName("");
    java.lang.String str23 = graph19.name;
    node1.setOwner(graph19);
    java.lang.String str25 = graph19.name;
    graph19.init();
    graph19.setName("");
    Node node30 = new Node("");
    Node node32 = new Node("hi!");
    Graph graph33 = new Graph();
    node32.setOwner(graph33);
    node30.setOwner(graph33);
    Node node37 = new Node("hi!");
    Graph graph38 = new Graph();
    node37.setOwner(graph38);
    graph38.setName("");
    java.lang.String str42 = graph38.name;
    node30.setOwner(graph38);
    node30.setOwnerName("hi!");
    Graph graph46 = new Graph();
    graph46.init();
    node30.setOwner(graph46);
    node30.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i51 = graph19.getDegree(node30);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test176"); }


    Graph graph0 = new Graph();
    graph0.init();
    graph0.setName("");
    Node node5 = new Node("hi!");
    Node node7 = new Node("hi!");
    Graph graph8 = new Graph();
    node7.setOwner(graph8);
    graph8.setName("");
    node5.setOwner(graph8);
    node5.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i15 = graph0.getDegree(node5);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test177"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerName("hi!");
    node1.setOwnerName("[graph]");
    Node node20 = new Node("");
    Graph graph21 = Graph.generateGraph();
    Node node23 = new Node("");
    Node node25 = new Node("hi!");
    Graph graph26 = new Graph();
    node25.setOwner(graph26);
    node23.setOwner(graph26);
    Node node30 = new Node("hi!");
    Graph graph31 = new Graph();
    node30.setOwner(graph31);
    graph31.setName("");
    java.lang.String str35 = graph31.name;
    node23.setOwner(graph31);
    node23.setOwnerNameDirectly("hi!");
    graph21.addNode(node23);
    graph21.name = "";
    node20.setOwner(graph21);
    Node node44 = new Node("hi!");
    Graph graph45 = new Graph();
    node44.setOwner(graph45);
    graph21.addNode(node44);
    Node node49 = new Node("");
    Graph graph50 = Graph.generateGraph();
    java.lang.String str51 = graph50.name;
    graph50.init();
    node49.setOwner(graph50);
    java.lang.String str54 = graph50.name;
    graph50.init();
    graph50.setName("");
    node44.setOwner(graph50);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node44);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test178"); }


    Graph graph0 = Graph.generateGraph();
    Node node2 = new Node("");
    Node node4 = new Node("hi!");
    Graph graph5 = new Graph();
    node4.setOwner(graph5);
    node2.setOwner(graph5);
    Node node9 = new Node("hi!");
    Graph graph10 = new Graph();
    node9.setOwner(graph10);
    graph10.setName("");
    java.lang.String str14 = graph10.name;
    node2.setOwner(graph10);
    node2.setOwnerNameDirectly("hi!");
    graph0.addNode(node2);
    node2.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node2.thisIsNotCalled();

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test179"); }


    Graph graph0 = Graph.generateGraph();
    Node node2 = new Node("");
    Node node4 = new Node("hi!");
    Graph graph5 = new Graph();
    node4.setOwner(graph5);
    node2.setOwner(graph5);
    Node node9 = new Node("hi!");
    Graph graph10 = new Graph();
    node9.setOwner(graph10);
    graph10.setName("");
    java.lang.String str14 = graph10.name;
    node2.setOwner(graph10);
    node2.setOwnerNameDirectly("hi!");
    graph0.addNode(node2);
    node2.setOwnerNameDirectly("hi!");
    Node node22 = new Node("hi!");
    Graph graph23 = new Graph();
    node22.setOwner(graph23);
    graph23.setName("");
    graph23.setName("");
    graph23.init();
    node2.setOwner(graph23);
    Graph graph31 = Graph.generateGraph();
    Node node33 = new Node("");
    Node node35 = new Node("hi!");
    Graph graph36 = new Graph();
    node35.setOwner(graph36);
    node33.setOwner(graph36);
    Node node40 = new Node("hi!");
    Graph graph41 = new Graph();
    node40.setOwner(graph41);
    graph41.setName("");
    java.lang.String str45 = graph41.name;
    node33.setOwner(graph41);
    node33.setOwnerNameDirectly("hi!");
    graph31.addNode(node33);
    Graph graph50 = Graph.generateGraph();
    node33.setOwner(graph50);
    Node node53 = new Node("hi!");
    Node node55 = new Node("hi!");
    Graph graph56 = new Graph();
    node55.setOwner(graph56);
    graph56.setName("");
    node53.setOwner(graph56);
    graph50.addNode(node53);
    Node node63 = new Node("");
    Graph graph64 = Graph.generateGraph();
    java.lang.String str65 = graph64.name;
    graph64.init();
    node63.setOwner(graph64);
    graph64.name = "hi!";
    Graph graph70 = new Graph();
    graph70.init();
    graph70.setName("");
    Node node75 = new Node("");
    graph70.addNode(node75);
    graph64.addNode(node75);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph23.addEdge(node53, node75);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test180"); }


    Node node1 = new Node("hi!");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    graph4.setName("");
    node1.setOwner(graph4);
    graph4.init();
    Node node11 = new Node("");
    Graph graph12 = Graph.generateGraph();
    java.lang.String str13 = graph12.name;
    node11.setOwner(graph12);
    Graph graph15 = new Graph();
    node11.setOwner(graph15);
    Node node18 = new Node("hi!");
    Node node20 = new Node("hi!");
    Graph graph21 = new Graph();
    node20.setOwner(graph21);
    graph21.setName("");
    node18.setOwner(graph21);
    java.lang.String str26 = graph21.name;
    node11.setOwner(graph21);
    Node node29 = new Node("");
    Graph graph30 = Graph.generateGraph();
    java.lang.String str31 = graph30.name;
    graph30.init();
    node29.setOwner(graph30);
    java.lang.String str34 = graph30.name;
    node11.setOwner(graph30);
    graph4.addNode(node11);
    Node node38 = new Node("hi!");
    Graph graph39 = new Graph();
    node38.setOwner(graph39);
    node38.setOwnerName("[graph]");
    Node node44 = new Node("");
    Node node46 = new Node("hi!");
    Graph graph47 = new Graph();
    node46.setOwner(graph47);
    node44.setOwner(graph47);
    Node node51 = new Node("hi!");
    Graph graph52 = new Graph();
    node51.setOwner(graph52);
    graph52.setName("");
    java.lang.String str56 = graph52.name;
    node44.setOwner(graph52);
    node38.setOwner(graph52);
    Node node60 = new Node("hi!");
    Graph graph61 = new Graph();
    node60.setOwner(graph61);
    graph61.setName("");
    graph61.setName("");
    graph61.setName("hi!");
    graph61.name = "[graph]";
    java.lang.String str71 = graph61.name;
    node38.setOwner(graph61);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i73 = graph4.getDegree(node38);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test181"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    graph9.init();
    graph9.init();
    Node node18 = new Node("");
    Node node20 = new Node("hi!");
    Graph graph21 = new Graph();
    node20.setOwner(graph21);
    node18.setOwner(graph21);
    Node node25 = new Node("hi!");
    Graph graph26 = new Graph();
    node25.setOwner(graph26);
    graph26.setName("");
    java.lang.String str30 = graph26.name;
    node18.setOwner(graph26);
    node18.setOwnerNameDirectly("[graph]");
    node18.setOwnerName("");
    node18.setOwnerName("[graph]");
    graph9.addNode(node18);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node18.thisIsNotCalled();

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test182"); }


    Graph graph0 = new Graph();
    graph0.init();
    java.lang.String str2 = graph0.name;
    graph0.init();
    graph0.name = "hi!";
    graph0.setName("hi!");
    Node node9 = new Node("");
    Graph graph10 = Graph.generateGraph();
    java.lang.String str11 = graph10.name;
    node9.setOwner(graph10);
    Graph graph13 = new Graph();
    node9.setOwner(graph13);
    Node node16 = new Node("hi!");
    Node node18 = new Node("hi!");
    Graph graph19 = new Graph();
    node18.setOwner(graph19);
    graph19.setName("");
    node16.setOwner(graph19);
    java.lang.String str24 = graph19.name;
    node9.setOwner(graph19);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i26 = graph0.getDegree(node9);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test183"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerName("hi!");
    Graph graph17 = new Graph();
    graph17.init();
    node1.setOwner(graph17);
    Node node21 = new Node("");
    graph17.addNode(node21);
    java.lang.String str23 = graph17.name;
    graph17.name = "";
    graph17.name = "hi!";
    Node node29 = new Node("hi!");
    Node node31 = new Node("hi!");
    Graph graph32 = new Graph();
    node31.setOwner(graph32);
    graph32.setName("");
    node29.setOwner(graph32);
    node29.setOwnerNameDirectly("hi!");
    node29.setOwnerNameDirectly("[graph]");
    Node node42 = new Node("");
    Graph graph43 = Graph.generateGraph();
    java.lang.String str44 = graph43.name;
    graph43.init();
    node42.setOwner(graph43);
    java.lang.String str47 = graph43.name;
    graph43.init();
    node29.setOwner(graph43);
    Node node51 = new Node("hi!");
    Node node53 = new Node("hi!");
    Graph graph54 = new Graph();
    node53.setOwner(graph54);
    graph54.setName("");
    node51.setOwner(graph54);
    node51.setOwnerNameDirectly("hi!");
    node51.setOwnerNameDirectly("[graph]");
    Node node64 = new Node("");
    Graph graph65 = Graph.generateGraph();
    java.lang.String str66 = graph65.name;
    graph65.init();
    node64.setOwner(graph65);
    java.lang.String str69 = graph65.name;
    graph65.init();
    node51.setOwner(graph65);
    graph43.addNode(node51);
    Node node74 = new Node("");
    Graph graph75 = Graph.generateGraph();
    java.lang.String str76 = graph75.name;
    node74.setOwner(graph75);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph17.addEdge(node51, node74);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test184"); }


    Graph graph0 = new Graph();
    graph0.init();
    graph0.name = "";
    Node node5 = new Node("");
    Node node7 = new Node("hi!");
    Graph graph8 = new Graph();
    node7.setOwner(graph8);
    node5.setOwner(graph8);
    Node node12 = new Node("hi!");
    Graph graph13 = new Graph();
    node12.setOwner(graph13);
    graph13.setName("");
    java.lang.String str17 = graph13.name;
    node5.setOwner(graph13);
    Node node20 = new Node("hi!");
    Node node22 = new Node("hi!");
    Graph graph23 = new Graph();
    node22.setOwner(graph23);
    graph23.setName("");
    node20.setOwner(graph23);
    node20.setOwnerNameDirectly("hi!");
    node20.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node5, node20);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test185"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerNameDirectly("[graph]");
    Node node18 = new Node("");
    Node node20 = new Node("hi!");
    Graph graph21 = new Graph();
    node20.setOwner(graph21);
    node18.setOwner(graph21);
    Node node25 = new Node("hi!");
    Graph graph26 = new Graph();
    node25.setOwner(graph26);
    graph26.setName("");
    java.lang.String str30 = graph26.name;
    node18.setOwner(graph26);
    node18.setOwnerNameDirectly("hi!");
    Graph graph34 = Graph.generateGraph();
    Node node36 = new Node("");
    Node node38 = new Node("hi!");
    Graph graph39 = new Graph();
    node38.setOwner(graph39);
    node36.setOwner(graph39);
    Node node43 = new Node("hi!");
    Graph graph44 = new Graph();
    node43.setOwner(graph44);
    graph44.setName("");
    java.lang.String str48 = graph44.name;
    node36.setOwner(graph44);
    node36.setOwnerNameDirectly("hi!");
    graph34.addNode(node36);
    node18.setOwner(graph34);
    graph34.name = "";
    node1.setOwner(graph34);
    node1.setOwnerName("");
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerNameDirectly("hi!");
    Node node64 = new Node("hi!");
    Graph graph65 = new Graph();
    node64.setOwner(graph65);
    graph65.setName("");
    graph65.setName("");
    graph65.init();
    node1.setOwner(graph65);
    Node node74 = new Node("");
    Node node76 = new Node("hi!");
    Graph graph77 = new Graph();
    node76.setOwner(graph77);
    node74.setOwner(graph77);
    Node node81 = new Node("hi!");
    Graph graph82 = new Graph();
    node81.setOwner(graph82);
    graph82.setName("");
    java.lang.String str86 = graph82.name;
    node74.setOwner(graph82);
    node74.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node74);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test186"); }


    Graph graph0 = Graph.generateGraph();
    Node node2 = new Node("");
    Node node4 = new Node("hi!");
    Graph graph5 = new Graph();
    node4.setOwner(graph5);
    node2.setOwner(graph5);
    Node node9 = new Node("hi!");
    Graph graph10 = new Graph();
    node9.setOwner(graph10);
    graph10.setName("");
    java.lang.String str14 = graph10.name;
    node2.setOwner(graph10);
    node2.setOwnerNameDirectly("hi!");
    graph0.addNode(node2);
    Graph graph19 = Graph.generateGraph();
    node2.setOwner(graph19);
    Node node22 = new Node("");
    Graph graph23 = Graph.generateGraph();
    java.lang.String str24 = graph23.name;
    node22.setOwner(graph23);
    Graph graph26 = new Graph();
    node22.setOwner(graph26);
    Node node29 = new Node("hi!");
    Node node31 = new Node("hi!");
    Graph graph32 = new Graph();
    node31.setOwner(graph32);
    graph32.setName("");
    node29.setOwner(graph32);
    java.lang.String str37 = graph32.name;
    node22.setOwner(graph32);
    Node node40 = new Node("");
    Graph graph41 = Graph.generateGraph();
    java.lang.String str42 = graph41.name;
    graph41.init();
    node40.setOwner(graph41);
    java.lang.String str45 = graph41.name;
    node22.setOwner(graph41);
    graph41.name = "";
    node2.setOwner(graph41);
    java.lang.String str50 = graph41.name;
    Node node52 = new Node("");
    Node node54 = new Node("hi!");
    Graph graph55 = new Graph();
    node54.setOwner(graph55);
    node52.setOwner(graph55);
    Node node59 = new Node("hi!");
    Graph graph60 = new Graph();
    node59.setOwner(graph60);
    graph60.setName("");
    java.lang.String str64 = graph60.name;
    node52.setOwner(graph60);
    node52.setOwnerNameDirectly("hi!");
    node52.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i70 = graph41.getDegree(node52);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test187"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerNameDirectly("[graph]");
    Node node18 = new Node("");
    Node node20 = new Node("hi!");
    Graph graph21 = new Graph();
    node20.setOwner(graph21);
    node18.setOwner(graph21);
    Node node25 = new Node("hi!");
    Graph graph26 = new Graph();
    node25.setOwner(graph26);
    graph26.setName("");
    java.lang.String str30 = graph26.name;
    node18.setOwner(graph26);
    node18.setOwnerNameDirectly("hi!");
    Graph graph34 = Graph.generateGraph();
    Node node36 = new Node("");
    Node node38 = new Node("hi!");
    Graph graph39 = new Graph();
    node38.setOwner(graph39);
    node36.setOwner(graph39);
    Node node43 = new Node("hi!");
    Graph graph44 = new Graph();
    node43.setOwner(graph44);
    graph44.setName("");
    java.lang.String str48 = graph44.name;
    node36.setOwner(graph44);
    node36.setOwnerNameDirectly("hi!");
    graph34.addNode(node36);
    node18.setOwner(graph34);
    graph34.name = "";
    node1.setOwner(graph34);
    node1.setOwnerName("");
    node1.setOwnerName("");
    node1.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i63 = node1.getDegree();

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test188"); }


    Graph graph0 = Graph.generateGraph();
    java.lang.String str1 = graph0.name;
    graph0.name = "";
    graph0.name = "[graph]";
    graph0.setName("hi!");
    graph0.name = "";
    Node node11 = new Node("");
    Graph graph12 = Graph.generateGraph();
    java.lang.String str13 = graph12.name;
    node11.setOwner(graph12);
    Graph graph15 = new Graph();
    node11.setOwner(graph15);
    node11.setOwnerNameDirectly("");
    node11.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i21 = graph0.getDegree(node11);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test189"); }


    Node node1 = new Node("hi!");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    graph4.setName("");
    node1.setOwner(graph4);
    node1.setOwnerNameDirectly("hi!");
    Node node12 = new Node("hi!");
    Graph graph13 = new Graph();
    node12.setOwner(graph13);
    graph13.setName("");
    graph13.setName("");
    graph13.setName("hi!");
    graph13.init();
    graph13.setName("[graph]");
    node1.setOwner(graph13);
    node1.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test190"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerName("hi!");
    Graph graph17 = new Graph();
    graph17.init();
    node1.setOwner(graph17);
    node1.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test191"); }


    Node node1 = new Node("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.setOwnerName("");

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test192"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    node1.setOwner(graph2);
    Graph graph5 = new Graph();
    node1.setOwner(graph5);
    node1.setOwnerNameDirectly("");
    node1.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test193"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    Node node16 = new Node("");
    Graph graph17 = Graph.generateGraph();
    java.lang.String str18 = graph17.name;
    node16.setOwner(graph17);
    graph17.setName("");
    java.lang.String str22 = graph17.name;
    node1.setOwner(graph17);
    Node node25 = new Node("hi!");
    Graph graph26 = new Graph();
    node25.setOwner(graph26);
    graph17.addNode(node25);
    Node node30 = new Node("hi!");
    Node node32 = new Node("hi!");
    Graph graph33 = new Graph();
    node32.setOwner(graph33);
    graph33.setName("");
    node30.setOwner(graph33);
    Node node39 = new Node("");
    Node node41 = new Node("hi!");
    Graph graph42 = new Graph();
    node41.setOwner(graph42);
    node39.setOwner(graph42);
    Node node46 = new Node("hi!");
    Graph graph47 = new Graph();
    node46.setOwner(graph47);
    graph47.setName("");
    java.lang.String str51 = graph47.name;
    node39.setOwner(graph47);
    node39.setOwnerName("hi!");
    Graph graph55 = new Graph();
    graph55.init();
    node39.setOwner(graph55);
    node39.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph17.addEdge(node30, node39);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test194"); }


    Node node1 = new Node("hi!");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    graph4.setName("");
    node1.setOwner(graph4);
    graph4.init();
    Node node11 = new Node("");
    Node node13 = new Node("hi!");
    Graph graph14 = new Graph();
    node13.setOwner(graph14);
    node11.setOwner(graph14);
    Node node18 = new Node("hi!");
    Graph graph19 = new Graph();
    node18.setOwner(graph19);
    graph19.setName("");
    java.lang.String str23 = graph19.name;
    node11.setOwner(graph19);
    node11.setOwnerNameDirectly("[graph]");
    Node node28 = new Node("");
    Node node30 = new Node("hi!");
    Graph graph31 = new Graph();
    node30.setOwner(graph31);
    node28.setOwner(graph31);
    Node node35 = new Node("hi!");
    Graph graph36 = new Graph();
    node35.setOwner(graph36);
    graph36.setName("");
    java.lang.String str40 = graph36.name;
    node28.setOwner(graph36);
    node28.setOwnerNameDirectly("hi!");
    Graph graph44 = Graph.generateGraph();
    Node node46 = new Node("");
    Node node48 = new Node("hi!");
    Graph graph49 = new Graph();
    node48.setOwner(graph49);
    node46.setOwner(graph49);
    Node node53 = new Node("hi!");
    Graph graph54 = new Graph();
    node53.setOwner(graph54);
    graph54.setName("");
    java.lang.String str58 = graph54.name;
    node46.setOwner(graph54);
    node46.setOwnerNameDirectly("hi!");
    graph44.addNode(node46);
    node28.setOwner(graph44);
    graph44.name = "";
    node11.setOwner(graph44);
    node11.setOwnerNameDirectly("");
    graph4.addNode(node11);
    node11.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node11.thisIsNotCalled();

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test195"); }


    Node node1 = new Node("hi!");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    graph4.setName("");
    node1.setOwner(graph4);
    graph4.setName("");
    Graph graph11 = Graph.generateGraph();
    Node node13 = new Node("");
    Node node15 = new Node("hi!");
    Graph graph16 = new Graph();
    node15.setOwner(graph16);
    node13.setOwner(graph16);
    Node node20 = new Node("hi!");
    Graph graph21 = new Graph();
    node20.setOwner(graph21);
    graph21.setName("");
    java.lang.String str25 = graph21.name;
    node13.setOwner(graph21);
    node13.setOwnerNameDirectly("hi!");
    graph11.addNode(node13);
    Graph graph30 = Graph.generateGraph();
    node13.setOwner(graph30);
    Node node33 = new Node("hi!");
    Node node35 = new Node("hi!");
    Graph graph36 = new Graph();
    node35.setOwner(graph36);
    graph36.setName("");
    node33.setOwner(graph36);
    graph30.addNode(node33);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph4.addNode(node33);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test196"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    graph2.init();
    node1.setOwner(graph2);
    graph2.setName("");
    Graph graph8 = Graph.generateGraph();
    Node node10 = new Node("");
    Node node12 = new Node("hi!");
    Graph graph13 = new Graph();
    node12.setOwner(graph13);
    node10.setOwner(graph13);
    Node node17 = new Node("hi!");
    Graph graph18 = new Graph();
    node17.setOwner(graph18);
    graph18.setName("");
    java.lang.String str22 = graph18.name;
    node10.setOwner(graph18);
    node10.setOwnerNameDirectly("hi!");
    graph8.addNode(node10);
    Graph graph27 = Graph.generateGraph();
    node10.setOwner(graph27);
    Node node30 = new Node("hi!");
    Node node32 = new Node("hi!");
    Graph graph33 = new Graph();
    node32.setOwner(graph33);
    graph33.setName("");
    node30.setOwner(graph33);
    graph27.addNode(node30);
    Graph graph39 = Graph.generateGraph();
    Node node41 = new Node("");
    Node node43 = new Node("hi!");
    Graph graph44 = new Graph();
    node43.setOwner(graph44);
    node41.setOwner(graph44);
    Node node48 = new Node("hi!");
    Graph graph49 = new Graph();
    node48.setOwner(graph49);
    graph49.setName("");
    java.lang.String str53 = graph49.name;
    node41.setOwner(graph49);
    node41.setOwnerNameDirectly("hi!");
    graph39.addNode(node41);
    Graph graph58 = Graph.generateGraph();
    node41.setOwner(graph58);
    Node node61 = new Node("");
    Graph graph62 = Graph.generateGraph();
    java.lang.String str63 = graph62.name;
    node61.setOwner(graph62);
    Graph graph65 = new Graph();
    node61.setOwner(graph65);
    Node node68 = new Node("hi!");
    Node node70 = new Node("hi!");
    Graph graph71 = new Graph();
    node70.setOwner(graph71);
    graph71.setName("");
    node68.setOwner(graph71);
    java.lang.String str76 = graph71.name;
    node61.setOwner(graph71);
    Node node79 = new Node("");
    Graph graph80 = Graph.generateGraph();
    java.lang.String str81 = graph80.name;
    graph80.init();
    node79.setOwner(graph80);
    java.lang.String str84 = graph80.name;
    node61.setOwner(graph80);
    graph80.name = "";
    node41.setOwner(graph80);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph2.addEdge(node30, node41);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test197"); }


    Graph graph0 = Graph.generateGraph();
    Node node2 = new Node("");
    Node node4 = new Node("hi!");
    Graph graph5 = new Graph();
    node4.setOwner(graph5);
    node2.setOwner(graph5);
    Node node9 = new Node("hi!");
    Graph graph10 = new Graph();
    node9.setOwner(graph10);
    graph10.setName("");
    java.lang.String str14 = graph10.name;
    node2.setOwner(graph10);
    node2.setOwnerNameDirectly("hi!");
    graph0.addNode(node2);
    Graph graph19 = Graph.generateGraph();
    node2.setOwner(graph19);
    node2.setOwnerName("hi!");
    Graph graph23 = Graph.generateGraph();
    Node node25 = new Node("");
    Node node27 = new Node("hi!");
    Graph graph28 = new Graph();
    node27.setOwner(graph28);
    node25.setOwner(graph28);
    Node node32 = new Node("hi!");
    Graph graph33 = new Graph();
    node32.setOwner(graph33);
    graph33.setName("");
    java.lang.String str37 = graph33.name;
    node25.setOwner(graph33);
    node25.setOwnerNameDirectly("hi!");
    graph23.addNode(node25);
    Graph graph42 = Graph.generateGraph();
    node25.setOwner(graph42);
    Node node45 = new Node("");
    Graph graph46 = Graph.generateGraph();
    java.lang.String str47 = graph46.name;
    node45.setOwner(graph46);
    Graph graph49 = new Graph();
    node45.setOwner(graph49);
    Node node52 = new Node("hi!");
    Node node54 = new Node("hi!");
    Graph graph55 = new Graph();
    node54.setOwner(graph55);
    graph55.setName("");
    node52.setOwner(graph55);
    java.lang.String str60 = graph55.name;
    node45.setOwner(graph55);
    Node node63 = new Node("");
    Graph graph64 = Graph.generateGraph();
    java.lang.String str65 = graph64.name;
    graph64.init();
    node63.setOwner(graph64);
    java.lang.String str68 = graph64.name;
    node45.setOwner(graph64);
    graph64.name = "";
    node25.setOwner(graph64);
    Graph graph73 = Graph.generateGraph();
    Node node75 = new Node("");
    Node node77 = new Node("hi!");
    Graph graph78 = new Graph();
    node77.setOwner(graph78);
    node75.setOwner(graph78);
    Node node82 = new Node("hi!");
    Graph graph83 = new Graph();
    node82.setOwner(graph83);
    graph83.setName("");
    java.lang.String str87 = graph83.name;
    node75.setOwner(graph83);
    node75.setOwnerNameDirectly("hi!");
    graph73.addNode(node75);
    Graph graph92 = Graph.generateGraph();
    node75.setOwner(graph92);
    graph64.addNode(node75);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node2.addEdge(node75);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test198"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    node1.setOwner(graph2);
    Graph graph5 = new Graph();
    node1.setOwner(graph5);
    node1.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test199"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerNameDirectly("[graph]");
    Node node18 = new Node("");
    Node node20 = new Node("hi!");
    Graph graph21 = new Graph();
    node20.setOwner(graph21);
    node18.setOwner(graph21);
    Node node25 = new Node("hi!");
    Graph graph26 = new Graph();
    node25.setOwner(graph26);
    graph26.setName("");
    java.lang.String str30 = graph26.name;
    node18.setOwner(graph26);
    node18.setOwnerNameDirectly("hi!");
    Graph graph34 = Graph.generateGraph();
    Node node36 = new Node("");
    Node node38 = new Node("hi!");
    Graph graph39 = new Graph();
    node38.setOwner(graph39);
    node36.setOwner(graph39);
    Node node43 = new Node("hi!");
    Graph graph44 = new Graph();
    node43.setOwner(graph44);
    graph44.setName("");
    java.lang.String str48 = graph44.name;
    node36.setOwner(graph44);
    node36.setOwnerNameDirectly("hi!");
    graph34.addNode(node36);
    node18.setOwner(graph34);
    graph34.name = "";
    node1.setOwner(graph34);
    Node node58 = new Node("");
    Node node60 = new Node("hi!");
    Graph graph61 = new Graph();
    node60.setOwner(graph61);
    node58.setOwner(graph61);
    Node node65 = new Node("hi!");
    Graph graph66 = new Graph();
    node65.setOwner(graph66);
    graph66.setName("");
    java.lang.String str70 = graph66.name;
    node58.setOwner(graph66);
    node58.setOwnerNameDirectly("[graph]");
    node58.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i76 = graph34.getDegree(node58);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test200"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    graph9.init();
    graph9.init();
    Node node18 = new Node("");
    Node node20 = new Node("hi!");
    Graph graph21 = new Graph();
    node20.setOwner(graph21);
    node18.setOwner(graph21);
    Node node25 = new Node("hi!");
    Graph graph26 = new Graph();
    node25.setOwner(graph26);
    graph26.setName("");
    java.lang.String str30 = graph26.name;
    node18.setOwner(graph26);
    node18.setOwnerNameDirectly("[graph]");
    node18.setOwnerName("");
    node18.setOwnerName("[graph]");
    graph9.addNode(node18);
    node18.setOwnerNameDirectly("hi!");
    node18.setOwnerNameDirectly("hi!");
    Node node44 = new Node("");
    Node node46 = new Node("hi!");
    Graph graph47 = new Graph();
    node46.setOwner(graph47);
    node44.setOwner(graph47);
    Node node51 = new Node("hi!");
    Graph graph52 = new Graph();
    node51.setOwner(graph52);
    graph52.setName("");
    java.lang.String str56 = graph52.name;
    node44.setOwner(graph52);
    node44.setOwnerName("hi!");
    Graph graph60 = new Graph();
    graph60.init();
    node44.setOwner(graph60);
    Node node64 = new Node("");
    graph60.addNode(node64);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node18.addEdge(node64);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test201"); }


    Graph graph0 = Graph.generateGraph();
    Node node2 = new Node("");
    Node node4 = new Node("hi!");
    Graph graph5 = new Graph();
    node4.setOwner(graph5);
    node2.setOwner(graph5);
    Node node9 = new Node("hi!");
    Graph graph10 = new Graph();
    node9.setOwner(graph10);
    graph10.setName("");
    java.lang.String str14 = graph10.name;
    node2.setOwner(graph10);
    node2.setOwnerNameDirectly("hi!");
    graph0.addNode(node2);
    Graph graph19 = Graph.generateGraph();
    node2.setOwner(graph19);
    Node node22 = new Node("");
    Graph graph23 = Graph.generateGraph();
    java.lang.String str24 = graph23.name;
    node22.setOwner(graph23);
    Graph graph26 = new Graph();
    node22.setOwner(graph26);
    Node node29 = new Node("hi!");
    Node node31 = new Node("hi!");
    Graph graph32 = new Graph();
    node31.setOwner(graph32);
    graph32.setName("");
    node29.setOwner(graph32);
    java.lang.String str37 = graph32.name;
    node22.setOwner(graph32);
    Node node40 = new Node("");
    Graph graph41 = Graph.generateGraph();
    java.lang.String str42 = graph41.name;
    graph41.init();
    node40.setOwner(graph41);
    java.lang.String str45 = graph41.name;
    node22.setOwner(graph41);
    graph41.name = "";
    node2.setOwner(graph41);
    node2.setOwnerNameDirectly("hi!");
    Node node53 = new Node("");
    Node node55 = new Node("hi!");
    Graph graph56 = new Graph();
    node55.setOwner(graph56);
    node53.setOwner(graph56);
    Node node60 = new Node("hi!");
    Graph graph61 = new Graph();
    node60.setOwner(graph61);
    graph61.setName("");
    java.lang.String str65 = graph61.name;
    node53.setOwner(graph61);
    Node node68 = new Node("");
    Graph graph69 = Graph.generateGraph();
    java.lang.String str70 = graph69.name;
    node68.setOwner(graph69);
    graph69.setName("");
    java.lang.String str74 = graph69.name;
    node53.setOwner(graph69);
    node2.setOwner(graph69);
    Node node78 = new Node("");
    Graph graph79 = Graph.generateGraph();
    java.lang.String str80 = graph79.name;
    node78.setOwner(graph79);
    Graph graph82 = new Graph();
    node78.setOwner(graph82);
    node78.setOwnerNameDirectly("");
    node78.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node2.addEdge(node78);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test202"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    node1.setOwner(graph2);
    Graph graph5 = new Graph();
    node1.setOwner(graph5);
    Node node8 = new Node("hi!");
    Node node10 = new Node("hi!");
    Graph graph11 = new Graph();
    node10.setOwner(graph11);
    graph11.setName("");
    node8.setOwner(graph11);
    java.lang.String str16 = graph11.name;
    node1.setOwner(graph11);
    java.lang.String str18 = graph11.name;
    java.lang.String str19 = graph11.name;
    Node node21 = new Node("");
    Graph graph22 = Graph.generateGraph();
    Node node24 = new Node("");
    Node node26 = new Node("hi!");
    Graph graph27 = new Graph();
    node26.setOwner(graph27);
    node24.setOwner(graph27);
    Node node31 = new Node("hi!");
    Graph graph32 = new Graph();
    node31.setOwner(graph32);
    graph32.setName("");
    java.lang.String str36 = graph32.name;
    node24.setOwner(graph32);
    node24.setOwnerNameDirectly("hi!");
    graph22.addNode(node24);
    graph22.name = "";
    node21.setOwner(graph22);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph11.addNode(node21);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test203"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerNameDirectly("[graph]");
    Graph graph17 = Graph.generateGraph();
    Node node19 = new Node("");
    Node node21 = new Node("hi!");
    Graph graph22 = new Graph();
    node21.setOwner(graph22);
    node19.setOwner(graph22);
    Node node26 = new Node("hi!");
    Graph graph27 = new Graph();
    node26.setOwner(graph27);
    graph27.setName("");
    java.lang.String str31 = graph27.name;
    node19.setOwner(graph27);
    node19.setOwnerNameDirectly("hi!");
    graph17.addNode(node19);
    node1.setOwner(graph17);
    graph17.setName("");
    java.lang.String str39 = graph17.name;
    Node node41 = new Node("");
    Graph graph42 = Graph.generateGraph();
    Node node44 = new Node("");
    Node node46 = new Node("hi!");
    Graph graph47 = new Graph();
    node46.setOwner(graph47);
    node44.setOwner(graph47);
    Node node51 = new Node("hi!");
    Graph graph52 = new Graph();
    node51.setOwner(graph52);
    graph52.setName("");
    java.lang.String str56 = graph52.name;
    node44.setOwner(graph52);
    node44.setOwnerNameDirectly("hi!");
    graph42.addNode(node44);
    graph42.name = "";
    node41.setOwner(graph42);
    Node node65 = new Node("hi!");
    Graph graph66 = new Graph();
    node65.setOwner(graph66);
    graph42.addNode(node65);
    graph17.addNode(node65);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i70 = node65.getDegree();

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test204"); }


    Graph graph0 = Graph.generateGraph();
    java.lang.String str1 = graph0.name;
    graph0.name = "";
    java.lang.String str4 = graph0.name;
    Node node6 = new Node("");
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    node6.setOwner(graph9);
    Graph graph12 = Graph.generateGraph();
    Node node14 = new Node("");
    Node node16 = new Node("hi!");
    Graph graph17 = new Graph();
    node16.setOwner(graph17);
    node14.setOwner(graph17);
    Node node21 = new Node("hi!");
    Graph graph22 = new Graph();
    node21.setOwner(graph22);
    graph22.setName("");
    java.lang.String str26 = graph22.name;
    node14.setOwner(graph22);
    node14.setOwnerNameDirectly("hi!");
    graph12.addNode(node14);
    Graph graph31 = Graph.generateGraph();
    node14.setOwner(graph31);
    Node node34 = new Node("");
    Graph graph35 = Graph.generateGraph();
    java.lang.String str36 = graph35.name;
    node34.setOwner(graph35);
    Graph graph38 = new Graph();
    node34.setOwner(graph38);
    Node node41 = new Node("hi!");
    Node node43 = new Node("hi!");
    Graph graph44 = new Graph();
    node43.setOwner(graph44);
    graph44.setName("");
    node41.setOwner(graph44);
    java.lang.String str49 = graph44.name;
    node34.setOwner(graph44);
    Node node52 = new Node("");
    Graph graph53 = Graph.generateGraph();
    java.lang.String str54 = graph53.name;
    graph53.init();
    node52.setOwner(graph53);
    java.lang.String str57 = graph53.name;
    node34.setOwner(graph53);
    graph53.name = "";
    node14.setOwner(graph53);
    node14.setOwnerNameDirectly("hi!");
    node14.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node6, node14);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test205"); }


    Graph graph0 = Graph.generateGraph();
    Node node2 = new Node("");
    Node node4 = new Node("hi!");
    Graph graph5 = new Graph();
    node4.setOwner(graph5);
    node2.setOwner(graph5);
    Node node9 = new Node("hi!");
    Graph graph10 = new Graph();
    node9.setOwner(graph10);
    graph10.setName("");
    java.lang.String str14 = graph10.name;
    node2.setOwner(graph10);
    node2.setOwnerNameDirectly("hi!");
    graph0.addNode(node2);
    node2.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i21 = node2.getDegree();

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test206"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerName("hi!");
    Graph graph17 = new Graph();
    graph17.init();
    node1.setOwner(graph17);
    node1.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i22 = node1.getDegree();

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test207"); }


    Node node1 = new Node("hi!");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    graph4.setName("");
    node1.setOwner(graph4);
    node1.setOwnerNameDirectly("hi!");
    Node node12 = new Node("hi!");
    Graph graph13 = new Graph();
    node12.setOwner(graph13);
    graph13.setName("");
    graph13.setName("");
    graph13.init();
    node1.setOwner(graph13);
    Node node22 = new Node("");
    Node node24 = new Node("hi!");
    Graph graph25 = new Graph();
    node24.setOwner(graph25);
    node22.setOwner(graph25);
    Node node29 = new Node("hi!");
    Graph graph30 = new Graph();
    node29.setOwner(graph30);
    graph30.setName("");
    java.lang.String str34 = graph30.name;
    node22.setOwner(graph30);
    node22.setOwnerNameDirectly("[graph]");
    node22.setOwnerName("");
    Graph graph40 = new Graph();
    graph40.init();
    graph40.setName("");
    java.lang.String str44 = graph40.name;
    node22.setOwner(graph40);
    Node node47 = new Node("");
    Node node49 = new Node("hi!");
    Graph graph50 = new Graph();
    node49.setOwner(graph50);
    node47.setOwner(graph50);
    Node node54 = new Node("hi!");
    Graph graph55 = new Graph();
    node54.setOwner(graph55);
    graph55.setName("");
    java.lang.String str59 = graph55.name;
    node47.setOwner(graph55);
    node47.setOwnerNameDirectly("[graph]");
    Graph graph63 = Graph.generateGraph();
    Node node65 = new Node("");
    Node node67 = new Node("hi!");
    Graph graph68 = new Graph();
    node67.setOwner(graph68);
    node65.setOwner(graph68);
    Node node72 = new Node("hi!");
    Graph graph73 = new Graph();
    node72.setOwner(graph73);
    graph73.setName("");
    java.lang.String str77 = graph73.name;
    node65.setOwner(graph73);
    node65.setOwnerNameDirectly("hi!");
    graph63.addNode(node65);
    node47.setOwner(graph63);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph13.addEdge(node22, node47);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test208"); }


    Node node1 = new Node("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.setOwnerNameDirectly("[graph]");

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test209"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    node1.setOwner(graph2);
    Graph graph5 = new Graph();
    node1.setOwner(graph5);
    Node node8 = new Node("");
    Graph graph9 = Graph.generateGraph();
    Node node11 = new Node("");
    Node node13 = new Node("hi!");
    Graph graph14 = new Graph();
    node13.setOwner(graph14);
    node11.setOwner(graph14);
    Node node18 = new Node("hi!");
    Graph graph19 = new Graph();
    node18.setOwner(graph19);
    graph19.setName("");
    java.lang.String str23 = graph19.name;
    node11.setOwner(graph19);
    node11.setOwnerNameDirectly("hi!");
    graph9.addNode(node11);
    graph9.name = "";
    node8.setOwner(graph9);
    Node node32 = new Node("hi!");
    Graph graph33 = new Graph();
    node32.setOwner(graph33);
    graph9.addNode(node32);
    Node node37 = new Node("");
    Graph graph38 = Graph.generateGraph();
    Node node40 = new Node("");
    Node node42 = new Node("hi!");
    Graph graph43 = new Graph();
    node42.setOwner(graph43);
    node40.setOwner(graph43);
    Node node47 = new Node("hi!");
    Graph graph48 = new Graph();
    node47.setOwner(graph48);
    graph48.setName("");
    java.lang.String str52 = graph48.name;
    node40.setOwner(graph48);
    node40.setOwnerNameDirectly("hi!");
    graph38.addNode(node40);
    graph38.name = "";
    node37.setOwner(graph38);
    Node node61 = new Node("hi!");
    Graph graph62 = new Graph();
    node61.setOwner(graph62);
    graph38.addNode(node61);
    Node node66 = new Node("");
    Graph graph67 = Graph.generateGraph();
    java.lang.String str68 = graph67.name;
    graph67.init();
    node66.setOwner(graph67);
    java.lang.String str71 = graph67.name;
    graph67.init();
    graph67.setName("");
    node61.setOwner(graph67);
    Node node77 = new Node("hi!");
    Node node79 = new Node("hi!");
    Graph graph80 = new Graph();
    node79.setOwner(graph80);
    graph80.setName("");
    node77.setOwner(graph80);
    node77.setOwnerNameDirectly("hi!");
    graph67.addNode(node77);
    node77.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph5.addEdge(node32, node77);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test210"); }


    Graph graph0 = Graph.generateGraph();
    Node node2 = new Node("");
    Node node4 = new Node("hi!");
    Graph graph5 = new Graph();
    node4.setOwner(graph5);
    node2.setOwner(graph5);
    Node node9 = new Node("hi!");
    Graph graph10 = new Graph();
    node9.setOwner(graph10);
    graph10.setName("");
    java.lang.String str14 = graph10.name;
    node2.setOwner(graph10);
    node2.setOwnerNameDirectly("hi!");
    graph0.addNode(node2);
    node2.setOwnerNameDirectly("hi!");
    node2.setOwnerNameDirectly("hi!");
    node2.setOwnerNameDirectly("[graph]");
    Node node26 = new Node("");
    Node node28 = new Node("hi!");
    Graph graph29 = new Graph();
    node28.setOwner(graph29);
    node26.setOwner(graph29);
    Node node33 = new Node("hi!");
    Graph graph34 = new Graph();
    node33.setOwner(graph34);
    graph34.setName("");
    java.lang.String str38 = graph34.name;
    node26.setOwner(graph34);
    node26.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node2.addEdge(node26);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test211"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    graph2.init();
    node1.setOwner(graph2);
    java.lang.String str6 = graph2.name;
    graph2.name = "[graph]";
    graph2.name = "hi!";
    java.lang.String str11 = graph2.name;
    Node node13 = new Node("");
    Node node15 = new Node("hi!");
    Graph graph16 = new Graph();
    node15.setOwner(graph16);
    node13.setOwner(graph16);
    Node node20 = new Node("hi!");
    Graph graph21 = new Graph();
    node20.setOwner(graph21);
    graph21.setName("");
    java.lang.String str25 = graph21.name;
    node13.setOwner(graph21);
    node13.setOwnerNameDirectly("[graph]");
    node13.setOwnerName("");
    node13.setOwnerName("[graph]");
    graph2.addNode(node13);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i34 = node13.getDegree();

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test212"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    graph9.init();
    graph9.init();
    Node node18 = new Node("");
    Node node20 = new Node("hi!");
    Graph graph21 = new Graph();
    node20.setOwner(graph21);
    node18.setOwner(graph21);
    Node node25 = new Node("hi!");
    Graph graph26 = new Graph();
    node25.setOwner(graph26);
    graph26.setName("");
    java.lang.String str30 = graph26.name;
    node18.setOwner(graph26);
    node18.setOwnerNameDirectly("[graph]");
    node18.setOwnerName("");
    node18.setOwnerName("[graph]");
    graph9.addNode(node18);
    node18.setOwnerNameDirectly("hi!");
    node18.setOwnerNameDirectly("hi!");
    Graph graph43 = Graph.generateGraph();
    Node node45 = new Node("");
    Node node47 = new Node("hi!");
    Graph graph48 = new Graph();
    node47.setOwner(graph48);
    node45.setOwner(graph48);
    Node node52 = new Node("hi!");
    Graph graph53 = new Graph();
    node52.setOwner(graph53);
    graph53.setName("");
    java.lang.String str57 = graph53.name;
    node45.setOwner(graph53);
    node45.setOwnerNameDirectly("hi!");
    graph43.addNode(node45);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node18.addEdge(node45);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test213"); }


    Node node1 = new Node("hi!");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    graph4.setName("");
    node1.setOwner(graph4);
    java.lang.String str9 = graph4.name;
    graph4.setName("hi!");
    Node node13 = new Node("hi!");
    Node node15 = new Node("hi!");
    Graph graph16 = new Graph();
    node15.setOwner(graph16);
    graph16.setName("");
    node13.setOwner(graph16);
    node13.setOwnerNameDirectly("hi!");
    Node node24 = new Node("hi!");
    Graph graph25 = new Graph();
    node24.setOwner(graph25);
    graph25.setName("");
    graph25.setName("");
    graph25.init();
    node13.setOwner(graph25);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph4.addNode(node13);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test214"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    node1.setOwner(graph2);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test215"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    graph9.init();
    graph9.init();
    Node node18 = new Node("");
    Node node20 = new Node("hi!");
    Graph graph21 = new Graph();
    node20.setOwner(graph21);
    node18.setOwner(graph21);
    Node node25 = new Node("hi!");
    Graph graph26 = new Graph();
    node25.setOwner(graph26);
    graph26.setName("");
    java.lang.String str30 = graph26.name;
    node18.setOwner(graph26);
    node18.setOwnerNameDirectly("[graph]");
    node18.setOwnerName("");
    node18.setOwnerName("[graph]");
    graph9.addNode(node18);
    node18.setOwnerNameDirectly("hi!");
    node18.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i43 = node18.getDegree();

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test216"); }


    Node node1 = new Node("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.setOwnerName("");

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test217"); }


    Graph graph0 = Graph.generateGraph();
    Node node2 = new Node("");
    Node node4 = new Node("hi!");
    Graph graph5 = new Graph();
    node4.setOwner(graph5);
    node2.setOwner(graph5);
    Node node9 = new Node("hi!");
    Graph graph10 = new Graph();
    node9.setOwner(graph10);
    graph10.setName("");
    java.lang.String str14 = graph10.name;
    node2.setOwner(graph10);
    node2.setOwnerNameDirectly("hi!");
    graph0.addNode(node2);
    Graph graph19 = Graph.generateGraph();
    node2.setOwner(graph19);
    node2.setOwnerName("hi!");
    Node node24 = new Node("hi!");
    Graph graph25 = new Graph();
    node24.setOwner(graph25);
    graph25.setName("");
    graph25.setName("[graph]");
    node2.setOwner(graph25);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i32 = node2.getDegree();

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test218"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    graph9.init();
    graph9.init();
    Node node18 = new Node("");
    Node node20 = new Node("hi!");
    Graph graph21 = new Graph();
    node20.setOwner(graph21);
    node18.setOwner(graph21);
    Node node25 = new Node("hi!");
    Graph graph26 = new Graph();
    node25.setOwner(graph26);
    graph26.setName("");
    java.lang.String str30 = graph26.name;
    node18.setOwner(graph26);
    node18.setOwnerNameDirectly("[graph]");
    node18.setOwnerName("");
    node18.setOwnerName("[graph]");
    graph9.addNode(node18);
    node18.setOwnerNameDirectly("hi!");
    Node node42 = new Node("");
    Graph graph43 = Graph.generateGraph();
    java.lang.String str44 = graph43.name;
    graph43.init();
    node42.setOwner(graph43);
    java.lang.String str47 = graph43.name;
    graph43.name = "[graph]";
    graph43.name = "hi!";
    java.lang.String str52 = graph43.name;
    Node node54 = new Node("");
    Node node56 = new Node("hi!");
    Graph graph57 = new Graph();
    node56.setOwner(graph57);
    node54.setOwner(graph57);
    Node node61 = new Node("hi!");
    Graph graph62 = new Graph();
    node61.setOwner(graph62);
    graph62.setName("");
    java.lang.String str66 = graph62.name;
    node54.setOwner(graph62);
    node54.setOwnerNameDirectly("[graph]");
    node54.setOwnerName("");
    node54.setOwnerName("[graph]");
    graph43.addNode(node54);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node18.addEdge(node54);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test219"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerNameDirectly("[graph]");
    Node node18 = new Node("");
    Node node20 = new Node("hi!");
    Graph graph21 = new Graph();
    node20.setOwner(graph21);
    node18.setOwner(graph21);
    Node node25 = new Node("hi!");
    Graph graph26 = new Graph();
    node25.setOwner(graph26);
    graph26.setName("");
    java.lang.String str30 = graph26.name;
    node18.setOwner(graph26);
    node18.setOwnerNameDirectly("hi!");
    Graph graph34 = Graph.generateGraph();
    Node node36 = new Node("");
    Node node38 = new Node("hi!");
    Graph graph39 = new Graph();
    node38.setOwner(graph39);
    node36.setOwner(graph39);
    Node node43 = new Node("hi!");
    Graph graph44 = new Graph();
    node43.setOwner(graph44);
    graph44.setName("");
    java.lang.String str48 = graph44.name;
    node36.setOwner(graph44);
    node36.setOwnerNameDirectly("hi!");
    graph34.addNode(node36);
    node18.setOwner(graph34);
    graph34.name = "";
    node1.setOwner(graph34);
    node1.setOwnerName("");
    node1.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test220"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerNameDirectly("[graph]");
    node1.setOwnerName("");
    Graph graph19 = new Graph();
    graph19.init();
    graph19.setName("");
    java.lang.String str23 = graph19.name;
    node1.setOwner(graph19);
    java.lang.String str25 = graph19.name;
    Node node27 = new Node("");
    Graph graph28 = Graph.generateGraph();
    Node node30 = new Node("");
    Node node32 = new Node("hi!");
    Graph graph33 = new Graph();
    node32.setOwner(graph33);
    node30.setOwner(graph33);
    Node node37 = new Node("hi!");
    Graph graph38 = new Graph();
    node37.setOwner(graph38);
    graph38.setName("");
    java.lang.String str42 = graph38.name;
    node30.setOwner(graph38);
    node30.setOwnerNameDirectly("hi!");
    graph28.addNode(node30);
    graph28.name = "";
    node27.setOwner(graph28);
    Node node51 = new Node("hi!");
    Graph graph52 = new Graph();
    node51.setOwner(graph52);
    graph28.addNode(node51);
    Node node56 = new Node("");
    Graph graph57 = Graph.generateGraph();
    java.lang.String str58 = graph57.name;
    graph57.init();
    node56.setOwner(graph57);
    java.lang.String str61 = graph57.name;
    graph57.init();
    graph57.setName("");
    node51.setOwner(graph57);
    Node node67 = new Node("hi!");
    Node node69 = new Node("hi!");
    Graph graph70 = new Graph();
    node69.setOwner(graph70);
    graph70.setName("");
    node67.setOwner(graph70);
    node67.setOwnerNameDirectly("hi!");
    graph57.addNode(node67);
    node67.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i80 = graph19.getDegree(node67);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test221"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    graph9.init();
    graph9.init();
    Node node18 = new Node("");
    Node node20 = new Node("hi!");
    Graph graph21 = new Graph();
    node20.setOwner(graph21);
    node18.setOwner(graph21);
    Node node25 = new Node("hi!");
    Graph graph26 = new Graph();
    node25.setOwner(graph26);
    graph26.setName("");
    java.lang.String str30 = graph26.name;
    node18.setOwner(graph26);
    node18.setOwnerNameDirectly("[graph]");
    node18.setOwnerName("");
    node18.setOwnerName("[graph]");
    graph9.addNode(node18);
    node18.setOwnerNameDirectly("hi!");
    node18.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node18.thisIsNotCalled();

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test222"); }


    Node node1 = new Node("hi!");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    graph4.setName("");
    node1.setOwner(graph4);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerNameDirectly("[graph]");
    Node node14 = new Node("");
    Graph graph15 = Graph.generateGraph();
    java.lang.String str16 = graph15.name;
    graph15.init();
    node14.setOwner(graph15);
    java.lang.String str19 = graph15.name;
    graph15.init();
    node1.setOwner(graph15);
    graph15.name = "";
    Node node25 = new Node("hi!");
    Graph graph26 = new Graph();
    node25.setOwner(graph26);
    node25.setOwnerName("[graph]");
    Node node31 = new Node("");
    Node node33 = new Node("hi!");
    Graph graph34 = new Graph();
    node33.setOwner(graph34);
    node31.setOwner(graph34);
    Node node38 = new Node("hi!");
    Graph graph39 = new Graph();
    node38.setOwner(graph39);
    graph39.setName("");
    java.lang.String str43 = graph39.name;
    node31.setOwner(graph39);
    node25.setOwner(graph39);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i46 = graph15.getDegree(node25);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test223"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerNameDirectly("[graph]");
    Node node18 = new Node("");
    Node node20 = new Node("hi!");
    Graph graph21 = new Graph();
    node20.setOwner(graph21);
    node18.setOwner(graph21);
    Node node25 = new Node("hi!");
    Graph graph26 = new Graph();
    node25.setOwner(graph26);
    graph26.setName("");
    java.lang.String str30 = graph26.name;
    node18.setOwner(graph26);
    node18.setOwnerNameDirectly("hi!");
    Graph graph34 = Graph.generateGraph();
    Node node36 = new Node("");
    Node node38 = new Node("hi!");
    Graph graph39 = new Graph();
    node38.setOwner(graph39);
    node36.setOwner(graph39);
    Node node43 = new Node("hi!");
    Graph graph44 = new Graph();
    node43.setOwner(graph44);
    graph44.setName("");
    java.lang.String str48 = graph44.name;
    node36.setOwner(graph44);
    node36.setOwnerNameDirectly("hi!");
    graph34.addNode(node36);
    node18.setOwner(graph34);
    graph34.name = "";
    node1.setOwner(graph34);
    node1.setOwnerNameDirectly("");
    node1.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test224"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    node1.setOwner(graph2);
    Graph graph5 = new Graph();
    node1.setOwner(graph5);
    node1.setOwnerNameDirectly("");
    node1.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i11 = node1.getDegree();

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test225"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerName("hi!");
    node1.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test226"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("[graph]");
    Node node20 = new Node("");
    Graph graph21 = Graph.generateGraph();
    Node node23 = new Node("");
    Node node25 = new Node("hi!");
    Graph graph26 = new Graph();
    node25.setOwner(graph26);
    node23.setOwner(graph26);
    Node node30 = new Node("hi!");
    Graph graph31 = new Graph();
    node30.setOwner(graph31);
    graph31.setName("");
    java.lang.String str35 = graph31.name;
    node23.setOwner(graph31);
    node23.setOwnerNameDirectly("hi!");
    graph21.addNode(node23);
    graph21.name = "";
    node20.setOwner(graph21);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node20);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test227"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    node1.setOwner(graph2);
    Graph graph5 = new Graph();
    node1.setOwner(graph5);
    Node node8 = new Node("hi!");
    Node node10 = new Node("hi!");
    Graph graph11 = new Graph();
    node10.setOwner(graph11);
    graph11.setName("");
    node8.setOwner(graph11);
    java.lang.String str16 = graph11.name;
    node1.setOwner(graph11);
    Graph graph18 = Graph.generateGraph();
    Node node20 = new Node("");
    Node node22 = new Node("hi!");
    Graph graph23 = new Graph();
    node22.setOwner(graph23);
    node20.setOwner(graph23);
    Node node27 = new Node("hi!");
    Graph graph28 = new Graph();
    node27.setOwner(graph28);
    graph28.setName("");
    java.lang.String str32 = graph28.name;
    node20.setOwner(graph28);
    node20.setOwnerNameDirectly("hi!");
    graph18.addNode(node20);
    node20.setOwnerNameDirectly("hi!");
    node20.setOwnerNameDirectly("hi!");
    node20.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node20);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test228"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    graph2.init();
    node1.setOwner(graph2);
    java.lang.String str6 = graph2.name;
    graph2.name = "[graph]";
    java.lang.String str9 = graph2.name;
    graph2.name = "";
    graph2.init();
    Node node14 = new Node("");
    Graph graph15 = Graph.generateGraph();
    java.lang.String str16 = graph15.name;
    node14.setOwner(graph15);
    Graph graph18 = new Graph();
    node14.setOwner(graph18);
    Node node21 = new Node("hi!");
    Node node23 = new Node("hi!");
    Graph graph24 = new Graph();
    node23.setOwner(graph24);
    graph24.setName("");
    node21.setOwner(graph24);
    java.lang.String str29 = graph24.name;
    node14.setOwner(graph24);
    Node node32 = new Node("");
    Graph graph33 = Graph.generateGraph();
    java.lang.String str34 = graph33.name;
    graph33.init();
    node32.setOwner(graph33);
    java.lang.String str37 = graph33.name;
    node14.setOwner(graph33);
    Node node40 = new Node("hi!");
    Node node42 = new Node("hi!");
    Graph graph43 = new Graph();
    node42.setOwner(graph43);
    graph43.setName("");
    node40.setOwner(graph43);
    node40.setOwnerNameDirectly("hi!");
    graph33.addNode(node40);
    Graph graph51 = Graph.generateGraph();
    Node node53 = new Node("");
    Node node55 = new Node("hi!");
    Graph graph56 = new Graph();
    node55.setOwner(graph56);
    node53.setOwner(graph56);
    Node node60 = new Node("hi!");
    Graph graph61 = new Graph();
    node60.setOwner(graph61);
    graph61.setName("");
    java.lang.String str65 = graph61.name;
    node53.setOwner(graph61);
    node53.setOwnerNameDirectly("hi!");
    graph51.addNode(node53);
    Graph graph70 = Graph.generateGraph();
    node53.setOwner(graph70);
    node53.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph2.addEdge(node40, node53);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test229"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerNameDirectly("[graph]");
    Node node18 = new Node("");
    Node node20 = new Node("hi!");
    Graph graph21 = new Graph();
    node20.setOwner(graph21);
    node18.setOwner(graph21);
    Node node25 = new Node("hi!");
    Graph graph26 = new Graph();
    node25.setOwner(graph26);
    graph26.setName("");
    java.lang.String str30 = graph26.name;
    node18.setOwner(graph26);
    node18.setOwnerNameDirectly("hi!");
    Graph graph34 = Graph.generateGraph();
    Node node36 = new Node("");
    Node node38 = new Node("hi!");
    Graph graph39 = new Graph();
    node38.setOwner(graph39);
    node36.setOwner(graph39);
    Node node43 = new Node("hi!");
    Graph graph44 = new Graph();
    node43.setOwner(graph44);
    graph44.setName("");
    java.lang.String str48 = graph44.name;
    node36.setOwner(graph44);
    node36.setOwnerNameDirectly("hi!");
    graph34.addNode(node36);
    node18.setOwner(graph34);
    graph34.name = "";
    node1.setOwner(graph34);
    node1.setOwnerName("");
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerNameDirectly("hi!");
    Node node64 = new Node("hi!");
    Graph graph65 = new Graph();
    node64.setOwner(graph65);
    graph65.setName("");
    graph65.setName("");
    graph65.init();
    node1.setOwner(graph65);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test230"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerName("hi!");
    node1.setOwnerName("hi!");
    node1.setOwnerNameDirectly("");
    Node node22 = new Node("");
    Node node24 = new Node("hi!");
    Graph graph25 = new Graph();
    node24.setOwner(graph25);
    node22.setOwner(graph25);
    Node node29 = new Node("hi!");
    Graph graph30 = new Graph();
    node29.setOwner(graph30);
    graph30.setName("");
    java.lang.String str34 = graph30.name;
    node22.setOwner(graph30);
    java.lang.String str36 = graph30.name;
    graph30.setName("");
    graph30.setName("");
    node1.setOwner(graph30);
    node1.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i44 = node1.getDegree();

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test231"); }


    Graph graph0 = Graph.generateGraph();
    Node node2 = new Node("");
    Node node4 = new Node("hi!");
    Graph graph5 = new Graph();
    node4.setOwner(graph5);
    node2.setOwner(graph5);
    Node node9 = new Node("hi!");
    Graph graph10 = new Graph();
    node9.setOwner(graph10);
    graph10.setName("");
    java.lang.String str14 = graph10.name;
    node2.setOwner(graph10);
    node2.setOwnerNameDirectly("hi!");
    graph0.addNode(node2);
    Graph graph19 = Graph.generateGraph();
    node2.setOwner(graph19);
    Node node22 = new Node("");
    Graph graph23 = Graph.generateGraph();
    java.lang.String str24 = graph23.name;
    node22.setOwner(graph23);
    Graph graph26 = new Graph();
    node22.setOwner(graph26);
    Node node29 = new Node("hi!");
    Node node31 = new Node("hi!");
    Graph graph32 = new Graph();
    node31.setOwner(graph32);
    graph32.setName("");
    node29.setOwner(graph32);
    java.lang.String str37 = graph32.name;
    node22.setOwner(graph32);
    Node node40 = new Node("");
    Graph graph41 = Graph.generateGraph();
    java.lang.String str42 = graph41.name;
    graph41.init();
    node40.setOwner(graph41);
    java.lang.String str45 = graph41.name;
    node22.setOwner(graph41);
    graph41.name = "";
    node2.setOwner(graph41);
    node2.setOwnerNameDirectly("hi!");
    Node node53 = new Node("");
    Node node55 = new Node("hi!");
    Graph graph56 = new Graph();
    node55.setOwner(graph56);
    node53.setOwner(graph56);
    Node node60 = new Node("hi!");
    Graph graph61 = new Graph();
    node60.setOwner(graph61);
    graph61.setName("");
    java.lang.String str65 = graph61.name;
    node53.setOwner(graph61);
    Node node68 = new Node("");
    Graph graph69 = Graph.generateGraph();
    java.lang.String str70 = graph69.name;
    node68.setOwner(graph69);
    graph69.setName("");
    java.lang.String str74 = graph69.name;
    node53.setOwner(graph69);
    node2.setOwner(graph69);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node2.thisIsNotCalled();

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test232"); }


    Graph graph0 = Graph.generateGraph();
    Node node2 = new Node("");
    Node node4 = new Node("hi!");
    Graph graph5 = new Graph();
    node4.setOwner(graph5);
    node2.setOwner(graph5);
    Node node9 = new Node("hi!");
    Graph graph10 = new Graph();
    node9.setOwner(graph10);
    graph10.setName("");
    java.lang.String str14 = graph10.name;
    node2.setOwner(graph10);
    node2.setOwnerNameDirectly("hi!");
    graph0.addNode(node2);
    Graph graph19 = Graph.generateGraph();
    node2.setOwner(graph19);
    Node node22 = new Node("hi!");
    Node node24 = new Node("hi!");
    Graph graph25 = new Graph();
    node24.setOwner(graph25);
    graph25.setName("");
    node22.setOwner(graph25);
    graph19.addNode(node22);
    Node node32 = new Node("");
    Node node34 = new Node("hi!");
    Graph graph35 = new Graph();
    node34.setOwner(graph35);
    node32.setOwner(graph35);
    Node node39 = new Node("hi!");
    Graph graph40 = new Graph();
    node39.setOwner(graph40);
    graph40.setName("");
    java.lang.String str44 = graph40.name;
    node32.setOwner(graph40);
    node32.setOwnerNameDirectly("[graph]");
    node32.setOwnerName("");
    node32.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i52 = graph19.getDegree(node32);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test233"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test234"); }


    Node node1 = new Node("hi!");
    Graph graph2 = new Graph();
    node1.setOwner(graph2);
    graph2.setName("");
    graph2.init();
    Node node8 = new Node("");
    Node node10 = new Node("hi!");
    Graph graph11 = new Graph();
    node10.setOwner(graph11);
    node8.setOwner(graph11);
    Node node15 = new Node("hi!");
    Graph graph16 = new Graph();
    node15.setOwner(graph16);
    graph16.setName("");
    java.lang.String str20 = graph16.name;
    node8.setOwner(graph16);
    node8.setOwnerName("hi!");
    Graph graph24 = new Graph();
    graph24.init();
    node8.setOwner(graph24);
    node8.setOwnerNameDirectly("");
    graph2.addNode(node8);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node8.thisIsNotCalled();

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test235"); }


    Node node1 = new Node("hi!");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    graph4.setName("");
    node1.setOwner(graph4);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test236"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    Node node4 = new Node("");
    Node node6 = new Node("hi!");
    Graph graph7 = new Graph();
    node6.setOwner(graph7);
    node4.setOwner(graph7);
    Node node11 = new Node("hi!");
    Graph graph12 = new Graph();
    node11.setOwner(graph12);
    graph12.setName("");
    java.lang.String str16 = graph12.name;
    node4.setOwner(graph12);
    node4.setOwnerNameDirectly("hi!");
    graph2.addNode(node4);
    graph2.name = "";
    node1.setOwner(graph2);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i24 = node1.getDegree();

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test237"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    node1.setOwner(graph2);
    Graph graph5 = new Graph();
    node1.setOwner(graph5);
    node1.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i9 = node1.getDegree();

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test238"); }


    Node node1 = new Node("hi!");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    graph4.setName("");
    node1.setOwner(graph4);
    java.lang.String str9 = graph4.name;
    graph4.setName("hi!");
    Node node13 = new Node("");
    Graph graph14 = Graph.generateGraph();
    java.lang.String str15 = graph14.name;
    node13.setOwner(graph14);
    node13.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i19 = graph4.getDegree(node13);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test239"); }


    Node node1 = new Node("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.setOwnerName("hi!");

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test240"); }


    Node node1 = new Node("hi!");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    graph4.setName("");
    node1.setOwner(graph4);
    node1.setOwnerNameDirectly("hi!");
    Node node12 = new Node("hi!");
    Graph graph13 = new Graph();
    node12.setOwner(graph13);
    graph13.setName("");
    graph13.setName("");
    graph13.init();
    node1.setOwner(graph13);
    node1.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i23 = node1.getDegree();

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test241"); }


    Graph graph0 = Graph.generateGraph();
    Node node2 = new Node("");
    Node node4 = new Node("hi!");
    Graph graph5 = new Graph();
    node4.setOwner(graph5);
    node2.setOwner(graph5);
    Node node9 = new Node("hi!");
    Graph graph10 = new Graph();
    node9.setOwner(graph10);
    graph10.setName("");
    java.lang.String str14 = graph10.name;
    node2.setOwner(graph10);
    node2.setOwnerNameDirectly("hi!");
    graph0.addNode(node2);
    Graph graph19 = Graph.generateGraph();
    node2.setOwner(graph19);
    Node node22 = new Node("hi!");
    Node node24 = new Node("hi!");
    Graph graph25 = new Graph();
    node24.setOwner(graph25);
    graph25.setName("");
    node22.setOwner(graph25);
    graph19.addNode(node22);
    node22.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node22.thisIsNotCalled();

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test242"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    Node node4 = new Node("");
    Node node6 = new Node("hi!");
    Graph graph7 = new Graph();
    node6.setOwner(graph7);
    node4.setOwner(graph7);
    Node node11 = new Node("hi!");
    Graph graph12 = new Graph();
    node11.setOwner(graph12);
    graph12.setName("");
    java.lang.String str16 = graph12.name;
    node4.setOwner(graph12);
    node4.setOwnerNameDirectly("hi!");
    graph2.addNode(node4);
    graph2.name = "";
    node1.setOwner(graph2);
    Node node25 = new Node("hi!");
    Graph graph26 = new Graph();
    node25.setOwner(graph26);
    graph2.addNode(node25);
    node25.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node25.thisIsNotCalled();

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test243"); }


    Node node1 = new Node("hi!");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    graph4.setName("");
    node1.setOwner(graph4);
    node1.setOwnerNameDirectly("hi!");
    Node node12 = new Node("hi!");
    Graph graph13 = new Graph();
    node12.setOwner(graph13);
    graph13.setName("");
    graph13.setName("");
    graph13.init();
    node1.setOwner(graph13);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i21 = node1.getDegree();

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test244"); }


    Graph graph0 = new Graph();
    graph0.init();
    graph0.setName("");
    graph0.name = "";
    java.lang.String str6 = graph0.name;
    Node node8 = new Node("");
    Node node10 = new Node("hi!");
    Graph graph11 = new Graph();
    node10.setOwner(graph11);
    node8.setOwner(graph11);
    Node node15 = new Node("hi!");
    Graph graph16 = new Graph();
    node15.setOwner(graph16);
    graph16.setName("");
    java.lang.String str20 = graph16.name;
    node8.setOwner(graph16);
    node8.setOwnerNameDirectly("[graph]");
    Node node25 = new Node("");
    Node node27 = new Node("hi!");
    Graph graph28 = new Graph();
    node27.setOwner(graph28);
    node25.setOwner(graph28);
    Node node32 = new Node("hi!");
    Graph graph33 = new Graph();
    node32.setOwner(graph33);
    graph33.setName("");
    java.lang.String str37 = graph33.name;
    node25.setOwner(graph33);
    node25.setOwnerNameDirectly("hi!");
    Graph graph41 = Graph.generateGraph();
    Node node43 = new Node("");
    Node node45 = new Node("hi!");
    Graph graph46 = new Graph();
    node45.setOwner(graph46);
    node43.setOwner(graph46);
    Node node50 = new Node("hi!");
    Graph graph51 = new Graph();
    node50.setOwner(graph51);
    graph51.setName("");
    java.lang.String str55 = graph51.name;
    node43.setOwner(graph51);
    node43.setOwnerNameDirectly("hi!");
    graph41.addNode(node43);
    node25.setOwner(graph41);
    graph41.name = "";
    node8.setOwner(graph41);
    node8.setOwnerName("");
    node8.setOwnerName("");
    node8.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i70 = graph0.getDegree(node8);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test245"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerNameDirectly("[graph]");
    Node node18 = new Node("");
    Node node20 = new Node("hi!");
    Graph graph21 = new Graph();
    node20.setOwner(graph21);
    node18.setOwner(graph21);
    Node node25 = new Node("hi!");
    Graph graph26 = new Graph();
    node25.setOwner(graph26);
    graph26.setName("");
    java.lang.String str30 = graph26.name;
    node18.setOwner(graph26);
    node18.setOwnerNameDirectly("hi!");
    Graph graph34 = Graph.generateGraph();
    Node node36 = new Node("");
    Node node38 = new Node("hi!");
    Graph graph39 = new Graph();
    node38.setOwner(graph39);
    node36.setOwner(graph39);
    Node node43 = new Node("hi!");
    Graph graph44 = new Graph();
    node43.setOwner(graph44);
    graph44.setName("");
    java.lang.String str48 = graph44.name;
    node36.setOwner(graph44);
    node36.setOwnerNameDirectly("hi!");
    graph34.addNode(node36);
    node18.setOwner(graph34);
    graph34.name = "";
    node1.setOwner(graph34);
    node1.setOwnerName("");
    node1.setOwnerName("");
    node1.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test246"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerName("hi!");
    Graph graph17 = new Graph();
    graph17.init();
    node1.setOwner(graph17);
    Node node21 = new Node("");
    graph17.addNode(node21);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node21.setOwnerName("");

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test247"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    graph9.init();
    Graph graph16 = Graph.generateGraph();
    Node node18 = new Node("");
    Node node20 = new Node("hi!");
    Graph graph21 = new Graph();
    node20.setOwner(graph21);
    node18.setOwner(graph21);
    Node node25 = new Node("hi!");
    Graph graph26 = new Graph();
    node25.setOwner(graph26);
    graph26.setName("");
    java.lang.String str30 = graph26.name;
    node18.setOwner(graph26);
    node18.setOwnerNameDirectly("hi!");
    graph16.addNode(node18);
    node18.setOwnerName("hi!");
    node18.setOwnerName("");
    Graph graph39 = Graph.generateGraph();
    Node node41 = new Node("");
    Node node43 = new Node("hi!");
    Graph graph44 = new Graph();
    node43.setOwner(graph44);
    node41.setOwner(graph44);
    Node node48 = new Node("hi!");
    Graph graph49 = new Graph();
    node48.setOwner(graph49);
    graph49.setName("");
    java.lang.String str53 = graph49.name;
    node41.setOwner(graph49);
    node41.setOwnerNameDirectly("hi!");
    graph39.addNode(node41);
    node41.setOwnerNameDirectly("hi!");
    node41.setOwnerNameDirectly("hi!");
    node41.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph9.addEdge(node18, node41);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test248"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerName("hi!");
    Graph graph17 = new Graph();
    graph17.init();
    node1.setOwner(graph17);
    Node node21 = new Node("");
    graph17.addNode(node21);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i23 = node21.getDegree();

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test249"); }


    Graph graph0 = Graph.generateGraph();
    Node node2 = new Node("");
    Node node4 = new Node("hi!");
    Graph graph5 = new Graph();
    node4.setOwner(graph5);
    node2.setOwner(graph5);
    Node node9 = new Node("hi!");
    Graph graph10 = new Graph();
    node9.setOwner(graph10);
    graph10.setName("");
    java.lang.String str14 = graph10.name;
    node2.setOwner(graph10);
    node2.setOwnerNameDirectly("hi!");
    graph0.addNode(node2);
    Node node20 = new Node("hi!");
    Graph graph21 = new Graph();
    node20.setOwner(graph21);
    graph21.setName("");
    graph21.setName("");
    graph21.setName("hi!");
    graph21.init();
    graph21.setName("[graph]");
    java.lang.String str32 = graph21.name;
    java.lang.String str33 = graph21.name;
    node2.setOwner(graph21);
    Node node36 = new Node("");
    Node node38 = new Node("hi!");
    Graph graph39 = new Graph();
    node38.setOwner(graph39);
    node36.setOwner(graph39);
    Node node43 = new Node("hi!");
    Graph graph44 = new Graph();
    node43.setOwner(graph44);
    graph44.setName("");
    java.lang.String str48 = graph44.name;
    node36.setOwner(graph44);
    node36.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node2.addEdge(node36);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test250"); }


    Node node1 = new Node("hi!");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    graph4.setName("");
    node1.setOwner(graph4);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerNameDirectly("[graph]");
    Node node14 = new Node("");
    Graph graph15 = Graph.generateGraph();
    java.lang.String str16 = graph15.name;
    graph15.init();
    node14.setOwner(graph15);
    java.lang.String str19 = graph15.name;
    graph15.init();
    node1.setOwner(graph15);
    Node node23 = new Node("hi!");
    Node node25 = new Node("hi!");
    Graph graph26 = new Graph();
    node25.setOwner(graph26);
    graph26.setName("");
    node23.setOwner(graph26);
    node23.setOwnerNameDirectly("hi!");
    node23.setOwnerNameDirectly("[graph]");
    Node node36 = new Node("");
    Graph graph37 = Graph.generateGraph();
    java.lang.String str38 = graph37.name;
    graph37.init();
    node36.setOwner(graph37);
    java.lang.String str41 = graph37.name;
    graph37.init();
    node23.setOwner(graph37);
    graph15.addNode(node23);
    node23.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node23.thisIsNotCalled();

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test251"); }


    Graph graph0 = new Graph();
    graph0.init();
    Node node3 = new Node("");
    Graph graph4 = Graph.generateGraph();
    java.lang.String str5 = graph4.name;
    node3.setOwner(graph4);
    Graph graph7 = new Graph();
    node3.setOwner(graph7);
    Node node10 = new Node("hi!");
    Node node12 = new Node("hi!");
    Graph graph13 = new Graph();
    node12.setOwner(graph13);
    graph13.setName("");
    node10.setOwner(graph13);
    java.lang.String str18 = graph13.name;
    node3.setOwner(graph13);
    Node node21 = new Node("");
    Graph graph22 = Graph.generateGraph();
    java.lang.String str23 = graph22.name;
    graph22.init();
    node21.setOwner(graph22);
    java.lang.String str26 = graph22.name;
    node3.setOwner(graph22);
    Graph graph28 = Graph.generateGraph();
    Node node30 = new Node("");
    Node node32 = new Node("hi!");
    Graph graph33 = new Graph();
    node32.setOwner(graph33);
    node30.setOwner(graph33);
    Node node37 = new Node("hi!");
    Graph graph38 = new Graph();
    node37.setOwner(graph38);
    graph38.setName("");
    java.lang.String str42 = graph38.name;
    node30.setOwner(graph38);
    node30.setOwnerNameDirectly("hi!");
    graph28.addNode(node30);
    Graph graph47 = Graph.generateGraph();
    node30.setOwner(graph47);
    Node node50 = new Node("");
    Graph graph51 = Graph.generateGraph();
    java.lang.String str52 = graph51.name;
    node50.setOwner(graph51);
    Graph graph54 = new Graph();
    node50.setOwner(graph54);
    Node node57 = new Node("hi!");
    Node node59 = new Node("hi!");
    Graph graph60 = new Graph();
    node59.setOwner(graph60);
    graph60.setName("");
    node57.setOwner(graph60);
    java.lang.String str65 = graph60.name;
    node50.setOwner(graph60);
    Node node68 = new Node("");
    Graph graph69 = Graph.generateGraph();
    java.lang.String str70 = graph69.name;
    graph69.init();
    node68.setOwner(graph69);
    java.lang.String str73 = graph69.name;
    node50.setOwner(graph69);
    graph69.name = "";
    node30.setOwner(graph69);
    graph22.addNode(node30);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i79 = graph0.getDegree(node30);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test252"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    graph2.init();
    node1.setOwner(graph2);
    graph2.name = "hi!";
    Graph graph8 = new Graph();
    graph8.init();
    graph8.setName("");
    Node node13 = new Node("");
    graph8.addNode(node13);
    graph2.addNode(node13);
    Node node17 = new Node("");
    Graph graph18 = Graph.generateGraph();
    Node node20 = new Node("");
    Node node22 = new Node("hi!");
    Graph graph23 = new Graph();
    node22.setOwner(graph23);
    node20.setOwner(graph23);
    Node node27 = new Node("hi!");
    Graph graph28 = new Graph();
    node27.setOwner(graph28);
    graph28.setName("");
    java.lang.String str32 = graph28.name;
    node20.setOwner(graph28);
    node20.setOwnerNameDirectly("hi!");
    graph18.addNode(node20);
    graph18.name = "";
    node17.setOwner(graph18);
    Node node41 = new Node("hi!");
    Graph graph42 = new Graph();
    node41.setOwner(graph42);
    graph18.addNode(node41);
    node41.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node13.addEdge(node41);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test253"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    graph2.init();
    node1.setOwner(graph2);
    java.lang.String str6 = graph2.name;
    graph2.name = "[graph]";
    java.lang.String str9 = graph2.name;
    graph2.name = "";
    graph2.init();
    graph2.name = "hi!";
    java.lang.String str15 = graph2.name;
    Node node17 = new Node("hi!");
    Graph graph18 = new Graph();
    node17.setOwner(graph18);
    graph18.setName("");
    graph18.setName("");
    graph18.setName("hi!");
    graph18.init();
    Node node28 = new Node("");
    Node node30 = new Node("hi!");
    Graph graph31 = new Graph();
    node30.setOwner(graph31);
    node28.setOwner(graph31);
    Node node35 = new Node("hi!");
    Graph graph36 = new Graph();
    node35.setOwner(graph36);
    graph36.setName("");
    java.lang.String str40 = graph36.name;
    node28.setOwner(graph36);
    Node node43 = new Node("");
    Graph graph44 = Graph.generateGraph();
    java.lang.String str45 = graph44.name;
    node43.setOwner(graph44);
    graph44.setName("");
    java.lang.String str49 = graph44.name;
    node28.setOwner(graph44);
    Node node52 = new Node("hi!");
    Graph graph53 = new Graph();
    node52.setOwner(graph53);
    graph44.addNode(node52);
    graph18.addNode(node52);
    graph2.addNode(node52);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node52.thisIsNotCalled();

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test254"); }


    Node node1 = new Node("hi!");
    Graph graph2 = new Graph();
    node1.setOwner(graph2);
    graph2.init();
    graph2.init();
    graph2.name = "hi!";
    java.lang.String str8 = graph2.name;
    Node node10 = new Node("");
    Graph graph11 = Graph.generateGraph();
    java.lang.String str12 = graph11.name;
    graph11.init();
    node10.setOwner(graph11);
    java.lang.String str15 = graph11.name;
    graph11.init();
    Node node18 = new Node("");
    Node node20 = new Node("hi!");
    Graph graph21 = new Graph();
    node20.setOwner(graph21);
    node18.setOwner(graph21);
    Node node25 = new Node("hi!");
    Graph graph26 = new Graph();
    node25.setOwner(graph26);
    graph26.setName("");
    java.lang.String str30 = graph26.name;
    node18.setOwner(graph26);
    node18.setOwnerNameDirectly("hi!");
    graph11.addNode(node18);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i35 = graph2.getDegree(node18);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test255"); }


    Graph graph0 = new Graph();
    graph0.init();
    graph0.setName("");
    graph0.name = "";
    Node node7 = new Node("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i8 = graph0.getDegree(node7);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test256"); }


    Graph graph0 = new Graph();
    graph0.init();
    java.lang.String str2 = graph0.name;
    Node node4 = new Node("");
    Graph graph5 = Graph.generateGraph();
    java.lang.String str6 = graph5.name;
    node4.setOwner(graph5);
    graph0.addNode(node4);
    Graph graph9 = Graph.generateGraph();
    Node node11 = new Node("");
    Node node13 = new Node("hi!");
    Graph graph14 = new Graph();
    node13.setOwner(graph14);
    node11.setOwner(graph14);
    Node node18 = new Node("hi!");
    Graph graph19 = new Graph();
    node18.setOwner(graph19);
    graph19.setName("");
    java.lang.String str23 = graph19.name;
    node11.setOwner(graph19);
    node11.setOwnerNameDirectly("hi!");
    graph9.addNode(node11);
    node11.setOwnerNameDirectly("hi!");
    Node node31 = new Node("hi!");
    Graph graph32 = new Graph();
    node31.setOwner(graph32);
    graph32.setName("");
    graph32.setName("");
    graph32.init();
    node11.setOwner(graph32);
    Node node41 = new Node("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node11, node41);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test257"); }


    Graph graph0 = new Graph();
    graph0.init();
    graph0.setName("");
    java.lang.String str4 = graph0.name;
    graph0.init();
    Node node7 = new Node("hi!");
    Node node9 = new Node("hi!");
    Graph graph10 = new Graph();
    node9.setOwner(graph10);
    graph10.setName("");
    node7.setOwner(graph10);
    graph0.addNode(node7);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i16 = node7.getDegree();

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test258"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    graph2.init();
    node1.setOwner(graph2);
    java.lang.String str6 = graph2.name;
    graph2.setName("");
    graph2.setName("hi!");
    graph2.init();
    Node node13 = new Node("");
    Node node15 = new Node("hi!");
    Graph graph16 = new Graph();
    node15.setOwner(graph16);
    node13.setOwner(graph16);
    Node node20 = new Node("hi!");
    Graph graph21 = new Graph();
    node20.setOwner(graph21);
    graph21.setName("");
    java.lang.String str25 = graph21.name;
    node13.setOwner(graph21);
    node13.setOwnerName("hi!");
    node13.setOwnerName("[graph]");
    graph2.addNode(node13);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node13.thisIsNotCalled();

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test259"); }


    Graph graph0 = Graph.generateGraph();
    java.lang.String str1 = graph0.name;
    graph0.name = "";
    graph0.name = "[graph]";
    graph0.setName("hi!");
    graph0.name = "";
    java.lang.String str10 = graph0.name;
    Graph graph11 = Graph.generateGraph();
    Node node13 = new Node("");
    Node node15 = new Node("hi!");
    Graph graph16 = new Graph();
    node15.setOwner(graph16);
    node13.setOwner(graph16);
    Node node20 = new Node("hi!");
    Graph graph21 = new Graph();
    node20.setOwner(graph21);
    graph21.setName("");
    java.lang.String str25 = graph21.name;
    node13.setOwner(graph21);
    node13.setOwnerNameDirectly("hi!");
    graph11.addNode(node13);
    graph11.name = "";
    graph11.init();
    graph11.setName("");
    graph11.name = "";
    Node node38 = new Node("");
    Node node40 = new Node("hi!");
    Graph graph41 = new Graph();
    node40.setOwner(graph41);
    node38.setOwner(graph41);
    Node node45 = new Node("hi!");
    Graph graph46 = new Graph();
    node45.setOwner(graph46);
    graph46.setName("");
    java.lang.String str50 = graph46.name;
    node38.setOwner(graph46);
    node38.setOwnerNameDirectly("[graph]");
    Node node55 = new Node("");
    Node node57 = new Node("hi!");
    Graph graph58 = new Graph();
    node57.setOwner(graph58);
    node55.setOwner(graph58);
    Node node62 = new Node("hi!");
    Graph graph63 = new Graph();
    node62.setOwner(graph63);
    graph63.setName("");
    java.lang.String str67 = graph63.name;
    node55.setOwner(graph63);
    node55.setOwnerNameDirectly("hi!");
    Graph graph71 = Graph.generateGraph();
    Node node73 = new Node("");
    Node node75 = new Node("hi!");
    Graph graph76 = new Graph();
    node75.setOwner(graph76);
    node73.setOwner(graph76);
    Node node80 = new Node("hi!");
    Graph graph81 = new Graph();
    node80.setOwner(graph81);
    graph81.setName("");
    java.lang.String str85 = graph81.name;
    node73.setOwner(graph81);
    node73.setOwnerNameDirectly("hi!");
    graph71.addNode(node73);
    node55.setOwner(graph71);
    graph71.name = "";
    node38.setOwner(graph71);
    graph11.addNode(node38);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i95 = graph0.getDegree(node38);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test260"); }


    Graph graph0 = Graph.generateGraph();
    Node node2 = new Node("");
    Node node4 = new Node("hi!");
    Graph graph5 = new Graph();
    node4.setOwner(graph5);
    node2.setOwner(graph5);
    Node node9 = new Node("hi!");
    Graph graph10 = new Graph();
    node9.setOwner(graph10);
    graph10.setName("");
    java.lang.String str14 = graph10.name;
    node2.setOwner(graph10);
    node2.setOwnerNameDirectly("hi!");
    graph0.addNode(node2);
    Graph graph19 = Graph.generateGraph();
    node2.setOwner(graph19);
    Node node22 = new Node("");
    Graph graph23 = Graph.generateGraph();
    java.lang.String str24 = graph23.name;
    node22.setOwner(graph23);
    Graph graph26 = new Graph();
    node22.setOwner(graph26);
    Node node29 = new Node("hi!");
    Node node31 = new Node("hi!");
    Graph graph32 = new Graph();
    node31.setOwner(graph32);
    graph32.setName("");
    node29.setOwner(graph32);
    java.lang.String str37 = graph32.name;
    node22.setOwner(graph32);
    Node node40 = new Node("");
    Graph graph41 = Graph.generateGraph();
    java.lang.String str42 = graph41.name;
    graph41.init();
    node40.setOwner(graph41);
    java.lang.String str45 = graph41.name;
    node22.setOwner(graph41);
    graph41.name = "";
    node2.setOwner(graph41);
    Node node51 = new Node("");
    Node node53 = new Node("hi!");
    Graph graph54 = new Graph();
    node53.setOwner(graph54);
    node51.setOwner(graph54);
    Node node58 = new Node("hi!");
    Graph graph59 = new Graph();
    node58.setOwner(graph59);
    graph59.setName("");
    java.lang.String str63 = graph59.name;
    node51.setOwner(graph59);
    node51.setOwnerNameDirectly("hi!");
    Graph graph67 = Graph.generateGraph();
    Node node69 = new Node("");
    Node node71 = new Node("hi!");
    Graph graph72 = new Graph();
    node71.setOwner(graph72);
    node69.setOwner(graph72);
    Node node76 = new Node("hi!");
    Graph graph77 = new Graph();
    node76.setOwner(graph77);
    graph77.setName("");
    java.lang.String str81 = graph77.name;
    node69.setOwner(graph77);
    node69.setOwnerNameDirectly("hi!");
    graph67.addNode(node69);
    node51.setOwner(graph67);
    java.lang.String str87 = graph67.name;
    node2.setOwner(graph67);
    node2.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i91 = node2.getDegree();

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test261"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    node1.setOwner(graph2);
    Graph graph5 = new Graph();
    node1.setOwner(graph5);
    graph5.setName("hi!");
    graph5.name = "hi!";
    Node node12 = new Node("");
    Node node14 = new Node("hi!");
    Graph graph15 = new Graph();
    node14.setOwner(graph15);
    node12.setOwner(graph15);
    Node node19 = new Node("hi!");
    Graph graph20 = new Graph();
    node19.setOwner(graph20);
    graph20.setName("");
    java.lang.String str24 = graph20.name;
    node12.setOwner(graph20);
    node12.setOwnerName("hi!");
    node12.setOwnerName("hi!");
    node12.setOwnerNameDirectly("");
    Node node33 = new Node("");
    Node node35 = new Node("hi!");
    Graph graph36 = new Graph();
    node35.setOwner(graph36);
    node33.setOwner(graph36);
    Node node40 = new Node("hi!");
    Graph graph41 = new Graph();
    node40.setOwner(graph41);
    graph41.setName("");
    java.lang.String str45 = graph41.name;
    node33.setOwner(graph41);
    java.lang.String str47 = graph41.name;
    graph41.setName("");
    graph41.setName("");
    node12.setOwner(graph41);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i53 = graph5.getDegree(node12);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test262"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    node1.setOwner(graph2);
    Graph graph5 = new Graph();
    node1.setOwner(graph5);
    node1.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test263"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerNameDirectly("[graph]");
    Node node18 = new Node("");
    Node node20 = new Node("hi!");
    Graph graph21 = new Graph();
    node20.setOwner(graph21);
    node18.setOwner(graph21);
    Node node25 = new Node("hi!");
    Graph graph26 = new Graph();
    node25.setOwner(graph26);
    graph26.setName("");
    java.lang.String str30 = graph26.name;
    node18.setOwner(graph26);
    node18.setOwnerNameDirectly("hi!");
    Graph graph34 = Graph.generateGraph();
    Node node36 = new Node("");
    Node node38 = new Node("hi!");
    Graph graph39 = new Graph();
    node38.setOwner(graph39);
    node36.setOwner(graph39);
    Node node43 = new Node("hi!");
    Graph graph44 = new Graph();
    node43.setOwner(graph44);
    graph44.setName("");
    java.lang.String str48 = graph44.name;
    node36.setOwner(graph44);
    node36.setOwnerNameDirectly("hi!");
    graph34.addNode(node36);
    node18.setOwner(graph34);
    graph34.name = "";
    node1.setOwner(graph34);
    node1.setOwnerName("");
    node1.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i61 = node1.getDegree();

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test264"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerName("hi!");
    Graph graph17 = new Graph();
    graph17.init();
    node1.setOwner(graph17);
    Node node21 = new Node("");
    graph17.addNode(node21);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node21.setOwnerName("[graph]");

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test265"); }


    Graph graph0 = new Graph();
    graph0.init();
    java.lang.String str2 = graph0.name;
    graph0.init();
    Node node5 = new Node("");
    Node node7 = new Node("hi!");
    Graph graph8 = new Graph();
    node7.setOwner(graph8);
    node5.setOwner(graph8);
    Node node12 = new Node("hi!");
    Graph graph13 = new Graph();
    node12.setOwner(graph13);
    graph13.setName("");
    java.lang.String str17 = graph13.name;
    node5.setOwner(graph13);
    node5.setOwnerNameDirectly("[graph]");
    Node node22 = new Node("");
    Node node24 = new Node("hi!");
    Graph graph25 = new Graph();
    node24.setOwner(graph25);
    node22.setOwner(graph25);
    Node node29 = new Node("hi!");
    Graph graph30 = new Graph();
    node29.setOwner(graph30);
    graph30.setName("");
    java.lang.String str34 = graph30.name;
    node22.setOwner(graph30);
    node22.setOwnerNameDirectly("hi!");
    Graph graph38 = Graph.generateGraph();
    Node node40 = new Node("");
    Node node42 = new Node("hi!");
    Graph graph43 = new Graph();
    node42.setOwner(graph43);
    node40.setOwner(graph43);
    Node node47 = new Node("hi!");
    Graph graph48 = new Graph();
    node47.setOwner(graph48);
    graph48.setName("");
    java.lang.String str52 = graph48.name;
    node40.setOwner(graph48);
    node40.setOwnerNameDirectly("hi!");
    graph38.addNode(node40);
    node22.setOwner(graph38);
    graph38.name = "";
    node5.setOwner(graph38);
    node5.setOwnerName("");
    node5.setOwnerNameDirectly("hi!");
    node5.setOwnerNameDirectly("hi!");
    Node node68 = new Node("hi!");
    Graph graph69 = new Graph();
    node68.setOwner(graph69);
    graph69.setName("");
    graph69.setName("");
    graph69.init();
    node5.setOwner(graph69);
    node5.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i79 = graph0.getDegree(node5);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test266"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    Node node4 = new Node("");
    Node node6 = new Node("hi!");
    Graph graph7 = new Graph();
    node6.setOwner(graph7);
    node4.setOwner(graph7);
    Node node11 = new Node("hi!");
    Graph graph12 = new Graph();
    node11.setOwner(graph12);
    graph12.setName("");
    java.lang.String str16 = graph12.name;
    node4.setOwner(graph12);
    node4.setOwnerNameDirectly("hi!");
    graph2.addNode(node4);
    graph2.name = "";
    node1.setOwner(graph2);
    Node node25 = new Node("hi!");
    Graph graph26 = new Graph();
    node25.setOwner(graph26);
    graph2.addNode(node25);
    Node node30 = new Node("");
    Graph graph31 = Graph.generateGraph();
    java.lang.String str32 = graph31.name;
    graph31.init();
    node30.setOwner(graph31);
    java.lang.String str35 = graph31.name;
    graph31.init();
    graph31.setName("");
    node25.setOwner(graph31);
    Node node41 = new Node("hi!");
    Node node43 = new Node("hi!");
    Graph graph44 = new Graph();
    node43.setOwner(graph44);
    graph44.setName("");
    node41.setOwner(graph44);
    node41.setOwnerNameDirectly("hi!");
    graph31.addNode(node41);
    node41.setOwnerName("");
    Graph graph54 = Graph.generateGraph();
    java.lang.String str55 = graph54.name;
    graph54.name = "";
    graph54.name = "[graph]";
    graph54.setName("hi!");
    graph54.name = "";
    graph54.init();
    node41.setOwner(graph54);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i66 = node41.getDegree();

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test267"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    graph2.init();
    node1.setOwner(graph2);
    java.lang.String str6 = graph2.name;
    graph2.name = "[graph]";
    java.lang.String str9 = graph2.name;
    graph2.name = "";
    graph2.init();
    graph2.name = "hi!";
    java.lang.String str15 = graph2.name;
    Node node17 = new Node("hi!");
    Graph graph18 = new Graph();
    node17.setOwner(graph18);
    graph18.setName("");
    graph18.setName("");
    graph18.setName("hi!");
    graph18.init();
    Node node28 = new Node("");
    Node node30 = new Node("hi!");
    Graph graph31 = new Graph();
    node30.setOwner(graph31);
    node28.setOwner(graph31);
    Node node35 = new Node("hi!");
    Graph graph36 = new Graph();
    node35.setOwner(graph36);
    graph36.setName("");
    java.lang.String str40 = graph36.name;
    node28.setOwner(graph36);
    Node node43 = new Node("");
    Graph graph44 = Graph.generateGraph();
    java.lang.String str45 = graph44.name;
    node43.setOwner(graph44);
    graph44.setName("");
    java.lang.String str49 = graph44.name;
    node28.setOwner(graph44);
    Node node52 = new Node("hi!");
    Graph graph53 = new Graph();
    node52.setOwner(graph53);
    graph44.addNode(node52);
    graph18.addNode(node52);
    graph2.addNode(node52);
    Node node59 = new Node("");
    Graph graph60 = Graph.generateGraph();
    java.lang.String str61 = graph60.name;
    graph60.init();
    node59.setOwner(graph60);
    graph60.name = "hi!";
    Graph graph66 = new Graph();
    graph66.init();
    graph66.setName("");
    Node node71 = new Node("");
    graph66.addNode(node71);
    graph60.addNode(node71);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i74 = graph2.getDegree(node71);

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test268"); }


    Graph graph0 = Graph.generateGraph();
    Node node2 = new Node("");
    Node node4 = new Node("hi!");
    Graph graph5 = new Graph();
    node4.setOwner(graph5);
    node2.setOwner(graph5);
    Node node9 = new Node("hi!");
    Graph graph10 = new Graph();
    node9.setOwner(graph10);
    graph10.setName("");
    java.lang.String str14 = graph10.name;
    node2.setOwner(graph10);
    node2.setOwnerNameDirectly("hi!");
    graph0.addNode(node2);
    Graph graph19 = Graph.generateGraph();
    node2.setOwner(graph19);
    graph19.name = "[graph]";
    Node node24 = new Node("hi!");
    Node node26 = new Node("hi!");
    Graph graph27 = new Graph();
    node26.setOwner(graph27);
    graph27.setName("");
    node24.setOwner(graph27);
    node24.setOwnerNameDirectly("hi!");
    node24.setOwnerNameDirectly("[graph]");
    Node node37 = new Node("");
    Graph graph38 = Graph.generateGraph();
    java.lang.String str39 = graph38.name;
    graph38.init();
    node37.setOwner(graph38);
    java.lang.String str42 = graph38.name;
    graph38.init();
    node24.setOwner(graph38);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i45 = graph19.getDegree(node24);

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test269"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerNameDirectly("[graph]");
    node1.setOwnerName("");
    Graph graph19 = new Graph();
    graph19.init();
    graph19.setName("");
    java.lang.String str23 = graph19.name;
    node1.setOwner(graph19);
    java.lang.String str25 = graph19.name;
    graph19.init();
    Graph graph27 = Graph.generateGraph();
    Node node29 = new Node("");
    Node node31 = new Node("hi!");
    Graph graph32 = new Graph();
    node31.setOwner(graph32);
    node29.setOwner(graph32);
    Node node36 = new Node("hi!");
    Graph graph37 = new Graph();
    node36.setOwner(graph37);
    graph37.setName("");
    java.lang.String str41 = graph37.name;
    node29.setOwner(graph37);
    node29.setOwnerNameDirectly("hi!");
    graph27.addNode(node29);
    Graph graph46 = Graph.generateGraph();
    node29.setOwner(graph46);
    Node node49 = new Node("");
    Graph graph50 = Graph.generateGraph();
    java.lang.String str51 = graph50.name;
    node49.setOwner(graph50);
    Graph graph53 = new Graph();
    node49.setOwner(graph53);
    Node node56 = new Node("hi!");
    Node node58 = new Node("hi!");
    Graph graph59 = new Graph();
    node58.setOwner(graph59);
    graph59.setName("");
    node56.setOwner(graph59);
    java.lang.String str64 = graph59.name;
    node49.setOwner(graph59);
    Node node67 = new Node("");
    Graph graph68 = Graph.generateGraph();
    java.lang.String str69 = graph68.name;
    graph68.init();
    node67.setOwner(graph68);
    java.lang.String str72 = graph68.name;
    node49.setOwner(graph68);
    graph68.name = "";
    node29.setOwner(graph68);
    node29.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i79 = graph19.getDegree(node29);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test270"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerNameDirectly("hi!");
    Graph graph17 = Graph.generateGraph();
    Node node19 = new Node("");
    Node node21 = new Node("hi!");
    Graph graph22 = new Graph();
    node21.setOwner(graph22);
    node19.setOwner(graph22);
    Node node26 = new Node("hi!");
    Graph graph27 = new Graph();
    node26.setOwner(graph27);
    graph27.setName("");
    java.lang.String str31 = graph27.name;
    node19.setOwner(graph27);
    node19.setOwnerNameDirectly("hi!");
    graph17.addNode(node19);
    node1.setOwner(graph17);
    Node node38 = new Node("hi!");
    Graph graph39 = new Graph();
    node38.setOwner(graph39);
    graph39.setName("");
    graph39.setName("");
    node1.setOwner(graph39);
    Node node47 = new Node("");
    Node node49 = new Node("hi!");
    Graph graph50 = new Graph();
    node49.setOwner(graph50);
    node47.setOwner(graph50);
    Node node54 = new Node("hi!");
    Graph graph55 = new Graph();
    node54.setOwner(graph55);
    graph55.setName("");
    java.lang.String str59 = graph55.name;
    node47.setOwner(graph55);
    node47.setOwnerName("hi!");
    node47.setOwnerName("hi!");
    node47.setOwnerNameDirectly("");
    node47.setOwnerNameDirectly("");
    Graph graph69 = Graph.generateGraph();
    Node node71 = new Node("");
    Node node73 = new Node("hi!");
    Graph graph74 = new Graph();
    node73.setOwner(graph74);
    node71.setOwner(graph74);
    Node node78 = new Node("hi!");
    Graph graph79 = new Graph();
    node78.setOwner(graph79);
    graph79.setName("");
    java.lang.String str83 = graph79.name;
    node71.setOwner(graph79);
    node71.setOwnerNameDirectly("hi!");
    graph69.addNode(node71);
    Graph graph88 = Graph.generateGraph();
    node71.setOwner(graph88);
    node71.setOwnerName("hi!");
    node71.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph39.addEdge(node47, node71);

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test271"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    graph2.init();
    node1.setOwner(graph2);
    java.lang.String str6 = graph2.name;
    graph2.name = "[graph]";
    graph2.name = "";
    Graph graph11 = Graph.generateGraph();
    Node node13 = new Node("");
    Node node15 = new Node("hi!");
    Graph graph16 = new Graph();
    node15.setOwner(graph16);
    node13.setOwner(graph16);
    Node node20 = new Node("hi!");
    Graph graph21 = new Graph();
    node20.setOwner(graph21);
    graph21.setName("");
    java.lang.String str25 = graph21.name;
    node13.setOwner(graph21);
    node13.setOwnerNameDirectly("hi!");
    graph11.addNode(node13);
    node13.setOwnerNameDirectly("hi!");
    node13.setOwnerNameDirectly("hi!");
    graph2.addNode(node13);
    Node node36 = new Node("");
    Node node38 = new Node("hi!");
    Graph graph39 = new Graph();
    node38.setOwner(graph39);
    node36.setOwner(graph39);
    Node node43 = new Node("hi!");
    Graph graph44 = new Graph();
    node43.setOwner(graph44);
    graph44.setName("");
    java.lang.String str48 = graph44.name;
    node36.setOwner(graph44);
    node36.setOwnerNameDirectly("[graph]");
    Graph graph52 = Graph.generateGraph();
    Node node54 = new Node("");
    Node node56 = new Node("hi!");
    Graph graph57 = new Graph();
    node56.setOwner(graph57);
    node54.setOwner(graph57);
    Node node61 = new Node("hi!");
    Graph graph62 = new Graph();
    node61.setOwner(graph62);
    graph62.setName("");
    java.lang.String str66 = graph62.name;
    node54.setOwner(graph62);
    node54.setOwnerNameDirectly("hi!");
    graph52.addNode(node54);
    node36.setOwner(graph52);
    node36.setOwnerName("[graph]");
    Node node75 = new Node("hi!");
    Node node77 = new Node("hi!");
    Graph graph78 = new Graph();
    node77.setOwner(graph78);
    graph78.setName("");
    node75.setOwner(graph78);
    graph78.name = "hi!";
    node36.setOwner(graph78);
    node13.setOwner(graph78);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node13.thisIsNotCalled();

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test272"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    graph2.init();
    node1.setOwner(graph2);
    java.lang.String str6 = graph2.name;
    graph2.name = "[graph]";
    java.lang.String str9 = graph2.name;
    graph2.name = "";
    Node node13 = new Node("");
    Node node15 = new Node("hi!");
    Graph graph16 = new Graph();
    node15.setOwner(graph16);
    node13.setOwner(graph16);
    Node node20 = new Node("hi!");
    Graph graph21 = new Graph();
    node20.setOwner(graph21);
    graph21.setName("");
    java.lang.String str25 = graph21.name;
    node13.setOwner(graph21);
    Node node28 = new Node("");
    Graph graph29 = Graph.generateGraph();
    java.lang.String str30 = graph29.name;
    node28.setOwner(graph29);
    graph29.setName("");
    java.lang.String str34 = graph29.name;
    node13.setOwner(graph29);
    Node node37 = new Node("hi!");
    Graph graph38 = new Graph();
    node37.setOwner(graph38);
    graph29.addNode(node37);
    Node node42 = new Node("");
    Node node44 = new Node("hi!");
    Graph graph45 = new Graph();
    node44.setOwner(graph45);
    node42.setOwner(graph45);
    Node node49 = new Node("hi!");
    Graph graph50 = new Graph();
    node49.setOwner(graph50);
    graph50.setName("");
    java.lang.String str54 = graph50.name;
    node42.setOwner(graph50);
    node42.setOwnerNameDirectly("[graph]");
    Graph graph58 = Graph.generateGraph();
    Node node60 = new Node("");
    Node node62 = new Node("hi!");
    Graph graph63 = new Graph();
    node62.setOwner(graph63);
    node60.setOwner(graph63);
    Node node67 = new Node("hi!");
    Graph graph68 = new Graph();
    node67.setOwner(graph68);
    graph68.setName("");
    java.lang.String str72 = graph68.name;
    node60.setOwner(graph68);
    node60.setOwnerNameDirectly("hi!");
    graph58.addNode(node60);
    node42.setOwner(graph58);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph2.addEdge(node37, node42);

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test273"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    node1.setOwner(graph2);
    Graph graph5 = new Graph();
    node1.setOwner(graph5);
    node1.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test274"); }


    Node node1 = new Node("hi!");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    graph4.setName("");
    node1.setOwner(graph4);
    node1.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i11 = node1.getDegree();

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test275"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerNameDirectly("[graph]");
    Graph graph17 = Graph.generateGraph();
    Node node19 = new Node("");
    Node node21 = new Node("hi!");
    Graph graph22 = new Graph();
    node21.setOwner(graph22);
    node19.setOwner(graph22);
    Node node26 = new Node("hi!");
    Graph graph27 = new Graph();
    node26.setOwner(graph27);
    graph27.setName("");
    java.lang.String str31 = graph27.name;
    node19.setOwner(graph27);
    node19.setOwnerNameDirectly("hi!");
    graph17.addNode(node19);
    node1.setOwner(graph17);
    Node node38 = new Node("hi!");
    Node node40 = new Node("hi!");
    Graph graph41 = new Graph();
    node40.setOwner(graph41);
    graph41.setName("");
    node38.setOwner(graph41);
    node38.setOwnerNameDirectly("hi!");
    node38.setOwnerNameDirectly("[graph]");
    Node node51 = new Node("");
    Node node53 = new Node("hi!");
    Graph graph54 = new Graph();
    node53.setOwner(graph54);
    node51.setOwner(graph54);
    Node node58 = new Node("hi!");
    Graph graph59 = new Graph();
    node58.setOwner(graph59);
    graph59.setName("");
    java.lang.String str63 = graph59.name;
    node51.setOwner(graph59);
    graph59.init();
    graph59.init();
    Node node68 = new Node("");
    Node node70 = new Node("hi!");
    Graph graph71 = new Graph();
    node70.setOwner(graph71);
    node68.setOwner(graph71);
    Node node75 = new Node("hi!");
    Graph graph76 = new Graph();
    node75.setOwner(graph76);
    graph76.setName("");
    java.lang.String str80 = graph76.name;
    node68.setOwner(graph76);
    node68.setOwnerNameDirectly("[graph]");
    node68.setOwnerName("");
    node68.setOwnerName("[graph]");
    graph59.addNode(node68);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph17.addEdge(node38, node68);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test276"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    node1.setOwner(graph2);
    Graph graph5 = new Graph();
    node1.setOwner(graph5);
    node1.setOwnerNameDirectly("");
    node1.setOwnerName("[graph]");
    node1.setOwnerName("hi!");
    Graph graph13 = Graph.generateGraph();
    Node node15 = new Node("");
    Node node17 = new Node("hi!");
    Graph graph18 = new Graph();
    node17.setOwner(graph18);
    node15.setOwner(graph18);
    Node node22 = new Node("hi!");
    Graph graph23 = new Graph();
    node22.setOwner(graph23);
    graph23.setName("");
    java.lang.String str27 = graph23.name;
    node15.setOwner(graph23);
    node15.setOwnerNameDirectly("hi!");
    graph13.addNode(node15);
    Graph graph32 = Graph.generateGraph();
    node15.setOwner(graph32);
    Node node35 = new Node("hi!");
    Node node37 = new Node("hi!");
    Graph graph38 = new Graph();
    node37.setOwner(graph38);
    graph38.setName("");
    node35.setOwner(graph38);
    graph32.addNode(node35);
    node35.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node35);

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test277"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerName("hi!");
    node1.setOwnerName("hi!");
    node1.setOwnerNameDirectly("");
    Node node22 = new Node("");
    Node node24 = new Node("hi!");
    Graph graph25 = new Graph();
    node24.setOwner(graph25);
    node22.setOwner(graph25);
    Node node29 = new Node("hi!");
    Graph graph30 = new Graph();
    node29.setOwner(graph30);
    graph30.setName("");
    java.lang.String str34 = graph30.name;
    node22.setOwner(graph30);
    java.lang.String str36 = graph30.name;
    graph30.setName("");
    graph30.setName("");
    node1.setOwner(graph30);
    node1.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test278"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerNameDirectly("hi!");
    Node node18 = new Node("");
    Node node20 = new Node("hi!");
    Graph graph21 = new Graph();
    node20.setOwner(graph21);
    node18.setOwner(graph21);
    Node node25 = new Node("hi!");
    Graph graph26 = new Graph();
    node25.setOwner(graph26);
    graph26.setName("");
    java.lang.String str30 = graph26.name;
    node18.setOwner(graph26);
    node18.setOwnerNameDirectly("hi!");
    Graph graph34 = Graph.generateGraph();
    Node node36 = new Node("");
    Node node38 = new Node("hi!");
    Graph graph39 = new Graph();
    node38.setOwner(graph39);
    node36.setOwner(graph39);
    Node node43 = new Node("hi!");
    Graph graph44 = new Graph();
    node43.setOwner(graph44);
    graph44.setName("");
    java.lang.String str48 = graph44.name;
    node36.setOwner(graph44);
    node36.setOwnerNameDirectly("hi!");
    graph34.addNode(node36);
    node18.setOwner(graph34);
    graph34.name = "";
    graph34.name = "[graph]";
    node1.setOwner(graph34);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test279"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("[graph]");
    Graph graph19 = Graph.generateGraph();
    Node node21 = new Node("");
    Node node23 = new Node("hi!");
    Graph graph24 = new Graph();
    node23.setOwner(graph24);
    node21.setOwner(graph24);
    Node node28 = new Node("hi!");
    Graph graph29 = new Graph();
    node28.setOwner(graph29);
    graph29.setName("");
    java.lang.String str33 = graph29.name;
    node21.setOwner(graph29);
    node21.setOwnerNameDirectly("hi!");
    graph19.addNode(node21);
    node21.setOwnerName("hi!");
    Node node41 = new Node("hi!");
    Graph graph42 = new Graph();
    node41.setOwner(graph42);
    graph42.setName("");
    graph42.setName("");
    graph42.setName("");
    node21.setOwner(graph42);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node21);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test280"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    graph2.init();
    node1.setOwner(graph2);
    java.lang.String str6 = graph2.name;
    graph2.name = "[graph]";
    graph2.name = "";
    Graph graph11 = Graph.generateGraph();
    Node node13 = new Node("");
    Node node15 = new Node("hi!");
    Graph graph16 = new Graph();
    node15.setOwner(graph16);
    node13.setOwner(graph16);
    Node node20 = new Node("hi!");
    Graph graph21 = new Graph();
    node20.setOwner(graph21);
    graph21.setName("");
    java.lang.String str25 = graph21.name;
    node13.setOwner(graph21);
    node13.setOwnerNameDirectly("hi!");
    graph11.addNode(node13);
    node13.setOwnerNameDirectly("hi!");
    node13.setOwnerNameDirectly("hi!");
    graph2.addNode(node13);
    Node node36 = new Node("");
    Node node38 = new Node("hi!");
    Graph graph39 = new Graph();
    node38.setOwner(graph39);
    node36.setOwner(graph39);
    Node node43 = new Node("hi!");
    Graph graph44 = new Graph();
    node43.setOwner(graph44);
    graph44.setName("");
    java.lang.String str48 = graph44.name;
    node36.setOwner(graph44);
    node36.setOwnerNameDirectly("[graph]");
    Graph graph52 = Graph.generateGraph();
    Node node54 = new Node("");
    Node node56 = new Node("hi!");
    Graph graph57 = new Graph();
    node56.setOwner(graph57);
    node54.setOwner(graph57);
    Node node61 = new Node("hi!");
    Graph graph62 = new Graph();
    node61.setOwner(graph62);
    graph62.setName("");
    java.lang.String str66 = graph62.name;
    node54.setOwner(graph62);
    node54.setOwnerNameDirectly("hi!");
    graph52.addNode(node54);
    node36.setOwner(graph52);
    node36.setOwnerName("[graph]");
    Node node75 = new Node("hi!");
    Node node77 = new Node("hi!");
    Graph graph78 = new Graph();
    node77.setOwner(graph78);
    graph78.setName("");
    node75.setOwner(graph78);
    graph78.name = "hi!";
    node36.setOwner(graph78);
    node13.setOwner(graph78);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i87 = node13.getDegree();

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test281"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("");
    node1.setOwnerNameDirectly("[graph]");
    node1.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i11 = node1.getDegree();

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test282"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    node1.setOwner(graph2);
    Graph graph5 = new Graph();
    node1.setOwner(graph5);
    graph5.setName("[graph]");
    java.lang.String str9 = graph5.name;
    Node node11 = new Node("hi!");
    Node node13 = new Node("hi!");
    Graph graph14 = new Graph();
    node13.setOwner(graph14);
    graph14.setName("");
    node11.setOwner(graph14);
    graph14.init();
    Node node21 = new Node("");
    Graph graph22 = Graph.generateGraph();
    java.lang.String str23 = graph22.name;
    node21.setOwner(graph22);
    Graph graph25 = new Graph();
    node21.setOwner(graph25);
    Node node28 = new Node("hi!");
    Node node30 = new Node("hi!");
    Graph graph31 = new Graph();
    node30.setOwner(graph31);
    graph31.setName("");
    node28.setOwner(graph31);
    java.lang.String str36 = graph31.name;
    node21.setOwner(graph31);
    Node node39 = new Node("");
    Graph graph40 = Graph.generateGraph();
    java.lang.String str41 = graph40.name;
    graph40.init();
    node39.setOwner(graph40);
    java.lang.String str44 = graph40.name;
    node21.setOwner(graph40);
    graph14.addNode(node21);
    Node node48 = new Node("");
    Graph graph49 = Graph.generateGraph();
    java.lang.String str50 = graph49.name;
    node48.setOwner(graph49);
    Graph graph52 = new Graph();
    node48.setOwner(graph52);
    node48.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph5.addEdge(node21, node48);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test283"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    Graph graph15 = Graph.generateGraph();
    java.lang.String str16 = graph15.name;
    graph15.name = "";
    graph15.name = "[graph]";
    graph15.setName("hi!");
    graph15.name = "";
    graph15.init();
    graph15.name = "hi!";
    Node node29 = new Node("");
    Graph graph30 = Graph.generateGraph();
    java.lang.String str31 = graph30.name;
    node29.setOwner(graph30);
    Graph graph33 = new Graph();
    node29.setOwner(graph33);
    node29.setOwnerNameDirectly("");
    graph15.addNode(node29);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node29);

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test284"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerNameDirectly("[graph]");
    Node node18 = new Node("");
    Node node20 = new Node("hi!");
    Graph graph21 = new Graph();
    node20.setOwner(graph21);
    node18.setOwner(graph21);
    Node node25 = new Node("hi!");
    Graph graph26 = new Graph();
    node25.setOwner(graph26);
    graph26.setName("");
    java.lang.String str30 = graph26.name;
    node18.setOwner(graph26);
    node18.setOwnerNameDirectly("hi!");
    Graph graph34 = Graph.generateGraph();
    Node node36 = new Node("");
    Node node38 = new Node("hi!");
    Graph graph39 = new Graph();
    node38.setOwner(graph39);
    node36.setOwner(graph39);
    Node node43 = new Node("hi!");
    Graph graph44 = new Graph();
    node43.setOwner(graph44);
    graph44.setName("");
    java.lang.String str48 = graph44.name;
    node36.setOwner(graph44);
    node36.setOwnerNameDirectly("hi!");
    graph34.addNode(node36);
    node18.setOwner(graph34);
    graph34.name = "";
    node1.setOwner(graph34);
    node1.setOwnerName("");
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    node1.setOwnerName("hi!");
    node1.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i69 = node1.getDegree();

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test285"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerNameDirectly("[graph]");
    Node node18 = new Node("");
    Node node20 = new Node("hi!");
    Graph graph21 = new Graph();
    node20.setOwner(graph21);
    node18.setOwner(graph21);
    Node node25 = new Node("hi!");
    Graph graph26 = new Graph();
    node25.setOwner(graph26);
    graph26.setName("");
    java.lang.String str30 = graph26.name;
    node18.setOwner(graph26);
    node18.setOwnerNameDirectly("hi!");
    Graph graph34 = Graph.generateGraph();
    Node node36 = new Node("");
    Node node38 = new Node("hi!");
    Graph graph39 = new Graph();
    node38.setOwner(graph39);
    node36.setOwner(graph39);
    Node node43 = new Node("hi!");
    Graph graph44 = new Graph();
    node43.setOwner(graph44);
    graph44.setName("");
    java.lang.String str48 = graph44.name;
    node36.setOwner(graph44);
    node36.setOwnerNameDirectly("hi!");
    graph34.addNode(node36);
    node18.setOwner(graph34);
    graph34.name = "";
    node1.setOwner(graph34);
    node1.setOwnerName("");
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("[graph]");
    Node node64 = new Node("hi!");
    Graph graph65 = new Graph();
    node64.setOwner(graph65);
    graph65.setName("");
    graph65.setName("");
    graph65.init();
    Node node73 = new Node("");
    Graph graph74 = Graph.generateGraph();
    java.lang.String str75 = graph74.name;
    graph74.init();
    node73.setOwner(graph74);
    graph74.name = "hi!";
    Graph graph80 = new Graph();
    graph80.init();
    graph80.setName("");
    Node node85 = new Node("");
    graph80.addNode(node85);
    graph74.addNode(node85);
    graph65.addNode(node85);
    node1.setOwner(graph65);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i90 = node1.getDegree();

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test286"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerNameDirectly("[graph]");
    Node node18 = new Node("");
    Node node20 = new Node("hi!");
    Graph graph21 = new Graph();
    node20.setOwner(graph21);
    node18.setOwner(graph21);
    Node node25 = new Node("hi!");
    Graph graph26 = new Graph();
    node25.setOwner(graph26);
    graph26.setName("");
    java.lang.String str30 = graph26.name;
    node18.setOwner(graph26);
    node18.setOwnerNameDirectly("hi!");
    Graph graph34 = Graph.generateGraph();
    Node node36 = new Node("");
    Node node38 = new Node("hi!");
    Graph graph39 = new Graph();
    node38.setOwner(graph39);
    node36.setOwner(graph39);
    Node node43 = new Node("hi!");
    Graph graph44 = new Graph();
    node43.setOwner(graph44);
    graph44.setName("");
    java.lang.String str48 = graph44.name;
    node36.setOwner(graph44);
    node36.setOwnerNameDirectly("hi!");
    graph34.addNode(node36);
    node18.setOwner(graph34);
    graph34.name = "";
    node1.setOwner(graph34);
    node1.setOwnerName("");
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("[graph]");
    Node node64 = new Node("hi!");
    Graph graph65 = new Graph();
    node64.setOwner(graph65);
    graph65.setName("");
    graph65.setName("");
    graph65.init();
    Node node73 = new Node("");
    Graph graph74 = Graph.generateGraph();
    java.lang.String str75 = graph74.name;
    graph74.init();
    node73.setOwner(graph74);
    graph74.name = "hi!";
    Graph graph80 = new Graph();
    graph80.init();
    graph80.setName("");
    Node node85 = new Node("");
    graph80.addNode(node85);
    graph74.addNode(node85);
    graph65.addNode(node85);
    node1.setOwner(graph65);
    node1.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test287"); }


    Graph graph0 = new Graph();
    graph0.init();
    graph0.setName("");
    Node node5 = new Node("");
    graph0.addNode(node5);
    Node node8 = new Node("");
    Node node10 = new Node("hi!");
    Graph graph11 = new Graph();
    node10.setOwner(graph11);
    node8.setOwner(graph11);
    Node node15 = new Node("hi!");
    Graph graph16 = new Graph();
    node15.setOwner(graph16);
    graph16.setName("");
    java.lang.String str20 = graph16.name;
    node8.setOwner(graph16);
    node8.setOwnerNameDirectly("[graph]");
    node8.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i26 = graph0.getDegree(node8);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test288"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    node1.setOwner(graph2);
    Graph graph5 = new Graph();
    node1.setOwner(graph5);
    Node node8 = new Node("hi!");
    Node node10 = new Node("hi!");
    Graph graph11 = new Graph();
    node10.setOwner(graph11);
    graph11.setName("");
    node8.setOwner(graph11);
    node8.setOwnerNameDirectly("hi!");
    Node node19 = new Node("hi!");
    Graph graph20 = new Graph();
    node19.setOwner(graph20);
    graph20.setName("");
    graph20.setName("");
    graph20.init();
    node8.setOwner(graph20);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i28 = graph5.getDegree(node8);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test289"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerNameDirectly("[graph]");
    Node node18 = new Node("");
    Node node20 = new Node("hi!");
    Graph graph21 = new Graph();
    node20.setOwner(graph21);
    node18.setOwner(graph21);
    Node node25 = new Node("hi!");
    Graph graph26 = new Graph();
    node25.setOwner(graph26);
    graph26.setName("");
    java.lang.String str30 = graph26.name;
    node18.setOwner(graph26);
    node18.setOwnerNameDirectly("hi!");
    Graph graph34 = Graph.generateGraph();
    Node node36 = new Node("");
    Node node38 = new Node("hi!");
    Graph graph39 = new Graph();
    node38.setOwner(graph39);
    node36.setOwner(graph39);
    Node node43 = new Node("hi!");
    Graph graph44 = new Graph();
    node43.setOwner(graph44);
    graph44.setName("");
    java.lang.String str48 = graph44.name;
    node36.setOwner(graph44);
    node36.setOwnerNameDirectly("hi!");
    graph34.addNode(node36);
    node18.setOwner(graph34);
    graph34.name = "";
    node1.setOwner(graph34);
    node1.setOwnerName("");
    node1.setOwnerName("hi!");
    node1.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test290"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    node1.setOwner(graph2);
    Graph graph5 = new Graph();
    node1.setOwner(graph5);
    node1.setOwnerNameDirectly("");
    node1.setOwnerName("[graph]");
    node1.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i13 = node1.getDegree();

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test291"); }


    Node node1 = new Node("hi!");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    graph4.setName("");
    node1.setOwner(graph4);
    node1.setOwnerName("hi!");
    Node node12 = new Node("");
    Node node14 = new Node("hi!");
    Graph graph15 = new Graph();
    node14.setOwner(graph15);
    node12.setOwner(graph15);
    Node node19 = new Node("hi!");
    Graph graph20 = new Graph();
    node19.setOwner(graph20);
    graph20.setName("");
    java.lang.String str24 = graph20.name;
    node12.setOwner(graph20);
    graph20.init();
    graph20.init();
    Node node29 = new Node("");
    Node node31 = new Node("hi!");
    Graph graph32 = new Graph();
    node31.setOwner(graph32);
    node29.setOwner(graph32);
    Node node36 = new Node("hi!");
    Graph graph37 = new Graph();
    node36.setOwner(graph37);
    graph37.setName("");
    java.lang.String str41 = graph37.name;
    node29.setOwner(graph37);
    node29.setOwnerNameDirectly("[graph]");
    node29.setOwnerName("");
    node29.setOwnerName("[graph]");
    graph20.addNode(node29);
    node29.setOwnerNameDirectly("hi!");
    node29.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node29);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test292"); }


    Graph graph0 = Graph.generateGraph();
    Node node2 = new Node("");
    Node node4 = new Node("hi!");
    Graph graph5 = new Graph();
    node4.setOwner(graph5);
    node2.setOwner(graph5);
    Node node9 = new Node("hi!");
    Graph graph10 = new Graph();
    node9.setOwner(graph10);
    graph10.setName("");
    java.lang.String str14 = graph10.name;
    node2.setOwner(graph10);
    node2.setOwnerNameDirectly("hi!");
    graph0.addNode(node2);
    graph0.name = "";
    graph0.init();
    Node node23 = new Node("");
    Node node25 = new Node("hi!");
    Graph graph26 = new Graph();
    node25.setOwner(graph26);
    node23.setOwner(graph26);
    Node node30 = new Node("hi!");
    Graph graph31 = new Graph();
    node30.setOwner(graph31);
    graph31.setName("");
    java.lang.String str35 = graph31.name;
    node23.setOwner(graph31);
    node23.setOwnerNameDirectly("[graph]");
    Node node40 = new Node("");
    Node node42 = new Node("hi!");
    Graph graph43 = new Graph();
    node42.setOwner(graph43);
    node40.setOwner(graph43);
    Node node47 = new Node("hi!");
    Graph graph48 = new Graph();
    node47.setOwner(graph48);
    graph48.setName("");
    java.lang.String str52 = graph48.name;
    node40.setOwner(graph48);
    node40.setOwnerNameDirectly("hi!");
    Graph graph56 = Graph.generateGraph();
    Node node58 = new Node("");
    Node node60 = new Node("hi!");
    Graph graph61 = new Graph();
    node60.setOwner(graph61);
    node58.setOwner(graph61);
    Node node65 = new Node("hi!");
    Graph graph66 = new Graph();
    node65.setOwner(graph66);
    graph66.setName("");
    java.lang.String str70 = graph66.name;
    node58.setOwner(graph66);
    node58.setOwnerNameDirectly("hi!");
    graph56.addNode(node58);
    node40.setOwner(graph56);
    graph56.name = "";
    node23.setOwner(graph56);
    node23.setOwnerNameDirectly("");
    node23.setOwnerNameDirectly("hi!");
    graph0.addNode(node23);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i84 = node23.getDegree();

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test293"); }


    Graph graph0 = Graph.generateGraph();
    Node node2 = new Node("");
    Node node4 = new Node("hi!");
    Graph graph5 = new Graph();
    node4.setOwner(graph5);
    node2.setOwner(graph5);
    Node node9 = new Node("hi!");
    Graph graph10 = new Graph();
    node9.setOwner(graph10);
    graph10.setName("");
    java.lang.String str14 = graph10.name;
    node2.setOwner(graph10);
    node2.setOwnerNameDirectly("hi!");
    graph0.addNode(node2);
    Node node20 = new Node("");
    Node node22 = new Node("hi!");
    Graph graph23 = new Graph();
    node22.setOwner(graph23);
    node20.setOwner(graph23);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i26 = graph0.getDegree(node20);

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test294"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    graph2.init();
    node1.setOwner(graph2);
    java.lang.String str6 = graph2.name;
    graph2.name = "[graph]";
    java.lang.String str9 = graph2.name;
    graph2.name = "";
    graph2.init();
    graph2.name = "hi!";
    graph2.setName("[graph]");
    Node node18 = new Node("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i19 = graph2.getDegree(node18);

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test295"); }


    Node node1 = new Node("hi!");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    graph4.setName("");
    node1.setOwner(graph4);
    node1.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test296"); }


    Graph graph0 = Graph.generateGraph();
    Node node2 = new Node("");
    Node node4 = new Node("hi!");
    Graph graph5 = new Graph();
    node4.setOwner(graph5);
    node2.setOwner(graph5);
    Node node9 = new Node("hi!");
    Graph graph10 = new Graph();
    node9.setOwner(graph10);
    graph10.setName("");
    java.lang.String str14 = graph10.name;
    node2.setOwner(graph10);
    node2.setOwnerNameDirectly("hi!");
    graph0.addNode(node2);
    Graph graph19 = Graph.generateGraph();
    node2.setOwner(graph19);
    Node node22 = new Node("");
    Graph graph23 = Graph.generateGraph();
    java.lang.String str24 = graph23.name;
    node22.setOwner(graph23);
    Graph graph26 = new Graph();
    node22.setOwner(graph26);
    Node node29 = new Node("hi!");
    Node node31 = new Node("hi!");
    Graph graph32 = new Graph();
    node31.setOwner(graph32);
    graph32.setName("");
    node29.setOwner(graph32);
    java.lang.String str37 = graph32.name;
    node22.setOwner(graph32);
    Node node40 = new Node("");
    Graph graph41 = Graph.generateGraph();
    java.lang.String str42 = graph41.name;
    graph41.init();
    node40.setOwner(graph41);
    java.lang.String str45 = graph41.name;
    node22.setOwner(graph41);
    graph41.name = "";
    node2.setOwner(graph41);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i50 = node2.getDegree();

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test297"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    node1.setOwner(graph2);
    Graph graph5 = new Graph();
    node1.setOwner(graph5);
    Node node8 = new Node("hi!");
    Node node10 = new Node("hi!");
    Graph graph11 = new Graph();
    node10.setOwner(graph11);
    graph11.setName("");
    node8.setOwner(graph11);
    java.lang.String str16 = graph11.name;
    node1.setOwner(graph11);
    Node node19 = new Node("");
    Graph graph20 = Graph.generateGraph();
    java.lang.String str21 = graph20.name;
    graph20.init();
    node19.setOwner(graph20);
    java.lang.String str24 = graph20.name;
    node1.setOwner(graph20);
    Node node27 = new Node("hi!");
    Node node29 = new Node("hi!");
    Graph graph30 = new Graph();
    node29.setOwner(graph30);
    graph30.setName("");
    node27.setOwner(graph30);
    node27.setOwnerNameDirectly("hi!");
    graph20.addNode(node27);
    Graph graph38 = new Graph();
    node27.setOwner(graph38);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i40 = node27.getDegree();

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test298"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    graph2.init();
    node1.setOwner(graph2);
    java.lang.String str6 = graph2.name;
    graph2.name = "[graph]";
    java.lang.String str9 = graph2.name;
    Node node11 = new Node("");
    Node node13 = new Node("hi!");
    Graph graph14 = new Graph();
    node13.setOwner(graph14);
    node11.setOwner(graph14);
    Node node18 = new Node("hi!");
    Graph graph19 = new Graph();
    node18.setOwner(graph19);
    graph19.setName("");
    java.lang.String str23 = graph19.name;
    node11.setOwner(graph19);
    Node node26 = new Node("");
    Graph graph27 = Graph.generateGraph();
    java.lang.String str28 = graph27.name;
    node26.setOwner(graph27);
    graph27.setName("");
    java.lang.String str32 = graph27.name;
    node11.setOwner(graph27);
    java.lang.String str34 = graph27.name;
    Node node36 = new Node("");
    Graph graph37 = Graph.generateGraph();
    java.lang.String str38 = graph37.name;
    node36.setOwner(graph37);
    Graph graph40 = new Graph();
    node36.setOwner(graph40);
    node36.setOwnerNameDirectly("hi!");
    graph27.addNode(node36);
    Node node46 = new Node("hi!");
    Node node48 = new Node("hi!");
    Graph graph49 = new Graph();
    node48.setOwner(graph49);
    graph49.setName("");
    node46.setOwner(graph49);
    node46.setOwnerNameDirectly("hi!");
    Node node57 = new Node("hi!");
    Graph graph58 = new Graph();
    node57.setOwner(graph58);
    graph58.setName("");
    graph58.setName("");
    graph58.setName("hi!");
    graph58.init();
    graph58.setName("[graph]");
    node46.setOwner(graph58);
    Graph graph70 = Graph.generateGraph();
    Node node72 = new Node("");
    Node node74 = new Node("hi!");
    Graph graph75 = new Graph();
    node74.setOwner(graph75);
    node72.setOwner(graph75);
    Node node79 = new Node("hi!");
    Graph graph80 = new Graph();
    node79.setOwner(graph80);
    graph80.setName("");
    java.lang.String str84 = graph80.name;
    node72.setOwner(graph80);
    node72.setOwnerNameDirectly("hi!");
    graph70.addNode(node72);
    node72.setOwnerName("hi!");
    node72.setOwnerName("");
    graph58.addNode(node72);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph2.addEdge(node36, node72);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test299"); }


    Node node1 = new Node("hi!");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    graph4.setName("");
    node1.setOwner(graph4);
    node1.setOwnerNameDirectly("hi!");
    Node node12 = new Node("hi!");
    Graph graph13 = new Graph();
    node12.setOwner(graph13);
    graph13.setName("");
    graph13.setName("");
    graph13.init();
    node1.setOwner(graph13);
    Node node22 = new Node("");
    Graph graph23 = Graph.generateGraph();
    java.lang.String str24 = graph23.name;
    graph23.init();
    node22.setOwner(graph23);
    java.lang.String str27 = graph23.name;
    graph23.name = "[graph]";
    graph23.name = "";
    graph23.name = "";
    node1.setOwner(graph23);
    Node node36 = new Node("");
    Node node38 = new Node("hi!");
    Graph graph39 = new Graph();
    node38.setOwner(graph39);
    node36.setOwner(graph39);
    Node node43 = new Node("hi!");
    Graph graph44 = new Graph();
    node43.setOwner(graph44);
    graph44.setName("");
    java.lang.String str48 = graph44.name;
    node36.setOwner(graph44);
    node36.setOwnerNameDirectly("hi!");
    node36.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i54 = graph23.getDegree(node36);

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test300"); }


    Node node1 = new Node("hi!");
    Graph graph2 = new Graph();
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("[graph]");
    Graph graph6 = Graph.generateGraph();
    Node node8 = new Node("");
    Node node10 = new Node("hi!");
    Graph graph11 = new Graph();
    node10.setOwner(graph11);
    node8.setOwner(graph11);
    Node node15 = new Node("hi!");
    Graph graph16 = new Graph();
    node15.setOwner(graph16);
    graph16.setName("");
    java.lang.String str20 = graph16.name;
    node8.setOwner(graph16);
    node8.setOwnerNameDirectly("hi!");
    graph6.addNode(node8);
    Graph graph25 = Graph.generateGraph();
    node8.setOwner(graph25);
    Node node28 = new Node("");
    Graph graph29 = Graph.generateGraph();
    java.lang.String str30 = graph29.name;
    node28.setOwner(graph29);
    Graph graph32 = new Graph();
    node28.setOwner(graph32);
    Node node35 = new Node("hi!");
    Node node37 = new Node("hi!");
    Graph graph38 = new Graph();
    node37.setOwner(graph38);
    graph38.setName("");
    node35.setOwner(graph38);
    java.lang.String str43 = graph38.name;
    node28.setOwner(graph38);
    Node node46 = new Node("");
    Graph graph47 = Graph.generateGraph();
    java.lang.String str48 = graph47.name;
    graph47.init();
    node46.setOwner(graph47);
    java.lang.String str51 = graph47.name;
    node28.setOwner(graph47);
    graph47.name = "";
    node8.setOwner(graph47);
    node8.setOwnerNameDirectly("hi!");
    Node node59 = new Node("");
    Node node61 = new Node("hi!");
    Graph graph62 = new Graph();
    node61.setOwner(graph62);
    node59.setOwner(graph62);
    Node node66 = new Node("hi!");
    Graph graph67 = new Graph();
    node66.setOwner(graph67);
    graph67.setName("");
    java.lang.String str71 = graph67.name;
    node59.setOwner(graph67);
    Node node74 = new Node("");
    Graph graph75 = Graph.generateGraph();
    java.lang.String str76 = graph75.name;
    node74.setOwner(graph75);
    graph75.setName("");
    java.lang.String str80 = graph75.name;
    node59.setOwner(graph75);
    node8.setOwner(graph75);
    Node node84 = new Node("");
    Graph graph85 = Graph.generateGraph();
    java.lang.String str86 = graph85.name;
    node84.setOwner(graph85);
    Graph graph88 = new Graph();
    node84.setOwner(graph88);
    node84.setOwnerNameDirectly("");
    node84.setOwnerNameDirectly("");
    graph75.addNode(node84);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node84);

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test301"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerNameDirectly("[graph]");
    Node node18 = new Node("");
    Node node20 = new Node("hi!");
    Graph graph21 = new Graph();
    node20.setOwner(graph21);
    node18.setOwner(graph21);
    Node node25 = new Node("hi!");
    Graph graph26 = new Graph();
    node25.setOwner(graph26);
    graph26.setName("");
    java.lang.String str30 = graph26.name;
    node18.setOwner(graph26);
    node18.setOwnerNameDirectly("hi!");
    Graph graph34 = Graph.generateGraph();
    Node node36 = new Node("");
    Node node38 = new Node("hi!");
    Graph graph39 = new Graph();
    node38.setOwner(graph39);
    node36.setOwner(graph39);
    Node node43 = new Node("hi!");
    Graph graph44 = new Graph();
    node43.setOwner(graph44);
    graph44.setName("");
    java.lang.String str48 = graph44.name;
    node36.setOwner(graph44);
    node36.setOwnerNameDirectly("hi!");
    graph34.addNode(node36);
    node18.setOwner(graph34);
    graph34.name = "";
    node1.setOwner(graph34);
    node1.setOwnerName("");
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test302"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    graph2.init();
    node1.setOwner(graph2);
    java.lang.String str6 = graph2.name;
    graph2.name = "[graph]";
    graph2.name = "hi!";
    java.lang.String str11 = graph2.name;
    Node node13 = new Node("");
    Node node15 = new Node("hi!");
    Graph graph16 = new Graph();
    node15.setOwner(graph16);
    node13.setOwner(graph16);
    Node node20 = new Node("hi!");
    Graph graph21 = new Graph();
    node20.setOwner(graph21);
    graph21.setName("");
    java.lang.String str25 = graph21.name;
    node13.setOwner(graph21);
    node13.setOwnerNameDirectly("[graph]");
    node13.setOwnerName("");
    node13.setOwnerName("[graph]");
    graph2.addNode(node13);
    Graph graph34 = Graph.generateGraph();
    Node node36 = new Node("");
    Node node38 = new Node("hi!");
    Graph graph39 = new Graph();
    node38.setOwner(graph39);
    node36.setOwner(graph39);
    Node node43 = new Node("hi!");
    Graph graph44 = new Graph();
    node43.setOwner(graph44);
    graph44.setName("");
    java.lang.String str48 = graph44.name;
    node36.setOwner(graph44);
    node36.setOwnerNameDirectly("hi!");
    graph34.addNode(node36);
    node36.setOwnerName("hi!");
    Node node56 = new Node("hi!");
    Graph graph57 = new Graph();
    node56.setOwner(graph57);
    graph57.setName("");
    graph57.setName("");
    graph57.setName("");
    node36.setOwner(graph57);
    node36.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node13.addEdge(node36);

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test303"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    Node node4 = new Node("");
    Node node6 = new Node("hi!");
    Graph graph7 = new Graph();
    node6.setOwner(graph7);
    node4.setOwner(graph7);
    Node node11 = new Node("hi!");
    Graph graph12 = new Graph();
    node11.setOwner(graph12);
    graph12.setName("");
    java.lang.String str16 = graph12.name;
    node4.setOwner(graph12);
    node4.setOwnerNameDirectly("hi!");
    graph2.addNode(node4);
    graph2.name = "";
    node1.setOwner(graph2);
    Node node25 = new Node("hi!");
    Graph graph26 = new Graph();
    node25.setOwner(graph26);
    graph2.addNode(node25);
    Node node30 = new Node("");
    Graph graph31 = Graph.generateGraph();
    java.lang.String str32 = graph31.name;
    graph31.init();
    node30.setOwner(graph31);
    java.lang.String str35 = graph31.name;
    graph31.init();
    graph31.setName("");
    node25.setOwner(graph31);
    Node node41 = new Node("hi!");
    Node node43 = new Node("hi!");
    Graph graph44 = new Graph();
    node43.setOwner(graph44);
    graph44.setName("");
    node41.setOwner(graph44);
    node41.setOwnerNameDirectly("hi!");
    graph31.addNode(node41);
    node41.setOwnerName("");
    Node node55 = new Node("");
    Node node57 = new Node("hi!");
    Graph graph58 = new Graph();
    node57.setOwner(graph58);
    node55.setOwner(graph58);
    Node node62 = new Node("hi!");
    Graph graph63 = new Graph();
    node62.setOwner(graph63);
    graph63.setName("");
    java.lang.String str67 = graph63.name;
    node55.setOwner(graph63);
    graph63.init();
    graph63.init();
    Node node72 = new Node("");
    Node node74 = new Node("hi!");
    Graph graph75 = new Graph();
    node74.setOwner(graph75);
    node72.setOwner(graph75);
    Node node79 = new Node("hi!");
    Graph graph80 = new Graph();
    node79.setOwner(graph80);
    graph80.setName("");
    java.lang.String str84 = graph80.name;
    node72.setOwner(graph80);
    node72.setOwnerNameDirectly("[graph]");
    node72.setOwnerName("");
    node72.setOwnerName("[graph]");
    graph63.addNode(node72);
    node72.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node41.addEdge(node72);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test304"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    graph2.init();
    node1.setOwner(graph2);
    java.lang.String str6 = graph2.name;
    graph2.name = "[graph]";
    graph2.name = "";
    graph2.setName("[graph]");
    Graph graph13 = Graph.generateGraph();
    Node node15 = new Node("");
    Node node17 = new Node("hi!");
    Graph graph18 = new Graph();
    node17.setOwner(graph18);
    node15.setOwner(graph18);
    Node node22 = new Node("hi!");
    Graph graph23 = new Graph();
    node22.setOwner(graph23);
    graph23.setName("");
    java.lang.String str27 = graph23.name;
    node15.setOwner(graph23);
    node15.setOwnerNameDirectly("hi!");
    graph13.addNode(node15);
    Graph graph32 = Graph.generateGraph();
    node15.setOwner(graph32);
    Node node35 = new Node("");
    Graph graph36 = Graph.generateGraph();
    java.lang.String str37 = graph36.name;
    node35.setOwner(graph36);
    Graph graph39 = new Graph();
    node35.setOwner(graph39);
    Node node42 = new Node("hi!");
    Node node44 = new Node("hi!");
    Graph graph45 = new Graph();
    node44.setOwner(graph45);
    graph45.setName("");
    node42.setOwner(graph45);
    java.lang.String str50 = graph45.name;
    node35.setOwner(graph45);
    Node node53 = new Node("");
    Graph graph54 = Graph.generateGraph();
    java.lang.String str55 = graph54.name;
    graph54.init();
    node53.setOwner(graph54);
    java.lang.String str58 = graph54.name;
    node35.setOwner(graph54);
    graph54.name = "";
    node15.setOwner(graph54);
    node15.setOwnerNameDirectly("hi!");
    Node node66 = new Node("");
    Graph graph67 = Graph.generateGraph();
    java.lang.String str68 = graph67.name;
    graph67.init();
    node66.setOwner(graph67);
    java.lang.String str71 = graph67.name;
    graph67.setName("");
    graph67.setName("hi!");
    graph67.init();
    Node node78 = new Node("");
    Node node80 = new Node("hi!");
    Graph graph81 = new Graph();
    node80.setOwner(graph81);
    node78.setOwner(graph81);
    Node node85 = new Node("hi!");
    Graph graph86 = new Graph();
    node85.setOwner(graph86);
    graph86.setName("");
    java.lang.String str90 = graph86.name;
    node78.setOwner(graph86);
    node78.setOwnerName("hi!");
    node78.setOwnerName("[graph]");
    graph67.addNode(node78);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph2.addEdge(node15, node78);

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test305"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    java.lang.String str15 = graph9.name;
    graph9.setName("");
    Node node19 = new Node("");
    Graph graph20 = Graph.generateGraph();
    Node node22 = new Node("");
    Node node24 = new Node("hi!");
    Graph graph25 = new Graph();
    node24.setOwner(graph25);
    node22.setOwner(graph25);
    Node node29 = new Node("hi!");
    Graph graph30 = new Graph();
    node29.setOwner(graph30);
    graph30.setName("");
    java.lang.String str34 = graph30.name;
    node22.setOwner(graph30);
    node22.setOwnerNameDirectly("hi!");
    graph20.addNode(node22);
    graph20.name = "";
    node19.setOwner(graph20);
    Node node43 = new Node("hi!");
    Graph graph44 = new Graph();
    node43.setOwner(graph44);
    graph20.addNode(node43);
    node43.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i49 = graph9.getDegree(node43);

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test306"); }


    Graph graph0 = Graph.generateGraph();
    Node node2 = new Node("");
    Node node4 = new Node("hi!");
    Graph graph5 = new Graph();
    node4.setOwner(graph5);
    node2.setOwner(graph5);
    Node node9 = new Node("hi!");
    Graph graph10 = new Graph();
    node9.setOwner(graph10);
    graph10.setName("");
    java.lang.String str14 = graph10.name;
    node2.setOwner(graph10);
    node2.setOwnerNameDirectly("hi!");
    graph0.addNode(node2);
    node2.setOwnerName("hi!");
    Node node22 = new Node("hi!");
    Graph graph23 = new Graph();
    node22.setOwner(graph23);
    graph23.setName("");
    graph23.setName("");
    graph23.setName("");
    node2.setOwner(graph23);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i32 = node2.getDegree();

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test307"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    node1.setOwner(graph2);
    Graph graph5 = new Graph();
    node1.setOwner(graph5);
    node1.setOwnerNameDirectly("");
    node1.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test308"); }


    Graph graph0 = Graph.generateGraph();
    Node node2 = new Node("");
    Node node4 = new Node("hi!");
    Graph graph5 = new Graph();
    node4.setOwner(graph5);
    node2.setOwner(graph5);
    Node node9 = new Node("hi!");
    Graph graph10 = new Graph();
    node9.setOwner(graph10);
    graph10.setName("");
    java.lang.String str14 = graph10.name;
    node2.setOwner(graph10);
    node2.setOwnerNameDirectly("hi!");
    graph0.addNode(node2);
    Graph graph19 = Graph.generateGraph();
    node2.setOwner(graph19);
    Node node22 = new Node("");
    Graph graph23 = Graph.generateGraph();
    java.lang.String str24 = graph23.name;
    node22.setOwner(graph23);
    Graph graph26 = new Graph();
    node22.setOwner(graph26);
    Node node29 = new Node("hi!");
    Node node31 = new Node("hi!");
    Graph graph32 = new Graph();
    node31.setOwner(graph32);
    graph32.setName("");
    node29.setOwner(graph32);
    java.lang.String str37 = graph32.name;
    node22.setOwner(graph32);
    Node node40 = new Node("");
    Graph graph41 = Graph.generateGraph();
    java.lang.String str42 = graph41.name;
    graph41.init();
    node40.setOwner(graph41);
    java.lang.String str45 = graph41.name;
    node22.setOwner(graph41);
    graph41.name = "";
    node2.setOwner(graph41);
    Node node51 = new Node("");
    Node node53 = new Node("hi!");
    Graph graph54 = new Graph();
    node53.setOwner(graph54);
    node51.setOwner(graph54);
    Node node58 = new Node("hi!");
    Graph graph59 = new Graph();
    node58.setOwner(graph59);
    graph59.setName("");
    java.lang.String str63 = graph59.name;
    node51.setOwner(graph59);
    node51.setOwnerNameDirectly("[graph]");
    Graph graph67 = Graph.generateGraph();
    Node node69 = new Node("");
    Node node71 = new Node("hi!");
    Graph graph72 = new Graph();
    node71.setOwner(graph72);
    node69.setOwner(graph72);
    Node node76 = new Node("hi!");
    Graph graph77 = new Graph();
    node76.setOwner(graph77);
    graph77.setName("");
    java.lang.String str81 = graph77.name;
    node69.setOwner(graph77);
    node69.setOwnerNameDirectly("hi!");
    graph67.addNode(node69);
    node51.setOwner(graph67);
    node51.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i89 = graph41.getDegree(node51);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test309"); }


    Node node1 = new Node("hi!");
    Graph graph2 = new Graph();
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test310"); }


    Node node1 = new Node("hi!");
    Graph graph2 = new Graph();
    node1.setOwner(graph2);
    graph2.setName("");
    graph2.setName("");
    graph2.setName("hi!");
    graph2.name = "[graph]";
    Node node13 = new Node("");
    Graph graph14 = Graph.generateGraph();
    java.lang.String str15 = graph14.name;
    node13.setOwner(graph14);
    Graph graph17 = new Graph();
    node13.setOwner(graph17);
    Node node20 = new Node("hi!");
    Node node22 = new Node("hi!");
    Graph graph23 = new Graph();
    node22.setOwner(graph23);
    graph23.setName("");
    node20.setOwner(graph23);
    java.lang.String str28 = graph23.name;
    node13.setOwner(graph23);
    Node node31 = new Node("");
    Graph graph32 = Graph.generateGraph();
    java.lang.String str33 = graph32.name;
    graph32.init();
    node31.setOwner(graph32);
    java.lang.String str36 = graph32.name;
    node13.setOwner(graph32);
    Node node39 = new Node("hi!");
    Node node41 = new Node("hi!");
    Graph graph42 = new Graph();
    node41.setOwner(graph42);
    graph42.setName("");
    node39.setOwner(graph42);
    node39.setOwnerNameDirectly("hi!");
    graph32.addNode(node39);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i50 = graph2.getDegree(node39);

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test311"); }


    Node node1 = new Node("hi!");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    graph4.setName("");
    node1.setOwner(graph4);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerNameDirectly("[graph]");
    Node node14 = new Node("");
    Graph graph15 = Graph.generateGraph();
    java.lang.String str16 = graph15.name;
    graph15.init();
    node14.setOwner(graph15);
    java.lang.String str19 = graph15.name;
    graph15.init();
    node1.setOwner(graph15);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test312"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerNameDirectly("[graph]");
    Node node18 = new Node("");
    Node node20 = new Node("hi!");
    Graph graph21 = new Graph();
    node20.setOwner(graph21);
    node18.setOwner(graph21);
    Node node25 = new Node("hi!");
    Graph graph26 = new Graph();
    node25.setOwner(graph26);
    graph26.setName("");
    java.lang.String str30 = graph26.name;
    node18.setOwner(graph26);
    node18.setOwnerNameDirectly("hi!");
    Graph graph34 = Graph.generateGraph();
    Node node36 = new Node("");
    Node node38 = new Node("hi!");
    Graph graph39 = new Graph();
    node38.setOwner(graph39);
    node36.setOwner(graph39);
    Node node43 = new Node("hi!");
    Graph graph44 = new Graph();
    node43.setOwner(graph44);
    graph44.setName("");
    java.lang.String str48 = graph44.name;
    node36.setOwner(graph44);
    node36.setOwnerNameDirectly("hi!");
    graph34.addNode(node36);
    node18.setOwner(graph34);
    graph34.name = "";
    node1.setOwner(graph34);
    node1.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i59 = node1.getDegree();

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test313"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerName("hi!");
    Graph graph17 = new Graph();
    graph17.init();
    node1.setOwner(graph17);
    node1.setOwnerNameDirectly("");
    Node node23 = new Node("");
    Graph graph24 = Graph.generateGraph();
    Node node26 = new Node("");
    Node node28 = new Node("hi!");
    Graph graph29 = new Graph();
    node28.setOwner(graph29);
    node26.setOwner(graph29);
    Node node33 = new Node("hi!");
    Graph graph34 = new Graph();
    node33.setOwner(graph34);
    graph34.setName("");
    java.lang.String str38 = graph34.name;
    node26.setOwner(graph34);
    node26.setOwnerNameDirectly("hi!");
    graph24.addNode(node26);
    graph24.name = "";
    node23.setOwner(graph24);
    node1.setOwner(graph24);
    Node node48 = new Node("");
    Graph graph49 = Graph.generateGraph();
    java.lang.String str50 = graph49.name;
    graph49.init();
    node48.setOwner(graph49);
    java.lang.String str53 = graph49.name;
    graph49.name = "[graph]";
    java.lang.String str56 = graph49.name;
    node1.setOwner(graph49);
    Node node59 = new Node("");
    Node node61 = new Node("hi!");
    Graph graph62 = new Graph();
    node61.setOwner(graph62);
    node59.setOwner(graph62);
    Node node66 = new Node("hi!");
    Graph graph67 = new Graph();
    node66.setOwner(graph67);
    graph67.setName("");
    java.lang.String str71 = graph67.name;
    node59.setOwner(graph67);
    graph67.init();
    graph67.init();
    Node node76 = new Node("");
    Node node78 = new Node("hi!");
    Graph graph79 = new Graph();
    node78.setOwner(graph79);
    node76.setOwner(graph79);
    Node node83 = new Node("hi!");
    Graph graph84 = new Graph();
    node83.setOwner(graph84);
    graph84.setName("");
    java.lang.String str88 = graph84.name;
    node76.setOwner(graph84);
    node76.setOwnerNameDirectly("[graph]");
    node76.setOwnerName("");
    node76.setOwnerName("[graph]");
    graph67.addNode(node76);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i97 = graph49.getDegree(node76);

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test314"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    Node node16 = new Node("");
    Graph graph17 = Graph.generateGraph();
    java.lang.String str18 = graph17.name;
    node16.setOwner(graph17);
    graph17.setName("");
    java.lang.String str22 = graph17.name;
    node1.setOwner(graph17);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test315"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    graph2.init();
    node1.setOwner(graph2);
    java.lang.String str6 = graph2.name;
    graph2.setName("");
    graph2.name = "[graph]";
    Node node12 = new Node("hi!");
    Graph graph13 = new Graph();
    node12.setOwner(graph13);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i15 = graph2.getDegree(node12);

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test316"); }


    Graph graph0 = Graph.generateGraph();
    Node node2 = new Node("");
    Node node4 = new Node("hi!");
    Graph graph5 = new Graph();
    node4.setOwner(graph5);
    node2.setOwner(graph5);
    Node node9 = new Node("hi!");
    Graph graph10 = new Graph();
    node9.setOwner(graph10);
    graph10.setName("");
    java.lang.String str14 = graph10.name;
    node2.setOwner(graph10);
    node2.setOwnerNameDirectly("hi!");
    graph0.addNode(node2);
    node2.setOwnerName("hi!");
    node2.setOwnerName("");
    Graph graph23 = new Graph();
    graph23.init();
    java.lang.String str25 = graph23.name;
    graph23.init();
    graph23.name = "hi!";
    node2.setOwner(graph23);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i30 = node2.getDegree();

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test317"); }


    Node node1 = new Node("hi!");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    graph4.setName("");
    node1.setOwner(graph4);
    node1.setOwnerNameDirectly("hi!");
    Node node12 = new Node("hi!");
    Graph graph13 = new Graph();
    node12.setOwner(graph13);
    graph13.setName("");
    graph13.setName("");
    graph13.init();
    node1.setOwner(graph13);
    Node node22 = new Node("");
    Graph graph23 = Graph.generateGraph();
    java.lang.String str24 = graph23.name;
    graph23.init();
    node22.setOwner(graph23);
    java.lang.String str27 = graph23.name;
    graph23.name = "[graph]";
    node1.setOwner(graph23);
    Node node32 = new Node("hi!");
    Node node34 = new Node("hi!");
    Graph graph35 = new Graph();
    node34.setOwner(graph35);
    graph35.setName("");
    node32.setOwner(graph35);
    node32.setOwnerNameDirectly("hi!");
    Node node43 = new Node("hi!");
    Graph graph44 = new Graph();
    node43.setOwner(graph44);
    graph44.setName("");
    graph44.setName("");
    graph44.setName("hi!");
    graph44.init();
    graph44.setName("[graph]");
    node32.setOwner(graph44);
    node32.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i58 = graph23.getDegree(node32);

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test318"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerNameDirectly("[graph]");
    Node node18 = new Node("");
    Node node20 = new Node("hi!");
    Graph graph21 = new Graph();
    node20.setOwner(graph21);
    node18.setOwner(graph21);
    Node node25 = new Node("hi!");
    Graph graph26 = new Graph();
    node25.setOwner(graph26);
    graph26.setName("");
    java.lang.String str30 = graph26.name;
    node18.setOwner(graph26);
    node18.setOwnerNameDirectly("hi!");
    Graph graph34 = Graph.generateGraph();
    Node node36 = new Node("");
    Node node38 = new Node("hi!");
    Graph graph39 = new Graph();
    node38.setOwner(graph39);
    node36.setOwner(graph39);
    Node node43 = new Node("hi!");
    Graph graph44 = new Graph();
    node43.setOwner(graph44);
    graph44.setName("");
    java.lang.String str48 = graph44.name;
    node36.setOwner(graph44);
    node36.setOwnerNameDirectly("hi!");
    graph34.addNode(node36);
    node18.setOwner(graph34);
    graph34.name = "";
    node1.setOwner(graph34);
    node1.setOwnerName("");
    node1.setOwnerName("");
    node1.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i63 = node1.getDegree();

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test319"); }


    Node node1 = new Node("hi!");
    Graph graph2 = new Graph();
    node1.setOwner(graph2);
    graph2.setName("");
    graph2.setName("");
    graph2.setName("hi!");
    graph2.setName("hi!");
    Node node13 = new Node("");
    Graph graph14 = Graph.generateGraph();
    java.lang.String str15 = graph14.name;
    node13.setOwner(graph14);
    Graph graph17 = new Graph();
    node13.setOwner(graph17);
    node13.setOwnerNameDirectly("");
    node13.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i23 = graph2.getDegree(node13);

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test320"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    Node node4 = new Node("");
    Node node6 = new Node("hi!");
    Graph graph7 = new Graph();
    node6.setOwner(graph7);
    node4.setOwner(graph7);
    Node node11 = new Node("hi!");
    Graph graph12 = new Graph();
    node11.setOwner(graph12);
    graph12.setName("");
    java.lang.String str16 = graph12.name;
    node4.setOwner(graph12);
    node4.setOwnerNameDirectly("hi!");
    graph2.addNode(node4);
    graph2.name = "";
    node1.setOwner(graph2);
    Node node25 = new Node("hi!");
    Graph graph26 = new Graph();
    node25.setOwner(graph26);
    graph2.addNode(node25);
    Node node30 = new Node("");
    Node node32 = new Node("hi!");
    Graph graph33 = new Graph();
    node32.setOwner(graph33);
    node30.setOwner(graph33);
    Node node37 = new Node("hi!");
    Graph graph38 = new Graph();
    node37.setOwner(graph38);
    graph38.setName("");
    java.lang.String str42 = graph38.name;
    node30.setOwner(graph38);
    graph38.init();
    graph38.init();
    Node node47 = new Node("");
    Node node49 = new Node("hi!");
    Graph graph50 = new Graph();
    node49.setOwner(graph50);
    node47.setOwner(graph50);
    Node node54 = new Node("hi!");
    Graph graph55 = new Graph();
    node54.setOwner(graph55);
    graph55.setName("");
    java.lang.String str59 = graph55.name;
    node47.setOwner(graph55);
    node47.setOwnerNameDirectly("[graph]");
    node47.setOwnerName("");
    node47.setOwnerName("[graph]");
    graph38.addNode(node47);
    node47.setOwnerNameDirectly("hi!");
    node47.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node25.addEdge(node47);

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test321"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    Node node4 = new Node("");
    Node node6 = new Node("hi!");
    Graph graph7 = new Graph();
    node6.setOwner(graph7);
    node4.setOwner(graph7);
    Node node11 = new Node("hi!");
    Graph graph12 = new Graph();
    node11.setOwner(graph12);
    graph12.setName("");
    java.lang.String str16 = graph12.name;
    node4.setOwner(graph12);
    node4.setOwnerNameDirectly("hi!");
    graph2.addNode(node4);
    graph2.name = "";
    node1.setOwner(graph2);
    Node node25 = new Node("hi!");
    Graph graph26 = new Graph();
    node25.setOwner(graph26);
    graph2.addNode(node25);
    Node node30 = new Node("");
    Graph graph31 = Graph.generateGraph();
    java.lang.String str32 = graph31.name;
    graph31.init();
    node30.setOwner(graph31);
    java.lang.String str35 = graph31.name;
    graph31.init();
    graph31.setName("");
    node25.setOwner(graph31);
    Node node41 = new Node("hi!");
    Node node43 = new Node("hi!");
    Graph graph44 = new Graph();
    node43.setOwner(graph44);
    graph44.setName("");
    node41.setOwner(graph44);
    node41.setOwnerNameDirectly("hi!");
    graph31.addNode(node41);
    Node node53 = new Node("");
    Node node55 = new Node("hi!");
    Graph graph56 = new Graph();
    node55.setOwner(graph56);
    node53.setOwner(graph56);
    Node node60 = new Node("hi!");
    Graph graph61 = new Graph();
    node60.setOwner(graph61);
    graph61.setName("");
    java.lang.String str65 = graph61.name;
    node53.setOwner(graph61);
    node53.setOwnerName("hi!");
    node53.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i71 = graph31.getDegree(node53);

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test322"); }


    Node node1 = new Node("[graph]");
    Node node3 = new Node("hi!");
    Node node5 = new Node("hi!");
    Graph graph6 = new Graph();
    node5.setOwner(graph6);
    graph6.setName("");
    node3.setOwner(graph6);
    node3.setOwnerNameDirectly("hi!");
    Node node14 = new Node("hi!");
    Graph graph15 = new Graph();
    node14.setOwner(graph15);
    graph15.setName("");
    graph15.setName("");
    graph15.setName("hi!");
    graph15.init();
    graph15.setName("[graph]");
    node3.setOwner(graph15);
    node3.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node3);

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test323"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerNameDirectly("hi!");
    Node node18 = new Node("");
    Node node20 = new Node("hi!");
    Graph graph21 = new Graph();
    node20.setOwner(graph21);
    node18.setOwner(graph21);
    Node node25 = new Node("hi!");
    Graph graph26 = new Graph();
    node25.setOwner(graph26);
    graph26.setName("");
    java.lang.String str30 = graph26.name;
    node18.setOwner(graph26);
    node18.setOwnerNameDirectly("hi!");
    Graph graph34 = Graph.generateGraph();
    Node node36 = new Node("");
    Node node38 = new Node("hi!");
    Graph graph39 = new Graph();
    node38.setOwner(graph39);
    node36.setOwner(graph39);
    Node node43 = new Node("hi!");
    Graph graph44 = new Graph();
    node43.setOwner(graph44);
    graph44.setName("");
    java.lang.String str48 = graph44.name;
    node36.setOwner(graph44);
    node36.setOwnerNameDirectly("hi!");
    graph34.addNode(node36);
    node18.setOwner(graph34);
    graph34.name = "";
    graph34.name = "[graph]";
    node1.setOwner(graph34);
    graph34.name = "[graph]";
    Node node62 = new Node("");
    Node node64 = new Node("hi!");
    Graph graph65 = new Graph();
    node64.setOwner(graph65);
    node62.setOwner(graph65);
    Node node69 = new Node("hi!");
    Graph graph70 = new Graph();
    node69.setOwner(graph70);
    graph70.setName("");
    java.lang.String str74 = graph70.name;
    node62.setOwner(graph70);
    node62.setOwnerName("hi!");
    node62.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i80 = graph34.getDegree(node62);

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test324"); }


    Node node1 = new Node("hi!");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    graph4.setName("");
    node1.setOwner(graph4);
    node1.setOwnerNameDirectly("hi!");
    Node node12 = new Node("hi!");
    Graph graph13 = new Graph();
    node12.setOwner(graph13);
    graph13.setName("");
    graph13.setName("");
    graph13.init();
    node1.setOwner(graph13);
    node1.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test325"); }


    Node node1 = new Node("hi!");
    Graph graph2 = new Graph();
    node1.setOwner(graph2);
    graph2.setName("");
    graph2.setName("");
    graph2.init();
    Node node10 = new Node("");
    Graph graph11 = Graph.generateGraph();
    java.lang.String str12 = graph11.name;
    graph11.init();
    node10.setOwner(graph11);
    graph11.name = "hi!";
    Graph graph17 = new Graph();
    graph17.init();
    graph17.setName("");
    Node node22 = new Node("");
    graph17.addNode(node22);
    graph11.addNode(node22);
    graph2.addNode(node22);
    graph2.init();
    Node node28 = new Node("");
    Node node30 = new Node("hi!");
    Graph graph31 = new Graph();
    node30.setOwner(graph31);
    node28.setOwner(graph31);
    Node node35 = new Node("hi!");
    Graph graph36 = new Graph();
    node35.setOwner(graph36);
    graph36.setName("");
    java.lang.String str40 = graph36.name;
    node28.setOwner(graph36);
    node28.setOwnerNameDirectly("[graph]");
    Node node45 = new Node("");
    Node node47 = new Node("hi!");
    Graph graph48 = new Graph();
    node47.setOwner(graph48);
    node45.setOwner(graph48);
    Node node52 = new Node("hi!");
    Graph graph53 = new Graph();
    node52.setOwner(graph53);
    graph53.setName("");
    java.lang.String str57 = graph53.name;
    node45.setOwner(graph53);
    node45.setOwnerNameDirectly("hi!");
    Graph graph61 = Graph.generateGraph();
    Node node63 = new Node("");
    Node node65 = new Node("hi!");
    Graph graph66 = new Graph();
    node65.setOwner(graph66);
    node63.setOwner(graph66);
    Node node70 = new Node("hi!");
    Graph graph71 = new Graph();
    node70.setOwner(graph71);
    graph71.setName("");
    java.lang.String str75 = graph71.name;
    node63.setOwner(graph71);
    node63.setOwnerNameDirectly("hi!");
    graph61.addNode(node63);
    node45.setOwner(graph61);
    graph61.name = "";
    node28.setOwner(graph61);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i84 = graph2.getDegree(node28);

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test326"); }


    Node node1 = new Node("hi!");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    graph4.setName("");
    node1.setOwner(graph4);
    graph4.name = "hi!";
    graph4.setName("hi!");
    Node node14 = new Node("");
    Graph graph15 = Graph.generateGraph();
    java.lang.String str16 = graph15.name;
    node14.setOwner(graph15);
    Graph graph18 = new Graph();
    node14.setOwner(graph18);
    node14.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i22 = graph4.getDegree(node14);

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test327"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    graph2.init();
    node1.setOwner(graph2);
    java.lang.String str6 = graph2.name;
    graph2.name = "[graph]";
    java.lang.String str9 = graph2.name;
    graph2.name = "";
    Node node13 = new Node("hi!");
    Node node15 = new Node("hi!");
    Graph graph16 = new Graph();
    node15.setOwner(graph16);
    graph16.setName("");
    node13.setOwner(graph16);
    node13.setOwnerNameDirectly("hi!");
    graph2.addNode(node13);
    Node node25 = new Node("");
    Graph graph26 = Graph.generateGraph();
    java.lang.String str27 = graph26.name;
    graph26.init();
    node25.setOwner(graph26);
    java.lang.String str30 = graph26.name;
    graph26.name = "[graph]";
    graph26.name = "";
    Graph graph35 = Graph.generateGraph();
    Node node37 = new Node("");
    Node node39 = new Node("hi!");
    Graph graph40 = new Graph();
    node39.setOwner(graph40);
    node37.setOwner(graph40);
    Node node44 = new Node("hi!");
    Graph graph45 = new Graph();
    node44.setOwner(graph45);
    graph45.setName("");
    java.lang.String str49 = graph45.name;
    node37.setOwner(graph45);
    node37.setOwnerNameDirectly("hi!");
    graph35.addNode(node37);
    node37.setOwnerNameDirectly("hi!");
    node37.setOwnerNameDirectly("hi!");
    graph26.addNode(node37);
    node37.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i61 = graph2.getDegree(node37);

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test328"); }


    Graph graph0 = Graph.generateGraph();
    java.lang.String str1 = graph0.name;
    graph0.name = "";
    java.lang.String str4 = graph0.name;
    graph0.init();
    Node node7 = new Node("");
    Node node9 = new Node("hi!");
    Graph graph10 = new Graph();
    node9.setOwner(graph10);
    node7.setOwner(graph10);
    Node node14 = new Node("hi!");
    Graph graph15 = new Graph();
    node14.setOwner(graph15);
    graph15.setName("");
    java.lang.String str19 = graph15.name;
    node7.setOwner(graph15);
    node7.setOwnerNameDirectly("[graph]");
    Node node24 = new Node("");
    Node node26 = new Node("hi!");
    Graph graph27 = new Graph();
    node26.setOwner(graph27);
    node24.setOwner(graph27);
    Node node31 = new Node("hi!");
    Graph graph32 = new Graph();
    node31.setOwner(graph32);
    graph32.setName("");
    java.lang.String str36 = graph32.name;
    node24.setOwner(graph32);
    node24.setOwnerNameDirectly("hi!");
    Graph graph40 = Graph.generateGraph();
    Node node42 = new Node("");
    Node node44 = new Node("hi!");
    Graph graph45 = new Graph();
    node44.setOwner(graph45);
    node42.setOwner(graph45);
    Node node49 = new Node("hi!");
    Graph graph50 = new Graph();
    node49.setOwner(graph50);
    graph50.setName("");
    java.lang.String str54 = graph50.name;
    node42.setOwner(graph50);
    node42.setOwnerNameDirectly("hi!");
    graph40.addNode(node42);
    node24.setOwner(graph40);
    graph40.name = "";
    node7.setOwner(graph40);
    node7.setOwnerName("");
    node7.setOwnerName("hi!");
    node7.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i69 = graph0.getDegree(node7);

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test329"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    node1.setOwner(graph2);
    graph2.setName("");
    java.lang.String str7 = graph2.name;
    Graph graph8 = Graph.generateGraph();
    Node node10 = new Node("");
    Node node12 = new Node("hi!");
    Graph graph13 = new Graph();
    node12.setOwner(graph13);
    node10.setOwner(graph13);
    Node node17 = new Node("hi!");
    Graph graph18 = new Graph();
    node17.setOwner(graph18);
    graph18.setName("");
    java.lang.String str22 = graph18.name;
    node10.setOwner(graph18);
    node10.setOwnerNameDirectly("hi!");
    graph8.addNode(node10);
    node10.setOwnerName("hi!");
    Node node30 = new Node("hi!");
    Graph graph31 = new Graph();
    node30.setOwner(graph31);
    graph31.setName("");
    graph31.setName("");
    graph31.setName("");
    node10.setOwner(graph31);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i40 = graph2.getDegree(node10);

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test330"); }


    Node node1 = new Node("hi!");
    Graph graph2 = new Graph();
    node1.setOwner(graph2);
    graph2.setName("");
    graph2.setName("");
    graph2.setName("hi!");
    graph2.name = "[graph]";
    java.lang.String str12 = graph2.name;
    graph2.init();
    Node node15 = new Node("");
    Graph graph16 = Graph.generateGraph();
    java.lang.String str17 = graph16.name;
    node15.setOwner(graph16);
    node15.setOwnerNameDirectly("");
    node15.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i23 = graph2.getDegree(node15);

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test331"); }


    Graph graph0 = new Graph();
    graph0.init();
    java.lang.String str2 = graph0.name;
    graph0.init();
    graph0.name = "hi!";
    graph0.setName("hi!");
    java.lang.String str8 = graph0.name;
    graph0.name = "hi!";
    Graph graph11 = Graph.generateGraph();
    Node node13 = new Node("");
    Node node15 = new Node("hi!");
    Graph graph16 = new Graph();
    node15.setOwner(graph16);
    node13.setOwner(graph16);
    Node node20 = new Node("hi!");
    Graph graph21 = new Graph();
    node20.setOwner(graph21);
    graph21.setName("");
    java.lang.String str25 = graph21.name;
    node13.setOwner(graph21);
    node13.setOwnerNameDirectly("hi!");
    graph11.addNode(node13);
    graph0.addNode(node13);
    graph0.init();
    Node node33 = new Node("");
    Node node35 = new Node("hi!");
    Graph graph36 = new Graph();
    node35.setOwner(graph36);
    node33.setOwner(graph36);
    Node node40 = new Node("hi!");
    Graph graph41 = new Graph();
    node40.setOwner(graph41);
    graph41.setName("");
    java.lang.String str45 = graph41.name;
    node33.setOwner(graph41);
    node33.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i49 = graph0.getDegree(node33);

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test332"); }


    Graph graph0 = Graph.generateGraph();
    Node node2 = new Node("");
    Node node4 = new Node("hi!");
    Graph graph5 = new Graph();
    node4.setOwner(graph5);
    node2.setOwner(graph5);
    Node node9 = new Node("hi!");
    Graph graph10 = new Graph();
    node9.setOwner(graph10);
    graph10.setName("");
    java.lang.String str14 = graph10.name;
    node2.setOwner(graph10);
    node2.setOwnerNameDirectly("hi!");
    graph0.addNode(node2);
    node2.setOwnerName("hi!");
    Node node22 = new Node("hi!");
    Graph graph23 = new Graph();
    node22.setOwner(graph23);
    graph23.setName("");
    graph23.setName("");
    graph23.setName("");
    node2.setOwner(graph23);
    Graph graph32 = Graph.generateGraph();
    Node node34 = new Node("");
    Node node36 = new Node("hi!");
    Graph graph37 = new Graph();
    node36.setOwner(graph37);
    node34.setOwner(graph37);
    Node node41 = new Node("hi!");
    Graph graph42 = new Graph();
    node41.setOwner(graph42);
    graph42.setName("");
    java.lang.String str46 = graph42.name;
    node34.setOwner(graph42);
    node34.setOwnerNameDirectly("hi!");
    graph32.addNode(node34);
    node34.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i53 = graph23.getDegree(node34);

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test333"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerNameDirectly("[graph]");
    node1.setOwnerName("");
    Graph graph19 = new Graph();
    graph19.init();
    graph19.setName("");
    java.lang.String str23 = graph19.name;
    node1.setOwner(graph19);
    graph19.setName("hi!");
    java.lang.String str27 = graph19.name;
    Node node29 = new Node("hi!");
    Graph graph30 = new Graph();
    node29.setOwner(graph30);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i32 = graph19.getDegree(node29);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test334"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerNameDirectly("[graph]");
    Graph graph17 = Graph.generateGraph();
    Node node19 = new Node("");
    Node node21 = new Node("hi!");
    Graph graph22 = new Graph();
    node21.setOwner(graph22);
    node19.setOwner(graph22);
    Node node26 = new Node("hi!");
    Graph graph27 = new Graph();
    node26.setOwner(graph27);
    graph27.setName("");
    java.lang.String str31 = graph27.name;
    node19.setOwner(graph27);
    node19.setOwnerNameDirectly("hi!");
    graph17.addNode(node19);
    node1.setOwner(graph17);
    node1.setOwnerName("[graph]");
    Node node40 = new Node("hi!");
    Node node42 = new Node("hi!");
    Graph graph43 = new Graph();
    node42.setOwner(graph43);
    graph43.setName("");
    node40.setOwner(graph43);
    graph43.name = "hi!";
    node1.setOwner(graph43);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test335"); }


    Graph graph0 = Graph.generateGraph();
    java.lang.String str1 = graph0.name;
    graph0.name = "";
    graph0.name = "[graph]";
    graph0.setName("hi!");
    graph0.name = "";
    graph0.init();
    graph0.name = "hi!";
    Node node14 = new Node("");
    Graph graph15 = Graph.generateGraph();
    java.lang.String str16 = graph15.name;
    node14.setOwner(graph15);
    Graph graph18 = new Graph();
    node14.setOwner(graph18);
    node14.setOwnerNameDirectly("");
    graph0.addNode(node14);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node14.thisIsNotCalled();

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test336"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("");
    Node node10 = new Node("hi!");
    Graph graph11 = new Graph();
    node10.setOwner(graph11);
    node8.setOwner(graph11);
    Node node15 = new Node("hi!");
    Graph graph16 = new Graph();
    node15.setOwner(graph16);
    graph16.setName("");
    java.lang.String str20 = graph16.name;
    node8.setOwner(graph16);
    node8.setOwnerNameDirectly("[graph]");
    node8.setOwnerName("");
    Graph graph26 = new Graph();
    graph26.init();
    graph26.setName("");
    java.lang.String str30 = graph26.name;
    node8.setOwner(graph26);
    java.lang.String str32 = graph26.name;
    graph26.init();
    Graph graph34 = Graph.generateGraph();
    Node node36 = new Node("");
    Node node38 = new Node("hi!");
    Graph graph39 = new Graph();
    node38.setOwner(graph39);
    node36.setOwner(graph39);
    Node node43 = new Node("hi!");
    Graph graph44 = new Graph();
    node43.setOwner(graph44);
    graph44.setName("");
    java.lang.String str48 = graph44.name;
    node36.setOwner(graph44);
    node36.setOwnerNameDirectly("hi!");
    graph34.addNode(node36);
    node36.setOwnerName("hi!");
    node36.setOwnerName("");
    graph26.addNode(node36);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph4.addNode(node36);

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test337"); }


    Graph graph0 = Graph.generateGraph();
    Node node2 = new Node("");
    Node node4 = new Node("hi!");
    Graph graph5 = new Graph();
    node4.setOwner(graph5);
    node2.setOwner(graph5);
    Node node9 = new Node("hi!");
    Graph graph10 = new Graph();
    node9.setOwner(graph10);
    graph10.setName("");
    java.lang.String str14 = graph10.name;
    node2.setOwner(graph10);
    node2.setOwnerNameDirectly("hi!");
    graph0.addNode(node2);
    Graph graph19 = Graph.generateGraph();
    node2.setOwner(graph19);
    Node node22 = new Node("");
    Graph graph23 = Graph.generateGraph();
    java.lang.String str24 = graph23.name;
    node22.setOwner(graph23);
    Graph graph26 = new Graph();
    node22.setOwner(graph26);
    Node node29 = new Node("hi!");
    Node node31 = new Node("hi!");
    Graph graph32 = new Graph();
    node31.setOwner(graph32);
    graph32.setName("");
    node29.setOwner(graph32);
    java.lang.String str37 = graph32.name;
    node22.setOwner(graph32);
    Node node40 = new Node("");
    Graph graph41 = Graph.generateGraph();
    java.lang.String str42 = graph41.name;
    graph41.init();
    node40.setOwner(graph41);
    java.lang.String str45 = graph41.name;
    node22.setOwner(graph41);
    graph41.name = "";
    node2.setOwner(graph41);
    node2.setOwnerNameDirectly("hi!");
    Node node53 = new Node("");
    Node node55 = new Node("hi!");
    Graph graph56 = new Graph();
    node55.setOwner(graph56);
    node53.setOwner(graph56);
    Node node60 = new Node("hi!");
    Graph graph61 = new Graph();
    node60.setOwner(graph61);
    graph61.setName("");
    java.lang.String str65 = graph61.name;
    node53.setOwner(graph61);
    Node node68 = new Node("");
    Graph graph69 = Graph.generateGraph();
    java.lang.String str70 = graph69.name;
    node68.setOwner(graph69);
    graph69.setName("");
    java.lang.String str74 = graph69.name;
    node53.setOwner(graph69);
    node2.setOwner(graph69);
    Node node78 = new Node("");
    Graph graph79 = Graph.generateGraph();
    java.lang.String str80 = graph79.name;
    node78.setOwner(graph79);
    Graph graph82 = new Graph();
    node78.setOwner(graph82);
    node78.setOwnerNameDirectly("");
    node78.setOwnerNameDirectly("");
    graph69.addNode(node78);
    node78.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node78.thisIsNotCalled();

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test338"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerName("hi!");
    Graph graph17 = Graph.generateGraph();
    Node node19 = new Node("");
    Node node21 = new Node("hi!");
    Graph graph22 = new Graph();
    node21.setOwner(graph22);
    node19.setOwner(graph22);
    Node node26 = new Node("hi!");
    Graph graph27 = new Graph();
    node26.setOwner(graph27);
    graph27.setName("");
    java.lang.String str31 = graph27.name;
    node19.setOwner(graph27);
    node19.setOwnerNameDirectly("hi!");
    graph17.addNode(node19);
    Graph graph36 = Graph.generateGraph();
    node19.setOwner(graph36);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node19);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test339"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    node1.setOwner(graph2);
    Graph graph5 = new Graph();
    node1.setOwner(graph5);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i11 = node1.getDegree();

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test340"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    java.lang.String str15 = graph9.name;
    graph9.setName("");
    graph9.setName("");
    java.lang.String str20 = graph9.name;
    graph9.setName("");
    Node node24 = new Node("");
    Graph graph25 = Graph.generateGraph();
    java.lang.String str26 = graph25.name;
    graph25.init();
    node24.setOwner(graph25);
    java.lang.String str29 = graph25.name;
    graph25.setName("");
    graph25.setName("hi!");
    graph25.init();
    Node node36 = new Node("");
    Node node38 = new Node("hi!");
    Graph graph39 = new Graph();
    node38.setOwner(graph39);
    node36.setOwner(graph39);
    Node node43 = new Node("hi!");
    Graph graph44 = new Graph();
    node43.setOwner(graph44);
    graph44.setName("");
    java.lang.String str48 = graph44.name;
    node36.setOwner(graph44);
    node36.setOwnerName("hi!");
    node36.setOwnerName("[graph]");
    graph25.addNode(node36);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph9.addNode(node36);

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test341"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerNameDirectly("[graph]");
    Graph graph17 = Graph.generateGraph();
    Node node19 = new Node("");
    Node node21 = new Node("hi!");
    Graph graph22 = new Graph();
    node21.setOwner(graph22);
    node19.setOwner(graph22);
    Node node26 = new Node("hi!");
    Graph graph27 = new Graph();
    node26.setOwner(graph27);
    graph27.setName("");
    java.lang.String str31 = graph27.name;
    node19.setOwner(graph27);
    node19.setOwnerNameDirectly("hi!");
    graph17.addNode(node19);
    node1.setOwner(graph17);
    node1.setOwnerName("[graph]");
    Node node40 = new Node("hi!");
    Node node42 = new Node("hi!");
    Graph graph43 = new Graph();
    node42.setOwner(graph43);
    graph43.setName("");
    node40.setOwner(graph43);
    graph43.name = "hi!";
    node1.setOwner(graph43);
    Node node52 = new Node("hi!");
    Graph graph53 = new Graph();
    node52.setOwner(graph53);
    node52.setOwnerName("[graph]");
    Node node58 = new Node("");
    Node node60 = new Node("hi!");
    Graph graph61 = new Graph();
    node60.setOwner(graph61);
    node58.setOwner(graph61);
    Node node65 = new Node("hi!");
    Graph graph66 = new Graph();
    node65.setOwner(graph66);
    graph66.setName("");
    java.lang.String str70 = graph66.name;
    node58.setOwner(graph66);
    node52.setOwner(graph66);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node52);

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test342"); }


    Node node1 = new Node("hi!");
    Graph graph2 = new Graph();
    node1.setOwner(graph2);
    node1.setOwnerName("[graph]");
    Node node7 = new Node("");
    Node node9 = new Node("hi!");
    Graph graph10 = new Graph();
    node9.setOwner(graph10);
    node7.setOwner(graph10);
    Node node14 = new Node("hi!");
    Graph graph15 = new Graph();
    node14.setOwner(graph15);
    graph15.setName("");
    java.lang.String str19 = graph15.name;
    node7.setOwner(graph15);
    node1.setOwner(graph15);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test343"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerNameDirectly("[graph]");
    Node node18 = new Node("");
    Node node20 = new Node("hi!");
    Graph graph21 = new Graph();
    node20.setOwner(graph21);
    node18.setOwner(graph21);
    Node node25 = new Node("hi!");
    Graph graph26 = new Graph();
    node25.setOwner(graph26);
    graph26.setName("");
    java.lang.String str30 = graph26.name;
    node18.setOwner(graph26);
    node18.setOwnerNameDirectly("hi!");
    Graph graph34 = Graph.generateGraph();
    Node node36 = new Node("");
    Node node38 = new Node("hi!");
    Graph graph39 = new Graph();
    node38.setOwner(graph39);
    node36.setOwner(graph39);
    Node node43 = new Node("hi!");
    Graph graph44 = new Graph();
    node43.setOwner(graph44);
    graph44.setName("");
    java.lang.String str48 = graph44.name;
    node36.setOwner(graph44);
    node36.setOwnerNameDirectly("hi!");
    graph34.addNode(node36);
    node18.setOwner(graph34);
    graph34.name = "";
    node1.setOwner(graph34);
    node1.setOwnerName("");
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("[graph]");
    node1.setOwnerNameDirectly("");
    node1.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i67 = node1.getDegree();

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test344"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    Node node4 = new Node("");
    Node node6 = new Node("hi!");
    Graph graph7 = new Graph();
    node6.setOwner(graph7);
    node4.setOwner(graph7);
    Node node11 = new Node("hi!");
    Graph graph12 = new Graph();
    node11.setOwner(graph12);
    graph12.setName("");
    java.lang.String str16 = graph12.name;
    node4.setOwner(graph12);
    node4.setOwnerNameDirectly("hi!");
    graph2.addNode(node4);
    graph2.name = "";
    node1.setOwner(graph2);
    Node node25 = new Node("hi!");
    Graph graph26 = new Graph();
    node25.setOwner(graph26);
    graph2.addNode(node25);
    node25.setOwnerNameDirectly("");
    Node node32 = new Node("");
    Node node34 = new Node("hi!");
    Graph graph35 = new Graph();
    node34.setOwner(graph35);
    node32.setOwner(graph35);
    Node node39 = new Node("hi!");
    Graph graph40 = new Graph();
    node39.setOwner(graph40);
    graph40.setName("");
    java.lang.String str44 = graph40.name;
    node32.setOwner(graph40);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node25.addEdge(node32);

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test345"); }


    Node node1 = new Node("hi!");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    graph4.setName("");
    node1.setOwner(graph4);
    graph4.init();
    graph4.setName("");
    Node node13 = new Node("");
    Node node15 = new Node("hi!");
    Graph graph16 = new Graph();
    node15.setOwner(graph16);
    node13.setOwner(graph16);
    Node node20 = new Node("hi!");
    Graph graph21 = new Graph();
    node20.setOwner(graph21);
    graph21.setName("");
    java.lang.String str25 = graph21.name;
    node13.setOwner(graph21);
    node13.setOwnerNameDirectly("hi!");
    Node node30 = new Node("");
    Graph graph31 = Graph.generateGraph();
    java.lang.String str32 = graph31.name;
    graph31.init();
    node30.setOwner(graph31);
    java.lang.String str35 = graph31.name;
    graph31.setName("");
    graph31.setName("hi!");
    graph31.init();
    Node node42 = new Node("");
    Node node44 = new Node("hi!");
    Graph graph45 = new Graph();
    node44.setOwner(graph45);
    node42.setOwner(graph45);
    Node node49 = new Node("hi!");
    Graph graph50 = new Graph();
    node49.setOwner(graph50);
    graph50.setName("");
    java.lang.String str54 = graph50.name;
    node42.setOwner(graph50);
    node42.setOwnerName("hi!");
    node42.setOwnerName("[graph]");
    graph31.addNode(node42);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph4.addEdge(node13, node42);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test346"); }


    Node node1 = new Node("hi!");
    Graph graph2 = new Graph();
    node1.setOwner(graph2);
    node1.setOwnerName("[graph]");
    Node node7 = new Node("");
    Node node9 = new Node("hi!");
    Graph graph10 = new Graph();
    node9.setOwner(graph10);
    node7.setOwner(graph10);
    Node node14 = new Node("hi!");
    Graph graph15 = new Graph();
    node14.setOwner(graph15);
    graph15.setName("");
    java.lang.String str19 = graph15.name;
    node7.setOwner(graph15);
    node1.setOwner(graph15);
    Node node23 = new Node("");
    Node node25 = new Node("hi!");
    Graph graph26 = new Graph();
    node25.setOwner(graph26);
    node23.setOwner(graph26);
    Node node30 = new Node("hi!");
    Graph graph31 = new Graph();
    node30.setOwner(graph31);
    graph31.setName("");
    java.lang.String str35 = graph31.name;
    node23.setOwner(graph31);
    node23.setOwnerNameDirectly("[graph]");
    Node node40 = new Node("");
    Node node42 = new Node("hi!");
    Graph graph43 = new Graph();
    node42.setOwner(graph43);
    node40.setOwner(graph43);
    Node node47 = new Node("hi!");
    Graph graph48 = new Graph();
    node47.setOwner(graph48);
    graph48.setName("");
    java.lang.String str52 = graph48.name;
    node40.setOwner(graph48);
    node40.setOwnerNameDirectly("hi!");
    Graph graph56 = Graph.generateGraph();
    Node node58 = new Node("");
    Node node60 = new Node("hi!");
    Graph graph61 = new Graph();
    node60.setOwner(graph61);
    node58.setOwner(graph61);
    Node node65 = new Node("hi!");
    Graph graph66 = new Graph();
    node65.setOwner(graph66);
    graph66.setName("");
    java.lang.String str70 = graph66.name;
    node58.setOwner(graph66);
    node58.setOwnerNameDirectly("hi!");
    graph56.addNode(node58);
    node40.setOwner(graph56);
    graph56.name = "";
    node23.setOwner(graph56);
    node23.setOwnerName("");
    node23.setOwnerNameDirectly("hi!");
    node23.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node23);

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test347"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    graph2.init();
    node1.setOwner(graph2);
    java.lang.String str6 = graph2.name;
    graph2.setName("");
    graph2.setName("hi!");
    graph2.init();
    Node node13 = new Node("");
    Node node15 = new Node("hi!");
    Graph graph16 = new Graph();
    node15.setOwner(graph16);
    node13.setOwner(graph16);
    Node node20 = new Node("hi!");
    Graph graph21 = new Graph();
    node20.setOwner(graph21);
    graph21.setName("");
    java.lang.String str25 = graph21.name;
    node13.setOwner(graph21);
    node13.setOwnerNameDirectly("hi!");
    Graph graph29 = Graph.generateGraph();
    Node node31 = new Node("");
    Node node33 = new Node("hi!");
    Graph graph34 = new Graph();
    node33.setOwner(graph34);
    node31.setOwner(graph34);
    Node node38 = new Node("hi!");
    Graph graph39 = new Graph();
    node38.setOwner(graph39);
    graph39.setName("");
    java.lang.String str43 = graph39.name;
    node31.setOwner(graph39);
    node31.setOwnerNameDirectly("hi!");
    graph29.addNode(node31);
    node13.setOwner(graph29);
    node13.setOwnerNameDirectly("[graph]");
    Node node52 = new Node("");
    Node node54 = new Node("hi!");
    Graph graph55 = new Graph();
    node54.setOwner(graph55);
    node52.setOwner(graph55);
    Node node59 = new Node("hi!");
    Graph graph60 = new Graph();
    node59.setOwner(graph60);
    graph60.setName("");
    java.lang.String str64 = graph60.name;
    node52.setOwner(graph60);
    Node node67 = new Node("");
    Graph graph68 = Graph.generateGraph();
    java.lang.String str69 = graph68.name;
    node67.setOwner(graph68);
    graph68.setName("");
    java.lang.String str73 = graph68.name;
    node52.setOwner(graph68);
    Node node76 = new Node("hi!");
    Graph graph77 = new Graph();
    node76.setOwner(graph77);
    graph68.addNode(node76);
    Node node81 = new Node("");
    Graph graph82 = Graph.generateGraph();
    java.lang.String str83 = graph82.name;
    graph82.init();
    node81.setOwner(graph82);
    java.lang.String str86 = graph82.name;
    graph82.init();
    node76.setOwner(graph82);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph2.addEdge(node13, node76);

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test348"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerNameDirectly("[graph]");
    Node node18 = new Node("");
    Node node20 = new Node("hi!");
    Graph graph21 = new Graph();
    node20.setOwner(graph21);
    node18.setOwner(graph21);
    Node node25 = new Node("hi!");
    Graph graph26 = new Graph();
    node25.setOwner(graph26);
    graph26.setName("");
    java.lang.String str30 = graph26.name;
    node18.setOwner(graph26);
    node18.setOwnerNameDirectly("hi!");
    Graph graph34 = Graph.generateGraph();
    Node node36 = new Node("");
    Node node38 = new Node("hi!");
    Graph graph39 = new Graph();
    node38.setOwner(graph39);
    node36.setOwner(graph39);
    Node node43 = new Node("hi!");
    Graph graph44 = new Graph();
    node43.setOwner(graph44);
    graph44.setName("");
    java.lang.String str48 = graph44.name;
    node36.setOwner(graph44);
    node36.setOwnerNameDirectly("hi!");
    graph34.addNode(node36);
    node18.setOwner(graph34);
    graph34.name = "";
    node1.setOwner(graph34);
    node1.setOwnerName("");
    node1.setOwnerName("");
    node1.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test349"); }


    Graph graph0 = Graph.generateGraph();
    Node node2 = new Node("");
    Node node4 = new Node("hi!");
    Graph graph5 = new Graph();
    node4.setOwner(graph5);
    node2.setOwner(graph5);
    Node node9 = new Node("hi!");
    Graph graph10 = new Graph();
    node9.setOwner(graph10);
    graph10.setName("");
    java.lang.String str14 = graph10.name;
    node2.setOwner(graph10);
    node2.setOwnerNameDirectly("hi!");
    graph0.addNode(node2);
    Graph graph19 = Graph.generateGraph();
    node2.setOwner(graph19);
    Node node22 = new Node("");
    Graph graph23 = Graph.generateGraph();
    java.lang.String str24 = graph23.name;
    node22.setOwner(graph23);
    Graph graph26 = new Graph();
    node22.setOwner(graph26);
    Node node29 = new Node("hi!");
    Node node31 = new Node("hi!");
    Graph graph32 = new Graph();
    node31.setOwner(graph32);
    graph32.setName("");
    node29.setOwner(graph32);
    java.lang.String str37 = graph32.name;
    node22.setOwner(graph32);
    Node node40 = new Node("");
    Graph graph41 = Graph.generateGraph();
    java.lang.String str42 = graph41.name;
    graph41.init();
    node40.setOwner(graph41);
    java.lang.String str45 = graph41.name;
    node22.setOwner(graph41);
    graph41.name = "";
    node2.setOwner(graph41);
    node2.setOwnerNameDirectly("hi!");
    Node node53 = new Node("");
    Node node55 = new Node("hi!");
    Graph graph56 = new Graph();
    node55.setOwner(graph56);
    node53.setOwner(graph56);
    Node node60 = new Node("hi!");
    Graph graph61 = new Graph();
    node60.setOwner(graph61);
    graph61.setName("");
    java.lang.String str65 = graph61.name;
    node53.setOwner(graph61);
    Node node68 = new Node("");
    Graph graph69 = Graph.generateGraph();
    java.lang.String str70 = graph69.name;
    node68.setOwner(graph69);
    graph69.setName("");
    java.lang.String str74 = graph69.name;
    node53.setOwner(graph69);
    node2.setOwner(graph69);
    Node node78 = new Node("");
    Graph graph79 = Graph.generateGraph();
    java.lang.String str80 = graph79.name;
    node78.setOwner(graph79);
    Graph graph82 = new Graph();
    node78.setOwner(graph82);
    node78.setOwnerNameDirectly("");
    node78.setOwnerNameDirectly("");
    graph69.addNode(node78);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i89 = node78.getDegree();

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test350"); }


    Node node1 = new Node("hi!");
    Graph graph2 = new Graph();
    node1.setOwner(graph2);
    node1.setOwnerName("[graph]");
    Node node7 = new Node("");
    Node node9 = new Node("hi!");
    Graph graph10 = new Graph();
    node9.setOwner(graph10);
    node7.setOwner(graph10);
    Node node14 = new Node("hi!");
    Graph graph15 = new Graph();
    node14.setOwner(graph15);
    graph15.setName("");
    java.lang.String str19 = graph15.name;
    node7.setOwner(graph15);
    node1.setOwner(graph15);
    Node node23 = new Node("");
    Graph graph24 = Graph.generateGraph();
    java.lang.String str25 = graph24.name;
    graph24.init();
    node23.setOwner(graph24);
    java.lang.String str28 = graph24.name;
    graph24.name = "[graph]";
    java.lang.String str31 = graph24.name;
    graph24.name = "";
    graph24.init();
    graph24.name = "hi!";
    java.lang.String str37 = graph24.name;
    Node node39 = new Node("hi!");
    Graph graph40 = new Graph();
    node39.setOwner(graph40);
    graph40.setName("");
    graph40.setName("");
    graph40.setName("hi!");
    graph40.init();
    Node node50 = new Node("");
    Node node52 = new Node("hi!");
    Graph graph53 = new Graph();
    node52.setOwner(graph53);
    node50.setOwner(graph53);
    Node node57 = new Node("hi!");
    Graph graph58 = new Graph();
    node57.setOwner(graph58);
    graph58.setName("");
    java.lang.String str62 = graph58.name;
    node50.setOwner(graph58);
    Node node65 = new Node("");
    Graph graph66 = Graph.generateGraph();
    java.lang.String str67 = graph66.name;
    node65.setOwner(graph66);
    graph66.setName("");
    java.lang.String str71 = graph66.name;
    node50.setOwner(graph66);
    Node node74 = new Node("hi!");
    Graph graph75 = new Graph();
    node74.setOwner(graph75);
    graph66.addNode(node74);
    graph40.addNode(node74);
    graph24.addNode(node74);
    node74.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph15.addNode(node74);

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test351"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    graph4.name = "";
    graph4.name = "hi!";
    Node node12 = new Node("");
    Graph graph13 = Graph.generateGraph();
    java.lang.String str14 = graph13.name;
    node12.setOwner(graph13);
    Graph graph16 = new Graph();
    node12.setOwner(graph16);
    Node node19 = new Node("hi!");
    Node node21 = new Node("hi!");
    Graph graph22 = new Graph();
    node21.setOwner(graph22);
    graph22.setName("");
    node19.setOwner(graph22);
    java.lang.String str27 = graph22.name;
    node12.setOwner(graph22);
    Node node30 = new Node("");
    Graph graph31 = Graph.generateGraph();
    java.lang.String str32 = graph31.name;
    graph31.init();
    node30.setOwner(graph31);
    java.lang.String str35 = graph31.name;
    node12.setOwner(graph31);
    Node node38 = new Node("hi!");
    Node node40 = new Node("hi!");
    Graph graph41 = new Graph();
    node40.setOwner(graph41);
    graph41.setName("");
    node38.setOwner(graph41);
    node38.setOwnerNameDirectly("hi!");
    graph31.addNode(node38);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph4.addNode(node38);

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test352"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    graph2.init();
    node1.setOwner(graph2);
    java.lang.String str6 = graph2.name;
    graph2.name = "[graph]";
    graph2.name = "";
    Graph graph11 = Graph.generateGraph();
    Node node13 = new Node("");
    Node node15 = new Node("hi!");
    Graph graph16 = new Graph();
    node15.setOwner(graph16);
    node13.setOwner(graph16);
    Node node20 = new Node("hi!");
    Graph graph21 = new Graph();
    node20.setOwner(graph21);
    graph21.setName("");
    java.lang.String str25 = graph21.name;
    node13.setOwner(graph21);
    node13.setOwnerNameDirectly("hi!");
    graph11.addNode(node13);
    node13.setOwnerNameDirectly("hi!");
    node13.setOwnerNameDirectly("hi!");
    graph2.addNode(node13);
    Node node36 = new Node("");
    Node node38 = new Node("hi!");
    Graph graph39 = new Graph();
    node38.setOwner(graph39);
    node36.setOwner(graph39);
    Node node43 = new Node("hi!");
    Graph graph44 = new Graph();
    node43.setOwner(graph44);
    graph44.setName("");
    java.lang.String str48 = graph44.name;
    node36.setOwner(graph44);
    node36.setOwnerNameDirectly("hi!");
    node36.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node13.addEdge(node36);

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test353"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerNameDirectly("[graph]");
    Node node18 = new Node("");
    Node node20 = new Node("hi!");
    Graph graph21 = new Graph();
    node20.setOwner(graph21);
    node18.setOwner(graph21);
    Node node25 = new Node("hi!");
    Graph graph26 = new Graph();
    node25.setOwner(graph26);
    graph26.setName("");
    java.lang.String str30 = graph26.name;
    node18.setOwner(graph26);
    node18.setOwnerNameDirectly("hi!");
    Graph graph34 = Graph.generateGraph();
    Node node36 = new Node("");
    Node node38 = new Node("hi!");
    Graph graph39 = new Graph();
    node38.setOwner(graph39);
    node36.setOwner(graph39);
    Node node43 = new Node("hi!");
    Graph graph44 = new Graph();
    node43.setOwner(graph44);
    graph44.setName("");
    java.lang.String str48 = graph44.name;
    node36.setOwner(graph44);
    node36.setOwnerNameDirectly("hi!");
    graph34.addNode(node36);
    node18.setOwner(graph34);
    graph34.name = "";
    node1.setOwner(graph34);
    node1.setOwnerName("");
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("");
    node1.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i67 = node1.getDegree();

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test354"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    graph9.init();
    graph9.init();
    Node node18 = new Node("");
    Graph graph19 = Graph.generateGraph();
    java.lang.String str20 = graph19.name;
    node18.setOwner(graph19);
    Graph graph22 = new Graph();
    node18.setOwner(graph22);
    Node node25 = new Node("hi!");
    Node node27 = new Node("hi!");
    Graph graph28 = new Graph();
    node27.setOwner(graph28);
    graph28.setName("");
    node25.setOwner(graph28);
    java.lang.String str33 = graph28.name;
    node18.setOwner(graph28);
    Node node36 = new Node("");
    Graph graph37 = Graph.generateGraph();
    java.lang.String str38 = graph37.name;
    graph37.init();
    node36.setOwner(graph37);
    java.lang.String str41 = graph37.name;
    node18.setOwner(graph37);
    Graph graph43 = Graph.generateGraph();
    Node node45 = new Node("");
    Node node47 = new Node("hi!");
    Graph graph48 = new Graph();
    node47.setOwner(graph48);
    node45.setOwner(graph48);
    Node node52 = new Node("hi!");
    Graph graph53 = new Graph();
    node52.setOwner(graph53);
    graph53.setName("");
    java.lang.String str57 = graph53.name;
    node45.setOwner(graph53);
    node45.setOwnerNameDirectly("hi!");
    graph43.addNode(node45);
    Graph graph62 = Graph.generateGraph();
    node45.setOwner(graph62);
    Node node65 = new Node("");
    Graph graph66 = Graph.generateGraph();
    java.lang.String str67 = graph66.name;
    node65.setOwner(graph66);
    Graph graph69 = new Graph();
    node65.setOwner(graph69);
    Node node72 = new Node("hi!");
    Node node74 = new Node("hi!");
    Graph graph75 = new Graph();
    node74.setOwner(graph75);
    graph75.setName("");
    node72.setOwner(graph75);
    java.lang.String str80 = graph75.name;
    node65.setOwner(graph75);
    Node node83 = new Node("");
    Graph graph84 = Graph.generateGraph();
    java.lang.String str85 = graph84.name;
    graph84.init();
    node83.setOwner(graph84);
    java.lang.String str88 = graph84.name;
    node65.setOwner(graph84);
    graph84.name = "";
    node45.setOwner(graph84);
    graph37.addNode(node45);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i94 = graph9.getDegree(node45);

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test355"); }


    Node node1 = new Node("hi!");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    graph4.setName("");
    node1.setOwner(graph4);
    graph4.setName("");
    graph4.setName("");
    java.lang.String str13 = graph4.name;
    Node node15 = new Node("hi!");
    Node node17 = new Node("hi!");
    Graph graph18 = new Graph();
    node17.setOwner(graph18);
    graph18.setName("");
    node15.setOwner(graph18);
    node15.setOwnerNameDirectly("hi!");
    Node node26 = new Node("hi!");
    Graph graph27 = new Graph();
    node26.setOwner(graph27);
    graph27.setName("");
    graph27.setName("");
    graph27.init();
    node15.setOwner(graph27);
    node15.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i37 = graph4.getDegree(node15);

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test356"); }


    Graph graph0 = new Graph();
    graph0.init();
    java.lang.String str2 = graph0.name;
    graph0.init();
    graph0.name = "hi!";
    graph0.setName("hi!");
    java.lang.String str8 = graph0.name;
    graph0.name = "hi!";
    Graph graph11 = Graph.generateGraph();
    Node node13 = new Node("");
    Node node15 = new Node("hi!");
    Graph graph16 = new Graph();
    node15.setOwner(graph16);
    node13.setOwner(graph16);
    Node node20 = new Node("hi!");
    Graph graph21 = new Graph();
    node20.setOwner(graph21);
    graph21.setName("");
    java.lang.String str25 = graph21.name;
    node13.setOwner(graph21);
    node13.setOwnerNameDirectly("hi!");
    graph11.addNode(node13);
    graph0.addNode(node13);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i31 = node13.getDegree();

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test357"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerNameDirectly("[graph]");
    Node node18 = new Node("");
    Node node20 = new Node("hi!");
    Graph graph21 = new Graph();
    node20.setOwner(graph21);
    node18.setOwner(graph21);
    Node node25 = new Node("hi!");
    Graph graph26 = new Graph();
    node25.setOwner(graph26);
    graph26.setName("");
    java.lang.String str30 = graph26.name;
    node18.setOwner(graph26);
    node18.setOwnerNameDirectly("hi!");
    Graph graph34 = Graph.generateGraph();
    Node node36 = new Node("");
    Node node38 = new Node("hi!");
    Graph graph39 = new Graph();
    node38.setOwner(graph39);
    node36.setOwner(graph39);
    Node node43 = new Node("hi!");
    Graph graph44 = new Graph();
    node43.setOwner(graph44);
    graph44.setName("");
    java.lang.String str48 = graph44.name;
    node36.setOwner(graph44);
    node36.setOwnerNameDirectly("hi!");
    graph34.addNode(node36);
    node18.setOwner(graph34);
    graph34.name = "";
    node1.setOwner(graph34);
    node1.setOwnerName("");
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("[graph]");
    node1.setOwnerNameDirectly("");
    Node node66 = new Node("");
    Node node68 = new Node("hi!");
    Graph graph69 = new Graph();
    node68.setOwner(graph69);
    node66.setOwner(graph69);
    Node node73 = new Node("hi!");
    Graph graph74 = new Graph();
    node73.setOwner(graph74);
    graph74.setName("");
    java.lang.String str78 = graph74.name;
    node66.setOwner(graph74);
    node66.setOwnerName("hi!");
    node66.setOwnerName("hi!");
    node66.setOwnerNameDirectly("");
    node66.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node66);

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test358"); }


    Graph graph0 = Graph.generateGraph();
    java.lang.String str1 = graph0.name;
    graph0.name = "";
    graph0.name = "[graph]";
    graph0.setName("hi!");
    graph0.name = "";
    graph0.init();
    graph0.name = "hi!";
    Node node14 = new Node("");
    Graph graph15 = Graph.generateGraph();
    java.lang.String str16 = graph15.name;
    node14.setOwner(graph15);
    Graph graph18 = new Graph();
    node14.setOwner(graph18);
    node14.setOwnerNameDirectly("");
    graph0.addNode(node14);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i23 = node14.getDegree();

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test359"); }


    Node node1 = new Node("hi!");
    Graph graph2 = new Graph();
    node1.setOwner(graph2);
    graph2.setName("");
    graph2.setName("");
    graph2.setName("");
    graph2.setName("[graph]");
    graph2.setName("");
    java.lang.String str14 = graph2.name;
    java.lang.String str15 = graph2.name;
    Node node17 = new Node("");
    Node node19 = new Node("hi!");
    Graph graph20 = new Graph();
    node19.setOwner(graph20);
    node17.setOwner(graph20);
    Node node24 = new Node("hi!");
    Graph graph25 = new Graph();
    node24.setOwner(graph25);
    graph25.setName("");
    java.lang.String str29 = graph25.name;
    node17.setOwner(graph25);
    node17.setOwnerName("hi!");
    Graph graph33 = new Graph();
    graph33.init();
    node17.setOwner(graph33);
    node17.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph2.addNode(node17);

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test360"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerNameDirectly("hi!");
    Graph graph17 = Graph.generateGraph();
    Node node19 = new Node("");
    Node node21 = new Node("hi!");
    Graph graph22 = new Graph();
    node21.setOwner(graph22);
    node19.setOwner(graph22);
    Node node26 = new Node("hi!");
    Graph graph27 = new Graph();
    node26.setOwner(graph27);
    graph27.setName("");
    java.lang.String str31 = graph27.name;
    node19.setOwner(graph27);
    node19.setOwnerNameDirectly("hi!");
    graph17.addNode(node19);
    node1.setOwner(graph17);
    node1.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test361"); }


    Graph graph0 = Graph.generateGraph();
    Node node2 = new Node("");
    Node node4 = new Node("hi!");
    Graph graph5 = new Graph();
    node4.setOwner(graph5);
    node2.setOwner(graph5);
    Node node9 = new Node("hi!");
    Graph graph10 = new Graph();
    node9.setOwner(graph10);
    graph10.setName("");
    java.lang.String str14 = graph10.name;
    node2.setOwner(graph10);
    node2.setOwnerNameDirectly("hi!");
    graph0.addNode(node2);
    node2.setOwnerName("hi!");
    Node node22 = new Node("hi!");
    Graph graph23 = new Graph();
    node22.setOwner(graph23);
    graph23.setName("");
    graph23.setName("");
    graph23.setName("");
    node2.setOwner(graph23);
    node2.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node2.thisIsNotCalled();

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test362"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    graph2.init();
    node1.setOwner(graph2);
    java.lang.String str6 = graph2.name;
    graph2.setName("");
    graph2.setName("hi!");
    Node node12 = new Node("");
    Node node14 = new Node("hi!");
    Graph graph15 = new Graph();
    node14.setOwner(graph15);
    node12.setOwner(graph15);
    Node node19 = new Node("hi!");
    Graph graph20 = new Graph();
    node19.setOwner(graph20);
    graph20.setName("");
    java.lang.String str24 = graph20.name;
    node12.setOwner(graph20);
    node12.setOwnerName("hi!");
    node12.setOwnerName("hi!");
    node12.setOwnerNameDirectly("");
    Node node33 = new Node("");
    Node node35 = new Node("hi!");
    Graph graph36 = new Graph();
    node35.setOwner(graph36);
    node33.setOwner(graph36);
    Node node40 = new Node("hi!");
    Graph graph41 = new Graph();
    node40.setOwner(graph41);
    graph41.setName("");
    java.lang.String str45 = graph41.name;
    node33.setOwner(graph41);
    java.lang.String str47 = graph41.name;
    graph41.setName("");
    graph41.setName("");
    node12.setOwner(graph41);
    Node node54 = new Node("hi!");
    Node node56 = new Node("hi!");
    Graph graph57 = new Graph();
    node56.setOwner(graph57);
    graph57.setName("");
    node54.setOwner(graph57);
    node54.setOwnerNameDirectly("hi!");
    node54.setOwnerNameDirectly("[graph]");
    Node node67 = new Node("");
    Graph graph68 = Graph.generateGraph();
    java.lang.String str69 = graph68.name;
    graph68.init();
    node67.setOwner(graph68);
    java.lang.String str72 = graph68.name;
    graph68.init();
    node54.setOwner(graph68);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph2.addEdge(node12, node54);

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test363"); }


    Node node1 = new Node("hi!");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    graph4.setName("");
    node1.setOwner(graph4);
    node1.setOwnerNameDirectly("hi!");
    Node node12 = new Node("hi!");
    Graph graph13 = new Graph();
    node12.setOwner(graph13);
    graph13.setName("");
    graph13.setName("");
    graph13.init();
    node1.setOwner(graph13);
    Node node22 = new Node("");
    Graph graph23 = Graph.generateGraph();
    java.lang.String str24 = graph23.name;
    node22.setOwner(graph23);
    Graph graph26 = new Graph();
    node22.setOwner(graph26);
    node22.setOwnerNameDirectly("");
    node22.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node22);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test364"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerNameDirectly("hi!");
    Node node18 = new Node("");
    Node node20 = new Node("hi!");
    Graph graph21 = new Graph();
    node20.setOwner(graph21);
    node18.setOwner(graph21);
    Node node25 = new Node("hi!");
    Graph graph26 = new Graph();
    node25.setOwner(graph26);
    graph26.setName("");
    java.lang.String str30 = graph26.name;
    node18.setOwner(graph26);
    node18.setOwnerNameDirectly("hi!");
    Graph graph34 = Graph.generateGraph();
    Node node36 = new Node("");
    Node node38 = new Node("hi!");
    Graph graph39 = new Graph();
    node38.setOwner(graph39);
    node36.setOwner(graph39);
    Node node43 = new Node("hi!");
    Graph graph44 = new Graph();
    node43.setOwner(graph44);
    graph44.setName("");
    java.lang.String str48 = graph44.name;
    node36.setOwner(graph44);
    node36.setOwnerNameDirectly("hi!");
    graph34.addNode(node36);
    node18.setOwner(graph34);
    graph34.name = "";
    graph34.name = "[graph]";
    node1.setOwner(graph34);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i59 = node1.getDegree();

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test365"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerNameDirectly("[graph]");
    node1.setOwnerName("");
    Graph graph19 = new Graph();
    graph19.init();
    graph19.setName("");
    java.lang.String str23 = graph19.name;
    node1.setOwner(graph19);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test366"); }


    Graph graph0 = Graph.generateGraph();
    Node node2 = new Node("");
    Node node4 = new Node("hi!");
    Graph graph5 = new Graph();
    node4.setOwner(graph5);
    node2.setOwner(graph5);
    Node node9 = new Node("hi!");
    Graph graph10 = new Graph();
    node9.setOwner(graph10);
    graph10.setName("");
    java.lang.String str14 = graph10.name;
    node2.setOwner(graph10);
    node2.setOwnerNameDirectly("hi!");
    graph0.addNode(node2);
    Graph graph19 = Graph.generateGraph();
    node2.setOwner(graph19);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i21 = node2.getDegree();

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test367"); }


    Node node1 = new Node("hi!");
    Graph graph2 = new Graph();
    node1.setOwner(graph2);
    graph2.setName("");
    graph2.setName("");
    graph2.init();
    Node node10 = new Node("");
    Graph graph11 = Graph.generateGraph();
    java.lang.String str12 = graph11.name;
    node10.setOwner(graph11);
    Graph graph14 = new Graph();
    node10.setOwner(graph14);
    node10.setOwnerNameDirectly("");
    node10.setOwnerNameDirectly("");
    Node node21 = new Node("");
    Graph graph22 = Graph.generateGraph();
    java.lang.String str23 = graph22.name;
    node21.setOwner(graph22);
    node21.setOwnerNameDirectly("");
    node21.setOwnerNameDirectly("[graph]");
    node21.setOwnerNameDirectly("hi!");
    node21.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph2.addEdge(node10, node21);

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test368"); }


    Graph graph0 = Graph.generateGraph();
    Node node2 = new Node("");
    Node node4 = new Node("hi!");
    Graph graph5 = new Graph();
    node4.setOwner(graph5);
    node2.setOwner(graph5);
    Node node9 = new Node("hi!");
    Graph graph10 = new Graph();
    node9.setOwner(graph10);
    graph10.setName("");
    java.lang.String str14 = graph10.name;
    node2.setOwner(graph10);
    node2.setOwnerNameDirectly("hi!");
    graph0.addNode(node2);
    node2.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i21 = node2.getDegree();

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test369"); }


    Node node1 = new Node("hi!");
    Graph graph2 = new Graph();
    node1.setOwner(graph2);
    graph2.setName("");
    java.lang.String str6 = graph2.name;
    Graph graph7 = Graph.generateGraph();
    Node node9 = new Node("");
    Node node11 = new Node("hi!");
    Graph graph12 = new Graph();
    node11.setOwner(graph12);
    node9.setOwner(graph12);
    Node node16 = new Node("hi!");
    Graph graph17 = new Graph();
    node16.setOwner(graph17);
    graph17.setName("");
    java.lang.String str21 = graph17.name;
    node9.setOwner(graph17);
    node9.setOwnerNameDirectly("hi!");
    graph7.addNode(node9);
    graph7.name = "";
    graph7.init();
    graph7.setName("");
    graph7.name = "";
    Node node34 = new Node("");
    Node node36 = new Node("hi!");
    Graph graph37 = new Graph();
    node36.setOwner(graph37);
    node34.setOwner(graph37);
    Node node41 = new Node("hi!");
    Graph graph42 = new Graph();
    node41.setOwner(graph42);
    graph42.setName("");
    java.lang.String str46 = graph42.name;
    node34.setOwner(graph42);
    node34.setOwnerNameDirectly("[graph]");
    Node node51 = new Node("");
    Node node53 = new Node("hi!");
    Graph graph54 = new Graph();
    node53.setOwner(graph54);
    node51.setOwner(graph54);
    Node node58 = new Node("hi!");
    Graph graph59 = new Graph();
    node58.setOwner(graph59);
    graph59.setName("");
    java.lang.String str63 = graph59.name;
    node51.setOwner(graph59);
    node51.setOwnerNameDirectly("hi!");
    Graph graph67 = Graph.generateGraph();
    Node node69 = new Node("");
    Node node71 = new Node("hi!");
    Graph graph72 = new Graph();
    node71.setOwner(graph72);
    node69.setOwner(graph72);
    Node node76 = new Node("hi!");
    Graph graph77 = new Graph();
    node76.setOwner(graph77);
    graph77.setName("");
    java.lang.String str81 = graph77.name;
    node69.setOwner(graph77);
    node69.setOwnerNameDirectly("hi!");
    graph67.addNode(node69);
    node51.setOwner(graph67);
    graph67.name = "";
    node34.setOwner(graph67);
    graph7.addNode(node34);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i91 = graph2.getDegree(node34);

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test370"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    node1.setOwner(graph2);
    Graph graph5 = new Graph();
    node1.setOwner(graph5);
    node1.setOwnerNameDirectly("hi!");
    Node node10 = new Node("");
    Graph graph11 = Graph.generateGraph();
    java.lang.String str12 = graph11.name;
    graph11.init();
    node10.setOwner(graph11);
    graph11.name = "hi!";
    Graph graph17 = new Graph();
    graph17.init();
    graph17.setName("");
    Node node22 = new Node("");
    graph17.addNode(node22);
    graph11.addNode(node22);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node22);

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test371"); }


    Graph graph0 = Graph.generateGraph();
    Node node2 = new Node("");
    Node node4 = new Node("hi!");
    Graph graph5 = new Graph();
    node4.setOwner(graph5);
    node2.setOwner(graph5);
    Node node9 = new Node("hi!");
    Graph graph10 = new Graph();
    node9.setOwner(graph10);
    graph10.setName("");
    java.lang.String str14 = graph10.name;
    node2.setOwner(graph10);
    node2.setOwnerNameDirectly("hi!");
    graph0.addNode(node2);
    Graph graph19 = Graph.generateGraph();
    node2.setOwner(graph19);
    node2.setOwnerName("hi!");
    node2.setOwnerNameDirectly("[graph]");
    Node node26 = new Node("");
    Node node28 = new Node("hi!");
    Graph graph29 = new Graph();
    node28.setOwner(graph29);
    node26.setOwner(graph29);
    Node node33 = new Node("hi!");
    Graph graph34 = new Graph();
    node33.setOwner(graph34);
    graph34.setName("");
    java.lang.String str38 = graph34.name;
    node26.setOwner(graph34);
    Node node41 = new Node("");
    Graph graph42 = Graph.generateGraph();
    java.lang.String str43 = graph42.name;
    node41.setOwner(graph42);
    graph42.setName("");
    java.lang.String str47 = graph42.name;
    node26.setOwner(graph42);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node2.addEdge(node26);

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test372"); }


    Graph graph0 = new Graph();
    graph0.init();
    java.lang.String str2 = graph0.name;
    Node node4 = new Node("hi!");
    Graph graph5 = new Graph();
    node4.setOwner(graph5);
    graph5.setName("");
    graph5.init();
    Node node11 = new Node("");
    Node node13 = new Node("hi!");
    Graph graph14 = new Graph();
    node13.setOwner(graph14);
    node11.setOwner(graph14);
    Node node18 = new Node("hi!");
    Graph graph19 = new Graph();
    node18.setOwner(graph19);
    graph19.setName("");
    java.lang.String str23 = graph19.name;
    node11.setOwner(graph19);
    node11.setOwnerName("hi!");
    Graph graph27 = new Graph();
    graph27.init();
    node11.setOwner(graph27);
    node11.setOwnerNameDirectly("");
    graph5.addNode(node11);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i33 = graph0.getDegree(node11);

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test373"); }


    Node node1 = new Node("hi!");
    Graph graph2 = new Graph();
    node1.setOwner(graph2);
    graph2.setName("");
    graph2.init();
    Graph graph7 = Graph.generateGraph();
    Node node9 = new Node("");
    Node node11 = new Node("hi!");
    Graph graph12 = new Graph();
    node11.setOwner(graph12);
    node9.setOwner(graph12);
    Node node16 = new Node("hi!");
    Graph graph17 = new Graph();
    node16.setOwner(graph17);
    graph17.setName("");
    java.lang.String str21 = graph17.name;
    node9.setOwner(graph17);
    node9.setOwnerNameDirectly("hi!");
    graph7.addNode(node9);
    node9.setOwnerName("hi!");
    Node node29 = new Node("hi!");
    Graph graph30 = new Graph();
    node29.setOwner(graph30);
    graph30.setName("");
    graph30.setName("");
    graph30.setName("");
    node9.setOwner(graph30);
    Graph graph39 = new Graph();
    graph39.init();
    graph39.setName("");
    java.lang.String str43 = graph39.name;
    graph39.init();
    Node node46 = new Node("");
    Graph graph47 = Graph.generateGraph();
    java.lang.String str48 = graph47.name;
    node46.setOwner(graph47);
    Graph graph50 = new Graph();
    node46.setOwner(graph50);
    graph39.addNode(node46);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph2.addEdge(node9, node46);

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test374"); }


    Node node1 = new Node("hi!");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    graph4.setName("");
    node1.setOwner(graph4);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerNameDirectly("[graph]");
    Node node14 = new Node("");
    Node node16 = new Node("hi!");
    Graph graph17 = new Graph();
    node16.setOwner(graph17);
    node14.setOwner(graph17);
    Node node21 = new Node("hi!");
    Graph graph22 = new Graph();
    node21.setOwner(graph22);
    graph22.setName("");
    java.lang.String str26 = graph22.name;
    node14.setOwner(graph22);
    node14.setOwnerName("hi!");
    Graph graph30 = new Graph();
    graph30.init();
    node14.setOwner(graph30);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node14);

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test375"); }


    Graph graph0 = Graph.generateGraph();
    Node node2 = new Node("");
    Node node4 = new Node("hi!");
    Graph graph5 = new Graph();
    node4.setOwner(graph5);
    node2.setOwner(graph5);
    Node node9 = new Node("hi!");
    Graph graph10 = new Graph();
    node9.setOwner(graph10);
    graph10.setName("");
    java.lang.String str14 = graph10.name;
    node2.setOwner(graph10);
    node2.setOwnerNameDirectly("hi!");
    graph0.addNode(node2);
    node2.setOwnerNameDirectly("hi!");
    Node node22 = new Node("hi!");
    Graph graph23 = new Graph();
    node22.setOwner(graph23);
    graph23.setName("");
    graph23.setName("");
    graph23.init();
    node2.setOwner(graph23);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node2.thisIsNotCalled();

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test376"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    java.lang.String str15 = graph9.name;
    graph9.setName("");
    graph9.name = "";
    graph9.init();
    java.lang.String str21 = graph9.name;
    Node node23 = new Node("hi!");
    Graph graph24 = new Graph();
    node23.setOwner(graph24);
    node23.setOwnerNameDirectly("[graph]");
    Graph graph28 = new Graph();
    graph28.init();
    graph28.setName("");
    Node node33 = new Node("");
    graph28.addNode(node33);
    graph28.name = "";
    node23.setOwner(graph28);
    Node node39 = new Node("");
    Node node41 = new Node("hi!");
    Graph graph42 = new Graph();
    node41.setOwner(graph42);
    node39.setOwner(graph42);
    Node node46 = new Node("hi!");
    Graph graph47 = new Graph();
    node46.setOwner(graph47);
    graph47.setName("");
    java.lang.String str51 = graph47.name;
    node39.setOwner(graph47);
    node39.setOwnerName("hi!");
    Graph graph55 = new Graph();
    graph55.init();
    node39.setOwner(graph55);
    node39.setOwnerNameDirectly("");
    Node node61 = new Node("");
    Graph graph62 = Graph.generateGraph();
    Node node64 = new Node("");
    Node node66 = new Node("hi!");
    Graph graph67 = new Graph();
    node66.setOwner(graph67);
    node64.setOwner(graph67);
    Node node71 = new Node("hi!");
    Graph graph72 = new Graph();
    node71.setOwner(graph72);
    graph72.setName("");
    java.lang.String str76 = graph72.name;
    node64.setOwner(graph72);
    node64.setOwnerNameDirectly("hi!");
    graph62.addNode(node64);
    graph62.name = "";
    node61.setOwner(graph62);
    node39.setOwner(graph62);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph9.addEdge(node23, node39);

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test377"); }


    Graph graph0 = Graph.generateGraph();
    Node node2 = new Node("");
    Node node4 = new Node("hi!");
    Graph graph5 = new Graph();
    node4.setOwner(graph5);
    node2.setOwner(graph5);
    Node node9 = new Node("hi!");
    Graph graph10 = new Graph();
    node9.setOwner(graph10);
    graph10.setName("");
    java.lang.String str14 = graph10.name;
    node2.setOwner(graph10);
    node2.setOwnerNameDirectly("hi!");
    graph0.addNode(node2);
    node2.setOwnerName("hi!");
    Node node22 = new Node("hi!");
    Graph graph23 = new Graph();
    node22.setOwner(graph23);
    graph23.setName("");
    graph23.setName("");
    graph23.setName("");
    node2.setOwner(graph23);
    node2.setOwnerName("[graph]");
    Node node35 = new Node("hi!");
    Node node37 = new Node("hi!");
    Graph graph38 = new Graph();
    node37.setOwner(graph38);
    graph38.setName("");
    node35.setOwner(graph38);
    node35.setOwnerNameDirectly("hi!");
    Node node46 = new Node("hi!");
    Graph graph47 = new Graph();
    node46.setOwner(graph47);
    graph47.setName("");
    graph47.setName("");
    graph47.init();
    node35.setOwner(graph47);
    Node node56 = new Node("");
    Graph graph57 = Graph.generateGraph();
    java.lang.String str58 = graph57.name;
    graph57.init();
    node56.setOwner(graph57);
    java.lang.String str61 = graph57.name;
    graph57.name = "[graph]";
    graph57.name = "";
    graph57.name = "";
    node35.setOwner(graph57);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node2.addEdge(node35);

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test378"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerNameDirectly("[graph]");
    node1.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test379"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerNameDirectly("[graph]");
    Graph graph17 = Graph.generateGraph();
    Node node19 = new Node("");
    Node node21 = new Node("hi!");
    Graph graph22 = new Graph();
    node21.setOwner(graph22);
    node19.setOwner(graph22);
    Node node26 = new Node("hi!");
    Graph graph27 = new Graph();
    node26.setOwner(graph27);
    graph27.setName("");
    java.lang.String str31 = graph27.name;
    node19.setOwner(graph27);
    node19.setOwnerNameDirectly("hi!");
    graph17.addNode(node19);
    node1.setOwner(graph17);
    node1.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i39 = node1.getDegree();

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test380"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    graph2.init();
    node1.setOwner(graph2);
    java.lang.String str6 = graph2.name;
    graph2.name = "[graph]";
    java.lang.String str9 = graph2.name;
    graph2.name = "";
    graph2.init();
    graph2.name = "hi!";
    java.lang.String str15 = graph2.name;
    Node node17 = new Node("hi!");
    Graph graph18 = new Graph();
    node17.setOwner(graph18);
    graph18.setName("");
    graph18.setName("");
    graph18.setName("hi!");
    graph18.init();
    Node node28 = new Node("");
    Node node30 = new Node("hi!");
    Graph graph31 = new Graph();
    node30.setOwner(graph31);
    node28.setOwner(graph31);
    Node node35 = new Node("hi!");
    Graph graph36 = new Graph();
    node35.setOwner(graph36);
    graph36.setName("");
    java.lang.String str40 = graph36.name;
    node28.setOwner(graph36);
    Node node43 = new Node("");
    Graph graph44 = Graph.generateGraph();
    java.lang.String str45 = graph44.name;
    node43.setOwner(graph44);
    graph44.setName("");
    java.lang.String str49 = graph44.name;
    node28.setOwner(graph44);
    Node node52 = new Node("hi!");
    Graph graph53 = new Graph();
    node52.setOwner(graph53);
    graph44.addNode(node52);
    graph18.addNode(node52);
    graph2.addNode(node52);
    node52.setOwnerName("[graph]");
    Node node61 = new Node("");
    Graph graph62 = Graph.generateGraph();
    java.lang.String str63 = graph62.name;
    graph62.init();
    node61.setOwner(graph62);
    java.lang.String str66 = graph62.name;
    graph62.name = "[graph]";
    java.lang.String str69 = graph62.name;
    graph62.name = "";
    graph62.init();
    graph62.init();
    node52.setOwner(graph62);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i75 = node52.getDegree();

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test381"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    Node node4 = new Node("");
    Node node6 = new Node("hi!");
    Graph graph7 = new Graph();
    node6.setOwner(graph7);
    node4.setOwner(graph7);
    Node node11 = new Node("hi!");
    Graph graph12 = new Graph();
    node11.setOwner(graph12);
    graph12.setName("");
    java.lang.String str16 = graph12.name;
    node4.setOwner(graph12);
    node4.setOwnerNameDirectly("hi!");
    graph2.addNode(node4);
    graph2.name = "";
    node1.setOwner(graph2);
    Node node25 = new Node("hi!");
    Graph graph26 = new Graph();
    node25.setOwner(graph26);
    graph2.addNode(node25);
    node25.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i31 = node25.getDegree();

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test382"); }


    Graph graph0 = new Graph();
    graph0.init();
    java.lang.String str2 = graph0.name;
    graph0.init();
    graph0.name = "hi!";
    graph0.setName("hi!");
    graph0.setName("");
    Node node11 = new Node("");
    Graph graph12 = Graph.generateGraph();
    java.lang.String str13 = graph12.name;
    node11.setOwner(graph12);
    Graph graph15 = new Graph();
    node11.setOwner(graph15);
    Node node18 = new Node("hi!");
    Node node20 = new Node("hi!");
    Graph graph21 = new Graph();
    node20.setOwner(graph21);
    graph21.setName("");
    node18.setOwner(graph21);
    java.lang.String str26 = graph21.name;
    node11.setOwner(graph21);
    Node node29 = new Node("");
    Graph graph30 = Graph.generateGraph();
    java.lang.String str31 = graph30.name;
    graph30.init();
    node29.setOwner(graph30);
    java.lang.String str34 = graph30.name;
    node11.setOwner(graph30);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i36 = graph0.getDegree(node11);

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test383"); }


    Node node1 = new Node("hi!");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    graph4.setName("");
    node1.setOwner(graph4);
    graph4.name = "hi!";
    Node node12 = new Node("");
    Node node14 = new Node("hi!");
    Graph graph15 = new Graph();
    node14.setOwner(graph15);
    node12.setOwner(graph15);
    Node node19 = new Node("hi!");
    Graph graph20 = new Graph();
    node19.setOwner(graph20);
    graph20.setName("");
    java.lang.String str24 = graph20.name;
    node12.setOwner(graph20);
    node12.setOwnerNameDirectly("[graph]");
    node12.setOwnerNameDirectly("hi!");
    Node node31 = new Node("hi!");
    Node node33 = new Node("hi!");
    Graph graph34 = new Graph();
    node33.setOwner(graph34);
    graph34.setName("");
    node31.setOwner(graph34);
    node31.setOwnerNameDirectly("hi!");
    Node node42 = new Node("hi!");
    Graph graph43 = new Graph();
    node42.setOwner(graph43);
    graph43.setName("");
    graph43.setName("");
    graph43.setName("hi!");
    graph43.init();
    graph43.setName("[graph]");
    node31.setOwner(graph43);
    node31.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph4.addEdge(node12, node31);

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test384"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerNameDirectly("[graph]");
    node1.setOwnerName("");
    node1.setOwnerName("[graph]");
    Node node22 = new Node("");
    Node node24 = new Node("hi!");
    Graph graph25 = new Graph();
    node24.setOwner(graph25);
    node22.setOwner(graph25);
    Node node29 = new Node("hi!");
    Graph graph30 = new Graph();
    node29.setOwner(graph30);
    graph30.setName("");
    java.lang.String str34 = graph30.name;
    node22.setOwner(graph30);
    node22.setOwnerNameDirectly("[graph]");
    Node node39 = new Node("");
    Node node41 = new Node("hi!");
    Graph graph42 = new Graph();
    node41.setOwner(graph42);
    node39.setOwner(graph42);
    Node node46 = new Node("hi!");
    Graph graph47 = new Graph();
    node46.setOwner(graph47);
    graph47.setName("");
    java.lang.String str51 = graph47.name;
    node39.setOwner(graph47);
    node39.setOwnerNameDirectly("hi!");
    Graph graph55 = Graph.generateGraph();
    Node node57 = new Node("");
    Node node59 = new Node("hi!");
    Graph graph60 = new Graph();
    node59.setOwner(graph60);
    node57.setOwner(graph60);
    Node node64 = new Node("hi!");
    Graph graph65 = new Graph();
    node64.setOwner(graph65);
    graph65.setName("");
    java.lang.String str69 = graph65.name;
    node57.setOwner(graph65);
    node57.setOwnerNameDirectly("hi!");
    graph55.addNode(node57);
    node39.setOwner(graph55);
    graph55.name = "";
    node22.setOwner(graph55);
    node22.setOwnerName("");
    node22.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node22);

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test385"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerName("hi!");
    node1.setOwnerName("hi!");
    node1.setOwnerNameDirectly("");
    Node node22 = new Node("");
    Node node24 = new Node("hi!");
    Graph graph25 = new Graph();
    node24.setOwner(graph25);
    node22.setOwner(graph25);
    Node node29 = new Node("hi!");
    Graph graph30 = new Graph();
    node29.setOwner(graph30);
    graph30.setName("");
    java.lang.String str34 = graph30.name;
    node22.setOwner(graph30);
    java.lang.String str36 = graph30.name;
    graph30.setName("");
    graph30.setName("");
    node1.setOwner(graph30);
    node1.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test386"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    java.lang.String str7 = graph4.name;
    Node node9 = new Node("hi!");
    Node node11 = new Node("hi!");
    Graph graph12 = new Graph();
    node11.setOwner(graph12);
    graph12.setName("");
    node9.setOwner(graph12);
    node9.setOwnerNameDirectly("hi!");
    Node node20 = new Node("hi!");
    Graph graph21 = new Graph();
    node20.setOwner(graph21);
    graph21.setName("");
    graph21.setName("");
    graph21.setName("hi!");
    graph21.init();
    graph21.setName("[graph]");
    node9.setOwner(graph21);
    Graph graph33 = Graph.generateGraph();
    Node node35 = new Node("");
    Node node37 = new Node("hi!");
    Graph graph38 = new Graph();
    node37.setOwner(graph38);
    node35.setOwner(graph38);
    Node node42 = new Node("hi!");
    Graph graph43 = new Graph();
    node42.setOwner(graph43);
    graph43.setName("");
    java.lang.String str47 = graph43.name;
    node35.setOwner(graph43);
    node35.setOwnerNameDirectly("hi!");
    graph33.addNode(node35);
    node35.setOwnerName("hi!");
    node35.setOwnerName("");
    graph21.addNode(node35);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph4.addNode(node35);

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test387"); }


    Graph graph0 = Graph.generateGraph();
    Node node2 = new Node("");
    Node node4 = new Node("hi!");
    Graph graph5 = new Graph();
    node4.setOwner(graph5);
    node2.setOwner(graph5);
    Node node9 = new Node("hi!");
    Graph graph10 = new Graph();
    node9.setOwner(graph10);
    graph10.setName("");
    java.lang.String str14 = graph10.name;
    node2.setOwner(graph10);
    node2.setOwnerNameDirectly("hi!");
    graph0.addNode(node2);
    graph0.name = "";
    graph0.init();
    graph0.setName("");
    graph0.name = "";
    Node node27 = new Node("");
    Node node29 = new Node("hi!");
    Graph graph30 = new Graph();
    node29.setOwner(graph30);
    node27.setOwner(graph30);
    Node node34 = new Node("hi!");
    Graph graph35 = new Graph();
    node34.setOwner(graph35);
    graph35.setName("");
    java.lang.String str39 = graph35.name;
    node27.setOwner(graph35);
    node27.setOwnerNameDirectly("[graph]");
    Node node44 = new Node("");
    Node node46 = new Node("hi!");
    Graph graph47 = new Graph();
    node46.setOwner(graph47);
    node44.setOwner(graph47);
    Node node51 = new Node("hi!");
    Graph graph52 = new Graph();
    node51.setOwner(graph52);
    graph52.setName("");
    java.lang.String str56 = graph52.name;
    node44.setOwner(graph52);
    node44.setOwnerNameDirectly("hi!");
    Graph graph60 = Graph.generateGraph();
    Node node62 = new Node("");
    Node node64 = new Node("hi!");
    Graph graph65 = new Graph();
    node64.setOwner(graph65);
    node62.setOwner(graph65);
    Node node69 = new Node("hi!");
    Graph graph70 = new Graph();
    node69.setOwner(graph70);
    graph70.setName("");
    java.lang.String str74 = graph70.name;
    node62.setOwner(graph70);
    node62.setOwnerNameDirectly("hi!");
    graph60.addNode(node62);
    node44.setOwner(graph60);
    graph60.name = "";
    node27.setOwner(graph60);
    graph0.addNode(node27);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node27.thisIsNotCalled();

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test388"); }


    Node node1 = new Node("hi!");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    graph4.setName("");
    node1.setOwner(graph4);
    graph4.name = "hi!";
    graph4.setName("hi!");
    graph4.init();
    Node node15 = new Node("hi!");
    Node node17 = new Node("hi!");
    Graph graph18 = new Graph();
    node17.setOwner(graph18);
    graph18.setName("");
    node15.setOwner(graph18);
    node15.setOwnerNameDirectly("hi!");
    Node node26 = new Node("hi!");
    Graph graph27 = new Graph();
    node26.setOwner(graph27);
    graph27.setName("");
    graph27.setName("");
    graph27.init();
    node15.setOwner(graph27);
    Node node36 = new Node("");
    Graph graph37 = Graph.generateGraph();
    java.lang.String str38 = graph37.name;
    graph37.init();
    node36.setOwner(graph37);
    java.lang.String str41 = graph37.name;
    graph37.name = "[graph]";
    graph37.name = "";
    graph37.name = "";
    node15.setOwner(graph37);
    Node node50 = new Node("hi!");
    Node node52 = new Node("hi!");
    Graph graph53 = new Graph();
    node52.setOwner(graph53);
    graph53.setName("");
    node50.setOwner(graph53);
    node50.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph4.addEdge(node15, node50);

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test389"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    graph2.init();
    node1.setOwner(graph2);
    graph2.name = "hi!";
    graph2.name = "hi!";
    Node node11 = new Node("hi!");
    Node node13 = new Node("hi!");
    Graph graph14 = new Graph();
    node13.setOwner(graph14);
    graph14.setName("");
    node11.setOwner(graph14);
    node11.setOwnerNameDirectly("hi!");
    node11.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i23 = graph2.getDegree(node11);

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test390"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    node1.setOwner(graph2);
    Graph graph5 = new Graph();
    node1.setOwner(graph5);
    Node node8 = new Node("hi!");
    Node node10 = new Node("hi!");
    Graph graph11 = new Graph();
    node10.setOwner(graph11);
    graph11.setName("");
    node8.setOwner(graph11);
    graph11.init();
    Node node18 = new Node("");
    Node node20 = new Node("hi!");
    Graph graph21 = new Graph();
    node20.setOwner(graph21);
    node18.setOwner(graph21);
    Node node25 = new Node("hi!");
    Graph graph26 = new Graph();
    node25.setOwner(graph26);
    graph26.setName("");
    java.lang.String str30 = graph26.name;
    node18.setOwner(graph26);
    node18.setOwnerNameDirectly("[graph]");
    Node node35 = new Node("");
    Node node37 = new Node("hi!");
    Graph graph38 = new Graph();
    node37.setOwner(graph38);
    node35.setOwner(graph38);
    Node node42 = new Node("hi!");
    Graph graph43 = new Graph();
    node42.setOwner(graph43);
    graph43.setName("");
    java.lang.String str47 = graph43.name;
    node35.setOwner(graph43);
    node35.setOwnerNameDirectly("hi!");
    Graph graph51 = Graph.generateGraph();
    Node node53 = new Node("");
    Node node55 = new Node("hi!");
    Graph graph56 = new Graph();
    node55.setOwner(graph56);
    node53.setOwner(graph56);
    Node node60 = new Node("hi!");
    Graph graph61 = new Graph();
    node60.setOwner(graph61);
    graph61.setName("");
    java.lang.String str65 = graph61.name;
    node53.setOwner(graph61);
    node53.setOwnerNameDirectly("hi!");
    graph51.addNode(node53);
    node35.setOwner(graph51);
    graph51.name = "";
    node18.setOwner(graph51);
    node18.setOwnerNameDirectly("");
    graph11.addNode(node18);
    node18.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node18);

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test391"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerNameDirectly("[graph]");
    Node node18 = new Node("");
    Node node20 = new Node("hi!");
    Graph graph21 = new Graph();
    node20.setOwner(graph21);
    node18.setOwner(graph21);
    Node node25 = new Node("hi!");
    Graph graph26 = new Graph();
    node25.setOwner(graph26);
    graph26.setName("");
    java.lang.String str30 = graph26.name;
    node18.setOwner(graph26);
    node18.setOwnerNameDirectly("hi!");
    Graph graph34 = Graph.generateGraph();
    Node node36 = new Node("");
    Node node38 = new Node("hi!");
    Graph graph39 = new Graph();
    node38.setOwner(graph39);
    node36.setOwner(graph39);
    Node node43 = new Node("hi!");
    Graph graph44 = new Graph();
    node43.setOwner(graph44);
    graph44.setName("");
    java.lang.String str48 = graph44.name;
    node36.setOwner(graph44);
    node36.setOwnerNameDirectly("hi!");
    graph34.addNode(node36);
    node18.setOwner(graph34);
    graph34.name = "";
    node1.setOwner(graph34);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i57 = node1.getDegree();

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test392"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    node1.setOwner(graph2);
    Graph graph5 = new Graph();
    node1.setOwner(graph5);
    graph5.setName("hi!");
    graph5.name = "hi!";
    Node node12 = new Node("hi!");
    Graph graph13 = new Graph();
    node12.setOwner(graph13);
    node12.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph5.addNode(node12);

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test393"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    graph9.init();
    graph9.init();
    Graph graph17 = Graph.generateGraph();
    Node node19 = new Node("");
    Node node21 = new Node("hi!");
    Graph graph22 = new Graph();
    node21.setOwner(graph22);
    node19.setOwner(graph22);
    Node node26 = new Node("hi!");
    Graph graph27 = new Graph();
    node26.setOwner(graph27);
    graph27.setName("");
    java.lang.String str31 = graph27.name;
    node19.setOwner(graph27);
    node19.setOwnerNameDirectly("hi!");
    graph17.addNode(node19);
    Graph graph36 = Graph.generateGraph();
    node19.setOwner(graph36);
    node19.setOwnerName("hi!");
    node19.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i42 = graph9.getDegree(node19);

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test394"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerNameDirectly("[graph]");
    Node node18 = new Node("");
    Node node20 = new Node("hi!");
    Graph graph21 = new Graph();
    node20.setOwner(graph21);
    node18.setOwner(graph21);
    Node node25 = new Node("hi!");
    Graph graph26 = new Graph();
    node25.setOwner(graph26);
    graph26.setName("");
    java.lang.String str30 = graph26.name;
    node18.setOwner(graph26);
    node18.setOwnerNameDirectly("hi!");
    Graph graph34 = Graph.generateGraph();
    Node node36 = new Node("");
    Node node38 = new Node("hi!");
    Graph graph39 = new Graph();
    node38.setOwner(graph39);
    node36.setOwner(graph39);
    Node node43 = new Node("hi!");
    Graph graph44 = new Graph();
    node43.setOwner(graph44);
    graph44.setName("");
    java.lang.String str48 = graph44.name;
    node36.setOwner(graph44);
    node36.setOwnerNameDirectly("hi!");
    graph34.addNode(node36);
    node18.setOwner(graph34);
    graph34.name = "";
    node1.setOwner(graph34);
    Node node58 = new Node("");
    Graph graph59 = Graph.generateGraph();
    Node node61 = new Node("");
    Node node63 = new Node("hi!");
    Graph graph64 = new Graph();
    node63.setOwner(graph64);
    node61.setOwner(graph64);
    Node node68 = new Node("hi!");
    Graph graph69 = new Graph();
    node68.setOwner(graph69);
    graph69.setName("");
    java.lang.String str73 = graph69.name;
    node61.setOwner(graph69);
    node61.setOwnerNameDirectly("hi!");
    graph59.addNode(node61);
    graph59.name = "";
    node58.setOwner(graph59);
    graph59.name = "hi!";
    graph59.setName("[graph]");
    node1.setOwner(graph59);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i86 = node1.getDegree();

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test395"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    graph2.init();
    node1.setOwner(graph2);
    java.lang.String str6 = graph2.name;
    graph2.init();
    Node node9 = new Node("");
    Node node11 = new Node("hi!");
    Graph graph12 = new Graph();
    node11.setOwner(graph12);
    node9.setOwner(graph12);
    Node node16 = new Node("hi!");
    Graph graph17 = new Graph();
    node16.setOwner(graph17);
    graph17.setName("");
    java.lang.String str21 = graph17.name;
    node9.setOwner(graph17);
    node9.setOwnerNameDirectly("hi!");
    graph2.addNode(node9);
    node9.setOwnerName("");
    Node node29 = new Node("");
    Node node31 = new Node("hi!");
    Graph graph32 = new Graph();
    node31.setOwner(graph32);
    node29.setOwner(graph32);
    Node node36 = new Node("hi!");
    Graph graph37 = new Graph();
    node36.setOwner(graph37);
    graph37.setName("");
    java.lang.String str41 = graph37.name;
    node29.setOwner(graph37);
    node29.setOwnerNameDirectly("hi!");
    node29.setOwnerName("[graph]");
    node29.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node9.addEdge(node29);

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test396"); }


    Node node1 = new Node("hi!");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    graph4.setName("");
    node1.setOwner(graph4);
    node1.setOwnerNameDirectly("hi!");
    Node node12 = new Node("hi!");
    Graph graph13 = new Graph();
    node12.setOwner(graph13);
    graph13.setName("");
    graph13.setName("");
    graph13.init();
    node1.setOwner(graph13);
    Node node22 = new Node("");
    Graph graph23 = Graph.generateGraph();
    java.lang.String str24 = graph23.name;
    graph23.init();
    node22.setOwner(graph23);
    java.lang.String str27 = graph23.name;
    graph23.name = "[graph]";
    graph23.name = "";
    graph23.name = "";
    node1.setOwner(graph23);
    Node node36 = new Node("");
    Node node38 = new Node("hi!");
    Graph graph39 = new Graph();
    node38.setOwner(graph39);
    node36.setOwner(graph39);
    Node node43 = new Node("hi!");
    Graph graph44 = new Graph();
    node43.setOwner(graph44);
    graph44.setName("");
    java.lang.String str48 = graph44.name;
    node36.setOwner(graph44);
    node36.setOwnerNameDirectly("[graph]");
    node36.setOwnerName("");
    Graph graph54 = new Graph();
    graph54.init();
    graph54.setName("");
    java.lang.String str58 = graph54.name;
    node36.setOwner(graph54);
    Graph graph60 = Graph.generateGraph();
    java.lang.String str61 = graph60.name;
    graph60.name = "";
    graph60.name = "[graph]";
    graph60.setName("hi!");
    graph60.name = "[graph]";
    node36.setOwner(graph60);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node36);

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test397"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("");
    node1.setOwnerNameDirectly("[graph]");
    Node node10 = new Node("");
    Graph graph11 = Graph.generateGraph();
    java.lang.String str12 = graph11.name;
    graph11.init();
    node10.setOwner(graph11);
    java.lang.String str15 = graph11.name;
    graph11.name = "[graph]";
    java.lang.String str18 = graph11.name;
    graph11.name = "";
    graph11.init();
    graph11.name = "hi!";
    java.lang.String str24 = graph11.name;
    Node node26 = new Node("hi!");
    Graph graph27 = new Graph();
    node26.setOwner(graph27);
    graph27.setName("");
    graph27.setName("");
    graph27.setName("hi!");
    graph27.init();
    Node node37 = new Node("");
    Node node39 = new Node("hi!");
    Graph graph40 = new Graph();
    node39.setOwner(graph40);
    node37.setOwner(graph40);
    Node node44 = new Node("hi!");
    Graph graph45 = new Graph();
    node44.setOwner(graph45);
    graph45.setName("");
    java.lang.String str49 = graph45.name;
    node37.setOwner(graph45);
    Node node52 = new Node("");
    Graph graph53 = Graph.generateGraph();
    java.lang.String str54 = graph53.name;
    node52.setOwner(graph53);
    graph53.setName("");
    java.lang.String str58 = graph53.name;
    node37.setOwner(graph53);
    Node node61 = new Node("hi!");
    Graph graph62 = new Graph();
    node61.setOwner(graph62);
    graph53.addNode(node61);
    graph27.addNode(node61);
    graph11.addNode(node61);
    node61.setOwnerName("[graph]");
    Node node70 = new Node("");
    Graph graph71 = Graph.generateGraph();
    java.lang.String str72 = graph71.name;
    graph71.init();
    node70.setOwner(graph71);
    java.lang.String str75 = graph71.name;
    graph71.name = "[graph]";
    java.lang.String str78 = graph71.name;
    graph71.name = "";
    graph71.init();
    graph71.init();
    node61.setOwner(graph71);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node61);

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test398"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    java.lang.String str15 = graph9.name;
    Node node17 = new Node("");
    Node node19 = new Node("hi!");
    Graph graph20 = new Graph();
    node19.setOwner(graph20);
    node17.setOwner(graph20);
    Node node24 = new Node("hi!");
    Graph graph25 = new Graph();
    node24.setOwner(graph25);
    graph25.setName("");
    java.lang.String str29 = graph25.name;
    node17.setOwner(graph25);
    node17.setOwnerNameDirectly("[graph]");
    Node node34 = new Node("");
    Node node36 = new Node("hi!");
    Graph graph37 = new Graph();
    node36.setOwner(graph37);
    node34.setOwner(graph37);
    Node node41 = new Node("hi!");
    Graph graph42 = new Graph();
    node41.setOwner(graph42);
    graph42.setName("");
    java.lang.String str46 = graph42.name;
    node34.setOwner(graph42);
    node34.setOwnerNameDirectly("hi!");
    Graph graph50 = Graph.generateGraph();
    Node node52 = new Node("");
    Node node54 = new Node("hi!");
    Graph graph55 = new Graph();
    node54.setOwner(graph55);
    node52.setOwner(graph55);
    Node node59 = new Node("hi!");
    Graph graph60 = new Graph();
    node59.setOwner(graph60);
    graph60.setName("");
    java.lang.String str64 = graph60.name;
    node52.setOwner(graph60);
    node52.setOwnerNameDirectly("hi!");
    graph50.addNode(node52);
    node34.setOwner(graph50);
    graph50.name = "";
    node17.setOwner(graph50);
    node17.setOwnerName("");
    node17.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph9.addNode(node17);

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test399"); }


    Graph graph0 = Graph.generateGraph();
    Node node2 = new Node("");
    Node node4 = new Node("hi!");
    Graph graph5 = new Graph();
    node4.setOwner(graph5);
    node2.setOwner(graph5);
    Node node9 = new Node("hi!");
    Graph graph10 = new Graph();
    node9.setOwner(graph10);
    graph10.setName("");
    java.lang.String str14 = graph10.name;
    node2.setOwner(graph10);
    node2.setOwnerNameDirectly("hi!");
    graph0.addNode(node2);
    Graph graph19 = Graph.generateGraph();
    node2.setOwner(graph19);
    Node node22 = new Node("");
    Graph graph23 = Graph.generateGraph();
    java.lang.String str24 = graph23.name;
    node22.setOwner(graph23);
    Graph graph26 = new Graph();
    node22.setOwner(graph26);
    Node node29 = new Node("hi!");
    Node node31 = new Node("hi!");
    Graph graph32 = new Graph();
    node31.setOwner(graph32);
    graph32.setName("");
    node29.setOwner(graph32);
    java.lang.String str37 = graph32.name;
    node22.setOwner(graph32);
    Node node40 = new Node("");
    Graph graph41 = Graph.generateGraph();
    java.lang.String str42 = graph41.name;
    graph41.init();
    node40.setOwner(graph41);
    java.lang.String str45 = graph41.name;
    node22.setOwner(graph41);
    graph41.name = "";
    node2.setOwner(graph41);
    Node node51 = new Node("");
    Node node53 = new Node("hi!");
    Graph graph54 = new Graph();
    node53.setOwner(graph54);
    node51.setOwner(graph54);
    Node node58 = new Node("hi!");
    Graph graph59 = new Graph();
    node58.setOwner(graph59);
    graph59.setName("");
    java.lang.String str63 = graph59.name;
    node51.setOwner(graph59);
    node51.setOwnerNameDirectly("hi!");
    Graph graph67 = Graph.generateGraph();
    Node node69 = new Node("");
    Node node71 = new Node("hi!");
    Graph graph72 = new Graph();
    node71.setOwner(graph72);
    node69.setOwner(graph72);
    Node node76 = new Node("hi!");
    Graph graph77 = new Graph();
    node76.setOwner(graph77);
    graph77.setName("");
    java.lang.String str81 = graph77.name;
    node69.setOwner(graph77);
    node69.setOwnerNameDirectly("hi!");
    graph67.addNode(node69);
    node51.setOwner(graph67);
    java.lang.String str87 = graph67.name;
    node2.setOwner(graph67);
    node2.setOwnerNameDirectly("");
    node2.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i93 = node2.getDegree();

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test400"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    Node node16 = new Node("");
    Graph graph17 = Graph.generateGraph();
    java.lang.String str18 = graph17.name;
    node16.setOwner(graph17);
    graph17.setName("");
    java.lang.String str22 = graph17.name;
    node1.setOwner(graph17);
    Node node25 = new Node("hi!");
    Graph graph26 = new Graph();
    node25.setOwner(graph26);
    graph17.addNode(node25);
    Node node30 = new Node("");
    Graph graph31 = Graph.generateGraph();
    java.lang.String str32 = graph31.name;
    graph31.init();
    node30.setOwner(graph31);
    java.lang.String str35 = graph31.name;
    graph31.init();
    node25.setOwner(graph31);
    node25.setOwnerName("");
    node25.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i42 = node25.getDegree();

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test401"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerNameDirectly("hi!");
    Graph graph17 = Graph.generateGraph();
    Node node19 = new Node("");
    Node node21 = new Node("hi!");
    Graph graph22 = new Graph();
    node21.setOwner(graph22);
    node19.setOwner(graph22);
    Node node26 = new Node("hi!");
    Graph graph27 = new Graph();
    node26.setOwner(graph27);
    graph27.setName("");
    java.lang.String str31 = graph27.name;
    node19.setOwner(graph27);
    node19.setOwnerNameDirectly("hi!");
    graph17.addNode(node19);
    node1.setOwner(graph17);
    java.lang.String str37 = graph17.name;
    Node node39 = new Node("");
    Node node41 = new Node("hi!");
    Graph graph42 = new Graph();
    node41.setOwner(graph42);
    node39.setOwner(graph42);
    Node node46 = new Node("hi!");
    Graph graph47 = new Graph();
    node46.setOwner(graph47);
    graph47.setName("");
    java.lang.String str51 = graph47.name;
    node39.setOwner(graph47);
    node39.setOwnerNameDirectly("[graph]");
    Node node56 = new Node("");
    Node node58 = new Node("hi!");
    Graph graph59 = new Graph();
    node58.setOwner(graph59);
    node56.setOwner(graph59);
    Node node63 = new Node("hi!");
    Graph graph64 = new Graph();
    node63.setOwner(graph64);
    graph64.setName("");
    java.lang.String str68 = graph64.name;
    node56.setOwner(graph64);
    node56.setOwnerNameDirectly("hi!");
    Graph graph72 = Graph.generateGraph();
    Node node74 = new Node("");
    Node node76 = new Node("hi!");
    Graph graph77 = new Graph();
    node76.setOwner(graph77);
    node74.setOwner(graph77);
    Node node81 = new Node("hi!");
    Graph graph82 = new Graph();
    node81.setOwner(graph82);
    graph82.setName("");
    java.lang.String str86 = graph82.name;
    node74.setOwner(graph82);
    node74.setOwnerNameDirectly("hi!");
    graph72.addNode(node74);
    node56.setOwner(graph72);
    graph72.name = "";
    node39.setOwner(graph72);
    node39.setOwnerName("");
    node39.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i99 = graph17.getDegree(node39);

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test402"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    graph2.init();
    node1.setOwner(graph2);
    java.lang.String str6 = graph2.name;
    graph2.name = "[graph]";
    java.lang.String str9 = graph2.name;
    graph2.name = "";
    graph2.init();
    graph2.name = "hi!";
    java.lang.String str15 = graph2.name;
    Node node17 = new Node("hi!");
    Graph graph18 = new Graph();
    node17.setOwner(graph18);
    graph18.setName("");
    graph18.setName("");
    graph18.setName("hi!");
    graph18.init();
    Node node28 = new Node("");
    Node node30 = new Node("hi!");
    Graph graph31 = new Graph();
    node30.setOwner(graph31);
    node28.setOwner(graph31);
    Node node35 = new Node("hi!");
    Graph graph36 = new Graph();
    node35.setOwner(graph36);
    graph36.setName("");
    java.lang.String str40 = graph36.name;
    node28.setOwner(graph36);
    Node node43 = new Node("");
    Graph graph44 = Graph.generateGraph();
    java.lang.String str45 = graph44.name;
    node43.setOwner(graph44);
    graph44.setName("");
    java.lang.String str49 = graph44.name;
    node28.setOwner(graph44);
    Node node52 = new Node("hi!");
    Graph graph53 = new Graph();
    node52.setOwner(graph53);
    graph44.addNode(node52);
    graph18.addNode(node52);
    graph2.addNode(node52);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i58 = node52.getDegree();

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test403"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    Node node4 = new Node("");
    Node node6 = new Node("hi!");
    Graph graph7 = new Graph();
    node6.setOwner(graph7);
    node4.setOwner(graph7);
    Node node11 = new Node("hi!");
    Graph graph12 = new Graph();
    node11.setOwner(graph12);
    graph12.setName("");
    java.lang.String str16 = graph12.name;
    node4.setOwner(graph12);
    node4.setOwnerNameDirectly("hi!");
    graph2.addNode(node4);
    graph2.name = "";
    node1.setOwner(graph2);
    Node node25 = new Node("hi!");
    Graph graph26 = new Graph();
    node25.setOwner(graph26);
    graph2.addNode(node25);
    Node node30 = new Node("");
    Graph graph31 = Graph.generateGraph();
    java.lang.String str32 = graph31.name;
    graph31.init();
    node30.setOwner(graph31);
    java.lang.String str35 = graph31.name;
    graph31.init();
    graph31.setName("");
    node25.setOwner(graph31);
    Graph graph40 = Graph.generateGraph();
    Node node42 = new Node("");
    Node node44 = new Node("hi!");
    Graph graph45 = new Graph();
    node44.setOwner(graph45);
    node42.setOwner(graph45);
    Node node49 = new Node("hi!");
    Graph graph50 = new Graph();
    node49.setOwner(graph50);
    graph50.setName("");
    java.lang.String str54 = graph50.name;
    node42.setOwner(graph50);
    node42.setOwnerNameDirectly("hi!");
    graph40.addNode(node42);
    graph40.name = "";
    graph40.init();
    graph40.setName("");
    graph40.name = "";
    graph40.init();
    node25.setOwner(graph40);
    Graph graph68 = Graph.generateGraph();
    Node node70 = new Node("");
    Node node72 = new Node("hi!");
    Graph graph73 = new Graph();
    node72.setOwner(graph73);
    node70.setOwner(graph73);
    Node node77 = new Node("hi!");
    Graph graph78 = new Graph();
    node77.setOwner(graph78);
    graph78.setName("");
    java.lang.String str82 = graph78.name;
    node70.setOwner(graph78);
    node70.setOwnerNameDirectly("hi!");
    graph68.addNode(node70);
    node70.setOwnerName("hi!");
    node70.setOwnerNameDirectly("");
    graph40.addNode(node70);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node70.thisIsNotCalled();

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test404"); }


    Graph graph0 = new Graph();
    graph0.init();
    java.lang.String str2 = graph0.name;
    Graph graph3 = Graph.generateGraph();
    Node node5 = new Node("");
    Node node7 = new Node("hi!");
    Graph graph8 = new Graph();
    node7.setOwner(graph8);
    node5.setOwner(graph8);
    Node node12 = new Node("hi!");
    Graph graph13 = new Graph();
    node12.setOwner(graph13);
    graph13.setName("");
    java.lang.String str17 = graph13.name;
    node5.setOwner(graph13);
    node5.setOwnerNameDirectly("hi!");
    graph3.addNode(node5);
    Graph graph22 = Graph.generateGraph();
    node5.setOwner(graph22);
    node5.setOwnerName("hi!");
    node5.setOwnerNameDirectly("[graph]");
    Node node29 = new Node("");
    Node node31 = new Node("hi!");
    Graph graph32 = new Graph();
    node31.setOwner(graph32);
    node29.setOwner(graph32);
    Node node36 = new Node("hi!");
    Graph graph37 = new Graph();
    node36.setOwner(graph37);
    graph37.setName("");
    java.lang.String str41 = graph37.name;
    node29.setOwner(graph37);
    node29.setOwnerNameDirectly("[graph]");
    Graph graph45 = Graph.generateGraph();
    Node node47 = new Node("");
    Node node49 = new Node("hi!");
    Graph graph50 = new Graph();
    node49.setOwner(graph50);
    node47.setOwner(graph50);
    Node node54 = new Node("hi!");
    Graph graph55 = new Graph();
    node54.setOwner(graph55);
    graph55.setName("");
    java.lang.String str59 = graph55.name;
    node47.setOwner(graph55);
    node47.setOwnerNameDirectly("hi!");
    graph45.addNode(node47);
    node29.setOwner(graph45);
    node29.setOwnerName("[graph]");
    node29.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node5, node29);

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test405"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    Node node4 = new Node("");
    Node node6 = new Node("hi!");
    Graph graph7 = new Graph();
    node6.setOwner(graph7);
    node4.setOwner(graph7);
    Node node11 = new Node("hi!");
    Graph graph12 = new Graph();
    node11.setOwner(graph12);
    graph12.setName("");
    java.lang.String str16 = graph12.name;
    node4.setOwner(graph12);
    node4.setOwnerNameDirectly("hi!");
    graph2.addNode(node4);
    graph2.name = "";
    node1.setOwner(graph2);
    Node node25 = new Node("hi!");
    Graph graph26 = new Graph();
    node25.setOwner(graph26);
    graph2.addNode(node25);
    node25.setOwnerNameDirectly("");
    node25.setOwnerNameDirectly("hi!");
    Node node34 = new Node("");
    Node node36 = new Node("hi!");
    Graph graph37 = new Graph();
    node36.setOwner(graph37);
    node34.setOwner(graph37);
    Node node41 = new Node("hi!");
    Graph graph42 = new Graph();
    node41.setOwner(graph42);
    graph42.setName("");
    java.lang.String str46 = graph42.name;
    node34.setOwner(graph42);
    graph42.init();
    graph42.init();
    Node node51 = new Node("");
    Node node53 = new Node("hi!");
    Graph graph54 = new Graph();
    node53.setOwner(graph54);
    node51.setOwner(graph54);
    Node node58 = new Node("hi!");
    Graph graph59 = new Graph();
    node58.setOwner(graph59);
    graph59.setName("");
    java.lang.String str63 = graph59.name;
    node51.setOwner(graph59);
    node51.setOwnerNameDirectly("[graph]");
    node51.setOwnerName("");
    node51.setOwnerName("[graph]");
    graph42.addNode(node51);
    node51.setOwnerNameDirectly("hi!");
    node51.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node25.addEdge(node51);

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test406"); }


    Node node1 = new Node("hi!");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    graph4.setName("");
    node1.setOwner(graph4);
    graph4.init();
    graph4.setName("");
    Node node13 = new Node("");
    Node node15 = new Node("hi!");
    Graph graph16 = new Graph();
    node15.setOwner(graph16);
    node13.setOwner(graph16);
    Node node20 = new Node("hi!");
    Graph graph21 = new Graph();
    node20.setOwner(graph21);
    graph21.setName("");
    java.lang.String str25 = graph21.name;
    node13.setOwner(graph21);
    node13.setOwnerName("hi!");
    node13.setOwnerName("hi!");
    graph4.addNode(node13);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node13.thisIsNotCalled();

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test407"); }


    Node node1 = new Node("hi!");
    Graph graph2 = new Graph();
    node1.setOwner(graph2);
    graph2.setName("");
    graph2.setName("");
    graph2.setName("hi!");
    graph2.init();
    graph2.setName("");
    Graph graph13 = Graph.generateGraph();
    Node node15 = new Node("");
    Node node17 = new Node("hi!");
    Graph graph18 = new Graph();
    node17.setOwner(graph18);
    node15.setOwner(graph18);
    Node node22 = new Node("hi!");
    Graph graph23 = new Graph();
    node22.setOwner(graph23);
    graph23.setName("");
    java.lang.String str27 = graph23.name;
    node15.setOwner(graph23);
    node15.setOwnerNameDirectly("hi!");
    graph13.addNode(node15);
    Graph graph32 = Graph.generateGraph();
    node15.setOwner(graph32);
    Node node35 = new Node("");
    Graph graph36 = Graph.generateGraph();
    java.lang.String str37 = graph36.name;
    node35.setOwner(graph36);
    Graph graph39 = new Graph();
    node35.setOwner(graph39);
    Node node42 = new Node("hi!");
    Node node44 = new Node("hi!");
    Graph graph45 = new Graph();
    node44.setOwner(graph45);
    graph45.setName("");
    node42.setOwner(graph45);
    java.lang.String str50 = graph45.name;
    node35.setOwner(graph45);
    Node node53 = new Node("");
    Graph graph54 = Graph.generateGraph();
    java.lang.String str55 = graph54.name;
    graph54.init();
    node53.setOwner(graph54);
    java.lang.String str58 = graph54.name;
    node35.setOwner(graph54);
    graph54.name = "";
    node15.setOwner(graph54);
    node15.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i65 = graph2.getDegree(node15);

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test408"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Node node10 = new Node("hi!");
    Graph graph11 = new Graph();
    node10.setOwner(graph11);
    graph11.setName("");
    node8.setOwner(graph11);
    node8.setOwnerNameDirectly("hi!");
    Node node19 = new Node("hi!");
    Graph graph20 = new Graph();
    node19.setOwner(graph20);
    graph20.setName("");
    graph20.setName("");
    graph20.init();
    node8.setOwner(graph20);
    node8.setOwnerNameDirectly("");
    Graph graph30 = new Graph();
    graph30.init();
    java.lang.String str32 = graph30.name;
    graph30.init();
    graph30.name = "hi!";
    graph30.setName("hi!");
    node8.setOwner(graph30);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node8);

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test409"); }


    Node node1 = new Node("hi!");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    graph4.setName("");
    node1.setOwner(graph4);
    node1.setOwnerNameDirectly("hi!");
    Node node12 = new Node("hi!");
    Graph graph13 = new Graph();
    node12.setOwner(graph13);
    graph13.setName("");
    graph13.setName("");
    graph13.setName("hi!");
    graph13.init();
    graph13.setName("[graph]");
    node1.setOwner(graph13);
    graph13.name = "";
    Node node28 = new Node("hi!");
    Graph graph29 = new Graph();
    node28.setOwner(graph29);
    node28.setOwnerNameDirectly("[graph]");
    Graph graph33 = new Graph();
    graph33.init();
    graph33.setName("");
    Node node38 = new Node("");
    graph33.addNode(node38);
    graph33.name = "";
    node28.setOwner(graph33);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i43 = graph13.getDegree(node28);

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test410"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    node1.setOwner(graph2);
    Graph graph5 = new Graph();
    node1.setOwner(graph5);
    graph5.setName("[graph]");
    java.lang.String str9 = graph5.name;
    Node node11 = new Node("");
    Node node13 = new Node("hi!");
    Graph graph14 = new Graph();
    node13.setOwner(graph14);
    node11.setOwner(graph14);
    Node node18 = new Node("hi!");
    Graph graph19 = new Graph();
    node18.setOwner(graph19);
    graph19.setName("");
    java.lang.String str23 = graph19.name;
    node11.setOwner(graph19);
    node11.setOwnerName("hi!");
    Graph graph27 = new Graph();
    graph27.init();
    node11.setOwner(graph27);
    node11.setOwnerNameDirectly("");
    Node node33 = new Node("");
    Graph graph34 = Graph.generateGraph();
    Node node36 = new Node("");
    Node node38 = new Node("hi!");
    Graph graph39 = new Graph();
    node38.setOwner(graph39);
    node36.setOwner(graph39);
    Node node43 = new Node("hi!");
    Graph graph44 = new Graph();
    node43.setOwner(graph44);
    graph44.setName("");
    java.lang.String str48 = graph44.name;
    node36.setOwner(graph44);
    node36.setOwnerNameDirectly("hi!");
    graph34.addNode(node36);
    graph34.name = "";
    node33.setOwner(graph34);
    node11.setOwner(graph34);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph5.addNode(node11);

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test411"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerNameDirectly("[graph]");
    node1.setOwnerName("");
    node1.setOwnerName("[graph]");
    node1.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i23 = node1.getDegree();

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test412"); }


    Graph graph0 = Graph.generateGraph();
    Node node2 = new Node("");
    Node node4 = new Node("hi!");
    Graph graph5 = new Graph();
    node4.setOwner(graph5);
    node2.setOwner(graph5);
    Node node9 = new Node("hi!");
    Graph graph10 = new Graph();
    node9.setOwner(graph10);
    graph10.setName("");
    java.lang.String str14 = graph10.name;
    node2.setOwner(graph10);
    node2.setOwnerNameDirectly("hi!");
    graph0.addNode(node2);
    node2.setOwnerName("hi!");
    node2.setOwnerNameDirectly("");
    Node node24 = new Node("hi!");
    Node node26 = new Node("hi!");
    Graph graph27 = new Graph();
    node26.setOwner(graph27);
    graph27.setName("");
    node24.setOwner(graph27);
    java.lang.String str32 = graph27.name;
    node2.setOwner(graph27);
    Graph graph34 = Graph.generateGraph();
    Node node36 = new Node("");
    Node node38 = new Node("hi!");
    Graph graph39 = new Graph();
    node38.setOwner(graph39);
    node36.setOwner(graph39);
    Node node43 = new Node("hi!");
    Graph graph44 = new Graph();
    node43.setOwner(graph44);
    graph44.setName("");
    java.lang.String str48 = graph44.name;
    node36.setOwner(graph44);
    node36.setOwnerNameDirectly("hi!");
    graph34.addNode(node36);
    Graph graph53 = Graph.generateGraph();
    node36.setOwner(graph53);
    graph53.setName("hi!");
    Graph graph57 = Graph.generateGraph();
    java.lang.String str58 = graph57.name;
    graph57.init();
    Graph graph60 = Graph.generateGraph();
    Node node62 = new Node("");
    Node node64 = new Node("hi!");
    Graph graph65 = new Graph();
    node64.setOwner(graph65);
    node62.setOwner(graph65);
    Node node69 = new Node("hi!");
    Graph graph70 = new Graph();
    node69.setOwner(graph70);
    graph70.setName("");
    java.lang.String str74 = graph70.name;
    node62.setOwner(graph70);
    node62.setOwnerNameDirectly("hi!");
    graph60.addNode(node62);
    node62.setOwnerNameDirectly("hi!");
    node62.setOwnerNameDirectly("hi!");
    node62.setOwnerNameDirectly("[graph]");
    node62.setOwnerNameDirectly("[graph]");
    graph57.addNode(node62);
    graph53.addNode(node62);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i89 = graph27.getDegree(node62);

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test413"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerNameDirectly("[graph]");
    node1.setOwnerName("");
    Graph graph19 = new Graph();
    graph19.init();
    graph19.setName("");
    java.lang.String str23 = graph19.name;
    node1.setOwner(graph19);
    java.lang.String str25 = graph19.name;
    graph19.init();
    Graph graph27 = Graph.generateGraph();
    Node node29 = new Node("");
    Node node31 = new Node("hi!");
    Graph graph32 = new Graph();
    node31.setOwner(graph32);
    node29.setOwner(graph32);
    Node node36 = new Node("hi!");
    Graph graph37 = new Graph();
    node36.setOwner(graph37);
    graph37.setName("");
    java.lang.String str41 = graph37.name;
    node29.setOwner(graph37);
    node29.setOwnerNameDirectly("hi!");
    graph27.addNode(node29);
    node29.setOwnerName("hi!");
    node29.setOwnerName("");
    graph19.addNode(node29);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node29.thisIsNotCalled();

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test414"); }


    Graph graph0 = Graph.generateGraph();
    Node node2 = new Node("");
    Node node4 = new Node("hi!");
    Graph graph5 = new Graph();
    node4.setOwner(graph5);
    node2.setOwner(graph5);
    Node node9 = new Node("hi!");
    Graph graph10 = new Graph();
    node9.setOwner(graph10);
    graph10.setName("");
    java.lang.String str14 = graph10.name;
    node2.setOwner(graph10);
    node2.setOwnerNameDirectly("hi!");
    graph0.addNode(node2);
    Graph graph19 = Graph.generateGraph();
    node2.setOwner(graph19);
    Node node22 = new Node("hi!");
    Node node24 = new Node("hi!");
    Graph graph25 = new Graph();
    node24.setOwner(graph25);
    graph25.setName("");
    node22.setOwner(graph25);
    graph19.addNode(node22);
    node22.setOwnerName("");
    Graph graph33 = Graph.generateGraph();
    Node node35 = new Node("");
    Node node37 = new Node("hi!");
    Graph graph38 = new Graph();
    node37.setOwner(graph38);
    node35.setOwner(graph38);
    Node node42 = new Node("hi!");
    Graph graph43 = new Graph();
    node42.setOwner(graph43);
    graph43.setName("");
    java.lang.String str47 = graph43.name;
    node35.setOwner(graph43);
    node35.setOwnerNameDirectly("hi!");
    graph33.addNode(node35);
    Graph graph52 = Graph.generateGraph();
    node35.setOwner(graph52);
    Node node55 = new Node("hi!");
    Node node57 = new Node("hi!");
    Graph graph58 = new Graph();
    node57.setOwner(graph58);
    graph58.setName("");
    node55.setOwner(graph58);
    graph52.addNode(node55);
    node55.setOwnerName("");
    Node node67 = new Node("");
    Graph graph68 = Graph.generateGraph();
    java.lang.String str69 = graph68.name;
    graph68.init();
    node67.setOwner(graph68);
    java.lang.String str72 = graph68.name;
    graph68.setName("");
    graph68.setName("hi!");
    graph68.init();
    graph68.name = "[graph]";
    node55.setOwner(graph68);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node22.addEdge(node55);

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test415"); }


    Node node1 = new Node("hi!");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    graph4.setName("");
    node1.setOwner(graph4);
    graph4.init();
    Node node11 = new Node("");
    Graph graph12 = Graph.generateGraph();
    java.lang.String str13 = graph12.name;
    node11.setOwner(graph12);
    Graph graph15 = new Graph();
    node11.setOwner(graph15);
    Node node18 = new Node("hi!");
    Node node20 = new Node("hi!");
    Graph graph21 = new Graph();
    node20.setOwner(graph21);
    graph21.setName("");
    node18.setOwner(graph21);
    java.lang.String str26 = graph21.name;
    node11.setOwner(graph21);
    Node node29 = new Node("");
    Graph graph30 = Graph.generateGraph();
    java.lang.String str31 = graph30.name;
    graph30.init();
    node29.setOwner(graph30);
    java.lang.String str34 = graph30.name;
    node11.setOwner(graph30);
    graph4.addNode(node11);
    Graph graph37 = Graph.generateGraph();
    java.lang.String str38 = graph37.name;
    graph37.name = "";
    graph37.name = "[graph]";
    graph37.setName("hi!");
    graph37.name = "";
    java.lang.String str47 = graph37.name;
    graph37.setName("hi!");
    node11.setOwner(graph37);
    Node node52 = new Node("");
    Graph graph53 = Graph.generateGraph();
    Node node55 = new Node("");
    Node node57 = new Node("hi!");
    Graph graph58 = new Graph();
    node57.setOwner(graph58);
    node55.setOwner(graph58);
    Node node62 = new Node("hi!");
    Graph graph63 = new Graph();
    node62.setOwner(graph63);
    graph63.setName("");
    java.lang.String str67 = graph63.name;
    node55.setOwner(graph63);
    node55.setOwnerNameDirectly("hi!");
    graph53.addNode(node55);
    graph53.name = "";
    node52.setOwner(graph53);
    Node node76 = new Node("hi!");
    Graph graph77 = new Graph();
    node76.setOwner(graph77);
    graph53.addNode(node76);
    node76.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node11.addEdge(node76);

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test416"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("");
    node1.setOwnerNameDirectly("[graph]");
    Node node10 = new Node("hi!");
    Node node12 = new Node("hi!");
    Graph graph13 = new Graph();
    node12.setOwner(graph13);
    graph13.setName("");
    node10.setOwner(graph13);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node10);

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test417"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    node1.setOwner(graph2);
    Graph graph5 = new Graph();
    node1.setOwner(graph5);
    Node node8 = new Node("hi!");
    Node node10 = new Node("hi!");
    Graph graph11 = new Graph();
    node10.setOwner(graph11);
    graph11.setName("");
    node8.setOwner(graph11);
    java.lang.String str16 = graph11.name;
    node1.setOwner(graph11);
    Graph graph18 = new Graph();
    graph18.init();
    graph18.setName("");
    Node node23 = new Node("");
    graph18.addNode(node23);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node23);

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test418"); }


    Node node1 = new Node("hi!");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    graph4.setName("");
    node1.setOwner(graph4);
    graph4.setName("");
    graph4.setName("");
    graph4.setName("hi!");
    Node node16 = new Node("");
    Graph graph17 = Graph.generateGraph();
    java.lang.String str18 = graph17.name;
    graph17.init();
    node16.setOwner(graph17);
    java.lang.String str21 = graph17.name;
    graph17.name = "[graph]";
    graph17.name = "hi!";
    java.lang.String str26 = graph17.name;
    Node node28 = new Node("");
    Node node30 = new Node("hi!");
    Graph graph31 = new Graph();
    node30.setOwner(graph31);
    node28.setOwner(graph31);
    Node node35 = new Node("hi!");
    Graph graph36 = new Graph();
    node35.setOwner(graph36);
    graph36.setName("");
    java.lang.String str40 = graph36.name;
    node28.setOwner(graph36);
    node28.setOwnerNameDirectly("[graph]");
    node28.setOwnerName("");
    node28.setOwnerName("[graph]");
    graph17.addNode(node28);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph4.addNode(node28);

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test419"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerNameDirectly("[graph]");
    Graph graph17 = Graph.generateGraph();
    Node node19 = new Node("");
    Node node21 = new Node("hi!");
    Graph graph22 = new Graph();
    node21.setOwner(graph22);
    node19.setOwner(graph22);
    Node node26 = new Node("hi!");
    Graph graph27 = new Graph();
    node26.setOwner(graph27);
    graph27.setName("");
    java.lang.String str31 = graph27.name;
    node19.setOwner(graph27);
    node19.setOwnerNameDirectly("hi!");
    graph17.addNode(node19);
    node1.setOwner(graph17);
    node1.setOwnerName("[graph]");
    Node node40 = new Node("hi!");
    Node node42 = new Node("hi!");
    Graph graph43 = new Graph();
    node42.setOwner(graph43);
    graph43.setName("");
    node40.setOwner(graph43);
    graph43.name = "hi!";
    node1.setOwner(graph43);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i51 = node1.getDegree();

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test420"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerNameDirectly("[graph]");
    Graph graph17 = Graph.generateGraph();
    Node node19 = new Node("");
    Node node21 = new Node("hi!");
    Graph graph22 = new Graph();
    node21.setOwner(graph22);
    node19.setOwner(graph22);
    Node node26 = new Node("hi!");
    Graph graph27 = new Graph();
    node26.setOwner(graph27);
    graph27.setName("");
    java.lang.String str31 = graph27.name;
    node19.setOwner(graph27);
    node19.setOwnerNameDirectly("hi!");
    graph17.addNode(node19);
    node1.setOwner(graph17);
    node1.setOwnerName("[graph]");
    node1.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test421"); }


    Graph graph0 = Graph.generateGraph();
    java.lang.String str1 = graph0.name;
    graph0.name = "";
    graph0.name = "[graph]";
    graph0.setName("hi!");
    graph0.name = "";
    graph0.init();
    graph0.name = "hi!";
    Node node14 = new Node("");
    Graph graph15 = Graph.generateGraph();
    java.lang.String str16 = graph15.name;
    node14.setOwner(graph15);
    Graph graph18 = new Graph();
    node14.setOwner(graph18);
    node14.setOwnerNameDirectly("");
    graph0.addNode(node14);
    Graph graph23 = Graph.generateGraph();
    Node node25 = new Node("");
    Node node27 = new Node("hi!");
    Graph graph28 = new Graph();
    node27.setOwner(graph28);
    node25.setOwner(graph28);
    Node node32 = new Node("hi!");
    Graph graph33 = new Graph();
    node32.setOwner(graph33);
    graph33.setName("");
    java.lang.String str37 = graph33.name;
    node25.setOwner(graph33);
    node25.setOwnerNameDirectly("hi!");
    graph23.addNode(node25);
    node25.setOwnerName("hi!");
    node25.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node14.addEdge(node25);

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test422"); }


    Node node1 = new Node("hi!");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    graph4.setName("");
    node1.setOwner(graph4);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerNameDirectly("[graph]");
    Node node14 = new Node("");
    Graph graph15 = Graph.generateGraph();
    java.lang.String str16 = graph15.name;
    graph15.init();
    node14.setOwner(graph15);
    java.lang.String str19 = graph15.name;
    graph15.init();
    node1.setOwner(graph15);
    Node node23 = new Node("hi!");
    Node node25 = new Node("hi!");
    Graph graph26 = new Graph();
    node25.setOwner(graph26);
    graph26.setName("");
    node23.setOwner(graph26);
    node23.setOwnerNameDirectly("hi!");
    node23.setOwnerNameDirectly("[graph]");
    Node node36 = new Node("");
    Graph graph37 = Graph.generateGraph();
    java.lang.String str38 = graph37.name;
    graph37.init();
    node36.setOwner(graph37);
    java.lang.String str41 = graph37.name;
    graph37.init();
    node23.setOwner(graph37);
    graph15.addNode(node23);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i45 = node23.getDegree();

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test423"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    graph2.init();
    node1.setOwner(graph2);
    java.lang.String str6 = graph2.name;
    graph2.setName("");
    graph2.setName("hi!");
    graph2.name = "hi!";
    Node node14 = new Node("hi!");
    Node node16 = new Node("hi!");
    Graph graph17 = new Graph();
    node16.setOwner(graph17);
    graph17.setName("");
    node14.setOwner(graph17);
    node14.setOwnerNameDirectly("hi!");
    node14.setOwnerNameDirectly("[graph]");
    graph2.addNode(node14);
    graph2.init();
    java.lang.String str28 = graph2.name;
    Node node30 = new Node("");
    Node node32 = new Node("hi!");
    Graph graph33 = new Graph();
    node32.setOwner(graph33);
    node30.setOwner(graph33);
    Node node37 = new Node("hi!");
    Graph graph38 = new Graph();
    node37.setOwner(graph38);
    graph38.setName("");
    java.lang.String str42 = graph38.name;
    node30.setOwner(graph38);
    node30.setOwnerNameDirectly("hi!");
    Graph graph46 = Graph.generateGraph();
    Node node48 = new Node("");
    Node node50 = new Node("hi!");
    Graph graph51 = new Graph();
    node50.setOwner(graph51);
    node48.setOwner(graph51);
    Node node55 = new Node("hi!");
    Graph graph56 = new Graph();
    node55.setOwner(graph56);
    graph56.setName("");
    java.lang.String str60 = graph56.name;
    node48.setOwner(graph56);
    node48.setOwnerNameDirectly("hi!");
    graph46.addNode(node48);
    node30.setOwner(graph46);
    graph2.addNode(node30);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i67 = node30.getDegree();

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test424"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    graph2.init();
    node1.setOwner(graph2);
    java.lang.String str6 = graph2.name;
    graph2.name = "[graph]";
    graph2.name = "";
    graph2.setName("");
    graph2.init();
    Node node15 = new Node("");
    Graph graph16 = Graph.generateGraph();
    java.lang.String str17 = graph16.name;
    graph16.init();
    node15.setOwner(graph16);
    java.lang.String str20 = graph16.name;
    graph16.name = "[graph]";
    java.lang.String str23 = graph16.name;
    graph16.name = "";
    graph16.init();
    graph16.name = "hi!";
    java.lang.String str29 = graph16.name;
    Node node31 = new Node("hi!");
    Graph graph32 = new Graph();
    node31.setOwner(graph32);
    graph32.setName("");
    graph32.setName("");
    graph32.setName("hi!");
    graph32.init();
    Node node42 = new Node("");
    Node node44 = new Node("hi!");
    Graph graph45 = new Graph();
    node44.setOwner(graph45);
    node42.setOwner(graph45);
    Node node49 = new Node("hi!");
    Graph graph50 = new Graph();
    node49.setOwner(graph50);
    graph50.setName("");
    java.lang.String str54 = graph50.name;
    node42.setOwner(graph50);
    Node node57 = new Node("");
    Graph graph58 = Graph.generateGraph();
    java.lang.String str59 = graph58.name;
    node57.setOwner(graph58);
    graph58.setName("");
    java.lang.String str63 = graph58.name;
    node42.setOwner(graph58);
    Node node66 = new Node("hi!");
    Graph graph67 = new Graph();
    node66.setOwner(graph67);
    graph58.addNode(node66);
    graph32.addNode(node66);
    graph16.addNode(node66);
    node66.setOwnerName("[graph]");
    Node node75 = new Node("");
    Graph graph76 = Graph.generateGraph();
    java.lang.String str77 = graph76.name;
    graph76.init();
    node75.setOwner(graph76);
    java.lang.String str80 = graph76.name;
    graph76.name = "[graph]";
    java.lang.String str83 = graph76.name;
    graph76.name = "";
    graph76.init();
    graph76.init();
    node66.setOwner(graph76);
    node66.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i91 = graph2.getDegree(node66);

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test425"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    graph2.init();
    node1.setOwner(graph2);
    java.lang.String str6 = graph2.name;
    graph2.init();
    Node node9 = new Node("");
    Node node11 = new Node("hi!");
    Graph graph12 = new Graph();
    node11.setOwner(graph12);
    node9.setOwner(graph12);
    Node node16 = new Node("hi!");
    Graph graph17 = new Graph();
    node16.setOwner(graph17);
    graph17.setName("");
    java.lang.String str21 = graph17.name;
    node9.setOwner(graph17);
    node9.setOwnerNameDirectly("hi!");
    graph2.addNode(node9);
    node9.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i28 = node9.getDegree();

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test426"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    Node node16 = new Node("");
    Graph graph17 = Graph.generateGraph();
    java.lang.String str18 = graph17.name;
    node16.setOwner(graph17);
    graph17.setName("");
    java.lang.String str22 = graph17.name;
    node1.setOwner(graph17);
    Node node25 = new Node("hi!");
    Graph graph26 = new Graph();
    node25.setOwner(graph26);
    graph17.addNode(node25);
    Node node30 = new Node("");
    Graph graph31 = Graph.generateGraph();
    java.lang.String str32 = graph31.name;
    graph31.init();
    node30.setOwner(graph31);
    java.lang.String str35 = graph31.name;
    graph31.init();
    node25.setOwner(graph31);
    node25.setOwnerName("");
    node25.setOwnerNameDirectly("[graph]");
    Node node43 = new Node("hi!");
    Graph graph44 = new Graph();
    node43.setOwner(graph44);
    graph44.init();
    graph44.init();
    node25.setOwner(graph44);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i49 = node25.getDegree();

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test427"); }


    Node node1 = new Node("hi!");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    graph4.setName("");
    node1.setOwner(graph4);
    node1.setOwnerNameDirectly("hi!");
    Node node12 = new Node("hi!");
    Graph graph13 = new Graph();
    node12.setOwner(graph13);
    graph13.setName("");
    graph13.setName("");
    graph13.setName("hi!");
    graph13.init();
    graph13.setName("[graph]");
    node1.setOwner(graph13);
    Graph graph25 = Graph.generateGraph();
    Node node27 = new Node("");
    Node node29 = new Node("hi!");
    Graph graph30 = new Graph();
    node29.setOwner(graph30);
    node27.setOwner(graph30);
    Node node34 = new Node("hi!");
    Graph graph35 = new Graph();
    node34.setOwner(graph35);
    graph35.setName("");
    java.lang.String str39 = graph35.name;
    node27.setOwner(graph35);
    node27.setOwnerNameDirectly("hi!");
    graph25.addNode(node27);
    node27.setOwnerName("hi!");
    node27.setOwnerName("");
    graph13.addNode(node27);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node27.thisIsNotCalled();

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test428"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("[graph]");
    Node node20 = new Node("");
    Node node22 = new Node("hi!");
    Graph graph23 = new Graph();
    node22.setOwner(graph23);
    node20.setOwner(graph23);
    Node node27 = new Node("hi!");
    Graph graph28 = new Graph();
    node27.setOwner(graph28);
    graph28.setName("");
    java.lang.String str32 = graph28.name;
    node20.setOwner(graph28);
    node1.setOwner(graph28);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test429"); }


    Graph graph0 = Graph.generateGraph();
    Node node2 = new Node("");
    Node node4 = new Node("hi!");
    Graph graph5 = new Graph();
    node4.setOwner(graph5);
    node2.setOwner(graph5);
    Node node9 = new Node("hi!");
    Graph graph10 = new Graph();
    node9.setOwner(graph10);
    graph10.setName("");
    java.lang.String str14 = graph10.name;
    node2.setOwner(graph10);
    node2.setOwnerNameDirectly("hi!");
    graph0.addNode(node2);
    Graph graph19 = Graph.generateGraph();
    node2.setOwner(graph19);
    Node node22 = new Node("");
    Graph graph23 = Graph.generateGraph();
    java.lang.String str24 = graph23.name;
    node22.setOwner(graph23);
    Graph graph26 = new Graph();
    node22.setOwner(graph26);
    Node node29 = new Node("hi!");
    Node node31 = new Node("hi!");
    Graph graph32 = new Graph();
    node31.setOwner(graph32);
    graph32.setName("");
    node29.setOwner(graph32);
    java.lang.String str37 = graph32.name;
    node22.setOwner(graph32);
    Node node40 = new Node("");
    Graph graph41 = Graph.generateGraph();
    java.lang.String str42 = graph41.name;
    graph41.init();
    node40.setOwner(graph41);
    java.lang.String str45 = graph41.name;
    node22.setOwner(graph41);
    graph41.name = "";
    node2.setOwner(graph41);
    node2.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node2.thisIsNotCalled();

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test430"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerNameDirectly("[graph]");
    node1.setOwnerName("");
    Graph graph19 = new Graph();
    graph19.init();
    graph19.setName("");
    java.lang.String str23 = graph19.name;
    node1.setOwner(graph19);
    Graph graph25 = Graph.generateGraph();
    Node node27 = new Node("");
    Node node29 = new Node("hi!");
    Graph graph30 = new Graph();
    node29.setOwner(graph30);
    node27.setOwner(graph30);
    Node node34 = new Node("hi!");
    Graph graph35 = new Graph();
    node34.setOwner(graph35);
    graph35.setName("");
    java.lang.String str39 = graph35.name;
    node27.setOwner(graph35);
    node27.setOwnerNameDirectly("hi!");
    graph25.addNode(node27);
    node27.setOwnerNameDirectly("hi!");
    node27.setOwnerNameDirectly("hi!");
    node27.setOwnerNameDirectly("[graph]");
    graph19.addNode(node27);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node27.thisIsNotCalled();

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test431"); }


    Graph graph0 = Graph.generateGraph();
    Node node2 = new Node("");
    Node node4 = new Node("hi!");
    Graph graph5 = new Graph();
    node4.setOwner(graph5);
    node2.setOwner(graph5);
    Node node9 = new Node("hi!");
    Graph graph10 = new Graph();
    node9.setOwner(graph10);
    graph10.setName("");
    java.lang.String str14 = graph10.name;
    node2.setOwner(graph10);
    node2.setOwnerNameDirectly("hi!");
    graph0.addNode(node2);
    graph0.name = "";
    Node node22 = new Node("");
    Graph graph23 = Graph.generateGraph();
    java.lang.String str24 = graph23.name;
    graph23.init();
    node22.setOwner(graph23);
    java.lang.String str27 = graph23.name;
    graph23.name = "[graph]";
    java.lang.String str30 = graph23.name;
    graph23.name = "";
    Node node34 = new Node("hi!");
    Node node36 = new Node("hi!");
    Graph graph37 = new Graph();
    node36.setOwner(graph37);
    graph37.setName("");
    node34.setOwner(graph37);
    node34.setOwnerNameDirectly("hi!");
    graph23.addNode(node34);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i45 = graph0.getDegree(node34);

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test432"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    Node node4 = new Node("");
    Node node6 = new Node("hi!");
    Graph graph7 = new Graph();
    node6.setOwner(graph7);
    node4.setOwner(graph7);
    Node node11 = new Node("hi!");
    Graph graph12 = new Graph();
    node11.setOwner(graph12);
    graph12.setName("");
    java.lang.String str16 = graph12.name;
    node4.setOwner(graph12);
    node4.setOwnerNameDirectly("hi!");
    graph2.addNode(node4);
    graph2.name = "";
    node1.setOwner(graph2);
    Node node25 = new Node("");
    Graph graph26 = Graph.generateGraph();
    java.lang.String str27 = graph26.name;
    graph26.init();
    node25.setOwner(graph26);
    java.lang.String str30 = graph26.name;
    graph26.init();
    Node node33 = new Node("");
    Node node35 = new Node("hi!");
    Graph graph36 = new Graph();
    node35.setOwner(graph36);
    node33.setOwner(graph36);
    Node node40 = new Node("hi!");
    Graph graph41 = new Graph();
    node40.setOwner(graph41);
    graph41.setName("");
    java.lang.String str45 = graph41.name;
    node33.setOwner(graph41);
    node33.setOwnerNameDirectly("hi!");
    graph26.addNode(node33);
    node1.setOwner(graph26);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test433"); }


    Graph graph0 = Graph.generateGraph();
    Node node2 = new Node("");
    Node node4 = new Node("hi!");
    Graph graph5 = new Graph();
    node4.setOwner(graph5);
    node2.setOwner(graph5);
    Node node9 = new Node("hi!");
    Graph graph10 = new Graph();
    node9.setOwner(graph10);
    graph10.setName("");
    java.lang.String str14 = graph10.name;
    node2.setOwner(graph10);
    node2.setOwnerNameDirectly("hi!");
    graph0.addNode(node2);
    Graph graph19 = Graph.generateGraph();
    node2.setOwner(graph19);
    Node node22 = new Node("hi!");
    Node node24 = new Node("hi!");
    Graph graph25 = new Graph();
    node24.setOwner(graph25);
    graph25.setName("");
    node22.setOwner(graph25);
    graph19.addNode(node22);
    node22.setOwnerName("");
    Node node34 = new Node("");
    Graph graph35 = Graph.generateGraph();
    java.lang.String str36 = graph35.name;
    graph35.init();
    node34.setOwner(graph35);
    java.lang.String str39 = graph35.name;
    graph35.setName("");
    graph35.setName("hi!");
    graph35.init();
    graph35.name = "[graph]";
    node22.setOwner(graph35);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node22.thisIsNotCalled();

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test434"); }


    Node node1 = new Node("hi!");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    graph4.setName("");
    node1.setOwner(graph4);
    node1.setOwnerNameDirectly("hi!");
    Node node12 = new Node("hi!");
    Graph graph13 = new Graph();
    node12.setOwner(graph13);
    graph13.setName("");
    graph13.setName("");
    graph13.setName("hi!");
    graph13.init();
    graph13.setName("[graph]");
    node1.setOwner(graph13);
    node1.setOwnerNameDirectly("[graph]");
    node1.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i29 = node1.getDegree();

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test435"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    node1.setOwner(graph2);
    Graph graph5 = new Graph();
    node1.setOwner(graph5);
    Node node8 = new Node("hi!");
    Node node10 = new Node("hi!");
    Graph graph11 = new Graph();
    node10.setOwner(graph11);
    graph11.setName("");
    node8.setOwner(graph11);
    java.lang.String str16 = graph11.name;
    node1.setOwner(graph11);
    Node node19 = new Node("");
    Graph graph20 = Graph.generateGraph();
    Node node22 = new Node("");
    Node node24 = new Node("hi!");
    Graph graph25 = new Graph();
    node24.setOwner(graph25);
    node22.setOwner(graph25);
    Node node29 = new Node("hi!");
    Graph graph30 = new Graph();
    node29.setOwner(graph30);
    graph30.setName("");
    java.lang.String str34 = graph30.name;
    node22.setOwner(graph30);
    node22.setOwnerNameDirectly("hi!");
    graph20.addNode(node22);
    graph20.name = "";
    node19.setOwner(graph20);
    Node node43 = new Node("hi!");
    Graph graph44 = new Graph();
    node43.setOwner(graph44);
    graph20.addNode(node43);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph11.addNode(node43);

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test436"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerName("hi!");
    node1.setOwnerName("hi!");
    node1.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test437"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    graph9.init();
    graph9.init();
    Node node18 = new Node("");
    Node node20 = new Node("hi!");
    Graph graph21 = new Graph();
    node20.setOwner(graph21);
    node18.setOwner(graph21);
    Node node25 = new Node("hi!");
    Graph graph26 = new Graph();
    node25.setOwner(graph26);
    graph26.setName("");
    java.lang.String str30 = graph26.name;
    node18.setOwner(graph26);
    node18.setOwnerNameDirectly("[graph]");
    node18.setOwnerName("");
    node18.setOwnerName("[graph]");
    graph9.addNode(node18);
    node18.setOwnerNameDirectly("hi!");
    node18.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node18.thisIsNotCalled();

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test438"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerNameDirectly("[graph]");
    Node node18 = new Node("");
    Node node20 = new Node("hi!");
    Graph graph21 = new Graph();
    node20.setOwner(graph21);
    node18.setOwner(graph21);
    Node node25 = new Node("hi!");
    Graph graph26 = new Graph();
    node25.setOwner(graph26);
    graph26.setName("");
    java.lang.String str30 = graph26.name;
    node18.setOwner(graph26);
    node18.setOwnerNameDirectly("hi!");
    Graph graph34 = Graph.generateGraph();
    Node node36 = new Node("");
    Node node38 = new Node("hi!");
    Graph graph39 = new Graph();
    node38.setOwner(graph39);
    node36.setOwner(graph39);
    Node node43 = new Node("hi!");
    Graph graph44 = new Graph();
    node43.setOwner(graph44);
    graph44.setName("");
    java.lang.String str48 = graph44.name;
    node36.setOwner(graph44);
    node36.setOwnerNameDirectly("hi!");
    graph34.addNode(node36);
    node18.setOwner(graph34);
    graph34.name = "";
    node1.setOwner(graph34);
    node1.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test439"); }


    Graph graph0 = new Graph();
    graph0.init();
    graph0.setName("");
    java.lang.String str4 = graph0.name;
    graph0.init();
    Node node7 = new Node("hi!");
    Node node9 = new Node("hi!");
    Graph graph10 = new Graph();
    node9.setOwner(graph10);
    graph10.setName("");
    node7.setOwner(graph10);
    graph0.addNode(node7);
    graph0.init();
    Graph graph17 = Graph.generateGraph();
    Node node19 = new Node("");
    Node node21 = new Node("hi!");
    Graph graph22 = new Graph();
    node21.setOwner(graph22);
    node19.setOwner(graph22);
    Node node26 = new Node("hi!");
    Graph graph27 = new Graph();
    node26.setOwner(graph27);
    graph27.setName("");
    java.lang.String str31 = graph27.name;
    node19.setOwner(graph27);
    node19.setOwnerNameDirectly("hi!");
    graph17.addNode(node19);
    node19.setOwnerName("hi!");
    Node node39 = new Node("hi!");
    Graph graph40 = new Graph();
    node39.setOwner(graph40);
    graph40.setName("");
    graph40.setName("");
    graph40.setName("");
    node19.setOwner(graph40);
    node19.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i51 = graph0.getDegree(node19);

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test440"); }


    Graph graph0 = new Graph();
    graph0.init();
    java.lang.String str2 = graph0.name;
    graph0.init();
    graph0.name = "hi!";
    graph0.setName("hi!");
    java.lang.String str8 = graph0.name;
    graph0.name = "hi!";
    Graph graph11 = Graph.generateGraph();
    Node node13 = new Node("");
    Node node15 = new Node("hi!");
    Graph graph16 = new Graph();
    node15.setOwner(graph16);
    node13.setOwner(graph16);
    Node node20 = new Node("hi!");
    Graph graph21 = new Graph();
    node20.setOwner(graph21);
    graph21.setName("");
    java.lang.String str25 = graph21.name;
    node13.setOwner(graph21);
    node13.setOwnerNameDirectly("hi!");
    graph11.addNode(node13);
    graph0.addNode(node13);
    Graph graph31 = Graph.generateGraph();
    Node node33 = new Node("");
    Node node35 = new Node("hi!");
    Graph graph36 = new Graph();
    node35.setOwner(graph36);
    node33.setOwner(graph36);
    Node node40 = new Node("hi!");
    Graph graph41 = new Graph();
    node40.setOwner(graph41);
    graph41.setName("");
    java.lang.String str45 = graph41.name;
    node33.setOwner(graph41);
    node33.setOwnerNameDirectly("hi!");
    graph31.addNode(node33);
    graph31.name = "";
    graph31.init();
    graph31.setName("");
    graph31.name = "";
    Node node58 = new Node("");
    Graph graph59 = Graph.generateGraph();
    Node node61 = new Node("");
    Node node63 = new Node("hi!");
    Graph graph64 = new Graph();
    node63.setOwner(graph64);
    node61.setOwner(graph64);
    Node node68 = new Node("hi!");
    Graph graph69 = new Graph();
    node68.setOwner(graph69);
    graph69.setName("");
    java.lang.String str73 = graph69.name;
    node61.setOwner(graph69);
    node61.setOwnerNameDirectly("hi!");
    graph59.addNode(node61);
    graph59.name = "";
    node58.setOwner(graph59);
    graph31.addNode(node58);
    node13.setOwner(graph31);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node13.thisIsNotCalled();

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test441"); }


    Node node1 = new Node("hi!");
    Graph graph2 = new Graph();
    node1.setOwner(graph2);
    graph2.setName("");
    graph2.setName("");
    graph2.init();
    Node node10 = new Node("");
    Graph graph11 = Graph.generateGraph();
    java.lang.String str12 = graph11.name;
    graph11.init();
    node10.setOwner(graph11);
    graph11.name = "hi!";
    Graph graph17 = new Graph();
    graph17.init();
    graph17.setName("");
    Node node22 = new Node("");
    graph17.addNode(node22);
    graph11.addNode(node22);
    graph2.addNode(node22);
    Graph graph26 = Graph.generateGraph();
    Node node28 = new Node("");
    Node node30 = new Node("hi!");
    Graph graph31 = new Graph();
    node30.setOwner(graph31);
    node28.setOwner(graph31);
    Node node35 = new Node("hi!");
    Graph graph36 = new Graph();
    node35.setOwner(graph36);
    graph36.setName("");
    java.lang.String str40 = graph36.name;
    node28.setOwner(graph36);
    node28.setOwnerNameDirectly("hi!");
    graph26.addNode(node28);
    node28.setOwnerNameDirectly("hi!");
    node28.setOwnerNameDirectly("hi!");
    node28.setOwnerNameDirectly("[graph]");
    node28.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node22.addEdge(node28);

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test442"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    node1.setOwner(graph2);
    Graph graph5 = new Graph();
    node1.setOwner(graph5);
    graph5.setName("[graph]");
    java.lang.String str9 = graph5.name;
    graph5.name = "hi!";
    Node node13 = new Node("hi!");
    Node node15 = new Node("hi!");
    Graph graph16 = new Graph();
    node15.setOwner(graph16);
    graph16.setName("");
    node13.setOwner(graph16);
    graph16.init();
    Node node23 = new Node("");
    Node node25 = new Node("hi!");
    Graph graph26 = new Graph();
    node25.setOwner(graph26);
    node23.setOwner(graph26);
    Node node30 = new Node("hi!");
    Graph graph31 = new Graph();
    node30.setOwner(graph31);
    graph31.setName("");
    java.lang.String str35 = graph31.name;
    node23.setOwner(graph31);
    node23.setOwnerNameDirectly("[graph]");
    Node node40 = new Node("");
    Node node42 = new Node("hi!");
    Graph graph43 = new Graph();
    node42.setOwner(graph43);
    node40.setOwner(graph43);
    Node node47 = new Node("hi!");
    Graph graph48 = new Graph();
    node47.setOwner(graph48);
    graph48.setName("");
    java.lang.String str52 = graph48.name;
    node40.setOwner(graph48);
    node40.setOwnerNameDirectly("hi!");
    Graph graph56 = Graph.generateGraph();
    Node node58 = new Node("");
    Node node60 = new Node("hi!");
    Graph graph61 = new Graph();
    node60.setOwner(graph61);
    node58.setOwner(graph61);
    Node node65 = new Node("hi!");
    Graph graph66 = new Graph();
    node65.setOwner(graph66);
    graph66.setName("");
    java.lang.String str70 = graph66.name;
    node58.setOwner(graph66);
    node58.setOwnerNameDirectly("hi!");
    graph56.addNode(node58);
    node40.setOwner(graph56);
    graph56.name = "";
    node23.setOwner(graph56);
    node23.setOwnerNameDirectly("");
    graph16.addNode(node23);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i82 = graph5.getDegree(node23);

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test443"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerName("hi!");
    Graph graph17 = new Graph();
    graph17.init();
    node1.setOwner(graph17);
    node1.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test444"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    graph2.init();
    node1.setOwner(graph2);
    java.lang.String str6 = graph2.name;
    graph2.name = "[graph]";
    graph2.name = "";
    graph2.setName("");
    graph2.init();
    Graph graph14 = Graph.generateGraph();
    Node node16 = new Node("");
    Node node18 = new Node("hi!");
    Graph graph19 = new Graph();
    node18.setOwner(graph19);
    node16.setOwner(graph19);
    Node node23 = new Node("hi!");
    Graph graph24 = new Graph();
    node23.setOwner(graph24);
    graph24.setName("");
    java.lang.String str28 = graph24.name;
    node16.setOwner(graph24);
    node16.setOwnerNameDirectly("hi!");
    graph14.addNode(node16);
    Graph graph33 = Graph.generateGraph();
    node16.setOwner(graph33);
    Node node36 = new Node("");
    Graph graph37 = Graph.generateGraph();
    java.lang.String str38 = graph37.name;
    node36.setOwner(graph37);
    Graph graph40 = new Graph();
    node36.setOwner(graph40);
    Node node43 = new Node("hi!");
    Node node45 = new Node("hi!");
    Graph graph46 = new Graph();
    node45.setOwner(graph46);
    graph46.setName("");
    node43.setOwner(graph46);
    java.lang.String str51 = graph46.name;
    node36.setOwner(graph46);
    Node node54 = new Node("");
    Graph graph55 = Graph.generateGraph();
    java.lang.String str56 = graph55.name;
    graph55.init();
    node54.setOwner(graph55);
    java.lang.String str59 = graph55.name;
    node36.setOwner(graph55);
    graph55.name = "";
    node16.setOwner(graph55);
    Graph graph64 = Graph.generateGraph();
    Node node66 = new Node("");
    Node node68 = new Node("hi!");
    Graph graph69 = new Graph();
    node68.setOwner(graph69);
    node66.setOwner(graph69);
    Node node73 = new Node("hi!");
    Graph graph74 = new Graph();
    node73.setOwner(graph74);
    graph74.setName("");
    java.lang.String str78 = graph74.name;
    node66.setOwner(graph74);
    node66.setOwnerNameDirectly("hi!");
    graph64.addNode(node66);
    Graph graph83 = Graph.generateGraph();
    node66.setOwner(graph83);
    graph55.addNode(node66);
    node66.setOwnerNameDirectly("[graph]");
    node66.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i90 = graph2.getDegree(node66);

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test445"); }


    Node node1 = new Node("hi!");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    graph4.setName("");
    node1.setOwner(graph4);
    node1.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i11 = node1.getDegree();

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test446"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    node1.setOwner(graph2);
    Graph graph5 = new Graph();
    node1.setOwner(graph5);
    Node node8 = new Node("hi!");
    Node node10 = new Node("hi!");
    Graph graph11 = new Graph();
    node10.setOwner(graph11);
    graph11.setName("");
    node8.setOwner(graph11);
    java.lang.String str16 = graph11.name;
    node1.setOwner(graph11);
    graph11.name = "hi!";
    Graph graph20 = Graph.generateGraph();
    Node node22 = new Node("");
    Node node24 = new Node("hi!");
    Graph graph25 = new Graph();
    node24.setOwner(graph25);
    node22.setOwner(graph25);
    Node node29 = new Node("hi!");
    Graph graph30 = new Graph();
    node29.setOwner(graph30);
    graph30.setName("");
    java.lang.String str34 = graph30.name;
    node22.setOwner(graph30);
    node22.setOwnerNameDirectly("hi!");
    graph20.addNode(node22);
    Graph graph39 = Graph.generateGraph();
    node22.setOwner(graph39);
    node22.setOwnerName("hi!");
    node22.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph11.addNode(node22);

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test447"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerName("hi!");
    node1.setOwnerName("hi!");
    node1.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i21 = node1.getDegree();

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test448"); }


    Node node1 = new Node("hi!");
    Graph graph2 = new Graph();
    node1.setOwner(graph2);
    Node node5 = new Node("");
    Graph graph6 = Graph.generateGraph();
    Node node8 = new Node("");
    Node node10 = new Node("hi!");
    Graph graph11 = new Graph();
    node10.setOwner(graph11);
    node8.setOwner(graph11);
    Node node15 = new Node("hi!");
    Graph graph16 = new Graph();
    node15.setOwner(graph16);
    graph16.setName("");
    java.lang.String str20 = graph16.name;
    node8.setOwner(graph16);
    node8.setOwnerNameDirectly("hi!");
    graph6.addNode(node8);
    graph6.name = "";
    node5.setOwner(graph6);
    Node node29 = new Node("hi!");
    Graph graph30 = new Graph();
    node29.setOwner(graph30);
    graph6.addNode(node29);
    Node node34 = new Node("");
    Graph graph35 = Graph.generateGraph();
    java.lang.String str36 = graph35.name;
    graph35.init();
    node34.setOwner(graph35);
    java.lang.String str39 = graph35.name;
    graph35.init();
    graph35.setName("");
    node29.setOwner(graph35);
    Graph graph44 = Graph.generateGraph();
    Node node46 = new Node("");
    Node node48 = new Node("hi!");
    Graph graph49 = new Graph();
    node48.setOwner(graph49);
    node46.setOwner(graph49);
    Node node53 = new Node("hi!");
    Graph graph54 = new Graph();
    node53.setOwner(graph54);
    graph54.setName("");
    java.lang.String str58 = graph54.name;
    node46.setOwner(graph54);
    node46.setOwnerNameDirectly("hi!");
    graph44.addNode(node46);
    Graph graph63 = Graph.generateGraph();
    node46.setOwner(graph63);
    graph35.addNode(node46);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node46);

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test449"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerName("hi!");
    Graph graph17 = new Graph();
    graph17.init();
    node1.setOwner(graph17);
    node1.setOwnerNameDirectly("");
    Node node23 = new Node("");
    Graph graph24 = Graph.generateGraph();
    Node node26 = new Node("");
    Node node28 = new Node("hi!");
    Graph graph29 = new Graph();
    node28.setOwner(graph29);
    node26.setOwner(graph29);
    Node node33 = new Node("hi!");
    Graph graph34 = new Graph();
    node33.setOwner(graph34);
    graph34.setName("");
    java.lang.String str38 = graph34.name;
    node26.setOwner(graph34);
    node26.setOwnerNameDirectly("hi!");
    graph24.addNode(node26);
    graph24.name = "";
    node23.setOwner(graph24);
    node1.setOwner(graph24);
    Node node48 = new Node("");
    Node node50 = new Node("hi!");
    Graph graph51 = new Graph();
    node50.setOwner(graph51);
    node48.setOwner(graph51);
    Node node55 = new Node("hi!");
    Graph graph56 = new Graph();
    node55.setOwner(graph56);
    graph56.setName("");
    java.lang.String str60 = graph56.name;
    node48.setOwner(graph56);
    graph56.init();
    graph56.init();
    Node node65 = new Node("");
    Node node67 = new Node("hi!");
    Graph graph68 = new Graph();
    node67.setOwner(graph68);
    node65.setOwner(graph68);
    Node node72 = new Node("hi!");
    Graph graph73 = new Graph();
    node72.setOwner(graph73);
    graph73.setName("");
    java.lang.String str77 = graph73.name;
    node65.setOwner(graph73);
    node65.setOwnerNameDirectly("[graph]");
    node65.setOwnerName("");
    node65.setOwnerName("[graph]");
    graph56.addNode(node65);
    node65.setOwnerNameDirectly("hi!");
    node65.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node65);

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test450"); }


    Graph graph0 = new Graph();
    graph0.init();
    graph0.setName("");
    Node node5 = new Node("");
    graph0.addNode(node5);
    Node node8 = new Node("");
    Node node10 = new Node("hi!");
    Graph graph11 = new Graph();
    node10.setOwner(graph11);
    node8.setOwner(graph11);
    Node node15 = new Node("hi!");
    Graph graph16 = new Graph();
    node15.setOwner(graph16);
    graph16.setName("");
    java.lang.String str20 = graph16.name;
    node8.setOwner(graph16);
    node8.setOwnerName("hi!");
    node8.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i26 = graph0.getDegree(node8);

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test451"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerName("hi!");
    Graph graph17 = new Graph();
    graph17.init();
    node1.setOwner(graph17);
    Node node21 = new Node("");
    graph17.addNode(node21);
    java.lang.String str23 = graph17.name;
    graph17.name = "";
    java.lang.String str26 = graph17.name;
    graph17.name = "";
    Node node30 = new Node("");
    Node node32 = new Node("hi!");
    Graph graph33 = new Graph();
    node32.setOwner(graph33);
    node30.setOwner(graph33);
    Node node37 = new Node("hi!");
    Graph graph38 = new Graph();
    node37.setOwner(graph38);
    graph38.setName("");
    java.lang.String str42 = graph38.name;
    node30.setOwner(graph38);
    node30.setOwnerNameDirectly("[graph]");
    Node node47 = new Node("");
    Node node49 = new Node("hi!");
    Graph graph50 = new Graph();
    node49.setOwner(graph50);
    node47.setOwner(graph50);
    Node node54 = new Node("hi!");
    Graph graph55 = new Graph();
    node54.setOwner(graph55);
    graph55.setName("");
    java.lang.String str59 = graph55.name;
    node47.setOwner(graph55);
    node47.setOwnerNameDirectly("hi!");
    Graph graph63 = Graph.generateGraph();
    Node node65 = new Node("");
    Node node67 = new Node("hi!");
    Graph graph68 = new Graph();
    node67.setOwner(graph68);
    node65.setOwner(graph68);
    Node node72 = new Node("hi!");
    Graph graph73 = new Graph();
    node72.setOwner(graph73);
    graph73.setName("");
    java.lang.String str77 = graph73.name;
    node65.setOwner(graph73);
    node65.setOwnerNameDirectly("hi!");
    graph63.addNode(node65);
    node47.setOwner(graph63);
    graph63.name = "";
    node30.setOwner(graph63);
    node30.setOwnerName("");
    node30.setOwnerNameDirectly("hi!");
    node30.setOwnerNameDirectly("hi!");
    node30.setOwnerName("");
    node30.setOwnerName("hi!");
    node30.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i98 = graph17.getDegree(node30);

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test452"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    graph9.init();
    graph9.init();
    Node node18 = new Node("");
    Node node20 = new Node("hi!");
    Graph graph21 = new Graph();
    node20.setOwner(graph21);
    node18.setOwner(graph21);
    Node node25 = new Node("hi!");
    Graph graph26 = new Graph();
    node25.setOwner(graph26);
    graph26.setName("");
    java.lang.String str30 = graph26.name;
    node18.setOwner(graph26);
    node18.setOwnerNameDirectly("[graph]");
    node18.setOwnerName("");
    node18.setOwnerName("[graph]");
    graph9.addNode(node18);
    node18.setOwnerNameDirectly("hi!");
    node18.setOwnerName("[graph]");
    node18.setOwnerName("");
    Graph graph45 = Graph.generateGraph();
    java.lang.String str46 = graph45.name;
    graph45.name = "";
    graph45.name = "[graph]";
    graph45.setName("hi!");
    graph45.name = "";
    graph45.init();
    graph45.name = "hi!";
    Node node59 = new Node("");
    Graph graph60 = Graph.generateGraph();
    java.lang.String str61 = graph60.name;
    node59.setOwner(graph60);
    Graph graph63 = new Graph();
    node59.setOwner(graph63);
    node59.setOwnerNameDirectly("");
    graph45.addNode(node59);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node18.addEdge(node59);

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test453"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    Node node16 = new Node("");
    Graph graph17 = Graph.generateGraph();
    java.lang.String str18 = graph17.name;
    node16.setOwner(graph17);
    graph17.setName("");
    java.lang.String str22 = graph17.name;
    node1.setOwner(graph17);
    Node node25 = new Node("hi!");
    Graph graph26 = new Graph();
    node25.setOwner(graph26);
    graph17.addNode(node25);
    Node node30 = new Node("");
    Graph graph31 = Graph.generateGraph();
    java.lang.String str32 = graph31.name;
    graph31.init();
    node30.setOwner(graph31);
    java.lang.String str35 = graph31.name;
    graph31.init();
    node25.setOwner(graph31);
    Node node39 = new Node("");
    Node node41 = new Node("hi!");
    Graph graph42 = new Graph();
    node41.setOwner(graph42);
    node39.setOwner(graph42);
    Node node46 = new Node("hi!");
    Graph graph47 = new Graph();
    node46.setOwner(graph47);
    graph47.setName("");
    java.lang.String str51 = graph47.name;
    node39.setOwner(graph47);
    node39.setOwnerName("hi!");
    Graph graph55 = new Graph();
    graph55.init();
    node39.setOwner(graph55);
    node39.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node25.addEdge(node39);

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test454"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerNameDirectly("[graph]");
    Node node18 = new Node("");
    Node node20 = new Node("hi!");
    Graph graph21 = new Graph();
    node20.setOwner(graph21);
    node18.setOwner(graph21);
    Node node25 = new Node("hi!");
    Graph graph26 = new Graph();
    node25.setOwner(graph26);
    graph26.setName("");
    java.lang.String str30 = graph26.name;
    node18.setOwner(graph26);
    node18.setOwnerNameDirectly("hi!");
    Graph graph34 = Graph.generateGraph();
    Node node36 = new Node("");
    Node node38 = new Node("hi!");
    Graph graph39 = new Graph();
    node38.setOwner(graph39);
    node36.setOwner(graph39);
    Node node43 = new Node("hi!");
    Graph graph44 = new Graph();
    node43.setOwner(graph44);
    graph44.setName("");
    java.lang.String str48 = graph44.name;
    node36.setOwner(graph44);
    node36.setOwnerNameDirectly("hi!");
    graph34.addNode(node36);
    node18.setOwner(graph34);
    graph34.name = "";
    node1.setOwner(graph34);
    node1.setOwnerName("");
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("[graph]");
    Node node64 = new Node("hi!");
    Graph graph65 = new Graph();
    node64.setOwner(graph65);
    node64.setOwnerNameDirectly("[graph]");
    Graph graph69 = new Graph();
    graph69.init();
    graph69.setName("");
    Node node74 = new Node("");
    graph69.addNode(node74);
    graph69.name = "";
    node64.setOwner(graph69);
    node64.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node64);

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test455"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerNameDirectly("hi!");
    Graph graph17 = Graph.generateGraph();
    Node node19 = new Node("");
    Node node21 = new Node("hi!");
    Graph graph22 = new Graph();
    node21.setOwner(graph22);
    node19.setOwner(graph22);
    Node node26 = new Node("hi!");
    Graph graph27 = new Graph();
    node26.setOwner(graph27);
    graph27.setName("");
    java.lang.String str31 = graph27.name;
    node19.setOwner(graph27);
    node19.setOwnerNameDirectly("hi!");
    graph17.addNode(node19);
    node1.setOwner(graph17);
    Node node38 = new Node("hi!");
    Graph graph39 = new Graph();
    node38.setOwner(graph39);
    graph39.setName("");
    graph39.setName("");
    node1.setOwner(graph39);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test456"); }


    Graph graph0 = Graph.generateGraph();
    Node node2 = new Node("");
    Node node4 = new Node("hi!");
    Graph graph5 = new Graph();
    node4.setOwner(graph5);
    node2.setOwner(graph5);
    Node node9 = new Node("hi!");
    Graph graph10 = new Graph();
    node9.setOwner(graph10);
    graph10.setName("");
    java.lang.String str14 = graph10.name;
    node2.setOwner(graph10);
    node2.setOwnerNameDirectly("hi!");
    graph0.addNode(node2);
    Graph graph19 = Graph.generateGraph();
    node2.setOwner(graph19);
    Node node22 = new Node("hi!");
    Node node24 = new Node("hi!");
    Graph graph25 = new Graph();
    node24.setOwner(graph25);
    graph25.setName("");
    node22.setOwner(graph25);
    graph19.addNode(node22);
    Node node32 = new Node("");
    Node node34 = new Node("hi!");
    Graph graph35 = new Graph();
    node34.setOwner(graph35);
    node32.setOwner(graph35);
    Node node39 = new Node("hi!");
    Graph graph40 = new Graph();
    node39.setOwner(graph40);
    graph40.setName("");
    java.lang.String str44 = graph40.name;
    node32.setOwner(graph40);
    java.lang.String str46 = graph40.name;
    graph40.setName("");
    graph40.name = "";
    java.lang.String str51 = graph40.name;
    node22.setOwner(graph40);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node22.thisIsNotCalled();

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test457"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    graph2.init();
    node1.setOwner(graph2);
    java.lang.String str6 = graph2.name;
    graph2.name = "[graph]";
    java.lang.String str9 = graph2.name;
    graph2.name = "";
    Node node13 = new Node("");
    Node node15 = new Node("hi!");
    Graph graph16 = new Graph();
    node15.setOwner(graph16);
    node13.setOwner(graph16);
    Node node20 = new Node("hi!");
    Graph graph21 = new Graph();
    node20.setOwner(graph21);
    graph21.setName("");
    java.lang.String str25 = graph21.name;
    node13.setOwner(graph21);
    node13.setOwnerNameDirectly("[graph]");
    node13.setOwnerNameDirectly("[graph]");
    Node node32 = new Node("");
    Node node34 = new Node("hi!");
    Graph graph35 = new Graph();
    node34.setOwner(graph35);
    node32.setOwner(graph35);
    Node node39 = new Node("hi!");
    Graph graph40 = new Graph();
    node39.setOwner(graph40);
    graph40.setName("");
    java.lang.String str44 = graph40.name;
    node32.setOwner(graph40);
    node32.setOwnerNameDirectly("[graph]");
    Node node49 = new Node("");
    Node node51 = new Node("hi!");
    Graph graph52 = new Graph();
    node51.setOwner(graph52);
    node49.setOwner(graph52);
    Node node56 = new Node("hi!");
    Graph graph57 = new Graph();
    node56.setOwner(graph57);
    graph57.setName("");
    java.lang.String str61 = graph57.name;
    node49.setOwner(graph57);
    node49.setOwnerNameDirectly("hi!");
    Graph graph65 = Graph.generateGraph();
    Node node67 = new Node("");
    Node node69 = new Node("hi!");
    Graph graph70 = new Graph();
    node69.setOwner(graph70);
    node67.setOwner(graph70);
    Node node74 = new Node("hi!");
    Graph graph75 = new Graph();
    node74.setOwner(graph75);
    graph75.setName("");
    java.lang.String str79 = graph75.name;
    node67.setOwner(graph75);
    node67.setOwnerNameDirectly("hi!");
    graph65.addNode(node67);
    node49.setOwner(graph65);
    graph65.name = "";
    node32.setOwner(graph65);
    node32.setOwnerName("");
    node32.setOwnerNameDirectly("hi!");
    node32.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph2.addEdge(node13, node32);

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test458"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerNameDirectly("[graph]");
    Graph graph17 = Graph.generateGraph();
    Node node19 = new Node("");
    Node node21 = new Node("hi!");
    Graph graph22 = new Graph();
    node21.setOwner(graph22);
    node19.setOwner(graph22);
    Node node26 = new Node("hi!");
    Graph graph27 = new Graph();
    node26.setOwner(graph27);
    graph27.setName("");
    java.lang.String str31 = graph27.name;
    node19.setOwner(graph27);
    node19.setOwnerNameDirectly("hi!");
    graph17.addNode(node19);
    node1.setOwner(graph17);
    graph17.setName("");
    Node node40 = new Node("");
    Graph graph41 = Graph.generateGraph();
    java.lang.String str42 = graph41.name;
    node40.setOwner(graph41);
    Graph graph44 = new Graph();
    node40.setOwner(graph44);
    node40.setOwnerNameDirectly("");
    node40.setOwnerName("[graph]");
    node40.setOwnerName("hi!");
    Node node53 = new Node("");
    Node node55 = new Node("hi!");
    Graph graph56 = new Graph();
    node55.setOwner(graph56);
    node53.setOwner(graph56);
    Node node60 = new Node("hi!");
    Graph graph61 = new Graph();
    node60.setOwner(graph61);
    graph61.setName("");
    java.lang.String str65 = graph61.name;
    node53.setOwner(graph61);
    node53.setOwnerNameDirectly("[graph]");
    node53.setOwnerName("");
    Graph graph71 = new Graph();
    graph71.init();
    graph71.setName("");
    java.lang.String str75 = graph71.name;
    node53.setOwner(graph71);
    java.lang.String str77 = graph71.name;
    graph71.init();
    graph71.setName("");
    graph71.init();
    node40.setOwner(graph71);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i83 = graph17.getDegree(node40);

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test459"); }


    Graph graph0 = Graph.generateGraph();
    Node node2 = new Node("");
    Node node4 = new Node("hi!");
    Graph graph5 = new Graph();
    node4.setOwner(graph5);
    node2.setOwner(graph5);
    Node node9 = new Node("hi!");
    Graph graph10 = new Graph();
    node9.setOwner(graph10);
    graph10.setName("");
    java.lang.String str14 = graph10.name;
    node2.setOwner(graph10);
    node2.setOwnerNameDirectly("hi!");
    graph0.addNode(node2);
    node2.setOwnerName("hi!");
    node2.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i23 = node2.getDegree();

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test460"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerName("[graph]");
    Graph graph19 = Graph.generateGraph();
    Node node21 = new Node("");
    Node node23 = new Node("hi!");
    Graph graph24 = new Graph();
    node23.setOwner(graph24);
    node21.setOwner(graph24);
    Node node28 = new Node("hi!");
    Graph graph29 = new Graph();
    node28.setOwner(graph29);
    graph29.setName("");
    java.lang.String str33 = graph29.name;
    node21.setOwner(graph29);
    node21.setOwnerNameDirectly("hi!");
    graph19.addNode(node21);
    Graph graph38 = Graph.generateGraph();
    node21.setOwner(graph38);
    Node node41 = new Node("hi!");
    Node node43 = new Node("hi!");
    Graph graph44 = new Graph();
    node43.setOwner(graph44);
    graph44.setName("");
    node41.setOwner(graph44);
    graph38.addNode(node41);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node41);

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test461"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    graph2.init();
    node1.setOwner(graph2);
    java.lang.String str6 = graph2.name;
    graph2.name = "[graph]";
    graph2.init();
    java.lang.String str10 = graph2.name;
    Node node12 = new Node("");
    Graph graph13 = Graph.generateGraph();
    java.lang.String str14 = graph13.name;
    node12.setOwner(graph13);
    node12.setOwnerNameDirectly("");
    Graph graph18 = Graph.generateGraph();
    java.lang.String str19 = graph18.name;
    graph18.init();
    Graph graph21 = Graph.generateGraph();
    Node node23 = new Node("");
    Node node25 = new Node("hi!");
    Graph graph26 = new Graph();
    node25.setOwner(graph26);
    node23.setOwner(graph26);
    Node node30 = new Node("hi!");
    Graph graph31 = new Graph();
    node30.setOwner(graph31);
    graph31.setName("");
    java.lang.String str35 = graph31.name;
    node23.setOwner(graph31);
    node23.setOwnerNameDirectly("hi!");
    graph21.addNode(node23);
    node23.setOwnerNameDirectly("hi!");
    node23.setOwnerNameDirectly("hi!");
    node23.setOwnerNameDirectly("[graph]");
    node23.setOwnerNameDirectly("[graph]");
    graph18.addNode(node23);
    graph18.setName("");
    node12.setOwner(graph18);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i52 = graph2.getDegree(node12);

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test462"); }


    Graph graph0 = Graph.generateGraph();
    Node node2 = new Node("");
    Node node4 = new Node("hi!");
    Graph graph5 = new Graph();
    node4.setOwner(graph5);
    node2.setOwner(graph5);
    Node node9 = new Node("hi!");
    Graph graph10 = new Graph();
    node9.setOwner(graph10);
    graph10.setName("");
    java.lang.String str14 = graph10.name;
    node2.setOwner(graph10);
    node2.setOwnerNameDirectly("hi!");
    graph0.addNode(node2);
    node2.setOwnerName("hi!");
    node2.setOwnerName("");
    Graph graph23 = new Graph();
    graph23.init();
    java.lang.String str25 = graph23.name;
    graph23.init();
    graph23.name = "hi!";
    node2.setOwner(graph23);
    node2.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node2.thisIsNotCalled();

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test463"); }


    Graph graph0 = new Graph();
    graph0.init();
    graph0.setName("");
    java.lang.String str4 = graph0.name;
    graph0.init();
    Node node7 = new Node("hi!");
    Node node9 = new Node("hi!");
    Graph graph10 = new Graph();
    node9.setOwner(graph10);
    graph10.setName("");
    node7.setOwner(graph10);
    graph0.addNode(node7);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node7.thisIsNotCalled();

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test464"); }


    Graph graph0 = new Graph();
    graph0.init();
    graph0.setName("");
    graph0.name = "";
    java.lang.String str6 = graph0.name;
    Node node8 = new Node("");
    Graph graph9 = Graph.generateGraph();
    Node node11 = new Node("");
    Node node13 = new Node("hi!");
    Graph graph14 = new Graph();
    node13.setOwner(graph14);
    node11.setOwner(graph14);
    Node node18 = new Node("hi!");
    Graph graph19 = new Graph();
    node18.setOwner(graph19);
    graph19.setName("");
    java.lang.String str23 = graph19.name;
    node11.setOwner(graph19);
    node11.setOwnerNameDirectly("hi!");
    graph9.addNode(node11);
    graph9.name = "";
    node8.setOwner(graph9);
    Node node32 = new Node("hi!");
    Graph graph33 = new Graph();
    node32.setOwner(graph33);
    graph9.addNode(node32);
    Node node37 = new Node("");
    Graph graph38 = Graph.generateGraph();
    java.lang.String str39 = graph38.name;
    graph38.init();
    node37.setOwner(graph38);
    java.lang.String str42 = graph38.name;
    graph38.init();
    graph38.setName("");
    node32.setOwner(graph38);
    Graph graph47 = Graph.generateGraph();
    Node node49 = new Node("");
    Node node51 = new Node("hi!");
    Graph graph52 = new Graph();
    node51.setOwner(graph52);
    node49.setOwner(graph52);
    Node node56 = new Node("hi!");
    Graph graph57 = new Graph();
    node56.setOwner(graph57);
    graph57.setName("");
    java.lang.String str61 = graph57.name;
    node49.setOwner(graph57);
    node49.setOwnerNameDirectly("hi!");
    graph47.addNode(node49);
    Graph graph66 = Graph.generateGraph();
    node49.setOwner(graph66);
    graph38.addNode(node49);
    Node node70 = new Node("");
    Graph graph71 = Graph.generateGraph();
    java.lang.String str72 = graph71.name;
    node70.setOwner(graph71);
    Graph graph74 = new Graph();
    node70.setOwner(graph74);
    node70.setOwnerNameDirectly("hi!");
    node70.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node49, node70);

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test465"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerNameDirectly("[graph]");
    Node node18 = new Node("");
    Node node20 = new Node("hi!");
    Graph graph21 = new Graph();
    node20.setOwner(graph21);
    node18.setOwner(graph21);
    Node node25 = new Node("hi!");
    Graph graph26 = new Graph();
    node25.setOwner(graph26);
    graph26.setName("");
    java.lang.String str30 = graph26.name;
    node18.setOwner(graph26);
    node18.setOwnerNameDirectly("hi!");
    Graph graph34 = Graph.generateGraph();
    Node node36 = new Node("");
    Node node38 = new Node("hi!");
    Graph graph39 = new Graph();
    node38.setOwner(graph39);
    node36.setOwner(graph39);
    Node node43 = new Node("hi!");
    Graph graph44 = new Graph();
    node43.setOwner(graph44);
    graph44.setName("");
    java.lang.String str48 = graph44.name;
    node36.setOwner(graph44);
    node36.setOwnerNameDirectly("hi!");
    graph34.addNode(node36);
    node18.setOwner(graph34);
    graph34.name = "";
    node1.setOwner(graph34);
    node1.setOwnerName("");
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test466"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    graph2.init();
    node1.setOwner(graph2);
    java.lang.String str6 = graph2.name;
    graph2.name = "[graph]";
    graph2.name = "hi!";
    java.lang.String str11 = graph2.name;
    Node node13 = new Node("");
    Node node15 = new Node("hi!");
    Graph graph16 = new Graph();
    node15.setOwner(graph16);
    node13.setOwner(graph16);
    Node node20 = new Node("hi!");
    Graph graph21 = new Graph();
    node20.setOwner(graph21);
    graph21.setName("");
    java.lang.String str25 = graph21.name;
    node13.setOwner(graph21);
    node13.setOwnerNameDirectly("[graph]");
    node13.setOwnerName("");
    node13.setOwnerName("[graph]");
    graph2.addNode(node13);
    Graph graph34 = Graph.generateGraph();
    Node node36 = new Node("");
    Node node38 = new Node("hi!");
    Graph graph39 = new Graph();
    node38.setOwner(graph39);
    node36.setOwner(graph39);
    Node node43 = new Node("hi!");
    Graph graph44 = new Graph();
    node43.setOwner(graph44);
    graph44.setName("");
    java.lang.String str48 = graph44.name;
    node36.setOwner(graph44);
    node36.setOwnerNameDirectly("hi!");
    graph34.addNode(node36);
    node36.setOwnerNameDirectly("hi!");
    node36.setOwnerNameDirectly("hi!");
    node36.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i59 = graph2.getDegree(node36);

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test467"); }


    Graph graph0 = Graph.generateGraph();
    Node node2 = new Node("");
    Node node4 = new Node("hi!");
    Graph graph5 = new Graph();
    node4.setOwner(graph5);
    node2.setOwner(graph5);
    Node node9 = new Node("hi!");
    Graph graph10 = new Graph();
    node9.setOwner(graph10);
    graph10.setName("");
    java.lang.String str14 = graph10.name;
    node2.setOwner(graph10);
    node2.setOwnerNameDirectly("hi!");
    graph0.addNode(node2);
    Graph graph19 = Graph.generateGraph();
    node2.setOwner(graph19);
    Node node22 = new Node("");
    Graph graph23 = Graph.generateGraph();
    Node node25 = new Node("");
    Node node27 = new Node("hi!");
    Graph graph28 = new Graph();
    node27.setOwner(graph28);
    node25.setOwner(graph28);
    Node node32 = new Node("hi!");
    Graph graph33 = new Graph();
    node32.setOwner(graph33);
    graph33.setName("");
    java.lang.String str37 = graph33.name;
    node25.setOwner(graph33);
    node25.setOwnerNameDirectly("hi!");
    graph23.addNode(node25);
    graph23.name = "";
    node22.setOwner(graph23);
    graph23.name = "hi!";
    graph23.init();
    node2.setOwner(graph23);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node2.thisIsNotCalled();

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test468"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerNameDirectly("[graph]");
    Node node18 = new Node("");
    Node node20 = new Node("hi!");
    Graph graph21 = new Graph();
    node20.setOwner(graph21);
    node18.setOwner(graph21);
    Node node25 = new Node("hi!");
    Graph graph26 = new Graph();
    node25.setOwner(graph26);
    graph26.setName("");
    java.lang.String str30 = graph26.name;
    node18.setOwner(graph26);
    node18.setOwnerNameDirectly("hi!");
    Graph graph34 = Graph.generateGraph();
    Node node36 = new Node("");
    Node node38 = new Node("hi!");
    Graph graph39 = new Graph();
    node38.setOwner(graph39);
    node36.setOwner(graph39);
    Node node43 = new Node("hi!");
    Graph graph44 = new Graph();
    node43.setOwner(graph44);
    graph44.setName("");
    java.lang.String str48 = graph44.name;
    node36.setOwner(graph44);
    node36.setOwnerNameDirectly("hi!");
    graph34.addNode(node36);
    node18.setOwner(graph34);
    graph34.name = "";
    node1.setOwner(graph34);
    node1.setOwnerName("");
    node1.setOwnerName("hi!");
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i65 = node1.getDegree();

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test469"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerNameDirectly("[graph]");
    node1.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i19 = node1.getDegree();

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test470"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    graph2.init();
    node1.setOwner(graph2);
    java.lang.String str6 = graph2.name;
    graph2.name = "[graph]";
    java.lang.String str9 = graph2.name;
    graph2.name = "";
    graph2.init();
    graph2.name = "hi!";
    java.lang.String str15 = graph2.name;
    Node node17 = new Node("hi!");
    Graph graph18 = new Graph();
    node17.setOwner(graph18);
    graph18.setName("");
    graph18.setName("");
    graph18.setName("hi!");
    graph18.init();
    Node node28 = new Node("");
    Node node30 = new Node("hi!");
    Graph graph31 = new Graph();
    node30.setOwner(graph31);
    node28.setOwner(graph31);
    Node node35 = new Node("hi!");
    Graph graph36 = new Graph();
    node35.setOwner(graph36);
    graph36.setName("");
    java.lang.String str40 = graph36.name;
    node28.setOwner(graph36);
    Node node43 = new Node("");
    Graph graph44 = Graph.generateGraph();
    java.lang.String str45 = graph44.name;
    node43.setOwner(graph44);
    graph44.setName("");
    java.lang.String str49 = graph44.name;
    node28.setOwner(graph44);
    Node node52 = new Node("hi!");
    Graph graph53 = new Graph();
    node52.setOwner(graph53);
    graph44.addNode(node52);
    graph18.addNode(node52);
    graph2.addNode(node52);
    node52.setOwnerName("[graph]");
    Node node61 = new Node("");
    Graph graph62 = Graph.generateGraph();
    java.lang.String str63 = graph62.name;
    graph62.init();
    node61.setOwner(graph62);
    java.lang.String str66 = graph62.name;
    graph62.name = "[graph]";
    java.lang.String str69 = graph62.name;
    graph62.name = "";
    graph62.init();
    graph62.init();
    node52.setOwner(graph62);
    Node node76 = new Node("");
    Graph graph77 = Graph.generateGraph();
    java.lang.String str78 = graph77.name;
    node76.setOwner(graph77);
    Graph graph80 = new Graph();
    node76.setOwner(graph80);
    node76.setOwnerNameDirectly("[graph]");
    graph62.addNode(node76);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node76.thisIsNotCalled();

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test471"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerNameDirectly("hi!");
    Graph graph17 = Graph.generateGraph();
    Node node19 = new Node("");
    Node node21 = new Node("hi!");
    Graph graph22 = new Graph();
    node21.setOwner(graph22);
    node19.setOwner(graph22);
    Node node26 = new Node("hi!");
    Graph graph27 = new Graph();
    node26.setOwner(graph27);
    graph27.setName("");
    java.lang.String str31 = graph27.name;
    node19.setOwner(graph27);
    node19.setOwnerNameDirectly("hi!");
    graph17.addNode(node19);
    node1.setOwner(graph17);
    node1.setOwnerNameDirectly("");
    Node node40 = new Node("");
    Graph graph41 = Graph.generateGraph();
    Node node43 = new Node("");
    Node node45 = new Node("hi!");
    Graph graph46 = new Graph();
    node45.setOwner(graph46);
    node43.setOwner(graph46);
    Node node50 = new Node("hi!");
    Graph graph51 = new Graph();
    node50.setOwner(graph51);
    graph51.setName("");
    java.lang.String str55 = graph51.name;
    node43.setOwner(graph51);
    node43.setOwnerNameDirectly("hi!");
    graph41.addNode(node43);
    graph41.name = "";
    node40.setOwner(graph41);
    Node node64 = new Node("hi!");
    Graph graph65 = new Graph();
    node64.setOwner(graph65);
    graph41.addNode(node64);
    Node node69 = new Node("");
    Graph graph70 = Graph.generateGraph();
    java.lang.String str71 = graph70.name;
    graph70.init();
    node69.setOwner(graph70);
    java.lang.String str74 = graph70.name;
    graph70.init();
    graph70.setName("");
    node64.setOwner(graph70);
    Node node80 = new Node("hi!");
    Node node82 = new Node("hi!");
    Graph graph83 = new Graph();
    node82.setOwner(graph83);
    graph83.setName("");
    node80.setOwner(graph83);
    node80.setOwnerNameDirectly("hi!");
    graph70.addNode(node80);
    node80.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node80);

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test472"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    graph9.init();
    graph9.init();
    Node node18 = new Node("");
    Node node20 = new Node("hi!");
    Graph graph21 = new Graph();
    node20.setOwner(graph21);
    node18.setOwner(graph21);
    Node node25 = new Node("hi!");
    Graph graph26 = new Graph();
    node25.setOwner(graph26);
    graph26.setName("");
    java.lang.String str30 = graph26.name;
    node18.setOwner(graph26);
    node18.setOwnerNameDirectly("[graph]");
    node18.setOwnerName("");
    node18.setOwnerName("[graph]");
    graph9.addNode(node18);
    node18.setOwnerNameDirectly("hi!");
    node18.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i43 = node18.getDegree();

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test473"); }


    Graph graph0 = Graph.generateGraph();
    Node node2 = new Node("");
    Node node4 = new Node("hi!");
    Graph graph5 = new Graph();
    node4.setOwner(graph5);
    node2.setOwner(graph5);
    Node node9 = new Node("hi!");
    Graph graph10 = new Graph();
    node9.setOwner(graph10);
    graph10.setName("");
    java.lang.String str14 = graph10.name;
    node2.setOwner(graph10);
    node2.setOwnerNameDirectly("hi!");
    graph0.addNode(node2);
    Node node20 = new Node("hi!");
    Graph graph21 = new Graph();
    node20.setOwner(graph21);
    graph21.setName("");
    graph21.setName("");
    graph21.setName("hi!");
    graph21.init();
    graph21.setName("[graph]");
    java.lang.String str32 = graph21.name;
    java.lang.String str33 = graph21.name;
    node2.setOwner(graph21);
    Node node36 = new Node("hi!");
    Node node38 = new Node("hi!");
    Graph graph39 = new Graph();
    node38.setOwner(graph39);
    graph39.setName("");
    node36.setOwner(graph39);
    node36.setOwnerNameDirectly("hi!");
    Node node47 = new Node("hi!");
    Graph graph48 = new Graph();
    node47.setOwner(graph48);
    graph48.setName("");
    graph48.setName("");
    graph48.setName("hi!");
    graph48.init();
    graph48.setName("[graph]");
    node36.setOwner(graph48);
    node36.setOwnerNameDirectly("[graph]");
    graph21.addNode(node36);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i63 = node36.getDegree();

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test474"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    graph2.init();
    node1.setOwner(graph2);
    graph2.name = "hi!";
    graph2.name = "hi!";
    Node node11 = new Node("");
    Graph graph12 = Graph.generateGraph();
    Node node14 = new Node("");
    Node node16 = new Node("hi!");
    Graph graph17 = new Graph();
    node16.setOwner(graph17);
    node14.setOwner(graph17);
    Node node21 = new Node("hi!");
    Graph graph22 = new Graph();
    node21.setOwner(graph22);
    graph22.setName("");
    java.lang.String str26 = graph22.name;
    node14.setOwner(graph22);
    node14.setOwnerNameDirectly("hi!");
    graph12.addNode(node14);
    graph12.name = "";
    node11.setOwner(graph12);
    Node node35 = new Node("hi!");
    Graph graph36 = new Graph();
    node35.setOwner(graph36);
    graph12.addNode(node35);
    Node node40 = new Node("");
    Graph graph41 = Graph.generateGraph();
    java.lang.String str42 = graph41.name;
    graph41.init();
    node40.setOwner(graph41);
    java.lang.String str45 = graph41.name;
    graph41.init();
    graph41.setName("");
    node35.setOwner(graph41);
    Node node51 = new Node("hi!");
    Node node53 = new Node("hi!");
    Graph graph54 = new Graph();
    node53.setOwner(graph54);
    graph54.setName("");
    node51.setOwner(graph54);
    node51.setOwnerNameDirectly("hi!");
    graph41.addNode(node51);
    node51.setOwnerName("");
    Graph graph64 = Graph.generateGraph();
    Node node66 = new Node("");
    Node node68 = new Node("hi!");
    Graph graph69 = new Graph();
    node68.setOwner(graph69);
    node66.setOwner(graph69);
    Node node73 = new Node("hi!");
    Graph graph74 = new Graph();
    node73.setOwner(graph74);
    graph74.setName("");
    java.lang.String str78 = graph74.name;
    node66.setOwner(graph74);
    node66.setOwnerNameDirectly("hi!");
    graph64.addNode(node66);
    Graph graph83 = Graph.generateGraph();
    node66.setOwner(graph83);
    Node node86 = new Node("hi!");
    Node node88 = new Node("hi!");
    Graph graph89 = new Graph();
    node88.setOwner(graph89);
    graph89.setName("");
    node86.setOwner(graph89);
    graph83.addNode(node86);
    node86.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph2.addEdge(node51, node86);

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test475"); }


    Node node1 = new Node("hi!");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    graph4.setName("");
    node1.setOwner(graph4);
    node1.setOwnerNameDirectly("hi!");
    Node node12 = new Node("hi!");
    Graph graph13 = new Graph();
    node12.setOwner(graph13);
    graph13.setName("");
    graph13.setName("");
    graph13.setName("hi!");
    graph13.init();
    graph13.setName("[graph]");
    node1.setOwner(graph13);
    node1.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i27 = node1.getDegree();

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test476"); }


    Node node1 = new Node("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test477"); }


    Graph graph0 = new Graph();
    graph0.init();
    java.lang.String str2 = graph0.name;
    graph0.init();
    Node node5 = new Node("hi!");
    Node node7 = new Node("hi!");
    Graph graph8 = new Graph();
    node7.setOwner(graph8);
    graph8.setName("");
    node5.setOwner(graph8);
    node5.setOwnerNameDirectly("hi!");
    Node node16 = new Node("hi!");
    Graph graph17 = new Graph();
    node16.setOwner(graph17);
    graph17.setName("");
    graph17.setName("");
    graph17.init();
    node5.setOwner(graph17);
    node5.setOwnerName("hi!");
    Graph graph27 = new Graph();
    graph27.init();
    java.lang.String str29 = graph27.name;
    graph27.init();
    graph27.name = "hi!";
    graph27.setName("hi!");
    java.lang.String str35 = graph27.name;
    graph27.name = "hi!";
    Graph graph38 = Graph.generateGraph();
    Node node40 = new Node("");
    Node node42 = new Node("hi!");
    Graph graph43 = new Graph();
    node42.setOwner(graph43);
    node40.setOwner(graph43);
    Node node47 = new Node("hi!");
    Graph graph48 = new Graph();
    node47.setOwner(graph48);
    graph48.setName("");
    java.lang.String str52 = graph48.name;
    node40.setOwner(graph48);
    node40.setOwnerNameDirectly("hi!");
    graph38.addNode(node40);
    graph27.addNode(node40);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node5, node40);

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test478"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    node1.setOwnerNameDirectly("[graph]");
    Node node10 = new Node("");
    Node node12 = new Node("hi!");
    Graph graph13 = new Graph();
    node12.setOwner(graph13);
    node10.setOwner(graph13);
    Node node17 = new Node("hi!");
    Graph graph18 = new Graph();
    node17.setOwner(graph18);
    graph18.setName("");
    java.lang.String str22 = graph18.name;
    node10.setOwner(graph18);
    node10.setOwnerName("hi!");
    Graph graph26 = new Graph();
    graph26.init();
    node10.setOwner(graph26);
    Node node30 = new Node("");
    graph26.addNode(node30);
    java.lang.String str32 = graph26.name;
    graph26.name = "";
    graph26.name = "hi!";
    node1.setOwner(graph26);
    node1.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i40 = node1.getDegree();

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test479"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerNameDirectly("[graph]");
    Graph graph17 = Graph.generateGraph();
    Node node19 = new Node("");
    Node node21 = new Node("hi!");
    Graph graph22 = new Graph();
    node21.setOwner(graph22);
    node19.setOwner(graph22);
    Node node26 = new Node("hi!");
    Graph graph27 = new Graph();
    node26.setOwner(graph27);
    graph27.setName("");
    java.lang.String str31 = graph27.name;
    node19.setOwner(graph27);
    node19.setOwnerNameDirectly("hi!");
    graph17.addNode(node19);
    node1.setOwner(graph17);
    node1.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test480"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerNameDirectly("[graph]");
    Graph graph17 = Graph.generateGraph();
    Node node19 = new Node("");
    Node node21 = new Node("hi!");
    Graph graph22 = new Graph();
    node21.setOwner(graph22);
    node19.setOwner(graph22);
    Node node26 = new Node("hi!");
    Graph graph27 = new Graph();
    node26.setOwner(graph27);
    graph27.setName("");
    java.lang.String str31 = graph27.name;
    node19.setOwner(graph27);
    node19.setOwnerNameDirectly("hi!");
    graph17.addNode(node19);
    node1.setOwner(graph17);
    node1.setOwnerName("[graph]");
    node1.setOwnerName("[graph]");
    node1.setOwnerNameDirectly("");
    node1.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i45 = node1.getDegree();

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test481"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    node1.setOwner(graph2);
    Graph graph5 = new Graph();
    node1.setOwner(graph5);
    Node node8 = new Node("hi!");
    Node node10 = new Node("hi!");
    Graph graph11 = new Graph();
    node10.setOwner(graph11);
    graph11.setName("");
    node8.setOwner(graph11);
    java.lang.String str16 = graph11.name;
    node1.setOwner(graph11);
    java.lang.String str18 = graph11.name;
    java.lang.String str19 = graph11.name;
    Node node21 = new Node("");
    Node node23 = new Node("hi!");
    Graph graph24 = new Graph();
    node23.setOwner(graph24);
    node21.setOwner(graph24);
    Node node28 = new Node("hi!");
    Graph graph29 = new Graph();
    node28.setOwner(graph29);
    graph29.setName("");
    java.lang.String str33 = graph29.name;
    node21.setOwner(graph29);
    graph29.init();
    graph29.init();
    Node node38 = new Node("");
    Node node40 = new Node("hi!");
    Graph graph41 = new Graph();
    node40.setOwner(graph41);
    node38.setOwner(graph41);
    Node node45 = new Node("hi!");
    Graph graph46 = new Graph();
    node45.setOwner(graph46);
    graph46.setName("");
    java.lang.String str50 = graph46.name;
    node38.setOwner(graph46);
    node38.setOwnerNameDirectly("[graph]");
    node38.setOwnerName("");
    node38.setOwnerName("[graph]");
    graph29.addNode(node38);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i59 = graph11.getDegree(node38);

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test482"); }


    Graph graph0 = Graph.generateGraph();
    Node node2 = new Node("");
    Node node4 = new Node("hi!");
    Graph graph5 = new Graph();
    node4.setOwner(graph5);
    node2.setOwner(graph5);
    Node node9 = new Node("hi!");
    Graph graph10 = new Graph();
    node9.setOwner(graph10);
    graph10.setName("");
    java.lang.String str14 = graph10.name;
    node2.setOwner(graph10);
    node2.setOwnerNameDirectly("hi!");
    graph0.addNode(node2);
    Graph graph19 = Graph.generateGraph();
    node2.setOwner(graph19);
    Node node22 = new Node("");
    Graph graph23 = Graph.generateGraph();
    java.lang.String str24 = graph23.name;
    node22.setOwner(graph23);
    Graph graph26 = new Graph();
    node22.setOwner(graph26);
    Node node29 = new Node("hi!");
    Node node31 = new Node("hi!");
    Graph graph32 = new Graph();
    node31.setOwner(graph32);
    graph32.setName("");
    node29.setOwner(graph32);
    java.lang.String str37 = graph32.name;
    node22.setOwner(graph32);
    Node node40 = new Node("");
    Graph graph41 = Graph.generateGraph();
    java.lang.String str42 = graph41.name;
    graph41.init();
    node40.setOwner(graph41);
    java.lang.String str45 = graph41.name;
    node22.setOwner(graph41);
    graph41.name = "";
    node2.setOwner(graph41);
    node2.setOwnerNameDirectly("hi!");
    Node node53 = new Node("");
    Node node55 = new Node("hi!");
    Graph graph56 = new Graph();
    node55.setOwner(graph56);
    node53.setOwner(graph56);
    Node node60 = new Node("hi!");
    Graph graph61 = new Graph();
    node60.setOwner(graph61);
    graph61.setName("");
    java.lang.String str65 = graph61.name;
    node53.setOwner(graph61);
    Node node68 = new Node("");
    Graph graph69 = Graph.generateGraph();
    java.lang.String str70 = graph69.name;
    node68.setOwner(graph69);
    graph69.setName("");
    java.lang.String str74 = graph69.name;
    node53.setOwner(graph69);
    node2.setOwner(graph69);
    Node node78 = new Node("hi!");
    Graph graph79 = new Graph();
    node78.setOwner(graph79);
    graph79.setName("");
    graph79.setName("");
    graph79.init();
    node2.setOwner(graph79);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i87 = node2.getDegree();

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test483"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerNameDirectly("[graph]");
    Node node18 = new Node("");
    Node node20 = new Node("hi!");
    Graph graph21 = new Graph();
    node20.setOwner(graph21);
    node18.setOwner(graph21);
    Node node25 = new Node("hi!");
    Graph graph26 = new Graph();
    node25.setOwner(graph26);
    graph26.setName("");
    java.lang.String str30 = graph26.name;
    node18.setOwner(graph26);
    node18.setOwnerNameDirectly("hi!");
    Graph graph34 = Graph.generateGraph();
    Node node36 = new Node("");
    Node node38 = new Node("hi!");
    Graph graph39 = new Graph();
    node38.setOwner(graph39);
    node36.setOwner(graph39);
    Node node43 = new Node("hi!");
    Graph graph44 = new Graph();
    node43.setOwner(graph44);
    graph44.setName("");
    java.lang.String str48 = graph44.name;
    node36.setOwner(graph44);
    node36.setOwnerNameDirectly("hi!");
    graph34.addNode(node36);
    node18.setOwner(graph34);
    graph34.name = "";
    node1.setOwner(graph34);
    node1.setOwnerName("");
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerNameDirectly("hi!");
    Node node64 = new Node("hi!");
    Graph graph65 = new Graph();
    node64.setOwner(graph65);
    graph65.setName("");
    graph65.setName("");
    graph65.init();
    node1.setOwner(graph65);
    node1.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test484"); }


    Node node1 = new Node("hi!");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    graph4.setName("");
    node1.setOwner(graph4);
    graph4.setName("");
    Node node12 = new Node("hi!");
    Node node14 = new Node("hi!");
    Graph graph15 = new Graph();
    node14.setOwner(graph15);
    graph15.setName("");
    node12.setOwner(graph15);
    node12.setOwnerNameDirectly("hi!");
    Node node23 = new Node("hi!");
    Graph graph24 = new Graph();
    node23.setOwner(graph24);
    graph24.setName("");
    graph24.setName("");
    graph24.setName("hi!");
    graph24.init();
    graph24.setName("[graph]");
    node12.setOwner(graph24);
    node12.setOwnerNameDirectly("[graph]");
    node12.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph4.addNode(node12);

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test485"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerName("hi!");
    node1.setOwnerName("[graph]");
    node1.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test486"); }


    Graph graph0 = Graph.generateGraph();
    Node node2 = new Node("");
    Node node4 = new Node("hi!");
    Graph graph5 = new Graph();
    node4.setOwner(graph5);
    node2.setOwner(graph5);
    Node node9 = new Node("hi!");
    Graph graph10 = new Graph();
    node9.setOwner(graph10);
    graph10.setName("");
    java.lang.String str14 = graph10.name;
    node2.setOwner(graph10);
    node2.setOwnerNameDirectly("[graph]");
    node2.setOwnerName("");
    Graph graph20 = new Graph();
    graph20.init();
    graph20.setName("");
    java.lang.String str24 = graph20.name;
    node2.setOwner(graph20);
    Node node27 = new Node("hi!");
    Node node29 = new Node("hi!");
    Graph graph30 = new Graph();
    node29.setOwner(graph30);
    graph30.setName("");
    node27.setOwner(graph30);
    node27.setOwnerNameDirectly("hi!");
    Node node38 = new Node("hi!");
    Graph graph39 = new Graph();
    node38.setOwner(graph39);
    graph39.setName("");
    graph39.setName("");
    graph39.init();
    node27.setOwner(graph39);
    Node node48 = new Node("");
    Graph graph49 = Graph.generateGraph();
    java.lang.String str50 = graph49.name;
    graph49.init();
    node48.setOwner(graph49);
    java.lang.String str53 = graph49.name;
    graph49.name = "[graph]";
    graph49.name = "";
    graph49.name = "";
    node27.setOwner(graph49);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node2, node27);

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test487"); }


    Graph graph0 = Graph.generateGraph();
    Node node2 = new Node("");
    Node node4 = new Node("hi!");
    Graph graph5 = new Graph();
    node4.setOwner(graph5);
    node2.setOwner(graph5);
    Node node9 = new Node("hi!");
    Graph graph10 = new Graph();
    node9.setOwner(graph10);
    graph10.setName("");
    java.lang.String str14 = graph10.name;
    node2.setOwner(graph10);
    node2.setOwnerNameDirectly("hi!");
    graph0.addNode(node2);
    node2.setOwnerNameDirectly("hi!");
    Node node22 = new Node("hi!");
    Graph graph23 = new Graph();
    node22.setOwner(graph23);
    graph23.setName("");
    graph23.setName("");
    graph23.init();
    node2.setOwner(graph23);
    Node node32 = new Node("");
    Graph graph33 = Graph.generateGraph();
    java.lang.String str34 = graph33.name;
    node32.setOwner(graph33);
    node32.setOwnerNameDirectly("");
    node32.setOwnerNameDirectly("[graph]");
    node32.setOwnerNameDirectly("hi!");
    node32.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i44 = graph23.getDegree(node32);

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test488"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerName("hi!");
    Graph graph17 = new Graph();
    graph17.init();
    node1.setOwner(graph17);
    Node node21 = new Node("");
    graph17.addNode(node21);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node21.setOwnerNameDirectly("hi!");

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test489"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerName("hi!");
    node1.setOwnerName("[graph]");
    Graph graph19 = Graph.generateGraph();
    java.lang.String str20 = graph19.name;
    graph19.name = "";
    java.lang.String str23 = graph19.name;
    graph19.init();
    node1.setOwner(graph19);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i26 = node1.getDegree();

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test490"); }


    Node node1 = new Node("hi!");
    Graph graph2 = new Graph();
    node1.setOwner(graph2);
    graph2.setName("");
    graph2.setName("");
    Node node9 = new Node("");
    Node node11 = new Node("hi!");
    Graph graph12 = new Graph();
    node11.setOwner(graph12);
    node9.setOwner(graph12);
    Node node16 = new Node("hi!");
    Graph graph17 = new Graph();
    node16.setOwner(graph17);
    graph17.setName("");
    java.lang.String str21 = graph17.name;
    node9.setOwner(graph17);
    node9.setOwnerNameDirectly("[graph]");
    Node node26 = new Node("");
    Node node28 = new Node("hi!");
    Graph graph29 = new Graph();
    node28.setOwner(graph29);
    node26.setOwner(graph29);
    Node node33 = new Node("hi!");
    Graph graph34 = new Graph();
    node33.setOwner(graph34);
    graph34.setName("");
    java.lang.String str38 = graph34.name;
    node26.setOwner(graph34);
    node26.setOwnerNameDirectly("hi!");
    Graph graph42 = Graph.generateGraph();
    Node node44 = new Node("");
    Node node46 = new Node("hi!");
    Graph graph47 = new Graph();
    node46.setOwner(graph47);
    node44.setOwner(graph47);
    Node node51 = new Node("hi!");
    Graph graph52 = new Graph();
    node51.setOwner(graph52);
    graph52.setName("");
    java.lang.String str56 = graph52.name;
    node44.setOwner(graph52);
    node44.setOwnerNameDirectly("hi!");
    graph42.addNode(node44);
    node26.setOwner(graph42);
    graph42.name = "";
    node9.setOwner(graph42);
    node9.setOwnerName("");
    node9.setOwnerName("hi!");
    node9.setOwnerNameDirectly("hi!");
    node9.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph2.addNode(node9);

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test491"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerNameDirectly("[graph]");
    node1.setOwnerName("");
    Graph graph19 = new Graph();
    graph19.init();
    graph19.setName("");
    java.lang.String str23 = graph19.name;
    node1.setOwner(graph19);
    Graph graph25 = Graph.generateGraph();
    java.lang.String str26 = graph25.name;
    graph25.name = "";
    graph25.name = "[graph]";
    graph25.setName("hi!");
    graph25.name = "[graph]";
    node1.setOwner(graph25);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i36 = node1.getDegree();

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test492"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    Node node8 = new Node("hi!");
    Graph graph9 = new Graph();
    node8.setOwner(graph9);
    graph9.setName("");
    java.lang.String str13 = graph9.name;
    node1.setOwner(graph9);
    node1.setOwnerName("hi!");
    Graph graph17 = new Graph();
    graph17.init();
    node1.setOwner(graph17);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i20 = node1.getDegree();

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test493"); }


    Graph graph0 = Graph.generateGraph();
    Node node2 = new Node("");
    Node node4 = new Node("hi!");
    Graph graph5 = new Graph();
    node4.setOwner(graph5);
    node2.setOwner(graph5);
    Node node9 = new Node("hi!");
    Graph graph10 = new Graph();
    node9.setOwner(graph10);
    graph10.setName("");
    java.lang.String str14 = graph10.name;
    node2.setOwner(graph10);
    node2.setOwnerNameDirectly("hi!");
    graph0.addNode(node2);
    Graph graph19 = Graph.generateGraph();
    node2.setOwner(graph19);
    Node node22 = new Node("");
    Graph graph23 = Graph.generateGraph();
    Node node25 = new Node("");
    Node node27 = new Node("hi!");
    Graph graph28 = new Graph();
    node27.setOwner(graph28);
    node25.setOwner(graph28);
    Node node32 = new Node("hi!");
    Graph graph33 = new Graph();
    node32.setOwner(graph33);
    graph33.setName("");
    java.lang.String str37 = graph33.name;
    node25.setOwner(graph33);
    node25.setOwnerNameDirectly("hi!");
    graph23.addNode(node25);
    graph23.name = "";
    node22.setOwner(graph23);
    graph23.name = "hi!";
    graph23.init();
    node2.setOwner(graph23);
    Graph graph49 = Graph.generateGraph();
    java.lang.String str50 = graph49.name;
    graph49.name = "";
    java.lang.String str53 = graph49.name;
    graph49.setName("");
    node2.setOwner(graph49);
    Graph graph57 = Graph.generateGraph();
    Node node59 = new Node("");
    Node node61 = new Node("hi!");
    Graph graph62 = new Graph();
    node61.setOwner(graph62);
    node59.setOwner(graph62);
    Node node66 = new Node("hi!");
    Graph graph67 = new Graph();
    node66.setOwner(graph67);
    graph67.setName("");
    java.lang.String str71 = graph67.name;
    node59.setOwner(graph67);
    node59.setOwnerNameDirectly("hi!");
    graph57.addNode(node59);
    node59.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node2.addEdge(node59);

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test494"); }


    Graph graph0 = new Graph();
    graph0.init();
    graph0.setName("");
    java.lang.String str4 = graph0.name;
    graph0.init();
    Node node7 = new Node("hi!");
    Node node9 = new Node("hi!");
    Graph graph10 = new Graph();
    node9.setOwner(graph10);
    graph10.setName("");
    node7.setOwner(graph10);
    graph0.addNode(node7);
    graph0.init();
    graph0.setName("hi!");
    graph0.setName("");
    Node node22 = new Node("");
    Graph graph23 = Graph.generateGraph();
    java.lang.String str24 = graph23.name;
    graph23.init();
    node22.setOwner(graph23);
    java.lang.String str27 = graph23.name;
    graph23.init();
    Node node30 = new Node("");
    Node node32 = new Node("hi!");
    Graph graph33 = new Graph();
    node32.setOwner(graph33);
    node30.setOwner(graph33);
    Node node37 = new Node("hi!");
    Graph graph38 = new Graph();
    node37.setOwner(graph38);
    graph38.setName("");
    java.lang.String str42 = graph38.name;
    node30.setOwner(graph38);
    node30.setOwnerNameDirectly("hi!");
    graph23.addNode(node30);
    node30.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i49 = graph0.getDegree(node30);

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test495"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    graph2.init();
    node1.setOwner(graph2);
    java.lang.String str6 = graph2.name;
    graph2.name = "[graph]";
    graph2.name = "";
    graph2.setName("");
    Node node14 = new Node("");
    Node node16 = new Node("hi!");
    Graph graph17 = new Graph();
    node16.setOwner(graph17);
    node14.setOwner(graph17);
    Node node21 = new Node("hi!");
    Graph graph22 = new Graph();
    node21.setOwner(graph22);
    graph22.setName("");
    java.lang.String str26 = graph22.name;
    node14.setOwner(graph22);
    node14.setOwnerName("hi!");
    node14.setOwnerName("hi!");
    node14.setOwnerName("[graph]");
    graph2.addNode(node14);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node14.thisIsNotCalled();

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test496"); }


    Node node1 = new Node("hi!");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    graph4.setName("");
    node1.setOwner(graph4);
    graph4.init();
    Node node11 = new Node("");
    Graph graph12 = Graph.generateGraph();
    java.lang.String str13 = graph12.name;
    node11.setOwner(graph12);
    Graph graph15 = new Graph();
    node11.setOwner(graph15);
    Node node18 = new Node("hi!");
    Node node20 = new Node("hi!");
    Graph graph21 = new Graph();
    node20.setOwner(graph21);
    graph21.setName("");
    node18.setOwner(graph21);
    java.lang.String str26 = graph21.name;
    node11.setOwner(graph21);
    Node node29 = new Node("");
    Graph graph30 = Graph.generateGraph();
    java.lang.String str31 = graph30.name;
    graph30.init();
    node29.setOwner(graph30);
    java.lang.String str34 = graph30.name;
    node11.setOwner(graph30);
    graph4.addNode(node11);
    Graph graph37 = Graph.generateGraph();
    java.lang.String str38 = graph37.name;
    graph37.name = "";
    graph37.name = "[graph]";
    graph37.setName("hi!");
    graph37.name = "";
    java.lang.String str47 = graph37.name;
    graph37.setName("hi!");
    node11.setOwner(graph37);
    Node node52 = new Node("");
    Graph graph53 = Graph.generateGraph();
    java.lang.String str54 = graph53.name;
    node52.setOwner(graph53);
    Graph graph56 = new Graph();
    node52.setOwner(graph56);
    Node node59 = new Node("hi!");
    Node node61 = new Node("hi!");
    Graph graph62 = new Graph();
    node61.setOwner(graph62);
    graph62.setName("");
    node59.setOwner(graph62);
    java.lang.String str67 = graph62.name;
    node52.setOwner(graph62);
    Node node70 = new Node("");
    Graph graph71 = Graph.generateGraph();
    java.lang.String str72 = graph71.name;
    graph71.init();
    node70.setOwner(graph71);
    java.lang.String str75 = graph71.name;
    node52.setOwner(graph71);
    Node node78 = new Node("hi!");
    Node node80 = new Node("hi!");
    Graph graph81 = new Graph();
    node80.setOwner(graph81);
    graph81.setName("");
    node78.setOwner(graph81);
    node78.setOwnerNameDirectly("hi!");
    graph71.addNode(node78);
    node78.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node11.addEdge(node78);

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test497"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    node1.setOwnerNameDirectly("[graph]");
    node1.setOwnerNameDirectly("");
    node1.setOwnerName("hi!");
    Node node14 = new Node("hi!");
    Graph graph15 = new Graph();
    node14.setOwner(graph15);
    node14.setOwnerName("[graph]");
    Node node20 = new Node("");
    Node node22 = new Node("hi!");
    Graph graph23 = new Graph();
    node22.setOwner(graph23);
    node20.setOwner(graph23);
    Node node27 = new Node("hi!");
    Graph graph28 = new Graph();
    node27.setOwner(graph28);
    graph28.setName("");
    java.lang.String str32 = graph28.name;
    node20.setOwner(graph28);
    node14.setOwner(graph28);
    node14.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node14);

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test498"); }


    Node node1 = new Node("hi!");
    Graph graph2 = new Graph();
    node1.setOwner(graph2);
    graph2.setName("");
    graph2.setName("");
    graph2.setName("");
    graph2.setName("[graph]");
    graph2.setName("");
    java.lang.String str14 = graph2.name;
    graph2.setName("hi!");
    Node node18 = new Node("");
    Graph graph19 = Graph.generateGraph();
    java.lang.String str20 = graph19.name;
    node18.setOwner(graph19);
    node18.setOwnerNameDirectly("");
    node18.setOwnerNameDirectly("[graph]");
    node18.setOwnerNameDirectly("hi!");
    Graph graph28 = new Graph();
    graph28.init();
    java.lang.String str30 = graph28.name;
    graph28.init();
    graph28.name = "hi!";
    node18.setOwner(graph28);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i35 = graph2.getDegree(node18);

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test499"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    graph2.init();
    node1.setOwner(graph2);
    java.lang.String str6 = graph2.name;
    graph2.init();
    Node node9 = new Node("");
    Node node11 = new Node("hi!");
    Graph graph12 = new Graph();
    node11.setOwner(graph12);
    node9.setOwner(graph12);
    Node node16 = new Node("hi!");
    Graph graph17 = new Graph();
    node16.setOwner(graph17);
    graph17.setName("");
    java.lang.String str21 = graph17.name;
    node9.setOwner(graph17);
    node9.setOwnerNameDirectly("hi!");
    graph2.addNode(node9);
    node9.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node9.thisIsNotCalled();

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test500"); }


    Graph graph0 = Graph.generateGraph();
    Node node2 = new Node("");
    Node node4 = new Node("hi!");
    Graph graph5 = new Graph();
    node4.setOwner(graph5);
    node2.setOwner(graph5);
    Node node9 = new Node("hi!");
    Graph graph10 = new Graph();
    node9.setOwner(graph10);
    graph10.setName("");
    java.lang.String str14 = graph10.name;
    node2.setOwner(graph10);
    node2.setOwnerNameDirectly("hi!");
    graph0.addNode(node2);
    node2.setOwnerName("hi!");
    node2.setOwnerName("");
    node2.setOwnerNameDirectly("[graph]");
    Graph graph25 = Graph.generateGraph();
    Node node27 = new Node("");
    Node node29 = new Node("hi!");
    Graph graph30 = new Graph();
    node29.setOwner(graph30);
    node27.setOwner(graph30);
    Node node34 = new Node("hi!");
    Graph graph35 = new Graph();
    node34.setOwner(graph35);
    graph35.setName("");
    java.lang.String str39 = graph35.name;
    node27.setOwner(graph35);
    node27.setOwnerNameDirectly("hi!");
    graph25.addNode(node27);
    node27.setOwnerNameDirectly("hi!");
    node27.setOwnerNameDirectly("hi!");
    node27.setOwnerNameDirectly("[graph]");
    node27.setOwnerNameDirectly("[graph]");
    node27.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node2.addEdge(node27);

  }

}
