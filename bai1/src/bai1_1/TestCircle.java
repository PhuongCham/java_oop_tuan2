package bai1_1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestCircle {
     
   Circle c = new Circle();
   Circle c1 = new Circle(0.1);
   @Test
   public void testgetColor() {
      assertEquals("red",c.getColor());
   }
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
	   c = new Circle(2.0);
	   assertEquals(2.0,c.getRadius(),0.0000001);
	   //assertEquals(Circle.class, new Circle(1.2));
   }
   @Test
   public void testgetColor2() {
      assertEquals("red",c.getColor());
   }
   @Test
   public void testgetRadius2() {
      assertEquals(1.0,c.getRadius(),0.000001);
   }
   
   @Test
   public void testgetArea2() {
      assertEquals(Math.PI,c.getArea(),0.000001);
   }
   


}
