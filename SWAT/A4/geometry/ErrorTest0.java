
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test001"); }


    Point point0 = null;
    Point point1 = null;
    Line line2 = new Line(point0, point1);
    
    // Checks the contract:  line2.equals(line2)
    org.junit.Assert.assertTrue("Contract failed: line2.equals(line2)", line2.equals(line2));

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test002"); }


    Point point2 = new Point(0, (int)'a');
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test003"); }


    Point point2 = new Point((int)(byte)1, 0);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test004"); }


    Point point2 = new Point(0, (int)(byte)10);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test005"); }


    Point point2 = new Point((int)(short)10, (int)(byte)0);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test006"); }


    Point point2 = new Point((int)(byte)0, 100);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test007"); }


    Point point2 = new Point((int)(short)-1, (int)(short)-1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test008"); }


    Point point2 = new Point((int)(byte)-1, 1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test009"); }


    Point point2 = new Point((int)(byte)1, (int)(short)0);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test010"); }


    Point point2 = new Point((int)' ', (int)'4');
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test011"); }


    Point point2 = new Point((int)'a', (int)(byte)-1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test012"); }


    Point point2 = new Point((int)(byte)10, (int)' ');
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test013"); }


    Point point2 = new Point((int)(short)-1, (int)'4');
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test014"); }


    Point point2 = new Point((int)'a', (int)(short)1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test015"); }


    Point point2 = new Point((int)(byte)10, (int)'a');
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test016"); }


    Point point2 = new Point((int)(byte)100, (int)(short)-1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test017"); }


    Point point2 = new Point((int)' ', (int)(byte)1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test018"); }


    Point point2 = new Point((int)(byte)100, (int)(short)100);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test019"); }


    Point point2 = new Point(0, 10);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test020"); }


    Point point2 = new Point(0, (int)(byte)1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test021"); }


    Point point2 = new Point((int)(byte)0, (int)'#');
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test022"); }


    Point point2 = new Point(1, 10);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test023"); }


    Point point2 = new Point(0, (int)(short)0);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test024"); }


    Point point2 = new Point((int)(byte)100, (int)(byte)100);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test025"); }


    Point point2 = new Point((int)(byte)0, (int)(byte)10);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test026"); }


    Point point2 = new Point((int)(byte)100, (int)(byte)0);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test027"); }


    Point point2 = new Point(1, (int)'4');
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test028"); }


    Point point2 = new Point((int)(short)1, (int)(byte)1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test029"); }


    Point point2 = new Point((int)(short)0, (int)'4');
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test030"); }


    Point point2 = new Point((int)(short)100, (int)'a');
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test031"); }


    Point point2 = new Point((int)(byte)-1, (int)'#');
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test032"); }


    Point point2 = new Point((int)(short)0, (int)(byte)100);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test033"); }


    Point point2 = new Point((int)(short)1, (int)(short)100);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test034"); }


    Point point2 = new Point((int)'4', (int)'#');
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test035"); }


    Point point2 = new Point((int)(byte)0, (int)'4');
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test036"); }


    Point point2 = new Point((int)(byte)100, (int)' ');
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test037"); }


    Point point2 = new Point((int)(short)-1, (int)(byte)0);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test038"); }


    Point point2 = new Point((int)'a', (int)(byte)1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test039"); }


    Point point2 = new Point(0, (int)'4');
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test040"); }


    Point point2 = new Point((int)'a', (int)(byte)0);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test041"); }


    Point point2 = new Point((int)(short)100, (int)(short)1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test042"); }


    Point point2 = new Point(0, 100);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test043"); }


    Point point2 = new Point((int)'4', (int)(short)100);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test044"); }


    Point point2 = new Point((int)(byte)-1, (int)'4');
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test045"); }


    Point point2 = new Point((int)(short)10, (int)(byte)10);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test046"); }


    Point point2 = new Point((int)' ', 0);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test047"); }


    Point point2 = new Point((int)(short)1, 0);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test048"); }


    Point point2 = new Point((int)(short)0, (-1));
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test049"); }


    Point point2 = new Point((int)(byte)100, (int)(short)1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test050"); }


    Point point2 = new Point((int)(short)-1, (int)' ');
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test051"); }


    Point point2 = new Point((int)(short)100, (int)(short)-1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test052"); }


    Point point2 = new Point(10, 100);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test053"); }


    Point point2 = new Point(0, (int)(byte)100);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test054"); }


    Point point2 = new Point((int)(short)0, 0);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test055"); }


    Point point2 = new Point(100, (int)'#');
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test056"); }


    Point point2 = new Point((int)(byte)1, (int)(short)100);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test057"); }


    Point point2 = new Point((int)' ', (int)(byte)100);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test058"); }


    Point point2 = new Point((int)(short)-1, 100);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test059"); }


    Point point2 = new Point((int)(byte)0, (int)(short)1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test060"); }


    Point point2 = new Point((int)(short)0, (int)(short)0);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test061"); }


    Point point2 = new Point((int)'4', 1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test062"); }


    Point point2 = new Point((int)(byte)0, (int)(byte)0);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test063"); }


    Point point2 = new Point((-1), (int)'4');
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test064"); }


    Point point2 = new Point((int)'4', (int)(short)10);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test065"); }


    Point point2 = new Point((int)(byte)0, (int)'a');
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test066"); }


    Point point2 = new Point(0, (int)(short)10);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test067"); }


    Point point2 = new Point((int)'#', 1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test068"); }


    Point point2 = new Point(1, (int)'a');
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test069"); }


    Point point2 = new Point(0, (int)'#');
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test070"); }


    Point point2 = new Point((int)(short)100, (-1));
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test071"); }


    Point point2 = new Point((int)(byte)100, (int)'#');
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test072"); }


    Point point2 = new Point(0, (int)(byte)0);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test073"); }


    Point point2 = new Point((int)(byte)1, (int)(byte)10);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test074"); }


    Point point2 = new Point((int)(byte)0, (-1));
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test075"); }


    Point point2 = new Point((int)(short)0, (int)'a');
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test076"); }


    Point point2 = new Point((int)(short)-1, 0);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test077"); }


    Point point2 = new Point(10, (int)(byte)-1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test078"); }


    Point point2 = new Point(100, (int)(short)100);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test079"); }


    Point point2 = new Point(10, 0);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test080"); }


    Point point2 = new Point((-1), (int)' ');
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test081"); }


    Point point2 = new Point((int)(short)-1, (int)(byte)100);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test082"); }


    Point point2 = new Point((int)' ', (int)' ');
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test083"); }


    Point point2 = new Point(1, (int)(byte)-1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test084"); }


    Point point2 = new Point((int)(byte)10, (int)(short)1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test085"); }


    Point point2 = new Point((int)(short)10, (int)'4');
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test086"); }


    Point point2 = new Point((int)'4', 100);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test087"); }


    Point point2 = new Point((int)(byte)-1, (int)(byte)0);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test088"); }


    Point point2 = new Point((int)(byte)10, 100);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test089"); }


    Point point2 = new Point((int)(byte)1, (-1));
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test090"); }


    Point point2 = new Point((int)(short)1, 10);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test091"); }


    Point point2 = new Point((int)'#', (int)(short)0);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test092"); }


    Point point2 = new Point((int)(short)100, 0);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test093"); }


    Point point2 = new Point((int)'#', (int)(byte)1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test094"); }


    Point point2 = new Point((int)(byte)0, (int)' ');
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test095"); }


    Point point2 = new Point((int)(short)-1, (int)(short)0);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test096"); }


    Point point2 = new Point(1, (int)(byte)100);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test097"); }


    Point point2 = new Point((int)(byte)-1, 0);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test098"); }


    Point point2 = new Point((int)(short)100, (int)(short)100);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test099"); }


    Point point2 = new Point(1, (int)(short)0);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test100"); }


    Point point2 = new Point(100, (-1));
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test101"); }


    Point point2 = new Point((int)(byte)0, 10);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test102"); }


    Point point2 = new Point(100, (int)(byte)10);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test103"); }


    Point point2 = new Point((int)(short)10, 10);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test104"); }


    Point point2 = new Point((int)(short)0, (int)(short)-1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test105"); }


    Point point2 = new Point((int)(byte)-1, (int)'a');
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test106"); }


    Point point2 = new Point((int)(short)0, (int)(byte)10);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test107"); }


    Point point2 = new Point(0, (int)' ');
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test108"); }


    Point point2 = new Point((int)(short)10, 1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test109"); }


    Point point2 = new Point((int)(short)-1, (int)(short)10);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test110"); }


    Point point2 = new Point((int)'#', 0);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test111"); }


    Point point2 = new Point(1, 0);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test112"); }


    Point point2 = new Point(10, 1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test113"); }


    Point point2 = new Point(1, (int)(byte)10);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test114"); }


    Point point2 = new Point((int)(short)100, (int)(short)10);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test115"); }


    Point point2 = new Point(1, (int)(short)-1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test116"); }


    Point point2 = new Point(1, (int)'#');
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test117"); }


    Point point2 = new Point(0, (int)(short)1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test118"); }


    Point point2 = new Point((int)(byte)0, (int)(byte)-1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test119"); }


    Point point2 = new Point((int)'a', (int)(short)0);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test120"); }


    Point point2 = new Point((int)(byte)0, (int)(short)-1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test121"); }


    Point point2 = new Point((int)'a', 10);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test122"); }


    Point point2 = new Point((int)(short)10, 0);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test123"); }


    Point point2 = new Point((int)' ', 1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test124"); }


    Point point2 = new Point(10, (int)'a');
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test125"); }


    Point point2 = new Point((-1), 1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test126"); }


    Point point2 = new Point(0, (int)(byte)-1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test127"); }


    Point point2 = new Point(100, 0);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test128"); }


    Point point2 = new Point((int)(byte)10, (int)'#');
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test129"); }


    Point point2 = new Point((int)(byte)10, (int)(short)-1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test130"); }


    Point point2 = new Point((int)(byte)1, (int)' ');
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test131"); }


    Point point2 = new Point((int)'a', (int)(short)100);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test132"); }


    Point point2 = new Point((int)(byte)0, (int)(short)10);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test133"); }


    Point point2 = new Point((int)(byte)100, 0);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test134"); }


    Point point2 = new Point((int)(byte)-1, (int)' ');
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test135"); }


    Point point2 = new Point(0, (-1));
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test136"); }


    Point point2 = new Point((int)(short)100, (int)(byte)1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test137"); }


    Point point2 = new Point((int)'4', 0);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test138"); }


    Point point2 = new Point(10, (int)(short)0);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test139"); }


    Point point2 = new Point(10, (int)(byte)100);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test140"); }


    Point point2 = new Point((-1), 100);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test141"); }


    Point point2 = new Point((int)' ', (int)'#');
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test142"); }


    Point point2 = new Point((int)(byte)0, (int)(byte)1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test143"); }


    Point point2 = new Point((int)'a', 100);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test144"); }


    Point point2 = new Point((int)(short)1, (int)(short)1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test145"); }


    Point point2 = new Point((int)' ', (int)(byte)10);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test146"); }


    Point point2 = new Point(0, (int)(short)-1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test147"); }


    Point point2 = new Point((int)(short)0, (int)(short)10);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test148"); }


    Point point2 = new Point((int)'#', (int)(byte)10);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test149"); }


    Point point2 = new Point((int)(byte)100, (int)(byte)-1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test150"); }


    Point point2 = new Point((int)'#', (int)(short)1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test151"); }


    Point point2 = new Point((int)(byte)0, (int)(short)0);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test152"); }


    Point point2 = new Point((int)(byte)-1, (int)(short)-1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test153"); }


    Point point2 = new Point((int)'4', (int)(short)1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test154"); }


    Point point2 = new Point((int)(short)-1, (-1));
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test155"); }


    Point point2 = new Point(100, (int)(short)10);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test156"); }


    Point point2 = new Point((int)' ', (int)'a');
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test157"); }


    Point point2 = new Point(10, (-1));
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test158"); }


    Point point2 = new Point((int)(short)1, (int)(short)0);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test159"); }


    Point point2 = new Point((int)(byte)10, (int)(byte)100);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test160"); }


    Point point2 = new Point((int)'#', (int)(byte)100);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test161"); }


    Point point2 = new Point((-1), (int)(byte)10);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test162"); }


    Point point2 = new Point(100, (int)(byte)0);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test163"); }


    Point point2 = new Point(10, (int)(byte)10);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test164"); }


    Point point2 = new Point((int)(short)0, (int)(byte)-1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test165"); }


    Point point2 = new Point(1, (int)(short)1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test166"); }


    Point point2 = new Point((int)(short)0, (int)'#');
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test167"); }


    Point point2 = new Point((int)(short)1, (int)(byte)-1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test168"); }


    Point point2 = new Point((int)(short)-1, (int)(short)1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test169"); }


    Point point2 = new Point((int)'4', (int)(short)0);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test170"); }


    Point point2 = new Point(1, (int)(byte)0);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test171"); }


    Point point2 = new Point((-1), (int)'#');
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test172"); }


    Point point2 = new Point((int)' ', (int)(short)10);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test173"); }


    Point point2 = new Point((int)'a', (int)(byte)100);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test174"); }


    Point point2 = new Point((int)'a', 1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test175"); }


    Point point2 = new Point((int)(byte)100, (int)(short)0);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test176"); }


    Point point2 = new Point((int)(byte)1, (int)(byte)0);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test177"); }


    Point point2 = new Point((int)(byte)10, 0);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test178"); }


    Point point2 = new Point((-1), (-1));
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test179"); }


    Point point2 = new Point((int)'a', 0);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test180"); }


    Point point2 = new Point((int)' ', (int)(short)0);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test181"); }


    Point point2 = new Point(100, (int)(byte)1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test182"); }


    Point point2 = new Point(100, (int)'a');
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test183"); }


    Point point2 = new Point((int)(byte)-1, (int)(byte)100);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test184"); }


    Point point2 = new Point((int)(short)1, (int)(short)10);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test185"); }


    Point point2 = new Point(100, (int)(byte)100);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test186"); }


    Point point2 = new Point((int)(byte)100, (int)(byte)10);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test187"); }


    Point point2 = new Point((int)(byte)10, (int)'4');
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test188"); }


    Point point2 = new Point((int)(short)100, 1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test189"); }


    Point point2 = new Point((int)(byte)1, 1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test190"); }


    Point point2 = new Point((int)'4', (int)(byte)100);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test191"); }


    Point point2 = new Point((int)'a', (int)'a');
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test192"); }


    Point point2 = new Point((int)(short)10, (int)' ');
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test193"); }


    Point point2 = new Point((int)(byte)-1, (int)(short)100);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test194"); }


    Point point2 = new Point((int)(short)-1, 1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test195"); }


    Point point2 = new Point((int)(byte)0, (int)(short)100);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test196"); }


    Point point2 = new Point((int)(byte)-1, (int)(short)10);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test197"); }


    Point point2 = new Point((int)(short)10, (-1));
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test198"); }


    Point point2 = new Point((int)(byte)100, (int)'4');
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test199"); }


    Point point2 = new Point((int)(short)1, (int)'#');
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test200"); }


    Point point2 = new Point((int)(short)1, (-1));
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test201"); }


    Point point2 = new Point((int)(byte)100, 1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test202"); }


    Point point2 = new Point((int)'#', (int)' ');
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test203"); }


    Point point2 = new Point((int)(short)0, (int)(byte)1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test204"); }


    Point point2 = new Point(100, (int)'4');
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test205"); }


    Point point2 = new Point((int)(byte)10, 10);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test206"); }


    Point point2 = new Point((int)(byte)-1, (int)(byte)10);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test207"); }


    Point point2 = new Point(100, (int)(short)1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test208"); }


    Point point2 = new Point(1, 100);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test209"); }


    Point point2 = new Point((int)' ', (int)(byte)0);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test210"); }


    Point point2 = new Point((int)' ', (int)(short)100);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test211"); }


    Point point2 = new Point((int)(short)10, (int)(short)0);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test212"); }


    Point point2 = new Point((int)(short)100, 10);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test213"); }


    Point point2 = new Point((int)'4', (-1));
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test214"); }


    Point point2 = new Point((int)(short)10, (int)(short)100);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test215"); }


    Point point2 = new Point(100, (int)' ');
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test216"); }


    Point point2 = new Point((int)'#', (int)'4');
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test217"); }


    Point point2 = new Point(10, (int)'#');
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test218"); }


    Point point2 = new Point((int)'4', (int)(short)-1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test219"); }


    Point point2 = new Point(1, (int)(byte)1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test220"); }


    Point point2 = new Point(0, 0);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test221"); }


    Point point2 = new Point(0, (int)(short)100);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test222"); }


    Point point2 = new Point((int)(short)0, 100);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test223"); }


    Point point2 = new Point((int)(short)0, (int)(short)1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test224"); }


    Point point2 = new Point((int)(short)-1, (int)(byte)1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test225"); }


    Point point2 = new Point((int)(byte)1, 100);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test226"); }


    Point point2 = new Point((int)(byte)-1, (int)(short)1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test227"); }


    Point point2 = new Point((int)(byte)-1, 10);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test228"); }


    Point point2 = new Point((int)(short)100, (int)' ');
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test229"); }


    Point point2 = new Point((int)'4', (int)'4');
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test230"); }


    Point point2 = new Point((int)(byte)0, 1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test231"); }


    Point point2 = new Point((int)'a', (int)'#');
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test232"); }


    Point point2 = new Point((int)' ', (int)(short)-1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test233"); }


    Point point2 = new Point((int)(short)0, (int)(short)100);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test234"); }


    Point point2 = new Point((int)(byte)100, 100);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test235"); }


    Point point2 = new Point(10, (int)(byte)1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test236"); }


    Point point2 = new Point((int)(short)0, (int)' ');
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test237"); }


    Point point2 = new Point(100, 1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test238"); }


    Point point2 = new Point((int)'#', (-1));
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test239"); }


    Point point2 = new Point((-1), 10);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test240"); }


    Point point2 = new Point((int)(short)1, (int)(byte)100);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test241"); }


    Point point2 = new Point((int)(short)100, (int)(byte)0);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test242"); }


    Point point2 = new Point((int)(byte)10, (int)(byte)1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test243"); }


    Point point2 = new Point((int)(byte)10, (int)(byte)10);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test244"); }


    Point point2 = new Point((int)'4', (int)'a');
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test245"); }


    Point point2 = new Point((int)(short)-1, (int)'a');
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test246"); }


    Point point2 = new Point((int)(byte)0, 0);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test247"); }


    Point point2 = new Point((int)(short)10, (int)'a');
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test248"); }


    Point point2 = new Point(10, (int)'4');
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test249"); }


    Point point2 = new Point((int)'#', 10);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test250"); }


    Point point2 = new Point((int)(short)100, (int)'#');
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test251"); }


    Point point2 = new Point(10, (int)(short)100);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test252"); }


    Point point2 = new Point((int)(byte)1, 10);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test253"); }


    Point point2 = new Point(10, (int)(short)-1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test254"); }


    Point point2 = new Point((int)(short)1, (int)(byte)0);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test255"); }


    Point point2 = new Point((int)(byte)-1, 100);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test256"); }


    Point point2 = new Point((int)(byte)10, (int)(short)100);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test257"); }


    Point point2 = new Point((int)(byte)-1, (-1));
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test258"); }


    Point point2 = new Point((int)(byte)100, 10);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test259"); }


    Point point2 = new Point((-1), (int)(short)1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test260"); }


    Point point2 = new Point((int)(byte)10, (int)(short)0);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test261"); }


    Point point2 = new Point((int)(byte)1, (int)(short)10);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test262"); }


    Point point2 = new Point((int)(byte)0, (int)(byte)100);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test263"); }


    Point point2 = new Point((-1), (int)(byte)0);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test264"); }


    Point point2 = new Point((-1), (int)(byte)-1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test265"); }


    Point point2 = new Point((int)(byte)1, (int)'#');
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test266"); }


    Point point2 = new Point((int)'#', (int)'#');
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test267"); }


    Point point2 = new Point((int)'4', 10);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test268"); }


    Point point2 = new Point((int)(short)100, (int)(byte)100);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test269"); }


    Point point2 = new Point((int)(byte)1, (int)(byte)100);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test270"); }


    Point point2 = new Point((int)(byte)10, (int)(short)10);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test271"); }


    Point point2 = new Point((int)'#', (int)(short)10);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test272"); }


    Point point2 = new Point(10, (int)(short)1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test273"); }


    Point point2 = new Point((int)(byte)-1, (int)(byte)-1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test274"); }


    Point point2 = new Point((int)'a', (-1));
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test275"); }


    Point point2 = new Point(10, 10);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test276"); }


    Point point2 = new Point((int)'#', (int)(short)-1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test277"); }


    Point point2 = new Point((int)(short)10, (int)(byte)100);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test278"); }


    Point point2 = new Point((int)(short)-1, (int)(byte)10);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test279"); }


    Point point2 = new Point((int)(byte)1, (int)(short)-1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test280"); }


    Point point2 = new Point((-1), (int)(short)100);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test281"); }


    Point point2 = new Point(1, (int)(short)100);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test282"); }


    Point point2 = new Point((int)(short)0, (int)(byte)0);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test283"); }


    Point point2 = new Point((int)(short)-1, (int)(byte)-1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test284"); }


    Point point2 = new Point(100, 10);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test285"); }


    Point point2 = new Point((-1), (int)(short)10);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test286"); }


    Point point2 = new Point((int)(short)10, (int)(short)1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test287"); }


    Point point2 = new Point((int)(byte)100, (int)(short)10);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test288"); }


    Point point2 = new Point((int)(short)10, (int)'#');
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test289"); }


    Point point2 = new Point((int)'a', (int)' ');
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test290"); }


    Point point2 = new Point((int)'a', (int)(short)10);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test291"); }


    Point point2 = new Point((int)'a', (int)(byte)10);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test292"); }


    Point point2 = new Point((int)(short)100, (int)(byte)-1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test293"); }


    Point point2 = new Point((-1), 0);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test294"); }


    Point point2 = new Point(10, (int)' ');
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test295"); }


    Point point2 = new Point((int)(short)10, (int)(short)10);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test296"); }


    Point point2 = new Point((int)'4', (int)(byte)1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test297"); }


    Point point2 = new Point((int)(byte)-1, (int)(byte)1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test298"); }


    Point point2 = new Point((int)(short)1, (int)' ');
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test299"); }


    Point point2 = new Point((int)'4', (int)' ');
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test300"); }


    Point point2 = new Point(10, (int)(byte)0);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test301"); }


    Point point2 = new Point((int)(short)100, (int)(short)0);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test302"); }


    Point point2 = new Point((int)(short)1, (int)(short)-1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test303"); }


    Point point2 = new Point((int)(short)-1, (int)(short)100);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test304"); }


    Point point2 = new Point(1, 1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test305"); }


    Point point2 = new Point((int)'a', (int)'4');
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test306"); }


    Point point2 = new Point((int)' ', (int)(short)1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test307"); }


    Point point2 = new Point((int)(short)0, 1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test308"); }


    Point point2 = new Point((-1), (int)(short)0);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test309"); }


    Point point2 = new Point((int)(short)1, (int)'4');
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test310"); }


    Point point2 = new Point((int)'4', (int)(byte)10);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test311"); }


    Point point2 = new Point((int)(byte)-1, (int)(short)0);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test312"); }


    Point point2 = new Point((int)(short)100, (int)'4');
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test313"); }


    Point point2 = new Point((int)(short)10, (int)(byte)1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test314"); }


    Point point2 = new Point(1, (int)' ');
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test315"); }


    Point point2 = new Point(1, (int)(short)10);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test316"); }


    Point point2 = new Point((int)(short)0, 10);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test317"); }


    Point point2 = new Point((int)(short)1, (int)(byte)10);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test318"); }


    Point point2 = new Point((int)'#', (int)'a');
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test319"); }


    Point point2 = new Point((int)(byte)1, (int)(byte)1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test320"); }


    Point point2 = new Point((int)(short)1, 1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test321"); }


    Point point2 = new Point(100, 100);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test322"); }


    Point point2 = new Point((int)(short)10, (int)(short)-1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test323"); }


    Point point2 = new Point(0, 1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test324"); }


    Point point2 = new Point((int)'a', (int)(short)-1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test325"); }


    Point point2 = new Point((int)'4', (int)(byte)-1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test326"); }


    Point point2 = new Point((int)(short)10, (int)(byte)-1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test327"); }


    Point point2 = new Point((int)(short)10, 100);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test328"); }


    Point point2 = new Point((int)(short)-1, (int)'#');
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test329"); }


    Point point2 = new Point((int)(byte)1, (int)(short)1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test330"); }


    Point point2 = new Point((int)'#', (int)(short)100);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test331"); }


    Point point2 = new Point((int)(byte)1, (int)'4');
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test332"); }


    Point point2 = new Point((int)(short)1, 100);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test333"); }


    Point point2 = new Point((int)(byte)10, (-1));
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test334"); }


    Point point2 = new Point((int)(byte)100, (int)'a');
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test335"); }


    Point point2 = new Point((-1), (int)(byte)100);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test336"); }


    Point point2 = new Point((int)(byte)1, (int)(byte)-1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test337"); }


    Point point2 = new Point((int)'#', 100);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test338"); }


    Point point2 = new Point(1, (-1));
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test339"); }


    Point point2 = new Point((int)(short)-1, 10);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test340"); }


    Point point2 = new Point(100, (int)(byte)-1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test341"); }


    Point point2 = new Point(100, (int)(short)0);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test342"); }


    Point point2 = new Point((int)' ', (-1));
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test343"); }


    Point point2 = new Point((int)(byte)100, (-1));
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test344"); }


    Point point2 = new Point((int)'#', (int)(byte)-1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test345"); }


    Point point2 = new Point((-1), (int)(short)-1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test346"); }


    Point point2 = new Point((int)(byte)10, 1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test347"); }


    Point point2 = new Point((int)' ', 10);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test348"); }


    Point point2 = new Point((int)(byte)10, (int)(byte)0);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test349"); }


    Point point2 = new Point((int)(short)1, (int)'a');
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test350"); }


    Point point2 = new Point((int)' ', (int)(byte)-1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test351"); }


    Point point2 = new Point((int)(byte)1, (int)'a');
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test352"); }


    Point point2 = new Point((int)' ', 100);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test353"); }


    Point point2 = new Point((int)'#', (int)(byte)0);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test354"); }


    Point point2 = new Point((int)(byte)100, (int)(byte)1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test355"); }


    Point point2 = new Point(10, (int)(short)10);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test356"); }


    Point point2 = new Point((-1), (int)(byte)1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test357"); }


    Point point2 = new Point((int)(byte)10, (int)(byte)-1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test358"); }


    Point point2 = new Point((int)(short)100, 100);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test359"); }


    Point point2 = new Point(100, (int)(short)-1);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test360"); }


    Point point2 = new Point((int)'4', (int)(byte)0);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test361"); }


    Point point2 = new Point((int)(short)100, (int)(byte)10);
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test362"); }


    Point point2 = new Point((-1), (int)'a');
    
    // Checks the contract:  !point2.equals(null)
    org.junit.Assert.assertTrue("Contract failed: !point2.equals(null)", !point2.equals(null));

  }

}
