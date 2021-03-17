package lab2.Task1;

public class DecoyDuck extends Duck {
    public DecoyDuck(String name) {
        super(name);
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }
    public void display() {
        System.out.println("I'm just a Decoy duck");
    }
}