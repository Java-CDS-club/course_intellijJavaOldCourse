package com.example.test;

public class ScopeCheck
{
    public int publicVar = 0;
    private int var1 =1;

    public ScopeCheck() {
        System.out.println("ScopeCheck created , publicVar = "+publicVar +": privateVar = "+ var1);
    }

    public int getVar1() {
        return var1;
    }
    public void timesTwo()
    {
        int var2 = 2;
        for (int i = 0 ; i < 10 ; i++)
        {
            System.out.println(i + " times two is "+ i*var2);
        }
    }
    public void useInner() {
        InnerClass innerClass = new InnerClass();
        System.out.println("varThree from outer class : "+innerClass.var3);
    }
    public class InnerClass
    {
        private   int var3 = 3;

        public InnerClass() {
            System.out.println("InnerClass created , privateVar is "+ var3);
        }
        public void timesTwo()
        {
            int privateVar = 2;
            for (int i = 0 ; i < 10 ; i++)
            {
                System.out.println(i + " times two is "+ i*privateVar);
            }
        }
    }
}
