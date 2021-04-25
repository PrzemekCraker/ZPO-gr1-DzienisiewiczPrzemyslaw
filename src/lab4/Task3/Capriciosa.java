package lab4.Task3;

public class Capriciosa extends PizzaDec
{
    public Capriciosa(Pizza newPizza)
    {
        super(newPizza);
        System.out.println("Additional Capriciosa's ingredients");
    }

    public String getDescription()
    {
        return ingredient.getDescription() + ", ham and mushrooms";
    }

    public double getCost()
    {
        return ingredient.getCost() + 0.50;
    }
}
