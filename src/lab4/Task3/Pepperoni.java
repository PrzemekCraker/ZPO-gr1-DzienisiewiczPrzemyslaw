package lab4.Task3;

public class Pepperoni extends PizzaDec
{
    public Pepperoni(Pizza newPizza)
    {
        super(newPizza);
        System.out.println("Additional Pepperoni's ingredients");
    }

    public String getDescription()
    {
        return ingredient.getDescription() + ", pepperoni sausage";
    }

    public double getCost()
    {
        return ingredient.getCost() + 1;
    }

}
