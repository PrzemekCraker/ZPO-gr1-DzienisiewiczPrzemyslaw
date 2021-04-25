package lab4.Task3;

public class Main {
    public static void main(String[] args) {

        PizzaDec fundamental = new Margarita();
        PizzaDec Capriciosa = new Capriciosa(fundamental);
        PizzaDec Pepperoni = new Pepperoni(Capriciosa);
        PizzaDec Prosciutto = new Prosciutto(Pepperoni);

        System.out.println("Ingridients: " + Prosciutto.getDescription());
        System.out.println("Price: " + Prosciutto.getCost());

        Prosciutto.removeDec(Capriciosa);

        System.out.println("Ingridients: " + Prosciutto.getDescription());
        System.out.println("Price: " + Prosciutto.getCost());

        Capriciosa.removeDec(Prosciutto);

        System.out.println("Ingridients: " + Capriciosa.getDescription());
        System.out.println("Price: " + Capriciosa.getCost());
    }
}