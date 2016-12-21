package com.sd.hello;
public class Rectangle implements Shape {
  private final double width, height, area, perimeter;

  public Rectangle(double width, double height) {
    this.width = width;
    this.height= height;
    this.area = width * height;
    this.perimeter = 2 * (width + height);
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