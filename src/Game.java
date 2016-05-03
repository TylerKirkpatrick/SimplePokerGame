import java.util.ArrayList;

/**
 * Created by tylerkirkpatrick on 5/2/16.
 */

public class Game extends Player
{
    Game()
    {
        Card[] myDeck = new Card[52];
        myDeck = getDeck();


    }

    public Card[] getDeck()
    {
        //We are using a regular array because the deck will always have 52 cards.

        Card theDeck[] = new Card[52];

        String suits[] = new String[4];
        suits[0] = "Spades";
        suits[1] = "Diamonds";
        suits[2] = "Clubs";
        suits[3] = "Hearts";

        String specialVals[] = new String[4];
        specialVals[0] = "Jack";
        specialVals[1] = "Queen";
        specialVals[2] = "King";
        specialVals[3] = "Ace";

        /*create 13 cards for each suit. Suit is the outer loop,
            value is the inner loop (2, 3, ..., King, Ace) */

        int inner = 0;
        for(int outer = 0; outer < 4; outer++)
        {

            for (inner = 0; inner < 13; inner++)
            {
                if(inner >= 9)
                {
                    Card c1 = new Card(specialVals[inner-9], suits[outer]);
                    theDeck[inner + outer] = c1;
                    System.out.println(c1.returnString());
                }
                else
                {
                    Card c1 = new Card(Integer.toString(inner + 2), suits[outer]);
                    theDeck[inner + outer] = c1;
                    System.out.println(c1.returnString());
                }
            }

        }

        return theDeck;
    }

    Card[] shuffle(Card[] pCards)
    {
        Card[] shuffled = new Card[52];
        shuffled


    }



}
