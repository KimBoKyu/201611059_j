package com.sd.ch8_2;
import com.sd.ch8_2.*;
public abstract class Shape {
	public String name = "Shape";
	public abstract double calcArea();
	public abstract double calcPerimeter();
	public String getname(){
		return this.name;
	}
	public String toString(){
		return "Shape..."+super.toString();
	}
}