package com.github.dduque.models;

import com.github.dduque.models.items.Character;

public class Player extends Character {
    private String name;
    private double health = 100.0;
    private double damage = 1.0;
    private int armor = 1;


    public Player() {
        super();
        setHealth(health);
        setDamage(damage);
        setArmor(armor);
    }

    public Player(String name, double health, int armor, double damage) {
        super(name, 100.0, 1, 1.0);
    }

    public void setName(String name)
    {
        this.name = name;
    }

    // attack
    public static void attackEnemy(Enemy enemy)
    {
        // total damage = base player damage + equipped damage bonus. If total damage > enemy armor, take from enemy health - armor.



        System.out.println();
    }
    // defend

    // heal
}
