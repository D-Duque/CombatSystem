package com.github.dduque.models;

public class Enemy {

    private String name;
    private static double health = 100.0;
    private static double damage = 1.0;
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


}
