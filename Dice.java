package	com.sd.DiceGame;
import java.util.Random;
import com.sd.DiceGame.*;

class Dice{
	int num = 0;
	public void roll(){
		num = (int)(Math.random()*6+1);
	}
	public int getNum(){
		return num;
	}
}

