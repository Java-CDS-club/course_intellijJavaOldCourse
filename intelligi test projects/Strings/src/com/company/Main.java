package com.company;

public class Main {

    public static void main(String[] args)
    {
      String myString = " this is a string";
        System.out.println("myString is eaual  to "+myString);
        myString = myString+", and this is more";
        System.out.println("myString is eaual  to "+myString);
        myString = myString +" \u00A9 2019";
        System.out.println("myString is eaual  to "+myString);
        String numberString ="250.55";
        numberString = numberString +"49.95";
        System.out.println(numberString);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString+ myInt;
        System.out.println("LastString is equal to "+lastString);
        double doubleNumber = 120.74d;
        lastString = lastString +doubleNumber;
        System.out.println("LastString is equal to "+lastString);
        
    }
}
