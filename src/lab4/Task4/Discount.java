package lab4.Task4;

public class Discount extends OrderDec
{
    public Discount(Order newItem)
    {
        super(newItem);
        System.out.println("+ Discount");
    }

    public String getDescription()
    {
        return item.getDescription() + ", discount";
    }

    public double getCost()
    {
        return item.getCost() - 10.00;
    }

}