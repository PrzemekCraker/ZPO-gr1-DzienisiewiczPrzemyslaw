package lab5.Task2;

public class Ship implements Allocate
{
    @Override
    public void provide(String code)
    {
        System.out.println("Ship providing - " + code);
    }
}
