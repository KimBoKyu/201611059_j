import ch.aplu.turtle.*;

Turtle t1 = new Turtle();
class Figure_Star{
	void drawStar(int size){
		for(int i=0; i<5; i++){
			t1.fd(size);
			t1.right(144);
		}
	}
}
Figure_Star f = new Figure_Star();
f.drawStar(50);