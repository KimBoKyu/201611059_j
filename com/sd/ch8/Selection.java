package com.sd.ch8;
import java.util.*;
public class Selection {
    ArrayList<Rectangle> sArr = new ArrayList<Rectangle>();
    Selection(){}
    public void select(Rectangle r) {
        r.setSelected(true);
        sArr.add(r);
        System.out.println("selected: "+r.isSelected);
    }
    public void print(){
        for(Rectangle r:sArr){
            System.out.println(r.toString());
        }
    }
    public static void main(String[] args){
    	Selection s = new Selection();
    	Rectangle r = new Rectangle(20,30);
        Cube c = new Cube(10,30,40);
		s.select(r);
        s.select(c);
        s.print();
    }
}
