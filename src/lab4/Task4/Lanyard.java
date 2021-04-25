package lab4.Task4;

public class Lanyard extends OrderDec
{
    public Lanyard(Order newItem)
    {
        super(newItem);
        System.out.println("+ Lanyard");
    }

    public String getDescription()
    {
        return item.getDescription() + ", lanyard";
    }

    public double getCost()
    {
        return item.getCost() + 1.00;
    }

}