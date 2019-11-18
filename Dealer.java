

public class Dealer extends Player
{
	//define a deck of cards
	Deck deck = new Deck();

	public Dealer() {
		super();
	}

	public void  shuffle()
	{
	   //shuffle the deck
		deck.shuffle();
	}

	public Card  deal(){
		
	   return deck.nextCard();
	}
	
	public int numCardsLeftInDeck()
	{
		return deck.size();
	}

	public boolean hit()
	{
		if(super.getHandValue() < 17) {
			return true;
		}
		else if(super.getHandValue() > 17) {
			return false;
		}
		else{
			return false;
		}
	   
    }
}


