package lab4.Task3;

public class Prosciutto extends PizzaDec
{
    public Prosciutto(Pizza newPizza)
    {
        super(newPizza);
        System.out.println("Additional Prosciutto's ingredients");
    }

    public String getDescription()
    {
        return ingredient.getDescription() + ", italian ham and arugula";
    }

    public double getCost()
    {
        return ingredient.getCost() + 2.50;
    }
}
