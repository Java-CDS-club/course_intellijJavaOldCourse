public class DeluxBurger extends Hamburger
{
    public DeluxBurger()
    {
        super("Deluxe", "Sausage & Bacon", 19.1, "White roll");
        super.addHamburgerAddition1("chips",0);
        super.addHamburgerAddition2("Drink", 0);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Should not do this");;
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Should not do this");;
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Should not do this");;
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Should not do this");;
    }

    @Override
    public double itemizeHamburger() {
        return 19.1;
    }
}
