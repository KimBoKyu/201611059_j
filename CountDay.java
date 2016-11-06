import java.util.Calendar;
class CountDay{
	void countSunday(){
		int sunday = 0;
		Calendar c = Calendar.getInstance();
		for(int y=1901; y<=2000; y++){
			for(int m=0; m<12; m++){
				c.set(y,m,1);
				if(c.get(Calendar.DAY_OF_WEEK)==1){
					sunday=sunday+1;
				}
			}
		}
		System.out.println("1901.01.01 ~ 2000.12.31 Sunday Counting : "+sunday);
	}
	public static void main(String[] args){
		CountDay h = new CountDay();
		h.countSunday();
	}
}