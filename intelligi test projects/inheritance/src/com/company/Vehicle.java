package com.company;

public class Vehicle {
    private String name, size;
    private int currentVelocity, currentDirection;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        this.currentDirection = 0;
        this.currentVelocity = 0;
    }

    public void steer(int currentDirection)
    {
        this.currentDirection = currentDirection;
        System.out.println("Vehicle.sterr() : steering at "+ currentDirection + " degrees.");
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getSize()
    {
        return size;
    }

    public void setSize(String size)
    {
        this.size = size;
    }

    public int getCurrentVelocity()
    {
        return currentVelocity;
    }

    public void setCurrentVelocity(int currentVelocity)
    {
        this.currentVelocity = currentVelocity;
    }

    public int getCurrentDirection()
    {
        return currentDirection;
    }

    public void setCurrentDirection(int currentDirection)
    {
        this.currentDirection = currentDirection;
    }

    public void move(int currentVelocity , int currentDirection)
    {
        this.currentDirection = currentDirection;
        this.currentVelocity = currentVelocity;
        System.out.println("Vehicle.move() Moving at " + currentVelocity + " in direction "+ currentDirection );
    }
    public void stop()
    {
        this.currentVelocity = 0;
    }

}
