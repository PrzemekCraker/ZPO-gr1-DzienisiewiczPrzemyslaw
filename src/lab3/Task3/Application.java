package lab3.Task3;

import java.util.Scanner;
import java.util.ArrayList;

public class Application implements Subject{

    void ask(int digit)
    {
        Scanner input = new Scanner(System.in);
        if(digit == 0){
            System.out.println("Jakie liczby ma obserwować program:\n1. Większe od 0\n2. Równe 3\n3. Podzielne przez 2");
            char sign = input.next().charAt(0);
            this.changeListening(sign);
        } else
            {
            this.notifyObservers(digit);
            }
    }

    private void changeListening(char sign){
        if(observersList.size()>0){
            this.unregister(observersList.get(0));
        }

        switch (sign){
            case '1':
                register(new GreaterZero());
                break;
            case '2':
                register(new EqualThree());
                break;
            default:
                register(new DividualTwo());
        }
    }

    @Override
    public void register(Observer o) {
        observersList.add(o);
    }

    @Override
    public void unregister(Observer o) {
        observersList.remove(o);
    }

    @Override
    public void notifyObservers(int digit) {
        for(Observer o : observersList){
            o.update(digit);
        }
    }

    public Application() {
        this.observersList = new ArrayList<>();
    }

    private ArrayList<Observer> observersList;
}