package cardgames;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GameOfWar {
    //make game play 26 rounds, sum up each won game for each player.
    //Then output the winning player.

    private static int tallyP1 = 0;
    private static int tallyP2 = 0;
    private static Player playerOne = new Player();
    private static Player playerTwo = new Player();


    public static void theGame(List<Card> deckListOne, List<Card> deckListTwo){
        for(int i = 0; i <= 26; i+=1){
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            //player one plays one card from deck one
            System.out.println("Player one plays: " + deckListOne.get(i).getCard());
            //player two plays one card from deck two
            System.out.println("Player two plays: " + deckListTwo.get(i).getCard());
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            int value1 = deckListOne.get(i).getVal();
            int value2 = deckListTwo.get(i).getVal();
            //call whoWon method
            whoWon(value1, value2);
        }
    }


    public static void whoWon(int val1, int val2){
        if(val1 > val2){
            System.out.println("Player one wins");
            tallyP1++;
            playerOne.setGamesWon(tallyP1);

        }else if(val1 < val2){
            System.out.println("Player two wins");
            tallyP2++;
            playerTwo.setGamesWon(tallyP2);

        }else{
            System.out.println("Tie");
        }

    }

    public static void compareWins(){

       int p1gamesWon =  playerOne.getGamesWon();
       int p2gamesWon = playerTwo.getGamesWon();

       if(p1gamesWon > p2gamesWon){
           System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
           System.out.println("Player one wins with a total tally of: " + p1gamesWon);
           System.out.println("Player two lost with a total tally of: " + p2gamesWon);
       }else if(p1gamesWon < p2gamesWon){
           System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
           System.out.println("Player two wins with a total tally of: " + p2gamesWon);
           System.out.println("Player one lost with a total tally of: " + p1gamesWon);
       }else{
           System.out.println("It's a tie! " + p1gamesWon + p2gamesWon);
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

        //play the game
        theGame(deckListOne, deckListTwo);

        //compare won games
        compareWins();




    }
}
