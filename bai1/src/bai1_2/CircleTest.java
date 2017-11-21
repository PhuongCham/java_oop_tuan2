package bai1_2;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CircleTest {
     
   Circle c = new Circle();
   Circle c1 = new Circle(1);

   @Test
   public void testgetRadius() {
      assertEquals(1.0,c.getRadius(),0.000001);
   }
   @Test
   public void testgetArea() {
      assertEquals(Math.PI,c.getArea(),0.000001);
   }
   @Test
   public void testCircle2() {
	   c = new Circle(1.0);
	   assertEquals(1.0,c.getRadius(),0.0000001);
	   //assertEquals(Circle.class, new Circle(1.2));
   }
   @Test
   public void testtoString() {
	   assertEquals("Circle[radius = 1.0]",c.toString());
   }
   @Test
   public void testSetRadius() {
	   c.setRadius(2.0);
	   assertEquals(2.0,c.getRadius(),0.00001);
   }
   @Test
   public void testgetCircumference() {
	   c = new Circle();
	   assertEquals(2*Math.PI,c.getCircumference(),0.00001);
   
   }

   @Test
   public void testgetRadius1() {
      assertEquals(1.0,c1.getRadius(),0.000001);
   }
   @Test
   public void testgetArea1() {
      assertEquals(Math.PI,c1.getArea(),0.000001);
   }
   @Test
   public void testCircle21() {
	   c1 = new Circle(1.0);
	   assertEquals(1.0,c1.getRadius(),0.0000001);
	   //assertEquals(Circle.class, new Circle(1.2));
   }
   @Test
   public void testtoString1() {
	   assertEquals("Circle[radius = 1.0]",c1.toString());
   }
   @Test
   public void testSetRadius1() {
	   c1.setRadius(2.0);
	   assertEquals(2.0,c1.getRadius(),0.00001);
   }
   @Test
   public void testgetCircumference1() {
	   Circle c1 = new Circle();
	   assertEquals(2*Math.PI,c1.getCircumference(), 0.00001);
   
   }
}
   

   
   



