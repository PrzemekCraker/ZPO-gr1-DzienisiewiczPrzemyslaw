package lab2.Task1;

public class MallardDuck extends Duck {
    public MallardDuck(String name) {
        super(name);
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    public void display() {
        System.out.println("Mallard duck here");
    }
}
