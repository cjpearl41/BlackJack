import static java.lang.System.out;

public class BlackJack
{
   private Dealer dealer;
   private Player player;
   private int playerTotal;
   private int dealerTotal;


   public BlackJack() 
   {
    // instantiate all of your instance variables
	   dealer= new Dealer();
	   player = new Player();
	   playerTotal = player.getHandValue();
	   dealerTotal = dealer.getHandValue();
	  
	  
	   
   }

   public void playGame() {   
       //all game code goes in here
	   dealer.shuffle();
	   
	   player.addCardToHand(dealer.deal());
	   player.addCardToHand(dealer.deal());
	   dealer.addCardToHand(dealer.deal());
	   
	   
	   out.println("Cards in Hand :: " + player.toString());
	   out.println("");
	   while(playerTotal < 21 && player.hit() == true) {
		   player.addCardToHand(dealer.deal());
		   playerTotal = player.getHandValue();
		   out.println("Cards in Hand :: " + player.toString());
		   out.println("");
	   }
	   out.println("PLAYER");
	   out.println("Hand Value :: " + playerTotal);
	   out.println("Hand Size :: " + player.getHandSize());
	   out.println("Cards in Hand :: " + player.toString());
	   out.println("");
	   
	   while(dealer.hit() == true) {
		   dealerTotal = dealer.getHandValue();
	   }
	   
	   out.println("DEALER");
	   out.println("Hand Value :: " + dealerTotal);
	   out.println("Hand Size :: " + dealer.getHandSize());
	   out.println("Cards in Hand :: " + dealer.toString());
	   
	   
	   
   }

   public static void main( String args[ ] ) {
      BlackJack game = new BlackJack();
      game.playGame();
   }
}

