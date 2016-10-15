//플레이어 주사위 두번 던지고 합산
public class Player{
	private String name;
	private int sum = 0;
	private int first = 0;
	private int second = 0;
	public Player(String n){
		this.name = n;
	}
	public String getName(){
		return this.name;
	}
	public void play(){
		Dice d = new Dice();
		d.roll();
		first = d.getNum();
		d.roll();
		second = d.getNum();
		System.out.println("first roll : "+first);
		System.out.println("second roll : "+second);
	}
	public int score(){
		sum = first + second;
		return this.sum;
	}
}