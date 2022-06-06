package com.company;

public class EnhancedPlayer
{
    private String hitPoints, weopen ;
    private int health = 100;

    public EnhancedPlayer(String name, String weopen, int health) {
        this.hitPoints = name;
        this.weopen = weopen;
        if (health > 0 && health <= 100)
                this.health = health;
    }
    public void loseHealth(int damage)
    {
        this.health -= damage;
        if (this.health <= 0)
        {
            System.out.println("PLayer Knocked out");
        }
    }

    public int getHealth() {
        return health;
    }
}
