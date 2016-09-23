// homework 2-4 자신의 몸무게를 남들이 볼 수 없게 구현하기
class Person{
	private float weight;
	public void setWeight(float w){
		this.weight = w;
	}
	private float getWeight(){
		return weight;
	}
}
Person p = new Person();
p.setWeight((float)70.0);
System.out.println("Your weight is " + p.getWeight());