class Multiplication{
	public static void main(String[] args){
		int[] x={1,2,3,4,5,6,7,8,9};
		for(int i: x) {
	    	System.out.printf("\n%d단 -",i);
		    for(int j: x) {
		        System.out.printf("\t%dx%d=%2d ",i,j,i*j);
	    	}
		}
	}
}