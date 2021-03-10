package lab2.Task3;

public class Chevalier extends Char
{
    public Chevalier()
    {
        weapon = new TwoHandedSword();
        //weapon = new Mace();
    }
    public void display()
    {
        System.out.println("Chevalier reporting for duty, sir.");
    }
}