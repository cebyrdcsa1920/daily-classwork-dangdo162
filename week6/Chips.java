import java.awt.Color;

public class Chips
{
    private String type;
    private Color color;
    private int numInPackage;
    private boolean sweet;


    public Chips()
    {
        type = "Doritos";
        color = Color.RED;
        numInPackage = 40;
        sweet = false;
    }

    public Chips(String type, Color color, int numInPackage, boolean sweet)
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
        return "This is my Chips";
    }
}