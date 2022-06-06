package test;

import java.util.ArrayList;

public class Account
{
    private String account;
    private int balance;
    private ArrayList<Integer> transactions;

    public Account(String account) {
        this.account = account;
        this.transactions = new ArrayList<Integer>();
    }

    public int getBalance() {
        return balance;
    }
    public void deposit(int amount)
    {
        if (amount>0)
        {
            transactions.add(amount);
            this.balance += amount;
            System.out.println(amount +" deposited . Balance is now "+this.balance);
        }
        else
        {
            System.out.println("Cannot deposit negative sums");
        }
    }
    public void withdraw(int amount)
    {
        int withdraw = -amount;
        if (withdraw < 0)
        {
            this.transactions.add(withdraw);
            this.balance += withdraw;
            System.out.println(amount + " withdrawn , balance is now "+this.balance);
        }
        else
        {
            System.out.println("Cannot withdraw negative sums");
        }
    }
    public void calculateBalance()
    {
        this.balance = 0 ;
        for (int i : this.transactions)
        {
            this.balance += i;
        }
        System.out.println("Calculated balance is "+this.balance);
    }

}
