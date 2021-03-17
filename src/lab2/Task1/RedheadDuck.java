package lab2.Task1;

public class RedheadDuck extends Duck {
    public RedheadDuck(String name) {
        super(name);
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    public void display() {
        System.out.println("Redhead duck here!");
    }
}
