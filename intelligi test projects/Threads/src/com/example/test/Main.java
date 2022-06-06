package com.example.test;

import static com.example.test.ThreadColor.*;

public class Main {

    public static void main(String[] args)
    {
        System.out.println(ANSI_PURPLE + "Hello  from the main thread");
        Thread anotherThread = new AnotherThread();
        anotherThread.setName("== AnotherThread ==");
        anotherThread.start();
        new Thread()
        {
            @Override
            public void run()
            {
                System.out.println(ANSI_GREEN + "Hello from the anonymous class thread");
            }
        }.start();
        Thread myRunnableThread = new Thread( new MyRunnable()
        {
            @Override
            public void run() {
                System.out.println(ANSI_RED + "Hello from the anonymous class's implementation of the run()");
                try {
                    anotherThread.join(3000);
                    System.out.println(ANSI_RED + "AnotherThread terminated , so I'm running again");
                }catch (InterruptedException e)
                {
                    System.out.println(ANSI_RED + "I couldn't wait after all. I was interrupted");
                }
            }
        });
        myRunnableThread.start();
        System.out.println(ANSI_PURPLE + "Hello again from the  main thread");

    }
}
