package lab2.Task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Duck> ducksList = new ArrayList();
        ducksList.add(new MallardDuck("Mallard - 2 position"));
        ducksList.add(new RubberDuck("DecoyDuck - 1 position"));
        ducksList.add(new DecoyDuck("RubberDuck - 3 position"));
        ducksList.add(new RedheadDuck("RedheadDuck - 4 position"));
        Duck[] ducksArray = new Duck[4];
        ducksArray[1] = new MallardDuck("Mallard - 2 position");
        ducksArray[2] = new RedheadDuck("RedheadDuck - 3 position");
        ducksArray[0] = new DecoyDuck("DecoyDuck - 1 position");
        ducksArray[3] = new RubberDuck("RubberDuck - 4 position");

        BubbleSort bubble = new BubbleSort();
        Random sorting = new Random(bubble);
        sorting.sort(ducksArray);
        sorting.print(ducksArray);
        sorting.sort(ducksList);
        sorting.print(ducksList);
    }
}