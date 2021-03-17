package lab2.Task1;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    String name;
    public Duck(String name){
        this.name = name;
    }

    abstract void display();
    public String getName(){
        return this.name;
    }
    public void printName(){
        System.out.println("" + this.name);
    }
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
