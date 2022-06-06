package com.company;

public class Pengun extends Bird
{
    public Pengun(String name) {
        super(name);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("I'm not very good at that , can I go for a swim instead");
    }
}
