package lab5.Task2;

public class Main
{
    public static void main(String[] args)
    {
        TruckAssign track = new TruckAssign();
        ShipAssign ship = new ShipAssign();
        TrainAssign train = new TrainAssign();
        PlaneAssign plane = new PlaneAssign();

        track.loadCargo("Cargo #1");
        ship.loadCargo("Cargo #2");
        train.loadCargo("Cargo #3");
        plane.loadCargo("Cargo #4");
    }
}