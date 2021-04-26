package lab5.Task1;

public class ParcelLockerSorting extends SortingDepartment
{
    @Override
    protected Deliverance arrivalParcel()
    {
        return new ParcelLocker();
    }
}
