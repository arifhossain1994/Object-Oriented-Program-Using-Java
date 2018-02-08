/* Description 						: This program can use two different classes to originate same output. 
 * 										Both of the classes use different methods in order to function properly
 * 										All 52 card of a deck is printed after execution of the program. 
 */
public class DeckDriver 									// Main Driver class for the program. 
{							
	    public static void main(String args[]) 				// Main function
	    {
	       
	        //Deck myDeck=new Deck();							// Deck class object
	        SmartDeck myDeck=new SmartDeck();				// SmartDeck class object. 
	        final int cardsPerRow = 8; 					
	        int cardsThisRow = 0;
	        int myCard;
	        myDeck.initDeck();
	        System.out.println("\nHere is a shuffled deck ...\n");
	        while (!myDeck.emptyDeck())						// Loop to control and print all the cards. 
	        {
	            myCard = myDeck.dealCard();
	            ++cardsThisRow;
	            if (cardsThisRow <= cardsPerRow)
	            {
	            	System.out.print(Deck.cardToString(myCard));
	                System.out.print(" ");
	            }
	            else										// For printing goes to next line 
	            {
	                System.out.println("");
	                cardsThisRow = 1;
	                System.out.print(Deck.cardToString(myCard));
	                System.out.print(" ");
	            }
	        }
	        System.out.println("\n");
	       
	    }

}
