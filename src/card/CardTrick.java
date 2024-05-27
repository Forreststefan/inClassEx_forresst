/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 * Modifier: Stefan Forrest [@forresst/@overd] 991734886
 */
import java.util.Random;
import java.util.Scanner;

public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            Random random = new Random();
//                c.setSuit("diamond");
//                c.setValue(2);
                c.setValue(random.nextInt(13)+1);
                c.setSuit(Card.SUITS[random.nextInt(4)]);
                magicHand[i]=c;
        }
               
        //insert code to ask the user for Card value and suit, create their card
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick a card (any card): ");
        System.out.println("Enter the card value(1-13): ");
        int userValue =scanner.nextInt();
        System.out.println("Please choose a suit(hearts,diamonds,clubs,spades: ");
        String userSuit = scanner.next();
        //Create the userCard obj
        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(userSuit);
        
        // and search magicHand here
        boolean found = false;
        for (Card card: magicHand){
                if(card.equals(userCard)){
                found=true;
                break;
                }}
        //Then report the result here
        if(found){
        System.out.println("Your card is in the MAGIC HAND!");}
        else{
        System.out.println("Sorry your card is not in the magic hand...");}
        
        // add one luckcard hard code 2,clubs
        Card luckyCard= new Card();
        luckyCard.setValue(2);
        luckyCard.setSuit("clubs");
        System.out.println(luckyCard);
    }
    
}
