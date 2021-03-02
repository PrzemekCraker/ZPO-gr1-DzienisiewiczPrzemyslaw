package lab1.Task4;

public class RubberDuck extends Duck{
    public RubberDuck() {
        quackBehavior = new Squeak();
        flyBehavior = new FlyNoWay();
    }
    public void display() {
        System.out.println("Rubber duck over-watch you all");
    }
}