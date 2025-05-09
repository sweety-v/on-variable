public class Player{
     static int totalPlayers=0;
     String playerName;
      public static void main(String [] args){
        Player p1=new Player();
        p1.playerName="sweety";
        Player.totalPlayers=1;
        Player p2=new Player();
        p2.playerName="varsha";
         Player.totalPlayers=2;
        System.out.println("Total players: "+Player.totalPlayers);
    }
  }