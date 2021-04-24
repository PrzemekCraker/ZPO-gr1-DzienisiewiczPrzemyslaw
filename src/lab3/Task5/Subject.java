package lab3.Task5;

public interface Subject {
    void register(Observer o);
    void unregister(Observer o);
    void notifyObservers();
}
