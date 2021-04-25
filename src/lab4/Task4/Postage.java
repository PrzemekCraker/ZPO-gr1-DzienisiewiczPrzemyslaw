package lab4.Task4;

public class Postage extends OrderDec
{
    public Postage(Order newItem)
    {
        super(newItem);
        System.out.println("+ Postage");
    }

    public String getDescription()
    {
        return item.getDescription() + ", postage";
    }

    public double getCost()
    {
        return item.getCost() + 13.00;
    }

}
