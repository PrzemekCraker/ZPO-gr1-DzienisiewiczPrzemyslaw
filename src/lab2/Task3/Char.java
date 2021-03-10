package lab2.Task3;

public abstract class Char
{
    Weapon weapon;
    abstract void display();

    public void weapon(Weapon arm)
    {
        weapon = arm;
    }
    public void Weapon()
    {
        weapon.display();
    }
}
