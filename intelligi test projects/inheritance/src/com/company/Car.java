package com.company;

public class Car extends Vehicle {
    private int wheels, doors, gears, currentGear;
    private boolean isMannual;

    public Car(String name, String size, int wheels, int doors, int gears, boolean isMannual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.currentGear = 1;
        this.isMannual = isMannual;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear() : Changed to" + this.currentGear + " gear.");
    }

    public void changeVelocity(int speed, int direction) {
        System.out.println("car.changeVelocity() : Velocity " + speed + " direction " + direction);
        move(speed, direction);
    }

}
