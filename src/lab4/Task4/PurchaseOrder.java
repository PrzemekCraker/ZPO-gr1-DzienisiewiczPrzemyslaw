package lab4.Task4;

public class PurchaseOrder extends OrderDec
{
    double baseValue;

    public PurchaseOrder (double value)
    {
        super(null);
        this.baseValue = value;
        System.out.println("+ Purchase Order");
    }

    @Override
    public String getDescription() {
        return "Purchase order";
    }

    @Override
    public double getCost() {
        return this.baseValue;
    }
}