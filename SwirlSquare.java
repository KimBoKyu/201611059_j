import ch.aplu.turtle.*;
class SwirlSquare{
	Turtle t1 = new Turtle();
	void drawSwirlSquare(int size, int bigger, int turns, double degree){
		for(int i=0; i<turns; i++){
			if(i%2!=0){
				t1.fd(size);
				t1.right(degree);
				size = size + bigger;
				System.out.printf("%d-%d\n", i,size);
			}
		}
	}
	public static void main(String[] args){
		SwirlSquare s = new SwirlSquare();
		s.drawSwirlSquare(15,15,30,90);
	}
}