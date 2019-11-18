import java.util.Scanner;

import static java.lang.System.out;

public class BlackJack
{
   private Dealer dealer;
   private Player player;
   private int playerTotal;
   private int dealerTotal;
   String play;
   private Scanner input;


   public BlackJack() 
   {
    // instantiate all of your instance variables
	   dealer= new Dealer();
	   player = new Player();
	   playerTotal = player.getHandValue();
	   dealerTotal = dealer.getHandValue();
	   play = "y";
	   input = new Scanner(System.in);
	  
	  
	   
   }

   public void playGame() {   
       //all game code goes in here
	   while (play.toLowerCase().equals("y") || play.toLowerCase().equals("yes")) {
		   dealer.shuffle();
		   player.resetHand();
		   dealer.resetHand();

		   player.addCardToHand(dealer.deal());
		   player.addCardToHand(dealer.deal());
		   dealer.addCardToHand(dealer.deal());


		   out.println("Cards in Hand :: " + player.toString());
		   out.println("");
		   while (playerTotal < 21 && player.hit() == true) {
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
		   if (playerTotal <= 21) {

			   while (dealer.hit() == true) {
				   dealer.addCardToHand(dealer.deal());
				   dealerTotal = dealer.getHandValue();
			   }

			   out.println("DEALER");
			   out.println("Hand Value :: " + dealerTotal);
			   out.println("Hand Size :: " + dealer.getHandSize());
			   out.println("Cards in Hand :: " + dealer.toString());
			   if (dealerTotal <= 21) {

				   if (playerTotal > dealerTotal) {
					   out.println("The player wins.");
					   player.setWinCount(player.getWinCount());
					   out.println("The player has won " + player.getWinCount() + " times");
					   out.println("The dealer has won " + dealer.getWinCount() + " times");
					   out.println("Do you want to play again (y/n)?");
					   play = input.next();

				   } else if (dealerTotal > playerTotal) {
					   out.println("The dealer has won.");
					   dealer.setWinCount(dealer.getWinCount());
					   out.println("The player has won " + player.getWinCount() + " times");
					   out.println("The dealer has won " + dealer.getWinCount() + " times");
					   out.println("Do you want to play again (y/n)?");
					   play = input.next();

				   } else if (playerTotal == dealerTotal) {
					   out.println("You have tied with the dealer");
					   out.println("Do you want to play again (y/n)?");
					   play = input.next();

				   }
			   } else{
				   out.println("The dealer has busted, the player wins.");
				   player.setWinCount(player.getWinCount());
				   out.println("The player has won " + player.getWinCount() + " times");
				   out.println("The dealer has won " + dealer.getWinCount() + " times");
				   out.println("Do you want to play again (y/n)?");
				   play = input.next();
			   }


		   } else {
			   out.println("The player has busted, the dealer wins.");
			   dealer.setWinCount(dealer.getWinCount());
			   out.println("The player has won " + player.getWinCount() + " times");
			   out.println("The dealer has won " + dealer.getWinCount() + " times");
			   out.println("Do you want to play again (y/n)?");
			   play = input.next();
		   }
	   }
	   
	   
	   
   }

   public static void main( String args[ ] ) {
      BlackJack game = new BlackJack();
      game.playGame();
   }
}

