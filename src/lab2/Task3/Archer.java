package lab2.Task3;

public class Archer extends Char
{
    public Archer()
    {
        weapon = new Bow();
        //weapon = new Crossbow();
    }
    public void display()
    {
        System.out.println("Archer reporting for duty, sir.");
    }
}
