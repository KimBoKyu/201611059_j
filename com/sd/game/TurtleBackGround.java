package com.sd.game;
import ch.aplu.turtle.*;
import java.awt.*;

class TurtleBackGround {
	Turtle t1 = new Turtle();
	public void setTitle1(){
		t1.setTitle("Player one");
	}
	public void setTitle2(){
		t1.setTitle("Player two");
	}
	public void setColor1(){
		t1.setColor("Blue");
	}
	public void setColor2(){
		t1.setColor("Red");
	}
	public void turtleset(){
		t1.penUp();
		t1.setPos(0,-200);
		t1.penDown();
	}
	public void turtlereset(){
		t1.penUp();
		t1.clean();
		t1.setPos(0,-200);
		t1.penDown();
	}
	public void movefd(int num){
		t1.fd((num*10)+20);
	}
	public void movebk(int num){
		t1.back(20);
	}
	public double getPos(){
		return t1.getY();
	}
}
