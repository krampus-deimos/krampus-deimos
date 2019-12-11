package cardgames;

public class Card {
    //variables
    protected String suit;
    protected String rank;
    protected int val;


    public Card(String suit, String rank, int val) {
        this.suit = suit;
        this.rank = rank;
        this.val = val;
    }


    public int getVal() {
        return val;
    }

    public String getSuit() {
        return this.suit;
    }

    public String getRank() {
        return this.rank;
    }


    public String getCard(){
        return ("The " + this.rank +" of "+ this.suit + "!");
    }




}
