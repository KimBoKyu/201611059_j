package com.sd.hello;
import com.sd.hello.*;
public class TestMain{
	public static void main(String[] args){
		Rectangle r1 = new Rectangle(10.0,5.0);
		Circle c1 = new Circle(10.0);
		Shape[] s = {r1,c1};
		for(Shape e:s){
			double area = e.calcArea();
			double perimeter = e.calcPerimeter();
			System.out.println("Area is "+area);
			System.out.println("Perimeter is "+perimeter);
		}
	}
}