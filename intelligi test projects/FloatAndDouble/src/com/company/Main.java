package com.company;

public class Main {

    public static void main(String[] args)
    {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFlaotValue = Float.MAX_VALUE;
        System.out.println("Float Minimum value = "+myMinFloatValue);
        System.out.println("Float Maximum Value = "+myMaxFlaotValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Minimum value = "+myMinDoubleValue);
        System.out.println("Double Maximum Value = "+myMaxDoubleValue);

        int myIntValue = 5/3;
        float myFloatValue1 = 5f/3f;
        double myDoubleValue = 5.00/3.00;
        System.out.println("MyIntValue = "+myIntValue);
        System.out.println("MyDoubleValue = "+myDoubleValue);
        System.out.println("MyFloatValue  = "+myFloatValue1);

        double numberOfPounds = 200d;
        double covertedKilograms= numberOfPounds*0.45359237d;
        System.out.println("Converted Kilograms = "+covertedKilograms);

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);

    }
}
