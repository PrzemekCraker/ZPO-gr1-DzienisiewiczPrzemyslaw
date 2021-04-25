package lab4.Task4;

public class OrderDec implements Order
{
    protected Order item;

    public OrderDec(Order item)
    {
        this.item = item;
    }

    @Override
    public String getDescription()
    {
        return item.getDescription();
    }

    @Override
    public double getCost()
    {
        return item.getCost();
    }
}
