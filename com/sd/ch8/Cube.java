package com.sd.ch8;

public class Cube extends Rectangle{
	double height;
	public Cube(double l, double w, double h){
		super(l, w);
		this.height = h;
	}
	public double getHeight(){
		return height;
	}
}
