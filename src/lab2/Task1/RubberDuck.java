package lab2.Task1;

public class RubberDuck extends Duck {
    public RubberDuck(String name) {
        super(name);
        quackBehavior = new Squeak();
        flyBehavior = new FlyNoWay();
    }
    public void display() {
        System.out.println("Rubber duck over-watch you all");
    }
}