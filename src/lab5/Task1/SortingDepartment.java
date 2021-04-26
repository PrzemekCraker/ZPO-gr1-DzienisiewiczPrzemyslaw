package lab5.Task1;

public class SortingDepartment
{
    public void Parcel(String name)
    {
        String parcel = prepare(name);
        Deliverance arrival = arrivalParcel();
        arrival.provide(parcel);
    }

    protected Deliverance arrivalParcel()
    {
        return new PostOffice();
    }

    private String prepare(String name)
    {
        System.out.println("Zaczęła się podróż Twojej " + name);
        return name;
    }
}
