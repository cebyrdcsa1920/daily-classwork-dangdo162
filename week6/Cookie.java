import java.awt.Color;

public class Cookie
{
    private String type;
    private Color color;
    private int numInPackage;
    private boolean sweet;


    public Cookie()
    {
        type = "SugarCookie";
        color = Color.WHITE;
        numInPackage = 12;
        sweet = true;
    }

    public Cookie(String type, Color color, int numInPackage, boolean sweet)
    {
        this.type = type;
        this.color = color;
        this.numInPackage = numInPackage;
        this.sweet = sweet;
    }
    public void eatFood(double foodweight)
    {
        numInPackage += foodweight;
    }

    public String toString()
    {
        return "This is my Cookie";
    }
}