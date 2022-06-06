package com.example.test;

import static com.example.test.ThreadColor.ANSI_BLUE;

public class AnotherThread extends Thread
{
    @Override
    public void run() {
        System.out.println(ANSI_BLUE + "Hello from " + currentThread().getName());
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e)
        {
            System.out.println(ANSI_BLUE + " AnotherThread wake me Up");
            return;
        }
        System.out.println(ANSI_BLUE + "Three seconds passed and I'm awake");
    }
}
