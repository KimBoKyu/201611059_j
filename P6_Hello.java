class P6_Hello{
	static void reverseWord(String word){
		char[] chArr = word.toCharArray();
		StringBuilder reverse = new StringBuilder();
		for(int i=chArr.length-1; i>=0; i--){
			reverse.append(chArr[i]);
		}
		System.out.println(reverse);
	}
	public static void main(String[] args) {
		Hello h = new Hello();
		String hello = "hello";
		h.reverseWord(hello);
	}
}