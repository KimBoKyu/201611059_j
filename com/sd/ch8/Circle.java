package com.sd.ch8;
import com.sd.ch8.*;
public class Circle extends Point{
	double radius;
	double area;
	public Circle(int x, int y, double r){
		super(x,y);
		radius = r;
	}
	public double getArea(){
		area = radius*radius*Math.PI;
		return area;
	}
	public void callArea(){
		System.out.println("Area is "+area);
	}
	public static void main(String[] args){
		Circle c = new Circle(10,10,5.0);
		c.getArea();
		c.callArea();
	}
}
