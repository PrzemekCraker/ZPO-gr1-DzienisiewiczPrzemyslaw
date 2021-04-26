package lab5.Task1;

public class Main
{
    public static void main(String[] args)
    {
        SortingDepartment office = new SortingDepartment();
        CourierSorting courier = new CourierSorting();
        ParcelLockerSorting parcelLocker = new ParcelLockerSorting();

        office.Parcel("Parcel 1#");
        courier.Parcel("Parcel 2#");
        parcelLocker.Parcel("Parcel 3#");
    }
}