package com.example.test;

public class Planet extends HeavenBody
{

    public Planet(String name, double orbitalPeriod)
    {
        super(name, orbitalPeriod, BodyTypes.PLANET);
    }

    @Override
    public boolean addSatellite(HeavenBody moon)
    {
        if (moon.getKey().getBodyType() == BodyTypes.MOON)
        {
            return super.addSatellite(moon);
        }
        else
            return false;
    }

}
