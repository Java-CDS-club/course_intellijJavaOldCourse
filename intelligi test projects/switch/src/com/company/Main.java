package com.company;

public class Main {

    public static void main(String[] args)
    {
        int switchValue = 2;
        switch (switchValue)
        {
            case 1 :
                System.out.println("value was 1");
                break;
            case 2 :
                System.out.println("value was 2");
                break;
            case  3 : case 4 : case 5 :
            System.out.println("was a 3 or 4 or 5");
            break;
            
            default:
                System.out.println("wasnot 1 or 2");
                break;
        }
    }
}
