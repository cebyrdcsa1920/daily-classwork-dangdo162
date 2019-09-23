public class TemperatureConverter
{
    private double temperature;
    private boolean isCelsius;

    public TemperatureConverter(double celsius)
    {
        temperature = celcius;
        isCelsius = true;
    }

    public void converToF
    {
        if (isCelsius)
        {
            temperature = temperature * 9 / 5 + 32;
        }
    }

    public String toString()
    {
        String result = "The current temperature is " + temperature + " degrees";
        if (isCelsius)
        {
            result += " Celsius";
        }
        else
        {
            result =+ " Fahrenheit";
        }
        return result;
    }
}