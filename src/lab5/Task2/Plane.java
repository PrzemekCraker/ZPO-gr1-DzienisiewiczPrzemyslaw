package lab5.Task2;

public class Plane implements Allocate
{
    @Override
    public void provide(String code)
    {
        System.out.println("Plane providing - " + code);
    }
}
