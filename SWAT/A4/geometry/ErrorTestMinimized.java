import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTestMinimized {

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
}
