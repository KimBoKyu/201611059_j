class Leep{
   void checking(int y){
      if(((y%4==0)&&(y%100!=0))||(y%400==0)){
         System.out.printf("%s is leapyear\n",y);
      }
      else{
         System.out.printf("%s is not leapyear\n",y);
      }
   }
   public static void main(String[] args){
      Leep l = new Leep();
      int[] year = {1800,1900,2000,2012,2016,2020};
      for(int i=0; i<year.length; i++){
         l.checking(year[i]);
      } 
   }
}