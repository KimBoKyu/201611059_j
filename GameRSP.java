class GameRSP{
   String player;
   String rsp;
   void setPlayer(String p){
      player = p;
   }
   String getPlayer(){
      return player;
   }
   void setRSP(String w){
      rsp = w;
   }
   String getRSP(){
      return rsp;
   }
   public static void main(String[] args){
      GameRSP p1 = new GameRSP();
      GameRSP p2 = new GameRSP();
      p1.setPlayer("Player 1");
      p2.setPlayer("Player 2");
      p1.setRSP("rock");
      p2.setRSP("scissors");
      System.out.println(p1.getPlayer()+" sel "+p1.getRSP());
      System.out.println(p2.getPlayer()+" sel "+p2.getRSP());
      if(p1.getRSP().equals(p2.getRSP())){
         System.out.println("Draw");
      }
      else if(p1.getRSP().equals("rock")){
         if(p2.getRSP().equals("scissors")){
            System.out.println(p1.getPlayer()+" is Winner");
         }
         else if(p2.getRSP().equals("paper")){
            System.out.println(p2.getPlayer()+" is Winner");
         }
      }
      else if(p1.getRSP().equals("scissors")){
         if(p2.getRSP().equals("paper")){
            System.out.println(p1.getPlayer()+" is Winner");
         }
         else if(p2.getRSP().equals("rock")){
            System.out.println(p2.getPlayer()+" is Winner");
         }      
      }
      else if(p1.getRSP().equals("paper")){
         if(p2.getRSP().equals("rock")){
            System.out.println(p1.getPlayer()+" is Winner");
         }
         else if(p2.getRSP().equals("scissors")){
            System.out.println(p2.getPlayer()+" is Winner");
         }
      }
      else{
         System.out.println("Setting is wrong");
      }
   }
}