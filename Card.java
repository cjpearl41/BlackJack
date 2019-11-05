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

  	public Card(int i, String string) {
  		this.face = i;
  		this.suit = string;
	}
	public Card() {
		// TODO Auto-generated constructor stub
		this.face = 0;
		this.suit=" ";
	}
	public int getValue()
  	{
  		return face;
  	}
  	private String getSuit() {
		
		return suit;
	}

	public boolean equals(Object obj)
	{
		
		return false;
	}
	

  	//toString
  	public String toString() {
  		
		return FACES[face] + " of " + getSuit() + " | value= " + getValue();
  		
  	}

	
 }
