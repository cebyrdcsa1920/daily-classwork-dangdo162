import java.awt.Color;
public class House
{
    private String story;
    private int numResident;
    private Color color;
    private double costOfHouse;

    public House()
    {
        story = "TwoStory";
        numResident = 2;
        color = Color.WHITE;
        costOfHouse = 200000.50;
    }
    public String toString()
    {
        return "This is my House";
    }

}