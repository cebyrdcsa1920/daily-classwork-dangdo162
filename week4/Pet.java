import java.awt.Color;

public class Pet
{
    private String species;
    private Color color;
    private int age;
    private double weight;


    public Pet()
    {
        species = "Lab";
        color = Color.YELLOW;
        age = 1;
        weight = 45.5;
    }

    public Pet(String species, Color color, int age, double weight)
    {
        this.species = species;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }
    public void eatFood(double foodweight)
    {
        weight += foodweight;
    }

    public String toString()
    {
        return "This is my Lab";
    }
}