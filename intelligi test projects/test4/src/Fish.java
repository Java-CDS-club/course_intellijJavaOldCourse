public class Fish extends Animal
{
    private int gills , eyes , fins;

    public Fish(int size, int weigth, String name, int gills, int eyes, int fins)
    {
        super(1, 1, size, weigth, name);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }
    private void rest()
    {}
    private void swim(int speed)
    {
        moveMuscles();
        moveBackFin();
        super.move(speed);
    }
    private void moveMuscles()
    {}
    private void moveBackFin()
    {

    }
}
