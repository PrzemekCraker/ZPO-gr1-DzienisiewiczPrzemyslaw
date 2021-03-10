package lab2.Task3;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args)
    {
        ArrayList<Char> chars = new ArrayList<Char>();
        chars.add(new Sharpshooter());
        chars.add(new Archer());
        chars.add(new Chevalier());
        chars.add(new Gunner());

        for (Char character : chars)
        {
            character.display();
            character.weapon.display();System.out.println("");
        }
    }
}