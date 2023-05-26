/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

//YASHIKA SAINI
//STUDENT NUMBER - 991708471 
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 */
import java.util.*;
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            Random random = new Random();
            
            //Generating random values and suits

            c.setValue(random.nextInt(13) + 1);
            c.setSuit(Card.SUITS[random.nextInt(4)]);

            magicHand[i] = c;
        }
        
        Scanner scanner = new Scanner(System.in);
         
         //Asking the user to guess
         
        System.out.print("Enter a card suit (Hearts, Diamonds, Spades, Clubs): ");
        String suit = scanner.nextLine();

        System.out.print("Enter a card value (1-13): ");
        int value = scanner.nextInt();
        
        //Storing the user's guess in a new card

        Card userCard = new Card();
        userCard.setValue(value);
        userCard.setSuit(suit);

        //Checking the user's guess in magicHand by iterating through
       
        boolean found = false;

        for (Card card : magicHand) {
            if (card.getSuit().equalsIgnoreCase(userCard.getSuit()) && card.getValue() == userCard.getValue()) {
                found = true;
                break;
            }
        }

        //Displaying the result
        
        if (found) {
            System.out.println("Congratulations! Your card was found in the magic hand.");
        } else {
            System.out.println("Sorry, your card was not found in the magic hand.");
        }
   
    }
    
}
