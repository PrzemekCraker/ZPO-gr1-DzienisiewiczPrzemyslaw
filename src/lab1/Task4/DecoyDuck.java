package lab1.Task4;

public class DecoyDuck extends Duck{
    public DecoyDuck() {
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }
    public void display() {
        System.out.println("I'm just a Decoy duck");
    }
}