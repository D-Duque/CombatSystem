package com.github.dduque.models;

import com.github.dduque.models.items.Weapon;

public class Player {

    private String name;
    private double health = 100.0;
    private double damage = 1.0;
    private int armor = 0;

    public String getName() {return name;}


    public double getHealth() {return health;}
    public void setHealth(double health) {this.health = health;}

    public int getArmor() {return armor;}
    public void setArmor(int armor) {this.armor = armor;}

    public double getDamage() {return damage;}
    public void setDamage(double damage) {this.damage = damage;}

    public Player() {
    }

    public Player(String name, double health, int armor, double damage) {
        this.name = name;
        this.health = health;
        this.armor = armor;
        this.damage = damage;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double calculateDamage(Weapon weapon)
    {
        return damage;
    }

    // attack
    public void attackEnemy(Enemy enemy)
    {
        // check enemy armor rating and if player damage is above armor rating

        // if damage is above armor rating, reduce HP by difference
    }
    // defend

    // heal
}
