package bai1_3;
import org.junit.Test;

import bai1_2.Circle;

import static org.junit.Assert.assertEquals;
public class RectangleTest {
	Rectangle r = new Rectangle();
	Rectangle r1 = new Rectangle(2.0f,1.0f);
	@Test
	public void testRectangle2() {
		   assertEquals(1.0f,r1.getWidth(),0.0000001);
		   assertEquals(2.0f,r1.getLength(),0.0000001);
		   //assertEquals(Circle.class, new Circle(1.2));
	   }
	@Test
	   public void testgetLength() {
	      assertEquals(2.0,r.getLength(),0.000001);
	   }
	@Test
	   public void testsetLength() {
		  r.setLength(2.0f);
		  assertEquals(2.0,r.getLength(),0.00001);
	   }
	@Test
	   public void testgetLength1() {
	      assertEquals(2.0,r1.getLength(),0.000001);
	   }
	@Test
	   public void testsetLength1() {
		  r1.setLength(2.0f);
		  assertEquals(2.0,r1.getLength(),0.00001);
	   }
	@Test
	   public void testgetWidth1() {
	      assertEquals(1.0,r.getWidth(),0.000001);
	   }
	@Test
	   public void testsetWidth1() {
		  r1.setWidth(1.0f);
		  assertEquals(1.0,r1.getWidth(),0.00001);
	   }
	
	@Test
	   public void testgetArea() {
	      assertEquals(2.0f,r.getArea(),0.000001);
	   }
	@Test
	   public void testgetArea1() {
	      assertEquals(2.0f,r1.getArea(),0.000001);
	   }
	@Test
	   public void testgetPerimeter() {
	      assertEquals(6.0f,r.getPerimeter(),0.000001);
	   }
	@Test
	   public void testgetPerimeter1() {
	      assertEquals(6.0f,r1.getPerimeter(),0.000001);
	   }
	@Test
	   public void testToString() {
	      assertEquals("Rectangle[length=2.0,width=1.0]",r.toString());
	   }
	@Test
	   public void testToString1() {
	      assertEquals("Rectangle[length=2.0,width=1.0]",r1.toString());
	   }
	
}
