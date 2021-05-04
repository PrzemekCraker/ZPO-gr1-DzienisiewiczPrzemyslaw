package lab6.Task4;

public class Facade {
    private Fonts bold;
    private Fonts cursive;

    public Facade()
    {
        bold = new Bold();
        cursive = new Cursive();
    }

    public void uBold(String text)
    {
        bold.useFont(text);
    }
    public void uCursive(String text)
    {
        cursive.useFont(text);
    }
}