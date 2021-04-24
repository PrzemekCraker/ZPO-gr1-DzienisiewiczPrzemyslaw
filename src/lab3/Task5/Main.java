package lab3.Task5;

import java.util.Random;


public class Main {
    public static void main(String[] args) {
        Random rand = new Random();

        Stock stock = new Stock(5);
        Partnership com1 = new Partnership(300, "Company 1#");
        Partnership com2 = new Partnership(200, "Company 2#");
        Partnership com3 = new Partnership(400, "Company 3#");
        Partnership com4 = new Partnership(500, "Company 4#");
        Partnership com5 = new Partnership(100, "Company 5#");
        stock.register(com1);
        stock.register(com2);
        stock.register(com3);
        stock.register(com4);
        stock.register(com5);

        for(int i = 0; i<4; i++){
            int rate = rand.nextInt(100)+1;
            System.out.println("Pricing nr" + (i+1) + " actual bid is " + rate + "%");
            stock.setRate(rate);
            System.out.println();
        }

    }
}
