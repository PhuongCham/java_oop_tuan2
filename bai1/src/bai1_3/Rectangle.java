package bai1_3;

public class Rectangle {
	private float length;
	private float width;
	
	public Rectangle() {
		length = 2.0f;
	    width = 1.0f;
	   }
	   
	   // 2nd constructor with given radius, but color default
	public Rectangle(float l,float w) {
	    length = l;
	    width = w;
	   }
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		this.length = length;
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float wight) {
		this.width = wight;
	}
	public double getArea() {
		return length*width;
	}
	public double getPerimeter() {
		return 2*(length+width);
	}
	public String toString() {
		return "Rectangle[length="+length+",width="+width+"]";
	}
}
