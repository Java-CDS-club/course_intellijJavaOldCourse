public class HealthyBurger extends Hamburger
{
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger( String meat, double price) {
        super("Healthy burger", meat, price, "Brown rye roll");
    }
    public void addHealthAddition1(String name , double price)
    {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }
    public void addHealthAddition2(String name , double price)
    {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double p = super.itemizeHamburger();
        if (healthyExtra1Name != null)
        {
            p += healthyExtra1Price;
        }
        if (healthyExtra2Name != null)
        {
            p += healthyExtra2Price;
        }
        return p;
    }
}
