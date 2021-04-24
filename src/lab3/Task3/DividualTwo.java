package lab3.Task3;

public class DividualTwo implements Observer{

    @Override
    public void update(int digit)
    {
        if(digit % 2 == 0){
            System.out.println("Jest podzielna przez 2.");
        }
    }
}
