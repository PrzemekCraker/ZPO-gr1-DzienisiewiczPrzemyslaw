package lab7.Task4;

public class Margherita extends Pizza {

    @Override
    void PizzaDough() {
        System.out.println("Przygotuj grube ciasto");
    }
    @Override
    void Toppings() {
        System.out.println("Dodaj dwa sery mozzarella");
    }
    @Override
    void Spices() {
        System.out.println("Dodaj bazylię oraz odrobinę oliwy");
    }
    @Override
    void setTime() { System.out.println("Czas pieczenia 15 min"); }
}