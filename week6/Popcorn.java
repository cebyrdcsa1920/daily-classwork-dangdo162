import java.awt.Color;

public class Popcorn
{
    private String type;
    private Color color;
    private int numInPackage;
    private boolean salty;


    public Popcorn()
    {
        type = "Healthy";
        color = Color.WHITE;
        numInPackage = 80;
        salty = true;
    }

    public Popcorn(String type, Color color, int numInPackage, boolean salty)
    {
        this.type = type;
        this.color = color;
        this.numInPackage = numInPackage;
        this.salty = salty;
    }
    public void eatFood(double foodweight)
    {
        numInPackage += foodweight;
    }

    public String toString()
    {
        return "This is my Popcorn";
    }
}