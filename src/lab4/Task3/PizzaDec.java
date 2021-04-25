package lab4.Task3;

public abstract class PizzaDec implements Pizza
{
    protected Pizza ingredient;

    public PizzaDec(Pizza newPizza)
    {
        this.ingredient = newPizza;
    }

    public void removeDec(PizzaDec toRemove)
    {
        if (ingredient == null)
        {
            return;
        } else if (ingredient.equals(toRemove))
        {
            ingredient = ingredient.getSubject();
        } else
            {
            ingredient.removeDec(toRemove);
            }
    }

    public String getDescription()
    {
        return ingredient.getDescription();
    }

    public double getCost()
    {
        return ingredient.getCost();
    }

    public Pizza getSubject()
    {
        return ingredient;
    }

}