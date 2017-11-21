package bai1_2;

public class Circle { 
		private double radius;
	   
	   public Circle() {
	      radius = 1.0;
	   }
	   
	   // 2nd constructor with given radius, but color default
	   public Circle(double r) {
	      radius = r;
	   }
	   
	   public void setRadius(double radius) {
		this.radius = radius;
	}


	// A public method for retrieving the radius
	   public double getRadius() {
	     return radius; 
	   }
	   
	   // A public method for computing the area of circle
	   public double getArea() {
	      return radius*radius*Math.PI;
	   }
	   public double getCircumference() {
		   return radius*2*Math.PI;
	   }
	   public String toString() {
		   return "Circle[radius = "+radius+"]";
	   }
	   }
	   
