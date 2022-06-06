package com.example.test;

import java.util.TreeMap;

import static com.example.test.Main.lock1;

public class Main {
    public static Object lock1 = new Object();
    public static Object lock2 = new Object();

    public static void main(String[] args)
    {
        (new Thread1()).start();
        new Thread2().start();
    }

    private static class Thread1 extends Thread
    {
        public void run()
        {
            synchronized (lock1)
            {
                System.out.println("Thread1 : Has lock1");
                try {
                    Thread.sleep(100);
                }catch (InterruptedException e)
                {

                }
                System.out.println("Thread1 : Waiting for lock2");
                synchronized (lock2)
                {
                    System.out.println("Thread1 : Has lock1 and lock2");
                }
                System.out.println("Thread1 : Released lock2");
            }
            System.out.println("Thread 1 : Released lock1. Exiting");
        }
    }
    private static class Thread2 extends Thread
    {
        public void run()
        {
            synchronized (lock1)
            {
                System.out.println("Thread2 : Has lock1");
                try {
                    Thread.sleep(100);
                }catch (InterruptedException e)
                {

                }
                System.out.println("Thread2 : Waiting for lock2");
                synchronized (lock2)
                {
                    System.out.println("Thread 2 : Has lock1 and lock2");
                }
                System.out.println("Thread2 : released lock2");
            }
            System.out.println("Thread2 : released lock1. Exiting...");
        }
    }
}

