package lab6.Task3;

public class Facade {
    private Form rectangle;
    private Form line;

    public Facade() {
        rectangle = new Rectangle();
        line = new Line();
    }
}