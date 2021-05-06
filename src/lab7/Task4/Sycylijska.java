package lab7.Task4;

public class Sycylijska extends Pizza
{
    @Override
    void PizzaDough() {
        System.out.println("Przygotuj grube ciasto");
    }
    @Override
    void Toppings() {
        System.out.println("Dodaj oliwki i kapary");
    }
    @Override
    void Spices() {
        System.out.println("Dodaj przyprawy");
    }
    @Override
    void setTime() { System.out.println("Czas pieczenia 15 min"); }
}