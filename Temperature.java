class Temperature{
	void exchange(String x, float y){
		float z;
		if(x.equals("F")){
			z = (y-32f)/1.8f;
			System.out.println("User input "+x+" "+y);
			System.out.println("Exchange "+"C "+z);
		}
		else if(x.equals("C")){
			z = (y*1.8f)+32f;
			System.out.println("User input "+x+" "+y);
			System.out.println("Exchange "+"F "+z);
		}
		else{
			System.out.println("Error");
		}
	}
	public static void main(String[] args){
		Temperature a = new Temperature();
		a.exchange("C", 30.0f);
		Temperature b = new Temperature();
		b.exchange("F", 30.0f);
	}
}