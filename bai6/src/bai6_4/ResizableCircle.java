package bai6_4;

public class ResizableCircle extends Circle implements Resizable {


  public ResizableCircle(double radius) {
    super(radius);
  }

  @Override
  public double resize(int percent) {
    return this.getRadius() * (1 - (percent / 100.0));
  }
}