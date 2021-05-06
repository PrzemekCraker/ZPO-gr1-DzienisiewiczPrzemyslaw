package lab7.Task4;

public class Main {
    public static void main(String[] args) {

        Pizza pizza = new Margherita();
        pizza.done();System.out.println();

        pizza = new Sycylijska();
        pizza.done();
    }
}