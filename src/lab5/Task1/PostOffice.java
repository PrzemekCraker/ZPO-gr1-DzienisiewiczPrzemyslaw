package lab5.Task1;

public class PostOffice implements Deliverance
{
    @Override
    public void provide(String paczka)
    {
        System.out.println("Wysyłka " + paczka + " odbywa się przez Pocztę.");
    }
}
