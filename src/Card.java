/**
 * Created by tylerkirkpatrick on 5/2/16.
 */
public class Card
{
    /*
    public static final int ACE = 14;
    public static final int QUEEN = 13;
    public static final int KING = 12;
    public static final int JACK = 11;
*/
    protected String cName;
    protected String cSuit;

    Card()
    {
        cName = null;
        cSuit = null;
    }

    Card(String p1, String p2)
    {
        cName = p1;
        cSuit = p2;
    }

    void setName(String p1)
    {
        cName = p1;
    }

    void setSuit(String p1)
    {
        cSuit = p1;
    }

    String getName()
    {
        return cName;
    }

    String getSuit()
    {
        return cSuit;
    }

    String returnString()
    {
        return cName + " of " + cSuit;
    }

}
