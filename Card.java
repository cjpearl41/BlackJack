import java.util.Random;

public class Card
{
	public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};
	public static final String SUITS[] = {"DIAMOND","HEARTS","SPADES","CLUBS"};

	private String suit;
	private int face;
	
	Random rand = new Random();

  	//constructors


	// modifiers


  	//accessors

  	public int getValue()
  	{
  		face = rand.nextInt(14);
  		
  		return face;
  	}
  	private String getSuit() {
		suit=SUITS[rand.nextInt(4)];
		return suit;
	}

	public boolean equals(Object obj)
	{
		return false;
	}
	

  	//toString
  	public String toString() {
  		face = getValue();
		return FACES[face] + " of " + getSuit() + " | value= " + face;
  		
  	}

	
 }
