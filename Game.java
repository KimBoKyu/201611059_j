package com.sd.DiceGame;
import com.sd.DiceGame.*;
//게임실행

class Game{
	public int score(){
		int first = 0;
		int second = 0;
		int sum=0;
		Dice d = new Dice();
		d.roll();
		first = d.getNum();
		d.roll();
		second = d.getNum();
		sum = first + second;
		return sum;
	}
	public void result(){
		Game p1 = new Game();
		Game p2 = new Game();
		Player player1 = new Player("P1");
		Player player2 = new Player("P2");
		if (p1.score() > p2.score()){
			System.out.println(player1.getName()+" is winner");
		}
		else if (p1.score() < p2.score()){
			System.out.println(player2.getName()+" is winner");
		}
		else {
			System.out.println(player1.getName()+" "+player2.getName()+" Draw");
		}
	}
	public static void main(String[] args) {
		Game g = new Game();
		g.result();
	}
}


