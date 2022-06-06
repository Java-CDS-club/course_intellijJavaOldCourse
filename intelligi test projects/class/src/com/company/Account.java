package com.company;

import java.util.Locale;

public class Account
{
    private String Number;
    private double Balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    public Account()
    {
        this("56789",2.50 , "default Name ", "default adress", "defualt phone");
        System.out.println("Empty constructor called");
    }

    public Account(String customerName, String customerEmailAddress, String customerPhoneNumber)
    {
        this("9999" , 100.55 , customerName , customerEmailAddress , customerPhoneNumber);
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public Account(String Number , double Balance , String customerEmailAddress , String customerPhoneNumber  , String customerName)
    {
        System.out.println("ho");
        this.Number = Number;
        this.Balance =Balance;
        this.customerEmailAddress = customerEmailAddress;
        this.customerName = customerName;
        this.customerPhoneNumber =customerPhoneNumber;
    }
    public void deposit(double depositAmount)
    {
        Balance += depositAmount;
        System.out.println("Deposit of "+depositAmount+" made . New balance is "+this.Balance);
    }

    public void withdrawal(double withdrawalAmount)
    {
        if (Balance - withdrawalAmount < 0) System.out.println("Only "+Balance+" avaliable. withdrawal not processed");
        else {Balance -= withdrawalAmount;
            System.out.println("Withdrawal of "+withdrawalAmount+" processed . Remaining balance = "+Balance);}
    }


    public String getNumber()
    {
        return Number;
    }

    public void setNumber(String number)
    {
        Number = number;
    }

    public double getBalance()
    {
        return Balance;
    }

    public void setBalance(double balance)
    {
        Balance = balance;
    }

    public String getCustomerName()
    {
        return customerName;
    }

    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress()
    {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress)
    {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber()
    {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber)
    {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
