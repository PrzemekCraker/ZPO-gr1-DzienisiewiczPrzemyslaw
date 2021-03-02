package lab1.Task4;

public class RedheadDuck extends Duck{
    public RedheadDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    public void display() {
        System.out.println("Redhead duck here!");
    }
}
