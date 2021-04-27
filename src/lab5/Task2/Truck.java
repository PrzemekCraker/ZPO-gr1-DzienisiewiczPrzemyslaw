package lab5.Task2;

public class Truck implements Allocate
{
    @Override
    public void provide(String code)
    {
        System.out.println("Truck providing - " + code);
    }
}
