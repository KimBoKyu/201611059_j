class Person{
	float bmi=0;
	float calc(float weight, float height){
		bmi=weight/(height*height/10000);
		return bmi;
	}
	void printResult(float r){
		if(r<18.5) {
			System.out.println("Your BMI result is "+r);
			System.out.println("You is low");
		}
		else if(r>=18.5 && r<23) {
			System.out.println("Your BMI result is "+r);
			System.out.println("You is nomal");
		}
		else if(r>=23 && r<25) {
			System.out.println("Your BMI result is "+r);
			System.out.println("You is resky");
		}
		else if(r>=25 && r<30) {
			System.out.println("Your BMI result is "+r);
			System.out.println("You is obesity 1");
		}
		else if(r>=30 && r<40) {
			System.out.println("Your BMI result is "+r);
			System.out.println("You is obesity 2");
		}
		else if(r>=40) {
			System.out.println("Your BMI result is "+r);
			System.out.println("You is obesity 3");
		}
		else {
			System.out.print("Error");
		}
	}
	public static void main(String[] args){
		float result;
		Person p = new Person();
		result = p.calc(70f, 180f);
		p.printResult(result);
	}
}