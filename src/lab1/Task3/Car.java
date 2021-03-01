package lab1.Task3;

public class Car {
    private String name;
    private CarSpeed carState;

    public Car(CarSpeed carState, String name)
    {
        this.name = name;
        this.carState = carState;
    }
    public void showCarName()
    {
        System.out.println(this.name);
    }
    public void getMaxSpeed(){
        System.out.println(this.carState.getMaxSpeed());
    }
}
