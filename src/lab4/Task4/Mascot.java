package lab4.Task4;

public class Mascot extends OrderDec
{
    public Mascot(Order newItem)
    {
        super(newItem);
        System.out.println("+ Mascot");
    }

    public String getDescription()
    {
        return item.getDescription() + ", mascot";
    }

    public double getCost()
    {
        return item.getCost();
    }

}
