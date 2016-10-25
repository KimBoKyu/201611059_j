package com.sd.Draw;
import ch.aplu.turtle.*;

class ShapeRectangle{
    Turtle t1 = new Turtle();
    enum Shape{TRIANGLE, RECTANGLE}
    public void drawSquareOrTriangle(int size, int sides, double angle){
        t1.home();
        t1.clean();
        for(int i=0; i<sides; i++){
            t1.fd(size);
            t1.right(angle);
        }
    }
    public static void main(String[] args) {
        Shape sel = Shape.RECTANGLE;
        int size = 100;
        int sides = 0;
        double angle = 0;
        switch(sel) {
          case TRIANGLE:
            sides = 3;
            angle = 120;
            break;
          case RECTANGLE:
            sides = 4;
            angle = 90;
            break;
        }
        ShapeRectangle r = new ShapeRectangle();
        r.drawSquareOrTriangle(size, sides, angle);
        System.out.println("Size is : "+size);
        System.out.println("Sides is : "+sides);
        System.out.println("Angle is : "+angle);
    }
}

