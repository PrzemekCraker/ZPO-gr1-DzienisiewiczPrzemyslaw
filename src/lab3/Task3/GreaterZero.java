package lab3.Task3;

public class GreaterZero implements Observer{
    @Override
    public void update(int digit) {
        if(digit > 0) {
            System.out.println("Jest większa od 0.");
        }
    }
}