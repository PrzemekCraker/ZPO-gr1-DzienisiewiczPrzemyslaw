package lab1.Task4;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    abstract void display();
    public void flyBehavior(FlyBehavior f) {
        flyBehavior = f;
    }
    public void QuackBehavior(QuackBehavior q) {
        quackBehavior = q;
    }
    public void Fly() {
        flyBehavior.fly();
    }
    public void Quack() {
        quackBehavior.quack();
    }
}
