package bai5_2;

public class Cylinder {
  private Circle base; 
  private double height;
 
  public Cylinder() {
    base = new Circle(); 
    height = 1.0;
  } 
  public Cylinder(double radius) {
    base = new Circle(radius);
    this.height = 1.0;
  } 
  public Cylinder(double radius, double height) {
    base = new Circle(radius);
    this.height = height;
  } 
  public Cylinder(double radius, double height, String color) {
    base = new Circle(radius, color);
    this.height = height;
  } 
  public double getRadius() {
    return base.getRadius();
  } 
  public String getColor() {
    return base.getColor();
  } 
  public double getHeight() {
    return height;
  } 
  public void setHeight(double height) {
    this.height = height;
  } 
  public double getVolume() {
    return base.getArea() * height;
  } 
  public double getArea() {
    return base.getArea();
  } 
  @Override
  public String toString() {
    return "Cylinder: subclass of " + base.toString() + " height=" + height;
  }
}