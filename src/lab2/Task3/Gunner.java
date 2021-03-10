package lab2.Task3;

public class Gunner extends Char
{
    public Gunner()
    {
        weapon = new Cannon();
        //weapon = new OneHandedSword();
    }
    public void display()
    {
        System.out.println("Gunner reporting for duty, sir.");
    }
}