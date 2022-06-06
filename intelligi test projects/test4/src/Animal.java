public class Animal
{
    private int brain , body , size , weigth;
    private String name;

    public Animal(int brain, int body, int size, int weigth, String name)
    {
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weigth = weigth;
        this.name = name;
    }

    public int getBrain()
    {
        return brain;
    }

    public int getBody()
    {
        return body;
    }

    public int getSize()
    {
        return size;
    }

    public int getWeigth()
    {
        return weigth;
    }

    public String getName()
    {
        return name;
    }
    public void eat()
    {
        System.out.println("animal.eat() called");
    }
    public void move(int speed)
    {
        System.out.println("animal is moving at "+ speed);
    }
}

