package bai5_1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PointTest {

  Point p;

  @Before
  public void setUp() throws Exception {
    p = new Point(1, 2);
  }

  @Test
  public void testPoint() {
    assertEquals(1, p.getX());
    assertEquals(2, p.getY());
  }

  @Test
  public void testToString() {
    String expected = "Point: (1,2)";
    assertEquals(expected, p.toString());
  }

  @Test
  public void testSetX() {
    p.setX(3);
    assertEquals(3, p.getX());
  }

  @Test
  public void testSetY() {
    p.setY(4);
    assertEquals(4, p.getY());
  }

  @Test
  public void testSetXY() {
    p.setXY(5, 6);
    assertEquals(5, p.getX());
    assertEquals(6, p.getY());
  }

}
