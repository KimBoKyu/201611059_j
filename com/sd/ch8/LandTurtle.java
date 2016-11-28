package com.sd.ch8;
import com.sd.ch8.*;

public class LandTurtle extends Turtle {
	public void walk(){
		System.out.println("LandTurtle Walks");
	}
	public static void main(String[] args){
		LandTurtle l = new LandTurtle();
		l.setFood("San");
		l.eat();
		l.walk();
		System.out.println("Land Turtle has "+l.nLimbs+" limbs");
	}
}