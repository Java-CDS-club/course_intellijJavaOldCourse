package com.company;

public class Player
{
    public String fullname  , weopen ;
    public int health;
    public void loseHealth(int damage)
    {
        this.health -= damage;
        if (this.health <= 0)
        {
            System.out.println("PLayer Knocked out");
        }
    }
    public int healthRemaining(){return this.health;}
}
