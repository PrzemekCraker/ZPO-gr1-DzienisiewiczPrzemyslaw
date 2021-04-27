package lab5.Task2;

public abstract class CodeAssign
{
    public void loadCargo(String name)
    {
        String cargo = load(name);
        Allocate cargoFlow = type();
        cargoFlow.provide(cargo);
    }

    protected abstract Allocate type();

    private String load(String name) { return name; }
}