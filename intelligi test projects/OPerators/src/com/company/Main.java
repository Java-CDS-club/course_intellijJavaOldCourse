package com.company;

public class Main {

    public static void main(String[] args)
    {
        int result = 1 +2; // 1+2 = 3
        System.out.println("1+2 = "+result);
        int previousResult = result;
        System.out.println("previous Result  = "+previousResult);
        result = result -1;//3-1 = 2
        System.out.println("3-1 = "+result);
        System.out.println("previous Result  = "+previousResult);
        result =result*10;//2 * 10 = 20
        System.out.println("2 * 10 = "+result);
        result =result/5;//20/5 =4
        System.out.println("20 / 5 = "+result);

        result = result % 3;// the reminder of (4 % 3) = 1
        System.out.println("4 % 3 = "+result);

        //result = result +1 ;
        result++; // 1+1 = 2
        System.out.println("1+1 = "+result);
        result--;//2 - 1 = 1
        System.out.println("2 -1 = "+result);
        // result = result +2;
        result += 2;
        System.out.println("1 + 2 = "+result);
        //result = result * 10 ;
        result *= 10; // 3* 10 = 30
        System.out.println("3* 10 ="+result);
        //result = result  / 3
        result /= 3;//30 / 3 = 10
        System.out.println("30 / 3 = " +result);
        //result = result -2
        result -= 2;//10 - 2 = 8
        System.out.println("10 - 2 = "+result);

        boolean isAlien = false;
        if (isAlien == false)
        {
            System.out.println("it isn't an alien!");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80;
        if(topScore <= 100)
        {
            System.out.println("You got the high score");
        }
        int secondTopScore = 81;
        if((topScore > secondTopScore && topScore < 100))
        {
            System.out.println("Greater than second top score and less than 100");
        }
        if(topScore > 90 || (secondTopScore <=90 ))
        {
            System.out.println("Either or both of the condiotions are true");
        }
        int newValue = 50;
        if(newValue == 50)
            System.out.println("this is true");

        boolean isCar =false;
        if(isCar)
            System.out.println("this is not supposed to happen");
        isCar = true ;
        boolean wasCar = isCar?true:false;
        if(wasCar)
        {
            System.out.println("was Car is true ");
        }

        double myFirstValue = 20.00d;
        double mySecondValue = 80.00d;
        double myValueTotal =(myFirstValue + mySecondValue )* 100.00d;
        System.out.println("MyValuesTotal = "+myValueTotal);
        double theReminder = myValueTotal % 40.00d;
        System.out.println("the Reminder = "+theReminder);
        boolean isNoReminder = (theReminder == 0)? true : false;
        System.out.println("isNoReminder = "+isNoReminder);
        if(!isNoReminder)
        {
            System.out.println("got some reminder");
        }
    }
}
