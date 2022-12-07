package com.github.dduque.models;

import com.github.dduque.models.items.Item;
import com.github.dduque.models.items.ItemType;

public class Enemy {

    private String name;
    private static double health = 100.0;
    private static double damage = 2.0;
    private static int armor = 0;

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public double getHealth() {return health;}
    public void setHealth(double health) {Enemy.health = health;}

    public double getDamage() {return damage;}
    public void setDamage(double damage) {Enemy.damage = damage;}

    public double getArmor() {return armor;}
    public void setArmor(int armor) {Enemy.armor = armor;}

    public Enemy()
    {

    }

    public Enemy(String name)
    {
        this.name = name;
    }

    public Enemy(String name, double health, double damage, int armor)
    {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.armor = armor;
    }

    public void attackPlayer(Player player)
    {

        if (damage > player.getArmor())
        {
            // if damage > armor, reduce enemy health
            player.setHealth(player.getHealth() - (damage - player.getTotalArmor()));
            System.out.println(getName() + " deals " + damage + " damage to you!");
        }
        else {
            // if not, print attack did not land message.
            System.out.println("The enemy misses you!");
        }
        System.out.println();
    }

}
