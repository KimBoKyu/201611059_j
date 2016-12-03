package com.sd.ch8_2;
import com.sd.ch8_2.*;
public class Rectangle extends Shape{
	private final double width, height, area, perimeter;
	public Rectangle(double width, double height){
		this.width = width;
		this.height = height;
		this.area = width*height;
		this.perimeter = 2*(width+height);
	}
	public double calcArea(){
		return this.area;
	}
	public double calcPerimeter(){
		return this.perimeter;
	}
	public String toString(){
		return "Rectangle..."+super.toString();
	}
	public static void main(String[] args){
		Rectangle r = new Rectangle(4,5);
		System.out.println("Area is "+r.calcArea());
		System.out.println("Perimeter is "+r.calcPerimeter());
		System.out.println(r.toString());
	}
}
