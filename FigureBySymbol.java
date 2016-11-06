class FigureBySymbol {
  void drawTriangleSymbol(int h,String s){
  StringBuffer sbuf = new StringBuffer();
  String white =" ";
  for (int i=0; i<h; i++ ) {
         for(int j=0;j<h-i;j++){
            sbuf.append(white);
         }
         for (int j=0; j<i*2+1; j++ ) {
            sbuf.append(s);
         }
         System.out.printf("%s\n",sbuf.toString());
         sbuf.delete(0,sbuf.length());
      }
   }
   public static void main(String[] args) {
   FigureBySymbol a = new FigureBySymbol();
   a.drawTriangleSymbol(7, "*");
   }
}