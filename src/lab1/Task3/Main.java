package lab1.Task3;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car(new Car1(),"Skoda");
        Car car2 = new Car(new Car2(),"Ferrari");

        car1.showCarName();
        car1.getMaxSpeed();
        car2.showCarName();
        car2.getMaxSpeed();
    }

}