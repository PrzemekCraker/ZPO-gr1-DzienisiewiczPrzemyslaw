package lab3.Task3;

public class EqualThree implements Observer{
    @Override
    public void update(int digit) {
        if(digit == 3){
            System.out.println("Jest równa liczbie 3.");
        }
    }
}
