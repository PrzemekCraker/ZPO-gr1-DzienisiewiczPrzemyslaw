package lab3.Task3;

public interface Subject {
    void register(Observer o);
    void unregister(Observer o);
    void notifyObservers(int digit);
}