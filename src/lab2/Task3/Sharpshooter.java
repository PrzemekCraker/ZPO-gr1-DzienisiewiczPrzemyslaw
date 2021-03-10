package lab2.Task3;

public class Sharpshooter extends Char
{
    public Sharpshooter()
    {
        weapon = new Rifle();
        //weapon = new OneHandedSword();
    }
    public void display()
    {
        System.out.println("Sharpshooter reporting for duty, sir.");
    }
}