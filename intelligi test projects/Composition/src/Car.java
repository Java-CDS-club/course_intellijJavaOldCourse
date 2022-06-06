public class Car extends Vehicle
{
    private int doors , engineCapacity;

    public Car(String name, int doors, int engineCapacity)
    {
        super(name);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }
}
