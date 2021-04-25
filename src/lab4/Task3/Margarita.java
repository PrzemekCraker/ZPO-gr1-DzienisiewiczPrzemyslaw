package lab4.Task3;

public class Margarita extends PizzaDec
{
    public Margarita()
    {
        super(null);
        System.out.println("Basic Margarita");
    }

    @Override
    public String getDescription()
    {
        return "pizza";
    }

    @Override
    public double getCost()
    {
        return 5.50;
    }
}