public class Rectangle {
    private int width;
    private int height;
    public Rectangle(int w, int h) {
        this.width=w;
        this.height=h;
    }
    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int newHeight) {
        height = newHeight;
    }
    public void setWidth(int newWidth){
        width = newWidth;
    }
    public void setSize(int w, int h){
        setWidth(w);
        setHeight(h);
    }
    public int calcArea() {
        return width*height;
    }
}

Rectangle r = new Rectangle(5,6);
System.out.println("Rectangle width is " + r.getWidth());
System.out.println("Rectangle height is " + r.getWidth());
System.out.println("Rectangle Area is " + r.calcArea());
r.setSize(3,4);
System.out.println("Rectangle width is " + r.getWidth());
System.out.println("Rectangle height is " + r.getWidth());
System.out.println("Rectangle Area is " + r.calcArea());

