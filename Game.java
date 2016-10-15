class Game{
	Player p1;
	Player p2;
	public void playGame(){
		p1 = new Player("Player 1");
		p2 = new Player("Player 2");
		p1.play();
		p2.play();
		if (p1.score() == p2.score()){
			System.out.println(p1.getName()+p2.getName()+" Draw");
		}
		else if (p1.score() > p2.score()){
			System.out.println(p1.getName()+" is winner");
		}
		else if (p1.score() < p2.score()){
			System.out.println(p2.getName()+" is winner");
		}
	}
}

Game g = new Game();
g.playGame();