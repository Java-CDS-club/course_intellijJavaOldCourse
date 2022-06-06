package com.example.test;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args)
    {
       /* ReentrantLock lock = new ReentrantLock();
        BankAccount account =new BankAccount("12345-678" , 1000.00 , lock);
       *//* Thread trThread1 = new Thread()
        {
            public void run()
            {
                account.deposit(300.00);
                account.withdraw(50.00);
            }
        };
        Thread trThread2 = new Thread()
        {
            public void run()
            {
                account.deposit(203.75);
                account.withdraw(100.00);
            }
        };*//*
        Thread trThread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                account.deposit(300.000);
                account.withdraw(50.00);
            }
        });
        Thread trThread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                account.deposit(203.75);
                account.withdraw(100.00);
            }
        });
        trThread1.start();
        trThread2.start();*/

    }
}
/*
class BankAccount {

    private double balance;
    private String accountNumber;
    private ReentrantLock lock;

    public BankAccount(String accountNumber, double initialBalance , ReentrantLock lock) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.lock = lock;
    }

   */
/* public synchronized void deposit(double amount) {
        balance += amount;
    }

    public synchronized void withdraw(double amount) {
        balance -= amount;
    }*//*

    */
/*public  void deposit(double amount) {
        synchronized (this)
        {
            balance += amount;
        }
    }

    public  void withdraw(double amount) {
        synchronized (this)
        {
            balance -= amount;
        }
    }*//*

    public  void deposit(double amount) {
        boolean status = false;
        try {
            if (lock.tryLock(1000 , TimeUnit.MILLISECONDS))
            {
                try {
                    balance+= amount;
                    status = true;
                }finally {
                    lock.unlock();
                }
            }else
            {
                System.out.println("Couldn't get the lock");
            }
        }catch (InterruptedException e)
        {

        }
        System.out.println("Transaction status = "+status);
    }

    public  void withdraw(double amount) {
        boolean status = false;
        try {
            if (lock.tryLock(1000 , TimeUnit.MILLISECONDS))
            {
                try {
                    balance-= amount;
                    status = true;
                }finally {
                    lock.unlock();
                }
            }else
            {
                System.out.println("Couldn't get the lock");
            }
        }catch (InterruptedException e)
        {

        }
        System.out.println("Transaction status = "+status);
    }
    public String getAccountNumber()
    {
        return accountNumber;
    }
    public void printAccountNumber()
    {
        System.out.println("Account Number = "+accountNumber);
    }

}*/
