import ch.aplu.turtle.*;

Turtle t1 = new Turtle();
class Figure_Triangle{
	void drawTriangle(int size){
		for(int i=0; i<3; i++){
			t1.fd(size);
			t1.right(120);
		}
	}
}
Figure_Triangle f = new Figure_Triangle();
f.drawTriangle(50);