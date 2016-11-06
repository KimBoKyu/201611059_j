class Multiple35{
	int sum = 0;
	void calc(int degree){
		for(int i=0; i<degree; i++){
			if(i%3==0 || i%5==0) {
				sum = sum + i;
			}
		}
		System.out.printf("3과 5의 배수의 합은 %d\n", sum);
	}
	public static void main(String[] args){
		Multiple35 m = new Multiple35();
		int range = 1000;
		m.calc(range);
	}
}