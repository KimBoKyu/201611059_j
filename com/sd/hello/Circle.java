package com.sd.hello;
public class Circle implements Shape {
  private final double radious, area, perimeter;

  public Circle(double radious) {
    this.radious = radious;
    this.area = radious*radious*Math.PI;
    this.perimeter = 2*radious*Math.PI;
  }
  @Override
  public double calcArea() {
    return this.area;
  }
  @Override
  public double calcPerimeter() {
    return this.perimeter;
  }
}