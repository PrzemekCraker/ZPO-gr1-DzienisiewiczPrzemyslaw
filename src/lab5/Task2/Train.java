package lab5.Task2;

public class Train implements Allocate
{
    @Override
    public void provide(String code)
    {
        System.out.println("Train providing - " + code);
    }
}