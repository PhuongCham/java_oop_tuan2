package bai5_1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LineTest {

  Line line1;
  Point begin = new Point(-1, -15);
  Point end = new Point(1, 2);

  @Before
  public void setUp() throws Exception {
    line1 = new Line(begin, end);
  }

  @Test
  public void testLinePointPoint() {
    assertEquals(-1, line1.getBeginX());
    assertEquals(-15, line1.getBeginY());
    assertEquals(1, line1.getEndX());
    assertEquals(2, line1.getEndY());
  }

  @Test
  public void testLineIntIntIntInt() {
    Line line2 = new Line(1, 2, 3, 4);
    assertEquals(1, line2.getBeginX());
    assertEquals(2, line2.getBeginY());
    assertEquals(3, line2.getEndX());
    assertEquals(4, line2.getEndY());
  }

  @Test
  public void testToString() {
    String expected = "Line: ((-1,-15),(1,2))";
    assertEquals(expected, line1.toString());
  }

  @Test
  public void testSetBegin() {
    Point p1 = new Point(1, 0);
    line1.setBegin(p1);
    assertEquals(p1, line1.getBegin());
  }

  @Test
  public void testSetEnd() {
    Point p1 = new Point(1, 0);
    line1.setEnd(p1);
    assertEquals(p1, line1.getEnd());
  }

  @Test
  public void testSetBeginX() {
    line1.setBeginX(-1);
    assertEquals(-1, line1.getBeginX());
  }

  @Test
  public void testSetBeginY() {
    line1.setBeginY(-1);
    assertEquals(-1, line1.getBeginY());
  }

  @Test
  public void testSetBeginXY() {
    line1.setBeginXY(-1, -1);
    assertEquals(-1, line1.getBeginX());
    assertEquals(-1, line1.getBeginY());
  }

  @Test
  public void testSetEndX() {
    line1.setEndX(1);
    assertEquals(1, line1.getEndX());
  }

  @Test
  public void testSetEndY() {
    line1.setEndY(5);
    assertEquals(5, line1.getEndY());
  }

  @Test
  public void testSetEndXY() {
    line1.setEndXY(10, 10);
    assertEquals(10, line1.getEndX());
    assertEquals(10, line1.getEndY());
  }

  @Test
  public void testGetLength() {
    double expected = Math.sqrt((1 - (-1)) * (1 - (-15)) + (2 - (-1)) * (2 - (-15)));
    assertEquals(expected, line1.getLength(), 0.001);
  }

  @Test
  public void testGetGradient() {
    double expected = Math.atan2(2 - (-15), 1 - (-1));
    assertEquals(expected, line1.getGradient(), 0.001);
  }

}
