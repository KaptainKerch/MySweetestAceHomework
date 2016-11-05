import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HomeworkPart1_7_29 {
	
	/*This is a combination of my own work combined with that of the Book and Internet's work.
	 * I had trouble with this one initially but started to make sense the more i researched it.
	 * I used Stack Exchange, along with good Ol' Google, and referenced the book to turn their 
	 * complicated terminology into something that i could understand.
	 */

	public static void main(String[] args) {
		System.out.print("Hello Jason");
		//initialize everything
        int[] deck = new int[52];
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8",
        				"9", "10", "Jack", "Queen", "King"};
        List<String> pickedCards = new ArrayList<String>();

        //This establishes the variable for the deck of cards
        for(int i = 0; i< deck.length; i ++)
            deck[i] = i;

        // this shuffles the deck of cards
        for(int i = 0; i < deck.length; i++){

            // this  will generate an index randomly
            int index = (int)(Math.random() * deck.length);
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }

        // This will display the four cards
        for(int i = 0; i < 4; i++){
            String suit = suits[deck[i] / 13];
            String rank = ranks[deck[i] % 13];
            System.out.println(rank + " of " + suit);
            pickedCards.add(rank);
        }
        
        // this will add the cards together and display an output
        int sum = 0;
        int jack = 11;
        int queen = 12;
        int king = 13;
        int ace = 1;
        Iterator<String> iterator = pickedCards.iterator();
        while(iterator.hasNext()) {

            String rank = iterator.next();
            System.out.println(rank);
            if(rank.equalsIgnoreCase("Jack")){
            sum = sum+jack;
        }
        else if(rank.equalsIgnoreCase("Queen")){
            sum = sum+queen;
        }
        else if(rank.equalsIgnoreCase("King")){
            sum = sum+king;
        }
        else if(rank.equalsIgnoreCase("Ace")){
            sum = sum+ace;
        } 
        else {
            sum = sum+Integer.parseInt(rank);
        }
    }
    System.out.println("Sum of picked cards is : "+sum);
	}

}
