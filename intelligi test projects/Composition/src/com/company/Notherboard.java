package com.company;

public class Notherboard
{
    private String model , manufacture , bios;
    private int ramSlots , cardSlots;

    public Notherboard(String model, String manufacture, String bios, int ramSlots, int cardSlots)
    {
        this.model = model;
        this.manufacture = manufacture;
        this.bios = bios;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
    }
    public void loadProgram(String programName)
    {
        System.out.println("program "+ programName + " is noe Loading ...");
    }

    public String getModel()
    {
        return model;
    }

    public String getManufacture() {
        return manufacture;
    }

    public String getBios() {
        return bios;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }
}
