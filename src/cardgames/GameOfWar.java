package cardgames;

import java.util.*;

public class GameOfWar {
    //make game play 26 rounds, sum up each won game for each player.
    //Then output the winning player.


    public static void deckOne(List<Card> cardDeckOne){
        //go through deck one randomly
        for(Card card1 : cardDeckOne) {
            System.out.println("The " + card1.getRank() + " of " + card1.getSuit());
            System.out.println("--------");

        }
    }
    public static void deckTwo(List<Card> cardDeckTwo){
        //go through deck one randomly
        for(Card card1 : cardDeckTwo) {
            System.out.println("The " + card1.getRank() + " of " + card1.getSuit());
            System.out.println("--------");

        }
    }


    public static void main(String[] args) {
//create array list for player one
        Card[] cardDeckOne = CardsArray.getAllCards();

        //create array list for player two
        Card[] cardDeckTwo = CardsArray.getAllCards();

        //list deck list one as a list
        List<Card> deckListOne = Arrays.asList(cardDeckOne);

        //list deck two as a list
        List<Card> deckListTwo = Arrays.asList(cardDeckTwo);

        //shuffle both decks
        Collections.shuffle(deckListOne);
        Collections.shuffle(deckListTwo);


        //go through deck one randomly
//        deckOne(deckListOne);

        //go through deck two randomly
//        deckTwo(deckListTwo);

        //get one card from deck one

        //import random object
        Random rndCard = new Random();

        //set a limit for random number (51)

//        int rndNum = rndCard.nextInt(deckListOne.size());

//        System.out.println(card1);


    }
}
