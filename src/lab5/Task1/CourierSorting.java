package lab5.Task1;

public class CourierSorting extends SortingDepartment
{
    @Override
    protected Deliverance arrivalParcel()
    {
        return new Courier();
    }
}
