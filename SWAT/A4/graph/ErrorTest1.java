
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest1 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test001"); }


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
    int i52 = node2.getDegree();

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test002"); }


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
    Node node25 = new Node("hi!");
    Node node27 = new Node("hi!");
    Graph graph28 = new Graph();
    node27.setOwner(graph28);
    graph28.setName("");
    node25.setOwner(graph28);
    node25.setOwnerNameDirectly("hi!");
    Node node36 = new Node("hi!");
    Graph graph37 = new Graph();
    node36.setOwner(graph37);
    graph37.setName("");
    graph37.setName("");
    graph37.setName("hi!");
    graph37.init();
    graph37.setName("[graph]");
    node25.setOwner(graph37);
    Graph graph49 = Graph.generateGraph();
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
    graph49.addNode(node51);
    node51.setOwnerName("hi!");
    Node node71 = new Node("hi!");
    Graph graph72 = new Graph();
    node71.setOwner(graph72);
    graph72.setName("");
    graph72.setName("");
    graph72.setName("");
    node51.setOwner(graph72);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph17.addEdge(node25, node51);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test003"); }


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
    node65.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node65.thisIsNotCalled();

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test004"); }


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
    node1.setOwnerName("hi!");
    Node node66 = new Node("hi!");
    Node node68 = new Node("hi!");
    Graph graph69 = new Graph();
    node68.setOwner(graph69);
    graph69.setName("");
    node66.setOwner(graph69);
    node66.setOwnerNameDirectly("hi!");
    Node node77 = new Node("hi!");
    Graph graph78 = new Graph();
    node77.setOwner(graph78);
    graph78.setName("");
    graph78.setName("");
    graph78.init();
    node66.setOwner(graph78);
    node66.setOwnerNameDirectly("");
    node66.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node66);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test005"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i45 = node18.getDegree();

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test006"); }


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
    java.lang.String str27 = graph2.name;
    Node node29 = new Node("");
    Graph graph30 = Graph.generateGraph();
    java.lang.String str31 = graph30.name;
    node29.setOwner(graph30);
    Graph graph33 = new Graph();
    node29.setOwner(graph33);
    node29.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i37 = graph2.getDegree(node29);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test007"); }


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
    Graph graph40 = Graph.generateGraph();
    java.lang.String str41 = graph40.name;
    node39.setOwner(graph40);
    graph40.setName("");
    java.lang.String str45 = graph40.name;
    node27.setOwner(graph40);
    graph40.init();
    java.lang.String str48 = graph40.name;
    graph40.setName("hi!");
    Node node52 = new Node("hi!");
    Node node54 = new Node("hi!");
    Graph graph55 = new Graph();
    node54.setOwner(graph55);
    graph55.setName("");
    node52.setOwner(graph55);
    node52.setOwnerNameDirectly("hi!");
    Node node63 = new Node("hi!");
    Graph graph64 = new Graph();
    node63.setOwner(graph64);
    graph64.setName("");
    graph64.setName("");
    graph64.init();
    node52.setOwner(graph64);
    Node node73 = new Node("");
    Graph graph74 = Graph.generateGraph();
    java.lang.String str75 = graph74.name;
    graph74.init();
    node73.setOwner(graph74);
    java.lang.String str78 = graph74.name;
    graph74.name = "[graph]";
    graph74.name = "";
    graph74.name = "";
    node52.setOwner(graph74);
    node52.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i88 = graph40.getDegree(node52);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test008"); }


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
    Graph graph17 = new Graph();
    graph17.init();
    graph17.setName("");
    java.lang.String str21 = graph17.name;
    graph17.init();
    Node node24 = new Node("hi!");
    Node node26 = new Node("hi!");
    Graph graph27 = new Graph();
    node26.setOwner(graph27);
    graph27.setName("");
    node24.setOwner(graph27);
    graph17.addNode(node24);
    java.lang.String str33 = graph17.name;
    Node node35 = new Node("hi!");
    Node node37 = new Node("hi!");
    Graph graph38 = new Graph();
    node37.setOwner(graph38);
    graph38.setName("");
    node35.setOwner(graph38);
    node35.setOwnerNameDirectly("hi!");
    node35.setOwnerNameDirectly("[graph]");
    Node node48 = new Node("");
    Graph graph49 = Graph.generateGraph();
    java.lang.String str50 = graph49.name;
    graph49.init();
    node48.setOwner(graph49);
    java.lang.String str53 = graph49.name;
    graph49.init();
    node35.setOwner(graph49);
    Node node57 = new Node("hi!");
    Node node59 = new Node("hi!");
    Graph graph60 = new Graph();
    node59.setOwner(graph60);
    graph60.setName("");
    node57.setOwner(graph60);
    node57.setOwnerNameDirectly("hi!");
    node57.setOwnerNameDirectly("[graph]");
    Node node70 = new Node("");
    Graph graph71 = Graph.generateGraph();
    java.lang.String str72 = graph71.name;
    graph71.init();
    node70.setOwner(graph71);
    java.lang.String str75 = graph71.name;
    graph71.init();
    node57.setOwner(graph71);
    graph49.addNode(node57);
    node57.setOwnerNameDirectly("");
    graph17.addNode(node57);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node57);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test009"); }


    Graph graph0 = Graph.generateGraph();
    java.lang.String str1 = graph0.name;
    graph0.name = "";
    graph0.name = "[graph]";
    graph0.setName("hi!");
    graph0.name = "";
    java.lang.String str10 = graph0.name;
    graph0.setName("hi!");
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
    Node node33 = new Node("hi!");
    Graph graph34 = new Graph();
    node33.setOwner(graph34);
    graph34.setName("");
    graph34.setName("");
    graph34.setName("hi!");
    graph34.init();
    graph34.setName("[graph]");
    java.lang.String str45 = graph34.name;
    java.lang.String str46 = graph34.name;
    node15.setOwner(graph34);
    Graph graph48 = Graph.generateGraph();
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
    node50.setOwnerNameDirectly("hi!");
    graph48.addNode(node50);
    Graph graph67 = Graph.generateGraph();
    node50.setOwner(graph67);
    node50.setOwnerName("hi!");
    Graph graph71 = Graph.generateGraph();
    java.lang.String str72 = graph71.name;
    graph71.name = "";
    graph71.name = "[graph]";
    graph71.setName("hi!");
    graph71.name = "";
    java.lang.String str81 = graph71.name;
    graph71.setName("hi!");
    node50.setOwner(graph71);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node15, node50);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test010"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    graph2.init();
    node1.setOwner(graph2);
    graph2.setName("");
    java.lang.String str8 = graph2.name;
    Node node10 = new Node("");
    Graph graph11 = Graph.generateGraph();
    java.lang.String str12 = graph11.name;
    node10.setOwner(graph11);
    Graph graph14 = new Graph();
    node10.setOwner(graph14);
    node10.setOwnerNameDirectly("hi!");
    node10.setOwnerName("");
    graph2.addNode(node10);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node10.thisIsNotCalled();

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test011"); }


    Node node1 = new Node("hi!");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    graph4.setName("");
    node1.setOwner(graph4);
    node1.setOwnerNameDirectly("hi!");
    node1.setOwnerNameDirectly("[graph]");
    node1.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i15 = node1.getDegree();

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test012"); }


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
    int i49 = node2.getDegree();

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test013"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test014"); }


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
    node5.setOwnerNameDirectly("[graph]");
    node5.setOwnerNameDirectly("[graph]");
    graph0.addNode(node5);
    Node node32 = new Node("hi!");
    Graph graph33 = new Graph();
    node32.setOwner(graph33);
    graph33.setName("");
    graph33.name = "[graph]";
    node5.setOwner(graph33);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i40 = node5.getDegree();

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test015"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node41.thisIsNotCalled();

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test016"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    graph2.init();
    node1.setOwner(graph2);
    java.lang.String str6 = graph2.name;
    graph2.name = "[graph]";
    graph2.init();
    graph2.init();
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
    node29.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i56 = graph2.getDegree(node29);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test017"); }


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
    Graph graph27 = Graph.generateGraph();
    java.lang.String str28 = graph27.name;
    node26.setOwner(graph27);
    Graph graph30 = new Graph();
    node26.setOwner(graph30);
    node26.setOwnerNameDirectly("hi!");
    graph17.addNode(node26);
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
    Graph graph52 = new Graph();
    graph52.init();
    node36.setOwner(graph52);
    graph17.addNode(node36);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i56 = node36.getDegree();

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test018"); }


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
    Graph graph19 = Graph.generateGraph();
    java.lang.String str20 = graph19.name;
    graph19.name = "";
    graph19.name = "[graph]";
    graph19.setName("hi!");
    graph19.name = "";
    graph19.init();
    graph19.name = "hi!";
    Node node33 = new Node("");
    Graph graph34 = Graph.generateGraph();
    java.lang.String str35 = graph34.name;
    node33.setOwner(graph34);
    Graph graph37 = new Graph();
    node33.setOwner(graph37);
    node33.setOwnerNameDirectly("");
    graph19.addNode(node33);
    Node node43 = new Node("");
    Graph graph44 = Graph.generateGraph();
    java.lang.String str45 = graph44.name;
    node43.setOwner(graph44);
    Graph graph47 = new Graph();
    node43.setOwner(graph47);
    Node node50 = new Node("hi!");
    Node node52 = new Node("hi!");
    Graph graph53 = new Graph();
    node52.setOwner(graph53);
    graph53.setName("");
    node50.setOwner(graph53);
    java.lang.String str58 = graph53.name;
    node43.setOwner(graph53);
    Node node61 = new Node("");
    Graph graph62 = Graph.generateGraph();
    java.lang.String str63 = graph62.name;
    graph62.init();
    node61.setOwner(graph62);
    java.lang.String str66 = graph62.name;
    node43.setOwner(graph62);
    graph62.name = "hi!";
    node33.setOwner(graph62);
    Node node72 = new Node("");
    Graph graph73 = Graph.generateGraph();
    java.lang.String str74 = graph73.name;
    graph73.init();
    node72.setOwner(graph73);
    node33.setOwner(graph73);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph11.addNode(node33);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test019"); }


    Node node1 = new Node("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.setOwnerNameDirectly("");

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test020"); }


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
    int i31 = node2.getDegree();

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test021"); }


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
    node21.setOwnerName("[graph]");
    Node node54 = new Node("hi!");
    Graph graph55 = new Graph();
    node54.setOwner(graph55);
    graph55.setName("");
    graph55.init();
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
    node61.setOwnerName("hi!");
    Graph graph77 = new Graph();
    graph77.init();
    node61.setOwner(graph77);
    node61.setOwnerNameDirectly("");
    graph55.addNode(node61);
    node21.setOwner(graph55);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node21);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test022"); }


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
    node1.setOwnerNameDirectly("hi!");
    Node node20 = new Node("hi!");
    Node node22 = new Node("hi!");
    Graph graph23 = new Graph();
    node22.setOwner(graph23);
    graph23.setName("");
    node20.setOwner(graph23);
    node20.setOwnerNameDirectly("hi!");
    Node node31 = new Node("hi!");
    Graph graph32 = new Graph();
    node31.setOwner(graph32);
    graph32.setName("");
    graph32.setName("");
    graph32.init();
    node20.setOwner(graph32);
    Node node41 = new Node("");
    Graph graph42 = Graph.generateGraph();
    java.lang.String str43 = graph42.name;
    graph42.init();
    node41.setOwner(graph42);
    java.lang.String str46 = graph42.name;
    graph42.name = "[graph]";
    node20.setOwner(graph42);
    node1.setOwner(graph42);
    Node node52 = new Node("");
    Graph graph53 = Graph.generateGraph();
    java.lang.String str54 = graph53.name;
    graph53.init();
    node52.setOwner(graph53);
    java.lang.String str57 = graph53.name;
    graph53.name = "[graph]";
    graph53.name = "";
    graph53.setName("");
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
    node65.setOwnerName("hi!");
    node65.setOwnerName("hi!");
    node65.setOwnerName("[graph]");
    graph53.addNode(node65);
    node65.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i88 = graph42.getDegree(node65);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test023"); }


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
    node2.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node2.thisIsNotCalled();

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test024"); }


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
    Node node27 = new Node("hi!");
    Node node29 = new Node("hi!");
    Graph graph30 = new Graph();
    node29.setOwner(graph30);
    graph30.setName("");
    node27.setOwner(graph30);
    node27.setOwnerNameDirectly("hi!");
    node27.setOwnerNameDirectly("[graph]");
    Node node40 = new Node("");
    Graph graph41 = Graph.generateGraph();
    java.lang.String str42 = graph41.name;
    graph41.init();
    node40.setOwner(graph41);
    java.lang.String str45 = graph41.name;
    graph41.init();
    node27.setOwner(graph41);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i48 = graph19.getDegree(node27);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test025"); }


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
    Node node32 = new Node("hi!");
    Node node34 = new Node("hi!");
    Graph graph35 = new Graph();
    node34.setOwner(graph35);
    graph35.setName("");
    node32.setOwner(graph35);
    graph35.init();
    Node node42 = new Node("");
    Graph graph43 = Graph.generateGraph();
    java.lang.String str44 = graph43.name;
    node42.setOwner(graph43);
    Graph graph46 = new Graph();
    node42.setOwner(graph46);
    Node node49 = new Node("hi!");
    Node node51 = new Node("hi!");
    Graph graph52 = new Graph();
    node51.setOwner(graph52);
    graph52.setName("");
    node49.setOwner(graph52);
    java.lang.String str57 = graph52.name;
    node42.setOwner(graph52);
    Node node60 = new Node("");
    Graph graph61 = Graph.generateGraph();
    java.lang.String str62 = graph61.name;
    graph61.init();
    node60.setOwner(graph61);
    java.lang.String str65 = graph61.name;
    node42.setOwner(graph61);
    graph35.addNode(node42);
    node25.setOwner(graph35);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node25.thisIsNotCalled();

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test026"); }


    Graph graph0 = Graph.generateGraph();
    java.lang.String str1 = graph0.name;
    graph0.init();
    java.lang.String str3 = graph0.name;
    java.lang.String str4 = graph0.name;
    Node node6 = new Node("");
    Graph graph7 = Graph.generateGraph();
    java.lang.String str8 = graph7.name;
    graph7.init();
    node6.setOwner(graph7);
    java.lang.String str11 = graph7.name;
    graph7.name = "[graph]";
    java.lang.String str14 = graph7.name;
    graph7.name = "";
    graph7.init();
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
    node19.setOwnerName("hi!");
    node19.setOwnerName("hi!");
    node19.setOwnerNameDirectly("");
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
    java.lang.String str54 = graph48.name;
    graph48.setName("");
    graph48.setName("");
    node19.setOwner(graph48);
    node19.setOwnerName("[graph]");
    graph7.addNode(node19);
    Node node64 = new Node("hi!");
    Node node66 = new Node("hi!");
    Graph graph67 = new Graph();
    node66.setOwner(graph67);
    graph67.setName("");
    node64.setOwner(graph67);
    node64.setOwnerNameDirectly("hi!");
    Node node75 = new Node("hi!");
    Graph graph76 = new Graph();
    node75.setOwner(graph76);
    graph76.setName("");
    graph76.setName("");
    graph76.init();
    node64.setOwner(graph76);
    node64.setOwnerNameDirectly("");
    node64.setOwnerNameDirectly("hi!");
    graph7.addNode(node64);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i89 = graph0.getDegree(node64);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test027"); }


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
    graph15.init();
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
    graph15.addNode(node22);
    node22.setOwnerNameDirectly("");
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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph2.addEdge(node22, node51);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test028"); }


    Graph graph0 = new Graph();
    graph0.init();
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
    Graph graph22 = Graph.generateGraph();
    node5.setOwner(graph22);
    Node node25 = new Node("hi!");
    Node node27 = new Node("hi!");
    Graph graph28 = new Graph();
    node27.setOwner(graph28);
    graph28.setName("");
    node25.setOwner(graph28);
    graph22.addNode(node25);
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
    java.lang.String str49 = graph43.name;
    graph43.setName("");
    graph43.name = "";
    java.lang.String str54 = graph43.name;
    node25.setOwner(graph43);
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
    node57.setOwnerNameDirectly("[graph]");
    node57.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph0.addEdge(node25, node57);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test029"); }


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
    graph59.init();
    graph59.setName("");
    java.lang.String str83 = graph59.name;
    graph59.init();
    graph59.setName("hi!");
    node1.setOwner(graph59);
    node1.setOwnerName("[graph]");
    node1.setOwnerNameDirectly("");
    node1.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test030"); }


    Node node1 = new Node("hi!");
    Graph graph2 = new Graph();
    node1.setOwner(graph2);
    graph2.init();
    graph2.setName("hi!");
    Graph graph7 = Graph.generateGraph();
    java.lang.String str8 = graph7.name;
    graph7.init();
    Graph graph10 = Graph.generateGraph();
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
    graph10.addNode(node12);
    node12.setOwnerNameDirectly("hi!");
    node12.setOwnerNameDirectly("hi!");
    node12.setOwnerNameDirectly("[graph]");
    node12.setOwnerNameDirectly("[graph]");
    graph7.addNode(node12);
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
    Graph graph57 = Graph.generateGraph();
    node40.setOwner(graph57);
    Node node60 = new Node("hi!");
    Node node62 = new Node("hi!");
    Graph graph63 = new Graph();
    node62.setOwner(graph63);
    graph63.setName("");
    node60.setOwner(graph63);
    graph57.addNode(node60);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph2.addEdge(node12, node60);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test031"); }


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
    Node node27 = new Node("hi!");
    Graph graph28 = new Graph();
    node27.setOwner(graph28);
    node27.setOwnerNameDirectly("[graph]");
    Graph graph32 = new Graph();
    graph32.init();
    graph32.setName("");
    Node node37 = new Node("");
    graph32.addNode(node37);
    graph32.name = "";
    node27.setOwner(graph32);
    Node node43 = new Node("");
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
    graph44.name = "";
    node43.setOwner(graph44);
    Node node67 = new Node("hi!");
    Graph graph68 = new Graph();
    node67.setOwner(graph68);
    graph44.addNode(node67);
    graph32.addNode(node67);
    graph0.addNode(node67);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node67.thisIsNotCalled();

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test032"); }


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
    java.lang.String str27 = graph19.name;
    graph19.init();
    Node node30 = new Node("");
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
    node30.setOwner(graph31);
    Node node54 = new Node("hi!");
    Graph graph55 = new Graph();
    node54.setOwner(graph55);
    graph31.addNode(node54);
    Node node59 = new Node("");
    Graph graph60 = Graph.generateGraph();
    java.lang.String str61 = graph60.name;
    graph60.init();
    node59.setOwner(graph60);
    java.lang.String str64 = graph60.name;
    graph60.init();
    graph60.setName("");
    node54.setOwner(graph60);
    Node node70 = new Node("hi!");
    Node node72 = new Node("hi!");
    Graph graph73 = new Graph();
    node72.setOwner(graph73);
    graph73.setName("");
    node70.setOwner(graph73);
    node70.setOwnerNameDirectly("hi!");
    graph60.addNode(node70);
    node70.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i83 = graph19.getDegree(node70);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test033"); }


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
    node2.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i32 = node2.getDegree();

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test034"); }


    Node node1 = new Node("hi!");
    Graph graph2 = new Graph();
    node1.setOwner(graph2);
    graph2.setName("");
    graph2.setName("");
    graph2.setName("hi!");
    graph2.name = "[graph]";
    java.lang.String str12 = graph2.name;
    java.lang.String str13 = graph2.name;
    graph2.init();
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
    node16.setOwnerName("[graph]");
    Graph graph34 = Graph.generateGraph();
    java.lang.String str35 = graph34.name;
    graph34.name = "";
    java.lang.String str38 = graph34.name;
    graph34.init();
    node16.setOwner(graph34);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i41 = graph2.getDegree(node16);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test035"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    graph2.init();
    node1.setOwner(graph2);
    java.lang.String str6 = graph2.name;
    graph2.name = "[graph]";
    graph2.name = "";
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
    graph36.name = "";
    node35.setOwner(graph36);
    graph36.name = "hi!";
    graph36.init();
    node15.setOwner(graph36);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i62 = graph2.getDegree(node15);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test036"); }


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
    Node node86 = new Node("");
    Graph graph87 = Graph.generateGraph();
    java.lang.String str88 = graph87.name;
    node86.setOwner(graph87);
    Graph graph90 = new Graph();
    node86.setOwner(graph90);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node76.addEdge(node86);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test037"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node2.thisIsNotCalled();

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test038"); }


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
    node22.setOwnerName("hi!");
    node22.setOwnerNameDirectly("");
    Graph graph43 = Graph.generateGraph();
    java.lang.String str44 = graph43.name;
    graph43.init();
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
    node48.setOwnerNameDirectly("[graph]");
    node48.setOwnerNameDirectly("[graph]");
    graph43.addNode(node48);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph11.addEdge(node22, node48);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test039"); }


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
    graph0.init();
    Node node21 = new Node("");
    Graph graph22 = Graph.generateGraph();
    java.lang.String str23 = graph22.name;
    node21.setOwner(graph22);
    Graph graph25 = new Graph();
    node21.setOwner(graph25);
    node21.setOwnerNameDirectly("");
    node21.setOwnerNameDirectly("");
    graph0.addNode(node21);
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
    node33.setOwner(graph47);
    node33.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node21.addEdge(node33);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test040"); }


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
    node13.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node13.thisIsNotCalled();

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test041"); }


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
    node20.setOwnerName("hi!");
    Graph graph36 = new Graph();
    graph36.init();
    node20.setOwner(graph36);
    Node node40 = new Node("");
    graph36.addNode(node40);
    java.lang.String str42 = graph36.name;
    graph36.name = "";
    graph36.name = "hi!";
    graph36.name = "hi!";
    node1.setOwner(graph36);
    Node node51 = new Node("");
    Graph graph52 = Graph.generateGraph();
    java.lang.String str53 = graph52.name;
    node51.setOwner(graph52);
    Graph graph55 = new Graph();
    node51.setOwner(graph55);
    graph55.setName("hi!");
    node1.setOwner(graph55);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i60 = node1.getDegree();

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test042"); }


    Node node1 = new Node("");
    Node node3 = new Node("");
    Graph graph4 = Graph.generateGraph();
    java.lang.String str5 = graph4.name;
    graph4.init();
    node3.setOwner(graph4);
    java.lang.String str8 = graph4.name;
    graph4.name = "[graph]";
    java.lang.String str11 = graph4.name;
    graph4.name = "";
    graph4.init();
    graph4.init();
    node1.setOwner(graph4);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test043"); }


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
    graph0.init();
    Node node21 = new Node("");
    Graph graph22 = Graph.generateGraph();
    java.lang.String str23 = graph22.name;
    node21.setOwner(graph22);
    Graph graph25 = new Graph();
    node21.setOwner(graph25);
    node21.setOwnerNameDirectly("");
    node21.setOwnerNameDirectly("");
    graph0.addNode(node21);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i32 = node21.getDegree();

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test044"); }


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
    node7.setOwnerName("[graph]");
    node7.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i71 = graph2.getDegree(node7);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test045"); }


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
    Graph graph40 = Graph.generateGraph();
    node23.setOwner(graph40);
    Node node43 = new Node("");
    Graph graph44 = Graph.generateGraph();
    java.lang.String str45 = graph44.name;
    node43.setOwner(graph44);
    Graph graph47 = new Graph();
    node43.setOwner(graph47);
    Node node50 = new Node("hi!");
    Node node52 = new Node("hi!");
    Graph graph53 = new Graph();
    node52.setOwner(graph53);
    graph53.setName("");
    node50.setOwner(graph53);
    java.lang.String str58 = graph53.name;
    node43.setOwner(graph53);
    Node node61 = new Node("");
    Graph graph62 = Graph.generateGraph();
    java.lang.String str63 = graph62.name;
    graph62.init();
    node61.setOwner(graph62);
    java.lang.String str66 = graph62.name;
    node43.setOwner(graph62);
    graph62.name = "";
    node23.setOwner(graph62);
    node23.setOwnerNameDirectly("hi!");
    node23.setOwnerName("hi!");
    graph19.addNode(node23);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i76 = node23.getDegree();

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test046"); }


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
    Graph graph16 = new Graph();
    node15.setOwner(graph16);
    graph16.setName("");
    graph16.setName("");
    graph16.setName("hi!");
    graph16.init();
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
    Node node50 = new Node("hi!");
    Graph graph51 = new Graph();
    node50.setOwner(graph51);
    graph42.addNode(node50);
    graph16.addNode(node50);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i55 = graph4.getDegree(node50);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test047"); }


    Node node1 = new Node("hi!");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    graph4.setName("");
    node1.setOwner(graph4);
    graph4.init();
    graph4.init();
    graph4.init();
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
    Node node34 = new Node("");
    Graph graph35 = Graph.generateGraph();
    java.lang.String str36 = graph35.name;
    graph35.init();
    node34.setOwner(graph35);
    java.lang.String str39 = graph35.name;
    graph35.name = "[graph]";
    graph35.name = "";
    graph35.name = "";
    node13.setOwner(graph35);
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
    node49.setOwnerName("hi!");
    node49.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph4.addEdge(node13, node49);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test048"); }


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
    graph21.init();
    graph21.setName("");
    java.lang.String str45 = graph21.name;
    node1.setOwner(graph21);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test049"); }


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
    graph19.setName("hi!");
    graph19.init();
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
    node31.setOwnerNameDirectly("[graph]");
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
    node48.setOwner(graph64);
    graph64.name = "";
    node31.setOwner(graph64);
    node31.setOwnerName("");
    node31.setOwnerName("hi!");
    node31.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i93 = graph19.getDegree(node31);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test050"); }


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
    int i22 = node1.getDegree();

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test051"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i33 = node25.getDegree();

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test052"); }


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
    node2.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node2.thisIsNotCalled();

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test053"); }


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
    Node node18 = new Node("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node18);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test054"); }


    Node node1 = new Node("hi!");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    graph4.setName("");
    node1.setOwner(graph4);
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
    graph9.init();
    graph9.setName("");
    graph9.name = "";
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
    node53.setOwner(graph69);
    graph69.name = "";
    node36.setOwner(graph69);
    graph9.addNode(node36);
    node36.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph4.addNode(node36);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test055"); }


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
    graph34.init();
    Node node63 = new Node("");
    Node node65 = new Node("hi!");
    Graph graph66 = new Graph();
    node65.setOwner(graph66);
    node63.setOwner(graph66);
    node63.setOwnerNameDirectly("[graph]");
    node63.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i73 = graph34.getDegree(node63);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test056"); }


    Node node1 = new Node("hi!");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    graph4.setName("");
    node1.setOwner(graph4);
    Node node10 = new Node("");
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
    node10.setOwner(graph11);
    Node node34 = new Node("hi!");
    Graph graph35 = new Graph();
    node34.setOwner(graph35);
    graph11.addNode(node34);
    Node node39 = new Node("");
    Graph graph40 = Graph.generateGraph();
    java.lang.String str41 = graph40.name;
    graph40.init();
    node39.setOwner(graph40);
    java.lang.String str44 = graph40.name;
    graph40.init();
    graph40.setName("");
    node34.setOwner(graph40);
    Graph graph49 = Graph.generateGraph();
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
    graph49.addNode(node51);
    graph49.name = "";
    graph49.init();
    graph49.setName("");
    graph49.name = "";
    graph49.init();
    node34.setOwner(graph49);
    node34.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node34);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test057"); }


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
    graph13.init();
    node12.setOwner(graph13);
    java.lang.String str17 = graph13.name;
    graph13.name = "[graph]";
    java.lang.String str20 = graph13.name;
    graph13.name = "";
    graph13.init();
    graph13.name = "hi!";
    java.lang.String str26 = graph13.name;
    Node node28 = new Node("hi!");
    Graph graph29 = new Graph();
    node28.setOwner(graph29);
    graph29.setName("");
    graph29.setName("");
    graph29.setName("hi!");
    graph29.init();
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
    Node node54 = new Node("");
    Graph graph55 = Graph.generateGraph();
    java.lang.String str56 = graph55.name;
    node54.setOwner(graph55);
    graph55.setName("");
    java.lang.String str60 = graph55.name;
    node39.setOwner(graph55);
    Node node63 = new Node("hi!");
    Graph graph64 = new Graph();
    node63.setOwner(graph64);
    graph55.addNode(node63);
    graph29.addNode(node63);
    graph13.addNode(node63);
    node63.setOwnerName("[graph]");
    Node node72 = new Node("");
    Graph graph73 = Graph.generateGraph();
    java.lang.String str74 = graph73.name;
    graph73.init();
    node72.setOwner(graph73);
    java.lang.String str77 = graph73.name;
    graph73.name = "[graph]";
    java.lang.String str80 = graph73.name;
    graph73.name = "";
    graph73.init();
    graph73.init();
    node63.setOwner(graph73);
    graph2.addNode(node63);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i87 = node63.getDegree();

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test058"); }


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
    graph4.init();
    graph4.init();
    Node node40 = new Node("hi!");
    Node node42 = new Node("hi!");
    Graph graph43 = new Graph();
    node42.setOwner(graph43);
    graph43.setName("");
    node40.setOwner(graph43);
    node40.setOwnerNameDirectly("hi!");
    Node node51 = new Node("hi!");
    Graph graph52 = new Graph();
    node51.setOwner(graph52);
    graph52.setName("");
    graph52.setName("");
    graph52.setName("hi!");
    graph52.init();
    graph52.setName("[graph]");
    node40.setOwner(graph52);
    node40.setOwnerNameDirectly("[graph]");
    Node node67 = new Node("hi!");
    Node node69 = new Node("hi!");
    Graph graph70 = new Graph();
    node69.setOwner(graph70);
    graph70.setName("");
    node67.setOwner(graph70);
    node67.setOwnerNameDirectly("hi!");
    Node node78 = new Node("hi!");
    Graph graph79 = new Graph();
    node78.setOwner(graph79);
    graph79.setName("");
    graph79.setName("");
    graph79.setName("hi!");
    graph79.init();
    graph79.setName("[graph]");
    node67.setOwner(graph79);
    node67.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph4.addEdge(node40, node67);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test059"); }


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
    node36.setOwnerNameDirectly("[graph]");
    node36.setOwnerNameDirectly("");
    node36.setOwnerName("hi!");
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
    node49.setOwnerNameDirectly("[graph]");
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
    node49.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph21.addEdge(node36, node49);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test060"); }


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
    Graph graph34 = Graph.generateGraph();
    java.lang.String str35 = graph34.name;
    graph34.name = "";
    java.lang.String str38 = graph34.name;
    graph34.init();
    graph34.name = "hi!";
    node2.setOwner(graph34);
    node2.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i45 = node2.getDegree();

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test061"); }


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
    graph20.name = "";
    java.lang.String str28 = graph20.name;
    java.lang.String str29 = graph20.name;
    Graph graph30 = Graph.generateGraph();
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
    node32.setOwnerNameDirectly("hi!");
    graph30.addNode(node32);
    node32.setOwnerNameDirectly("hi!");
    Node node52 = new Node("hi!");
    Graph graph53 = new Graph();
    node52.setOwner(graph53);
    graph53.setName("");
    graph53.setName("");
    graph53.init();
    node32.setOwner(graph53);
    Node node62 = new Node("hi!");
    Node node64 = new Node("hi!");
    Graph graph65 = new Graph();
    node64.setOwner(graph65);
    graph65.setName("");
    node62.setOwner(graph65);
    node62.setOwnerNameDirectly("hi!");
    Node node73 = new Node("hi!");
    Graph graph74 = new Graph();
    node73.setOwner(graph74);
    graph74.setName("");
    graph74.setName("");
    graph74.init();
    node62.setOwner(graph74);
    node62.setOwnerName("hi!");
    graph53.addNode(node62);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i85 = graph20.getDegree(node62);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test062"); }


    Graph graph0 = new Graph();
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
    java.lang.String str26 = graph20.name;
    graph20.init();
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
    node30.setOwnerName("hi!");
    node30.setOwnerName("");
    graph20.addNode(node30);
    Node node53 = new Node("hi!");
    Graph graph54 = new Graph();
    node53.setOwner(graph54);
    node53.setOwnerName("[graph]");
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
    node53.setOwner(graph67);
    Node node75 = new Node("");
    Graph graph76 = Graph.generateGraph();
    java.lang.String str77 = graph76.name;
    graph76.init();
    node75.setOwner(graph76);
    java.lang.String str80 = graph76.name;
    graph76.name = "[graph]";
    node53.setOwner(graph76);
    node53.setOwnerName("[graph]");
    graph20.addNode(node53);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i87 = graph0.getDegree(node53);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test063"); }


    Node node1 = new Node("hi!");
    Graph graph2 = new Graph();
    node1.setOwner(graph2);
    graph2.setName("");
    graph2.setName("");
    graph2.setName("hi!");
    graph2.init();
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
    node14.setOwnerNameDirectly("hi!");
    Graph graph30 = Graph.generateGraph();
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
    node32.setOwnerNameDirectly("hi!");
    graph30.addNode(node32);
    node14.setOwner(graph30);
    node14.setOwnerNameDirectly("");
    node14.setOwnerName("");
    Graph graph54 = new Graph();
    graph54.init();
    graph54.setName("");
    java.lang.String str58 = graph54.name;
    graph54.init();
    Node node61 = new Node("");
    Graph graph62 = Graph.generateGraph();
    java.lang.String str63 = graph62.name;
    node61.setOwner(graph62);
    Graph graph65 = new Graph();
    node61.setOwner(graph65);
    graph54.addNode(node61);
    node61.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph2.addEdge(node14, node61);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test064"); }


    Graph graph0 = new Graph();
    graph0.init();
    graph0.setName("");
    java.lang.String str4 = graph0.name;
    graph0.init();
    Node node7 = new Node("");
    Graph graph8 = Graph.generateGraph();
    java.lang.String str9 = graph8.name;
    node7.setOwner(graph8);
    Graph graph11 = new Graph();
    node7.setOwner(graph11);
    graph0.addNode(node7);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node7.thisIsNotCalled();

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test065"); }


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
    Node node38 = new Node("hi!");
    Node node40 = new Node("hi!");
    Graph graph41 = new Graph();
    node40.setOwner(graph41);
    graph41.setName("");
    node38.setOwner(graph41);
    graph35.addNode(node38);
    node38.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph9.addNode(node38);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test066"); }


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
    node13.setOwnerName("hi!");
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
    node38.setOwnerName("[graph]");
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
    node38.setOwner(graph65);
    graph65.name = "hi!";
    node13.setOwner(graph65);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node13.thisIsNotCalled();

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test067"); }


    Node node1 = new Node("hi!");
    Graph graph2 = new Graph();
    node1.setOwner(graph2);
    graph2.name = "";
    graph2.setName("hi!");
    Node node9 = new Node("hi!");
    Graph graph10 = new Graph();
    node9.setOwner(graph10);
    node9.setOwnerName("[graph]");
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
    node9.setOwner(graph23);
    Node node31 = new Node("");
    Graph graph32 = Graph.generateGraph();
    java.lang.String str33 = graph32.name;
    graph32.init();
    node31.setOwner(graph32);
    java.lang.String str36 = graph32.name;
    graph32.name = "[graph]";
    node9.setOwner(graph32);
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
    node41.setOwnerNameDirectly("[graph]");
    node41.setOwnerNameDirectly("[graph]");
    Graph graph59 = Graph.generateGraph();
    java.lang.String str60 = graph59.name;
    graph59.name = "";
    graph59.name = "[graph]";
    graph59.setName("hi!");
    graph59.name = "";
    graph59.init();
    graph59.name = "hi!";
    Node node73 = new Node("");
    Graph graph74 = Graph.generateGraph();
    java.lang.String str75 = graph74.name;
    node73.setOwner(graph74);
    Graph graph77 = new Graph();
    node73.setOwner(graph77);
    node73.setOwnerNameDirectly("");
    graph59.addNode(node73);
    node41.setOwner(graph59);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph2.addEdge(node9, node41);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test068"); }


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
    graph40.name = "hi!";
    graph40.init();
    Node node72 = new Node("");
    Node node74 = new Node("hi!");
    Graph graph75 = new Graph();
    node74.setOwner(graph75);
    node72.setOwner(graph75);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i78 = graph40.getDegree(node72);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test069"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    graph2.init();
    node1.setOwner(graph2);
    java.lang.String str6 = graph2.name;
    graph2.setName("");
    java.lang.String str9 = graph2.name;
    java.lang.String str10 = graph2.name;
    graph2.init();
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
    Graph graph57 = Graph.generateGraph();
    node40.setOwner(graph57);
    Node node60 = new Node("");
    Graph graph61 = Graph.generateGraph();
    java.lang.String str62 = graph61.name;
    node60.setOwner(graph61);
    Graph graph64 = new Graph();
    node60.setOwner(graph64);
    Node node67 = new Node("hi!");
    Node node69 = new Node("hi!");
    Graph graph70 = new Graph();
    node69.setOwner(graph70);
    graph70.setName("");
    node67.setOwner(graph70);
    java.lang.String str75 = graph70.name;
    node60.setOwner(graph70);
    Node node78 = new Node("");
    Graph graph79 = Graph.generateGraph();
    java.lang.String str80 = graph79.name;
    graph79.init();
    node78.setOwner(graph79);
    java.lang.String str83 = graph79.name;
    node60.setOwner(graph79);
    graph79.name = "";
    node40.setOwner(graph79);
    graph32.addNode(node40);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i89 = graph2.getDegree(node40);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test070"); }


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
    Node node35 = new Node("hi!");
    Graph graph36 = new Graph();
    node35.setOwner(graph36);
    node35.setOwnerName("[graph]");
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
    node35.setOwner(graph49);
    node13.setOwner(graph49);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i57 = node13.getDegree();

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test071"); }


    Node node1 = new Node("hi!");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    graph4.setName("");
    node1.setOwner(graph4);
    graph4.setName("");
    graph4.setName("");
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
    node14.setOwnerNameDirectly("[graph]");
    node14.setOwnerName("");
    node14.setOwnerName("[graph]");
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
    graph34.init();
    graph34.setName("");
    java.lang.String str58 = graph34.name;
    node14.setOwner(graph34);
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
    Node node85 = new Node("hi!");
    Graph graph86 = new Graph();
    node85.setOwner(graph86);
    graph62.addNode(node85);
    node85.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph4.addEdge(node14, node85);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test072"); }


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
    node1.setOwnerNameDirectly("");
    node1.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test073"); }


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
    node37.setOwner(graph53);
    graph53.name = "";
    node20.setOwner(graph53);
    node20.setOwnerName("");
    node20.setOwnerNameDirectly("hi!");
    node20.setOwnerNameDirectly("hi!");
    Node node83 = new Node("hi!");
    Graph graph84 = new Graph();
    node83.setOwner(graph84);
    graph84.setName("");
    graph84.setName("");
    graph84.init();
    node20.setOwner(graph84);
    node20.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i94 = graph0.getDegree(node20);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test074"); }


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
    Graph graph46 = Graph.generateGraph();
    java.lang.String str47 = graph46.name;
    node45.setOwner(graph46);
    graph46.setName("");
    java.lang.String str51 = graph46.name;
    node33.setOwner(graph46);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i53 = graph2.getDegree(node33);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test075"); }


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
    int i92 = node70.getDegree();

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test076"); }


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
    graph30.init();
    graph30.name = "hi!";
    node1.setOwner(graph30);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test077"); }


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
    node1.setOwnerNameDirectly("[graph]");
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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node29);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test078"); }


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
    Node node37 = new Node("");
    Graph graph38 = Graph.generateGraph();
    java.lang.String str39 = graph38.name;
    node37.setOwner(graph38);
    Graph graph41 = new Graph();
    node37.setOwner(graph41);
    Node node44 = new Node("hi!");
    Node node46 = new Node("hi!");
    Graph graph47 = new Graph();
    node46.setOwner(graph47);
    graph47.setName("");
    node44.setOwner(graph47);
    java.lang.String str52 = graph47.name;
    node37.setOwner(graph47);
    Node node55 = new Node("");
    Graph graph56 = Graph.generateGraph();
    java.lang.String str57 = graph56.name;
    graph56.init();
    node55.setOwner(graph56);
    java.lang.String str60 = graph56.name;
    node37.setOwner(graph56);
    graph56.name = "";
    node17.setOwner(graph56);
    node17.setOwnerNameDirectly("hi!");
    node17.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i69 = graph2.getDegree(node17);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test079"); }


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
    node1.setOwnerNameDirectly("[graph]");
    node1.setOwnerName("[graph]");
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
    graph48.init();
    graph48.init();
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
    node57.setOwnerNameDirectly("[graph]");
    node57.setOwnerName("");
    node57.setOwnerName("[graph]");
    graph48.addNode(node57);
    node57.setOwnerNameDirectly("hi!");
    node57.setOwnerName("");
    node57.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node57);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test080"); }


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
    java.lang.String str24 = graph0.name;
    graph0.init();
    graph0.setName("hi!");
    Node node29 = new Node("");
    Graph graph30 = Graph.generateGraph();
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
    node32.setOwnerNameDirectly("hi!");
    graph30.addNode(node32);
    graph30.name = "";
    node29.setOwner(graph30);
    Node node53 = new Node("hi!");
    Graph graph54 = new Graph();
    node53.setOwner(graph54);
    graph30.addNode(node53);
    Node node58 = new Node("");
    Graph graph59 = Graph.generateGraph();
    java.lang.String str60 = graph59.name;
    graph59.init();
    node58.setOwner(graph59);
    java.lang.String str63 = graph59.name;
    graph59.init();
    graph59.setName("");
    node53.setOwner(graph59);
    Node node69 = new Node("hi!");
    Node node71 = new Node("hi!");
    Graph graph72 = new Graph();
    node71.setOwner(graph72);
    graph72.setName("");
    node69.setOwner(graph72);
    node69.setOwnerNameDirectly("hi!");
    graph59.addNode(node69);
    node69.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i82 = graph0.getDegree(node69);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test081"); }


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
    graph19.name = "hi!";
    graph19.init();
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
    node25.setOwnerNameDirectly("[graph]");
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
    graph58.name = "";
    node25.setOwner(graph58);
    node25.setOwnerName("");
    node25.setOwnerName("hi!");
    node25.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i87 = graph19.getDegree(node25);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test082"); }


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
    node28.setOwnerNameDirectly("hi!");
    Node node47 = new Node("hi!");
    Node node49 = new Node("hi!");
    Graph graph50 = new Graph();
    node49.setOwner(graph50);
    graph50.setName("");
    node47.setOwner(graph50);
    node47.setOwnerNameDirectly("hi!");
    Node node58 = new Node("hi!");
    Graph graph59 = new Graph();
    node58.setOwner(graph59);
    graph59.setName("");
    graph59.setName("");
    graph59.init();
    node47.setOwner(graph59);
    Node node68 = new Node("");
    Graph graph69 = Graph.generateGraph();
    java.lang.String str70 = graph69.name;
    graph69.init();
    node68.setOwner(graph69);
    java.lang.String str73 = graph69.name;
    graph69.name = "[graph]";
    node47.setOwner(graph69);
    node28.setOwner(graph69);
    node28.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i80 = graph2.getDegree(node28);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test083"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i42 = node1.getDegree();

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test084"); }


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
    Node node42 = new Node("");
    Graph graph43 = Graph.generateGraph();
    java.lang.String str44 = graph43.name;
    graph43.init();
    node42.setOwner(graph43);
    java.lang.String str47 = graph43.name;
    graph43.name = "[graph]";
    graph43.name = "";
    graph43.setName("");
    java.lang.String str54 = graph43.name;
    node1.setOwner(graph43);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i56 = node1.getDegree();

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test085"); }


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
    node1.setOwnerNameDirectly("");
    node1.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i26 = node1.getDegree();

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test086"); }


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
    node31.setOwnerNameDirectly("[graph]");
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
    node48.setOwner(graph64);
    graph64.name = "";
    node31.setOwner(graph64);
    node31.setOwnerName("");
    node31.setOwnerName("hi!");
    node31.setOwnerName("[graph]");
    node31.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node2.addEdge(node31);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test087"); }


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
    Node node40 = new Node("");
    Graph graph41 = Graph.generateGraph();
    java.lang.String str42 = graph41.name;
    node40.setOwner(graph41);
    node40.setOwnerNameDirectly("");
    node40.setOwnerNameDirectly("[graph]");
    node40.setOwnerNameDirectly("hi!");
    node40.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node40);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test088"); }


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
    java.lang.String str26 = graph2.name;
    Graph graph27 = Graph.generateGraph();
    java.lang.String str28 = graph27.name;
    graph27.init();
    Graph graph30 = Graph.generateGraph();
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
    node32.setOwnerNameDirectly("hi!");
    graph30.addNode(node32);
    node32.setOwnerNameDirectly("hi!");
    node32.setOwnerNameDirectly("hi!");
    node32.setOwnerNameDirectly("[graph]");
    node32.setOwnerNameDirectly("[graph]");
    graph27.addNode(node32);
    Node node59 = new Node("hi!");
    Graph graph60 = new Graph();
    node59.setOwner(graph60);
    graph60.setName("");
    graph60.name = "[graph]";
    node32.setOwner(graph60);
    graph2.addNode(node32);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i68 = node32.getDegree();

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test089"); }


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
    java.lang.String str24 = graph17.name;
    graph17.name = "hi!";
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
    node28.setOwnerName("[graph]");
    node28.setOwnerName("[graph]");
    graph17.addNode(node28);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node28.thisIsNotCalled();

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test090"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    node1.setOwnerNameDirectly("[graph]");
    node1.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test091"); }


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
    node6.setOwnerNameDirectly("");
    node6.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph2.addNode(node6);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test092"); }


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
    node38.setOwnerName("hi!");
    node38.setOwnerName("");
    Graph graph59 = new Graph();
    graph59.init();
    java.lang.String str61 = graph59.name;
    graph59.init();
    graph59.name = "hi!";
    node38.setOwner(graph59);
    node38.setOwnerName("hi!");
    node38.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node38);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test093"); }


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
    Node node33 = new Node("");
    Graph graph34 = Graph.generateGraph();
    java.lang.String str35 = graph34.name;
    graph34.init();
    node33.setOwner(graph34);
    java.lang.String str38 = graph34.name;
    graph34.init();
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
    graph34.addNode(node41);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node13.addEdge(node41);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test094"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    node1.setOwner(graph2);
    Graph graph5 = new Graph();
    node1.setOwner(graph5);
    node1.setOwnerName("");
    Node node10 = new Node("");
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
    node10.setOwner(graph11);
    Node node34 = new Node("hi!");
    Graph graph35 = new Graph();
    node34.setOwner(graph35);
    graph11.addNode(node34);
    node34.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node34);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test095"); }


    Node node1 = new Node("hi!");
    Node node3 = new Node("");
    Graph graph4 = Graph.generateGraph();
    java.lang.String str5 = graph4.name;
    graph4.init();
    node3.setOwner(graph4);
    java.lang.String str8 = graph4.name;
    graph4.name = "[graph]";
    graph4.init();
    java.lang.String str12 = graph4.name;
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
    node31.setOwner(graph47);
    graph47.name = "";
    graph47.name = "[graph]";
    node14.setOwner(graph47);
    graph4.addNode(node14);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node14);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test096"); }


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
    Graph graph34 = Graph.generateGraph();
    java.lang.String str35 = graph34.name;
    graph34.name = "";
    java.lang.String str38 = graph34.name;
    graph34.init();
    graph34.name = "hi!";
    node2.setOwner(graph34);
    node2.setOwnerName("");
    Node node46 = new Node("hi!");
    Node node48 = new Node("hi!");
    Graph graph49 = new Graph();
    node48.setOwner(graph49);
    graph49.setName("");
    node46.setOwner(graph49);
    node46.setOwnerNameDirectly("hi!");
    node46.setOwnerNameDirectly("[graph]");
    Node node59 = new Node("");
    Graph graph60 = Graph.generateGraph();
    java.lang.String str61 = graph60.name;
    graph60.init();
    node59.setOwner(graph60);
    java.lang.String str64 = graph60.name;
    graph60.init();
    node46.setOwner(graph60);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node2.addEdge(node46);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test097"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    graph2.init();
    node1.setOwner(graph2);
    graph2.name = "hi!";
    java.lang.String str8 = graph2.name;
    graph2.name = "";
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
    node13.setOwnerName("hi!");
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
    Graph graph48 = Graph.generateGraph();
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
    node50.setOwnerNameDirectly("hi!");
    graph48.addNode(node50);
    node32.setOwner(graph48);
    node32.setOwnerName("[graph]");
    node32.setOwnerName("[graph]");
    node32.setOwnerNameDirectly("");
    node32.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph2.addEdge(node13, node32);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test098"); }


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
    node41.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node41.thisIsNotCalled();

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test099"); }


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
    node1.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i24 = node1.getDegree();

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test100"); }


    Node node1 = new Node("hi!");
    Graph graph2 = new Graph();
    node1.setOwner(graph2);
    graph2.init();
    graph2.init();
    graph2.name = "hi!";
    Graph graph8 = Graph.generateGraph();
    java.lang.String str9 = graph8.name;
    graph8.init();
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
    graph8.addNode(node38);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i96 = graph2.getDegree(node38);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test101"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    graph2.init();
    node1.setOwner(graph2);
    java.lang.String str6 = graph2.name;
    graph2.setName("");
    graph2.name = "hi!";
    graph2.name = "";
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
    Node node33 = new Node("hi!");
    Graph graph34 = new Graph();
    node33.setOwner(graph34);
    graph34.setName("");
    graph34.setName("");
    graph34.setName("hi!");
    graph34.init();
    graph34.setName("[graph]");
    java.lang.String str45 = graph34.name;
    java.lang.String str46 = graph34.name;
    node15.setOwner(graph34);
    Node node49 = new Node("hi!");
    Node node51 = new Node("hi!");
    Graph graph52 = new Graph();
    node51.setOwner(graph52);
    graph52.setName("");
    node49.setOwner(graph52);
    node49.setOwnerNameDirectly("hi!");
    Node node60 = new Node("hi!");
    Graph graph61 = new Graph();
    node60.setOwner(graph61);
    graph61.setName("");
    graph61.setName("");
    graph61.setName("hi!");
    graph61.init();
    graph61.setName("[graph]");
    node49.setOwner(graph61);
    node49.setOwnerNameDirectly("[graph]");
    graph34.addNode(node49);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i76 = graph2.getDegree(node49);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test102"); }


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
    graph59.init();
    graph59.setName("");
    java.lang.String str83 = graph59.name;
    graph59.init();
    graph59.setName("hi!");
    node1.setOwner(graph59);
    node1.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i90 = node1.getDegree();

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test103"); }


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
    node52.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i74 = node52.getDegree();

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test104"); }


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
    node1.setOwnerNameDirectly("");
    Node node24 = new Node("hi!");
    Graph graph25 = new Graph();
    node24.setOwner(graph25);
    graph25.setName("");
    graph25.name = "[graph]";
    java.lang.String str31 = graph25.name;
    node1.setOwner(graph25);
    Node node34 = new Node("");
    Graph graph35 = Graph.generateGraph();
    java.lang.String str36 = graph35.name;
    graph35.init();
    node34.setOwner(graph35);
    java.lang.String str39 = graph35.name;
    graph35.setName("");
    graph35.setName("hi!");
    graph35.name = "hi!";
    graph35.init();
    graph35.name = "[graph]";
    node1.setOwner(graph35);
    node1.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test105"); }


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
    node70.setOwnerName("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node70.thisIsNotCalled();

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test106"); }


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
    node27.setOwnerName("");
    Graph graph45 = new Graph();
    graph45.init();
    graph45.setName("");
    java.lang.String str49 = graph45.name;
    node27.setOwner(graph45);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.addEdge(node27);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test107"); }


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
    Graph graph73 = new Graph();
    graph73.init();
    java.lang.String str75 = graph73.name;
    Node node77 = new Node("");
    Graph graph78 = Graph.generateGraph();
    java.lang.String str79 = graph78.name;
    node77.setOwner(graph78);
    graph73.addNode(node77);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i82 = graph65.getDegree(node77);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test108"); }


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
    node31.setOwnerNameDirectly("[graph]");
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
    node48.setOwner(graph64);
    graph64.name = "";
    node31.setOwner(graph64);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i87 = graph2.getDegree(node31);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test109"); }


    Node node1 = new Node("hi!");
    Graph graph2 = new Graph();
    node1.setOwner(graph2);
    graph2.init();
    graph2.init();
    graph2.name = "hi!";
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
    node30.setOwnerName("");
    Node node42 = new Node("hi!");
    Graph graph43 = new Graph();
    node42.setOwner(graph43);
    graph43.init();
    graph43.init();
    graph43.name = "hi!";
    java.lang.String str49 = graph43.name;
    node30.setOwner(graph43);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i51 = graph2.getDegree(node30);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test110"); }


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
    graph47.name = "";
    graph47.init();
    graph47.setName("");
    java.lang.String str71 = graph47.name;
    graph47.init();
    graph47.setName("hi!");
    graph47.init();
    node1.setOwner(graph47);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i77 = node1.getDegree();

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test111"); }


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
    Node node62 = new Node("");
    Graph graph63 = Graph.generateGraph();
    java.lang.String str64 = graph63.name;
    graph63.init();
    node62.setOwner(graph63);
    java.lang.String str67 = graph63.name;
    graph63.init();
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
    graph63.addNode(node70);
    graph63.name = "";
    graph63.setName("[graph]");
    node1.setOwner(graph63);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test112"); }


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
    graph0.init();
    Node node21 = new Node("");
    Graph graph22 = Graph.generateGraph();
    java.lang.String str23 = graph22.name;
    node21.setOwner(graph22);
    Graph graph25 = new Graph();
    node21.setOwner(graph25);
    node21.setOwnerNameDirectly("");
    node21.setOwnerNameDirectly("");
    graph0.addNode(node21);
    node21.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node21.thisIsNotCalled();

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test113"); }


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
    Node node24 = new Node("hi!");
    Node node26 = new Node("hi!");
    Graph graph27 = new Graph();
    node26.setOwner(graph27);
    graph27.setName("");
    node24.setOwner(graph27);
    node24.setOwnerNameDirectly("hi!");
    node24.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i36 = graph9.getDegree(node24);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test114"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i70 = node11.getDegree();

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test115"); }


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
    graph28.name = "hi!";
    graph28.name = "[graph]";
    java.lang.String str39 = graph28.name;
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
    node58.setOwnerNameDirectly("hi!");
    node58.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph28.addNode(node58);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test116"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    node1.setOwner(graph2);
    Graph graph5 = new Graph();
    node1.setOwner(graph5);
    graph5.setName("[graph]");
    graph5.setName("[graph]");
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
    graph45.name = "";
    node12.setOwner(graph45);
    node12.setOwnerName("");
    node12.setOwnerNameDirectly("hi!");
    node12.setOwnerNameDirectly("hi!");
    Node node75 = new Node("hi!");
    Graph graph76 = new Graph();
    node75.setOwner(graph76);
    graph76.setName("");
    graph76.setName("");
    graph76.init();
    node12.setOwner(graph76);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i84 = graph5.getDegree(node12);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test117"); }


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
    Graph graph40 = Graph.generateGraph();
    java.lang.String str41 = graph40.name;
    node39.setOwner(graph40);
    graph40.setName("");
    java.lang.String str45 = graph40.name;
    node27.setOwner(graph40);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node27.thisIsNotCalled();

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test118"); }


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
    Node node27 = new Node("hi!");
    Graph graph28 = new Graph();
    node27.setOwner(graph28);
    graph28.setName("");
    node25.setOwner(graph28);
    node25.setOwnerNameDirectly("hi!");
    node25.setOwnerNameDirectly("[graph]");
    Node node38 = new Node("");
    Graph graph39 = Graph.generateGraph();
    java.lang.String str40 = graph39.name;
    graph39.init();
    node38.setOwner(graph39);
    java.lang.String str43 = graph39.name;
    graph39.init();
    node25.setOwner(graph39);
    Node node47 = new Node("hi!");
    Node node49 = new Node("hi!");
    Graph graph50 = new Graph();
    node49.setOwner(graph50);
    graph50.setName("");
    node47.setOwner(graph50);
    node47.setOwnerNameDirectly("hi!");
    node47.setOwnerNameDirectly("[graph]");
    Node node60 = new Node("");
    Graph graph61 = Graph.generateGraph();
    java.lang.String str62 = graph61.name;
    graph61.init();
    node60.setOwner(graph61);
    java.lang.String str65 = graph61.name;
    graph61.init();
    node47.setOwner(graph61);
    graph39.addNode(node47);
    Graph graph69 = Graph.generateGraph();
    java.lang.String str70 = graph69.name;
    graph69.name = "";
    java.lang.String str73 = graph69.name;
    graph69.init();
    node47.setOwner(graph69);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i76 = graph17.getDegree(node47);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test119"); }


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
    int i38 = node27.getDegree();

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test120"); }


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
    java.lang.String str38 = graph32.name;
    graph32.setName("");
    graph32.name = "";
    node2.setOwner(graph32);
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
    node45.setOwnerNameDirectly("[graph]");
    node45.setOwnerName("");
    Graph graph63 = Graph.generateGraph();
    java.lang.String str64 = graph63.name;
    graph63.name = "";
    graph63.name = "[graph]";
    graph63.setName("hi!");
    node45.setOwner(graph63);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph32.addNode(node45);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test121"); }


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
    node1.setOwner(graph24);
    node1.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i34 = node1.getDegree();

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test122"); }


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
    int i41 = node1.getDegree();

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test123"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    graph2.init();
    node1.setOwner(graph2);
    java.lang.String str6 = graph2.name;
    graph2.setName("");
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
    node12.setOwnerNameDirectly("[graph]");
    node12.setOwnerName("");
    Graph graph30 = new Graph();
    graph30.init();
    graph30.setName("");
    java.lang.String str34 = graph30.name;
    node12.setOwner(graph30);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i36 = graph2.getDegree(node12);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test124"); }


    Node node1 = new Node("hi!");
    Graph graph2 = new Graph();
    node1.setOwner(graph2);
    graph2.name = "";
    graph2.setName("hi!");
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
    Node node24 = new Node("");
    Graph graph25 = Graph.generateGraph();
    java.lang.String str26 = graph25.name;
    node24.setOwner(graph25);
    graph25.setName("");
    java.lang.String str30 = graph25.name;
    node9.setOwner(graph25);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph2.addNode(node9);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test125"); }


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
    node27.setOwnerName("[graph]");
    node27.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node27.thisIsNotCalled();

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test126"); }


    Node node1 = new Node("hi!");
    Graph graph2 = new Graph();
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("[graph]");
    Graph graph6 = new Graph();
    graph6.init();
    graph6.setName("");
    Node node11 = new Node("");
    graph6.addNode(node11);
    graph6.name = "";
    node1.setOwner(graph6);
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
    graph6.addNode(node41);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node41.thisIsNotCalled();

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test127"); }


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
    node11.setOwnerNameDirectly("");
    Node node40 = new Node("hi!");
    Graph graph41 = new Graph();
    node40.setOwner(graph41);
    graph41.setName("");
    graph41.setName("");
    graph41.init();
    Node node49 = new Node("");
    Graph graph50 = Graph.generateGraph();
    java.lang.String str51 = graph50.name;
    graph50.init();
    node49.setOwner(graph50);
    graph50.name = "hi!";
    Graph graph56 = new Graph();
    graph56.init();
    graph56.setName("");
    Node node61 = new Node("");
    graph56.addNode(node61);
    graph50.addNode(node61);
    graph41.addNode(node61);
    graph41.name = "";
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
    node69.setOwnerName("hi!");
    graph41.addNode(node69);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node11.addEdge(node69);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test128"); }


    Graph graph0 = new Graph();
    graph0.init();
    java.lang.String str2 = graph0.name;
    Node node4 = new Node("");
    Graph graph5 = Graph.generateGraph();
    java.lang.String str6 = graph5.name;
    node4.setOwner(graph5);
    graph0.addNode(node4);
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
    node27.setOwner(graph43);
    graph43.name = "";
    node10.setOwner(graph43);
    node10.setOwnerName("");
    node10.setOwnerName("hi!");
    node10.setOwnerName("[graph]");
    node10.setOwnerName("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i74 = graph0.getDegree(node10);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test129"); }


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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test130"); }


    Node node1 = new Node("hi!");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    graph4.setName("");
    node1.setOwner(graph4);
    graph4.name = "hi!";
    graph4.setName("hi!");
    graph4.name = "[graph]";
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
    node31.setOwner(graph47);
    node16.setOwner(graph47);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph4.addNode(node16);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test131"); }


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
    node41.setOwnerNameDirectly("");
    node41.setOwnerNameDirectly("hi!");
    Node node57 = new Node("hi!");
    Node node59 = new Node("hi!");
    Graph graph60 = new Graph();
    node59.setOwner(graph60);
    graph60.setName("");
    node57.setOwner(graph60);
    node57.setOwnerNameDirectly("hi!");
    Node node68 = new Node("hi!");
    Graph graph69 = new Graph();
    node68.setOwner(graph69);
    graph69.setName("");
    graph69.setName("");
    graph69.init();
    node57.setOwner(graph69);
    Node node78 = new Node("");
    Graph graph79 = Graph.generateGraph();
    java.lang.String str80 = graph79.name;
    graph79.init();
    node78.setOwner(graph79);
    java.lang.String str83 = graph79.name;
    graph79.name = "[graph]";
    node57.setOwner(graph79);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node41.addEdge(node57);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test132"); }


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
    node40.setOwnerName("hi!");
    node40.setOwnerName("hi!");
    node40.setOwnerNameDirectly("");
    node40.setOwnerNameDirectly("");
    Node node63 = new Node("hi!");
    Graph graph64 = new Graph();
    node63.setOwner(graph64);
    graph64.setName("");
    graph64.name = "[graph]";
    java.lang.String str70 = graph64.name;
    node40.setOwner(graph64);
    Node node73 = new Node("");
    Graph graph74 = Graph.generateGraph();
    java.lang.String str75 = graph74.name;
    graph74.init();
    node73.setOwner(graph74);
    java.lang.String str78 = graph74.name;
    graph74.setName("");
    graph74.setName("hi!");
    graph74.name = "hi!";
    graph74.init();
    graph74.name = "[graph]";
    node40.setOwner(graph74);
    node40.setOwnerNameDirectly("");
    node40.setOwnerName("");
    node40.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node18.addEdge(node40);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test133"); }


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
    java.lang.String str16 = graph0.name;
    Node node18 = new Node("hi!");
    Node node20 = new Node("hi!");
    Graph graph21 = new Graph();
    node20.setOwner(graph21);
    graph21.setName("");
    node18.setOwner(graph21);
    node18.setOwnerNameDirectly("hi!");
    node18.setOwnerNameDirectly("[graph]");
    Node node31 = new Node("");
    Graph graph32 = Graph.generateGraph();
    java.lang.String str33 = graph32.name;
    graph32.init();
    node31.setOwner(graph32);
    java.lang.String str36 = graph32.name;
    graph32.init();
    node18.setOwner(graph32);
    Node node40 = new Node("hi!");
    Node node42 = new Node("hi!");
    Graph graph43 = new Graph();
    node42.setOwner(graph43);
    graph43.setName("");
    node40.setOwner(graph43);
    node40.setOwnerNameDirectly("hi!");
    node40.setOwnerNameDirectly("[graph]");
    Node node53 = new Node("");
    Graph graph54 = Graph.generateGraph();
    java.lang.String str55 = graph54.name;
    graph54.init();
    node53.setOwner(graph54);
    java.lang.String str58 = graph54.name;
    graph54.init();
    node40.setOwner(graph54);
    graph32.addNode(node40);
    node40.setOwnerNameDirectly("");
    graph0.addNode(node40);
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
    node67.setOwnerNameDirectly("hi!");
    node67.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node40.addEdge(node67);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test134"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    node1.setOwnerNameDirectly("[graph]");
    node1.setOwnerNameDirectly("");
    node1.setOwnerNameDirectly("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test135"); }


    Node node1 = new Node("");
    Node node3 = new Node("hi!");
    Graph graph4 = new Graph();
    node3.setOwner(graph4);
    node1.setOwner(graph4);
    java.lang.String str7 = graph4.name;
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
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    graph4.addNode(node9);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test136"); }


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
    node16.setOwnerNameDirectly("hi!");
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
    node16.setOwner(graph32);
    node1.setOwner(graph32);
    Node node54 = new Node("");
    Graph graph55 = Graph.generateGraph();
    java.lang.String str56 = graph55.name;
    node54.setOwner(graph55);
    Graph graph58 = new Graph();
    node54.setOwner(graph58);
    node54.setOwnerNameDirectly("[graph]");
    node54.setOwnerName("hi!");
    graph32.addNode(node54);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i65 = node54.getDegree();

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test137"); }


    Graph graph0 = new Graph();
    graph0.init();
    java.lang.String str2 = graph0.name;
    Node node4 = new Node("");
    Graph graph5 = Graph.generateGraph();
    java.lang.String str6 = graph5.name;
    node4.setOwner(graph5);
    graph0.addNode(node4);
    graph0.init();
    graph0.setName("hi!");
    Node node13 = new Node("hi!");
    Node node15 = new Node("hi!");
    Graph graph16 = new Graph();
    node15.setOwner(graph16);
    graph16.setName("");
    node13.setOwner(graph16);
    node13.setOwnerNameDirectly("hi!");
    node13.setOwnerNameDirectly("[graph]");
    Node node26 = new Node("");
    Graph graph27 = Graph.generateGraph();
    java.lang.String str28 = graph27.name;
    graph27.init();
    node26.setOwner(graph27);
    java.lang.String str31 = graph27.name;
    graph27.init();
    node13.setOwner(graph27);
    Node node35 = new Node("hi!");
    Node node37 = new Node("hi!");
    Graph graph38 = new Graph();
    node37.setOwner(graph38);
    graph38.setName("");
    node35.setOwner(graph38);
    node35.setOwnerNameDirectly("hi!");
    node35.setOwnerNameDirectly("[graph]");
    Node node48 = new Node("");
    Graph graph49 = Graph.generateGraph();
    java.lang.String str50 = graph49.name;
    graph49.init();
    node48.setOwner(graph49);
    java.lang.String str53 = graph49.name;
    graph49.init();
    node35.setOwner(graph49);
    graph27.addNode(node35);
    Graph graph57 = Graph.generateGraph();
    java.lang.String str58 = graph57.name;
    graph57.name = "";
    java.lang.String str61 = graph57.name;
    graph57.init();
    node35.setOwner(graph57);
    node35.setOwnerName("hi!");
    graph0.addNode(node35);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i67 = node35.getDegree();

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test138"); }


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
    node65.setOwnerName("");
    node65.setOwnerNameDirectly("");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i74 = node65.getDegree();

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test139"); }


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
    graph2.init();
    Node node37 = new Node("");
    Graph graph38 = Graph.generateGraph();
    java.lang.String str39 = graph38.name;
    node37.setOwner(graph38);
    Graph graph41 = new Graph();
    node37.setOwner(graph41);
    node37.setOwnerNameDirectly("");
    node37.setOwnerName("[graph]");
    node37.setOwnerName("hi!");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i49 = graph2.getDegree(node37);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test140"); }


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
    node1.setOwnerNameDirectly("");
    Node node24 = new Node("hi!");
    Graph graph25 = new Graph();
    node24.setOwner(graph25);
    graph25.setName("");
    graph25.name = "[graph]";
    java.lang.String str31 = graph25.name;
    node1.setOwner(graph25);
    node1.setOwnerNameDirectly("[graph]");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i35 = node1.getDegree();

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test141"); }


    Node node1 = new Node("hi!");
    Graph graph2 = new Graph();
    node1.setOwner(graph2);
    graph2.init();
    graph2.init();
    Node node7 = new Node("");
    Node node9 = new Node("hi!");
    Graph graph10 = new Graph();
    node9.setOwner(graph10);
    node7.setOwner(graph10);
    node7.setOwnerNameDirectly("[graph]");
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
    Graph graph32 = new Graph();
    graph32.init();
    node16.setOwner(graph32);
    Node node36 = new Node("");
    graph32.addNode(node36);
    java.lang.String str38 = graph32.name;
    graph32.name = "";
    graph32.name = "hi!";
    node7.setOwner(graph32);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i44 = graph2.getDegree(node7);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test142"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    graph2.init();
    node1.setOwner(graph2);
    java.lang.String str6 = graph2.name;
    graph2.name = "[graph]";
    graph2.name = "";
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
    node12.setOwnerName("[graph]");
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
    node12.setOwner(graph39);
    graph2.addNode(node12);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i47 = node12.getDegree();

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test143"); }


    Node node1 = new Node("");
    Graph graph2 = Graph.generateGraph();
    java.lang.String str3 = graph2.name;
    node1.setOwner(graph2);
    node1.setOwnerNameDirectly("");
    Graph graph7 = Graph.generateGraph();
    java.lang.String str8 = graph7.name;
    graph7.init();
    Graph graph10 = Graph.generateGraph();
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
    graph10.addNode(node12);
    node12.setOwnerNameDirectly("hi!");
    node12.setOwnerNameDirectly("hi!");
    node12.setOwnerNameDirectly("[graph]");
    node12.setOwnerNameDirectly("[graph]");
    graph7.addNode(node12);
    graph7.setName("");
    node1.setOwner(graph7);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node1.thisIsNotCalled();

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test144"); }


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
    int i63 = node1.getDegree();

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test145"); }


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
    graph28.name = "hi!";
    java.lang.String str37 = graph28.name;
    Node node39 = new Node("");
    Graph graph40 = Graph.generateGraph();
    java.lang.String str41 = graph40.name;
    graph40.init();
    node39.setOwner(graph40);
    java.lang.String str44 = graph40.name;
    graph40.name = "[graph]";
    java.lang.String str47 = graph40.name;
    graph40.name = "";
    Node node51 = new Node("hi!");
    Node node53 = new Node("hi!");
    Graph graph54 = new Graph();
    node53.setOwner(graph54);
    graph54.setName("");
    node51.setOwner(graph54);
    node51.setOwnerNameDirectly("hi!");
    graph40.addNode(node51);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i62 = graph28.getDegree(node51);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest1.test146"); }


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
    Node node24 = new Node("");
    Graph graph25 = Graph.generateGraph();
    java.lang.String str26 = graph25.name;
    graph25.init();
    node24.setOwner(graph25);
    java.lang.String str29 = graph25.name;
    graph25.name = "[graph]";
    graph25.name = "";
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
    graph25.addNode(node36);
    graph25.init();
    node14.setOwner(graph25);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    node14.thisIsNotCalled();

  }

}
