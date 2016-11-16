import ch.aplu.turtle.*;

public class P3_TurtleTrackMain{
	static void drawSquare(double[][] tracks){
		Turtle t1 = new Turtle();
		t1.clean();
		for(double[] t:tracks){
			t1.moveTo(t[0],t[1]);
		}
	}
	public static void main(String[] args){
		double[][] tracks={{0,0},{50,0},{50,50},{0,50},{0,0}};
		drawSquare(tracks);
	} 
}