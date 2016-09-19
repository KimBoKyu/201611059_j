// homework 2_2 지하철
class Subway{
	int line;
	void setLine(int l){
		line = l;
	}
	void subwayRun(){
		System.out.println(line + " line is run!!!");
	}
}

// homework 2_3 커피원산지 
Subway s = new Subway();
s.setLine(4);
s.subwayRun();

class BrazilCoffee {
	String origin;
	int degreeOfRoast;
	int grade;
	BrazilCoffee(String o) {
		origin=o;
	}
	public void roast() {
		System.out.println("roasting..." + origin);
	}
	public void grind() {
		System.out.println("grinding..." + origin);
	}
	public void brew() {
		System.out.println("brewing..." + origin);
	}
}

BrazilCoffee b = new BrazilCoffee("Brazil");
b.roast();
b.grind();
b.brew();

// homework 2_4 인사하기
class Hello{
	String name;
	Hello(String name){
		this.name=name;
	}
	void sayHello(){
		System.out.println("Hello " + name);
	}
}

Hello h = new Hello("world")
h.sayHello();
h.name;