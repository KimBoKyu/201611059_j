class P10_People{
	static void calcSum(int[][] data){
		int sumx=0;
		int sumy=0;
		for(int i=0; i<data.length; i++){
			sumx = data[i][0]+sumx;
			sumy = data[i][1]+sumy;
		}
		System.out.printf("Man sum %d, Woman sum %d\n",sumx,sumy);
	}
	static void calcAverage(int[][] data){
		int sumx=0;
		int sumy=0;
		for(int i=0; i<data.length; i++){
			sumx = data[i][0]+sumx;
			sumy = data[i][1]+sumy;
		}
		float averagex=0f;
		float averagey=0f;
		averagex = (float)sumx/(float)data.length;
		averagey = (float)sumy/(float)data.length;
		System.out.printf("Man average %.1f, Woman average %.1f\n",averagex,averagey);
	}
	static void clacAdSum(int[][] data){
		for(int i=0; i<data.length; i++){
			int sumAD=0;
			float averageAD=0;
			sumAD = data[i][0]+data[i][1];
			averageAD = (float)sumAD/2f;
			System.out.printf("Sum for City%d is %d And Average is %.1f\n",i+1,sumAD, averageAD);
		}
	}
	public static void main(String[] args){
		int[][] data={
		    {74425, 76326},
		    {61164, 61636},
		    {109688, 115744},
		    {144796, 146776},
		    {174996, 181676},
		    {177841, 177434},
		    {204630, 205980},
		    {223373, 232245},
		    {161055, 166130},
		    {171576, 176735},
		    {279169, 293772},
		    {239450, 251066},
		    {148690, 156510},
		    {182977, 196992},
		    {237792, 242641},
		    {283869, 296762},
		    {209344, 210282},
		    {118965, 114441},
		    {186503, 186856},
		    {195734, 203014},
		    {254381, 249472},
		    {212401, 229111},
		    {271654, 295354},
		    {319197, 335045},
		    {229829, 231671}
		};
		P10_People p = new P10_People();
		p.calcSum(data);
		p.calcAverage(data);
		p.clacAdSum(data);
	}
}
