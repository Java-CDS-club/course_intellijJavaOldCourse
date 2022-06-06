package com.example.test;

public class Main {

    public static void main(String[] args)
    {
        final Worker worker1 = new Worker("Worker 1" , true);
        final Worker worker3 = new Worker("Worker 2" , true);

        final SharedResource sharedResource = new SharedResource(worker1);
        new Thread(new Runnable() {
            @Override
            public void run() {
                worker1.work(sharedResource , worker3);
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                worker3.work(sharedResource , worker1);
            }
        }).start();
    }
}
