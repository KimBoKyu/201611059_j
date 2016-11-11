import java.util.ArrayList;
class Numbers{
	ArrayList<Integer> myList = new ArrayList<Integer>();
	int sum=0;
	void setNumbers(){
		for(int i=0; i<1001; i++){
			if(i%4==0 && i%5!=0){
				myList.add(i);
			}
		}
	}
	int sumList(){
		for(int a:myList){
			sum=sum+a;
		}
		return sum;
	}
	public static void main(String[] args) {
		Numbers n = new Numbers();
		n.setNumbers();
		int sum = n.sumList();
		System.out.println("Result is "+sum);
	}
}