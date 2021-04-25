package lab4.Task4;

public class Main {
    public static void main(String[] args) {
        OrderDec baseOrder = new PurchaseOrder(350);
        OrderDec orderMascot = new Mascot(baseOrder);
        OrderDec orderLanyard = new Lanyard(orderMascot);
        OrderDec orderDiscount = new Discount(orderLanyard);
        OrderDec FinalCost = new Postage(orderDiscount);

        System.out.println("Contents of the order are " + FinalCost.getDescription() + "\nFinal cost: " + FinalCost.getCost());
    }
}
