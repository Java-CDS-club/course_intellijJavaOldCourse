package com.company;

public class DeluxBurger extends Hamburger
{
    public DeluxBurger()
    {
        super("Delux", "Susage & bacon", 14.54, "White");
        super.addHamburgerAddition1("Chips",2.75);
        super.addHamburgerAddition2("Drink",1.18);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add additional to a Delux Burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add additional to a Delux Burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add additional to a Delux Burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add additional to a Delux Burger");
    }
}
