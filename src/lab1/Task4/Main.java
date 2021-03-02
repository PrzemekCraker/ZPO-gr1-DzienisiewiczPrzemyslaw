package lab1.Task4;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Duck> ducks = new ArrayList<Duck>();
        ducks.add(new MallardDuck());
        ducks.add(new RedheadDuck());
        ducks.add(new RubberDuck());
        ducks.add(new DecoyDuck());

        ducks.get(2).flyBehavior(new RocketPropelled());
        for (Duck duck : ducks) {
            duck.display();
            duck.Fly();
            duck.Quack();
        }
    }
}