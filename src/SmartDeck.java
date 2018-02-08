import java.util.Random;

public class SmartDeck 
{
	private boolean[] deck = new boolean[52];
	private int count;
	
	
	
	public void initDeck ()		// Method to give every value in the initial array true value
    {
		System.out.println("With SmartDeck Class - ");
	    count=0;
        for (int i=0; i<this.deck.length; i++)
        {
            this.deck[i]=true;
        }
    
    }
	
	public boolean emptyDeck()	// Giving false value to one by one which will help to track which number is already shown
    {
      	return this.count==51;
    }
	
	
	public int dealCard ()		// Method for generating random number and putting them in the empty deck
	    {
	      Random rndGenerator= new Random();
			
			if (this.emptyDeck() == false)
			{
				while(true)
				{
					int x= rndGenerator.nextInt(52);
					if (this.deck[x]==true)
					{
						this.deck[x]=false;
						count++;
						return x;
					}
				}
			}
				return -1;
	    }
	  public static String cardToString (int card)				// Print method for the whole deck
	    {
	    	String []result=new String[52];							// New object to store 52 cards in string.
	    	String []suits= {"C","S","D","H"};
	    	String []numbers= {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	    	int value=card/13;										// Dividing result will give suit result 
	    															// 0=clubs, 1=Spades. 2=Diamonds, 3=Hearts. 
	    	int remainder=card%13;									// Remainder will be the card number. 
	    	return result[card]=numbers[remainder]+""+suits[value];	// Returning string. 
	       
	     }
}
