import java.util.ArrayList;
/**
 * Created by tylerkirkpatrick on 5/2/16.
 */

public class Player extends Card
{
    protected String pName;
    protected ArrayList<Card> pDeck;

    Player()
    {
        pName = null;
        pDeck = new ArrayList<Card>();
    }

    Player(String p1)
    {
        pName = p1;
        pDeck = new ArrayList<Card>();
    }

    void setpName(String p1)
    {
        pName = p1;
    }

    void addToDeck(Card c1)
    {
        pDeck.add(c1);
    }

    void removeFromDeck()
    {
        pDeck.remove(pDeck.size() - 1);
    }

    Card getCard(int pIndex)
    {
        return pDeck.get(pIndex);
    }

    String getName()
    {
        return pName;
    }

}
