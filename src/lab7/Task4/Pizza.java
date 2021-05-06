package lab7.Task4;

public abstract class Pizza {
    abstract void PizzaDough();
    abstract void Toppings();
    abstract void Spices();

    public final void done(){
        PizzaDough();
        TomatoSauce();
        Toppings();
        Spices();
        setTime();
    }
    void TomatoSauce() {
        System.out.println("Dodaj sos pomidorowy");
    }
    void setTime() { System.out.println("Czas pieczenia 15 min"); }
}