package com.sd.ch8;
import com.sd.ch8.*;

public class SeaTurtle extends Turtle {
	public void swim(){
		System.out.println("SeaTurtle Swims");
	}
	public static void main(String[] args){
		SeaTurtle s = new SeaTurtle();
		s.setFood("BaDa");
		s.eat();
		s.swim();
		System.out.println("Land Turtle has "+s.nLimbs+" limbs");
	}
}