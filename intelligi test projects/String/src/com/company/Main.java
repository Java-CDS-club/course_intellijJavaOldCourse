package com.company;

public class Main {

    public static void main(String[] args)
    {
        String numberString = "2018.125";
        System.out.println("numberAsString "+numberString);
        double number =Double.parseDouble(numberString);
        System.out.println("number = "+number);
        numberString += 1;
        number++;
        System.out.println(numberString);
    }
}
