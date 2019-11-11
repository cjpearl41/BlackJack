
import java.util.*;

public class Player
{
   private ArrayList<Card> hand;
   private int winCount;

   public Player ()
   {
	   hand = new ArrayList<>();
	   
	   
   }

   public Player (int score)
   {
	   System.out.println("Wlecome to BlackJack. You have won " + score + "times.");
   }

   public void addCardToHand( Card temp )
   {
	   hand.add(temp);
   }

   public void resetHand( )
   {
	   hand.clear();
   }

   public  void setWinCount( int numwins )
   {
	   winCount = numwins +1;
   }

   public int getWinCount() { return winCount; }

   public int getHandSize() { return hand.size(); }

   public int getHandValue()
   {
	   int value = 0;
	   for(int i = 0;i<hand.size();i++) {
		   value = value+hand.get(i).getValue();
	   }
      return value;
   }

   public  boolean  hit( )
   {
	   Scanner input = new Scanner(System.in);
	   System.out.println("Do you want to hit? y/n");
	   String response = input.next();
	   if(response.equals("y")) {
		   return true;
	   }
	   
	   
      return false;
   }

   public String toString()
   {
      return "hand= " + hand + " - " +getHandValue();
   }
}