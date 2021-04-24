package lab3.Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Application reader = new Application();

        while(true){
            System.out.println("Wprowadz liczbe\n");
            int digit = input.nextInt();
            reader.ask(digit);

        }
    }
}