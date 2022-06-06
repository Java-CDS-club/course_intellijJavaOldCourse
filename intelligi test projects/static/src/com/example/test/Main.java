package com.example.test;

public class Main {
    public static int multiplayer = 7;

    public static void main(String[] args)
    {
        StaticTest firstInstance = new StaticTest("1st Instance");
        System.out.println(firstInstance.getName() +" is instance number "+StaticTest.getNumInstances());
        StaticTest secondInstance = new StaticTest("2nd Instance ");
        System.out.println(secondInstance.getName()+" is instance number "+StaticTest.getNumInstances());
        int answer = multiply(5);
        System.out.println("The answer is "+answer);
        System.out.println("Multiplayer is "+multiplayer);
    }
    public static int multiply(int number)
    {
        return number * multiplayer;
    }
}
