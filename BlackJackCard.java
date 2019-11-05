
public class BlackJackCard extends Card
{
  	//constructors



  	public BlackJackCard(int i, String string) {
		
  		super(i, string);
	}

	public BlackJackCard() {
		super();
	}

	public int getValue()
  	{
  		//enables you to build the value for the game into the card
  		//this makes writing the whole program a little easier
		if (super.getValue() == 1) {
			return 11;
		}
		else if(super.getValue() < 11 || super.getValue() > 1) {
			return super.getValue();
		}
		else if(super.getValue() > 11) {
			return 10;
		}
		else {
			return 0;
		}

  	}
  	
 }
