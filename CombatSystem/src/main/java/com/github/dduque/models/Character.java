package com.github.dduque.models;

public abstract class Character {
    private String name;
    private double health;
    private double damage;
    private int armor;

    public String getName() {return name;}
    public void setName(String name)
    {
        this.name = name;
    }

    public double getHealth() {return health;}
    public void setHealth(double health) {this.health = health;}

    public int getArmor() {return armor;}

    public double getDamage() {return damage;}
    public void setDamage(double damage) {this.damage = damage;}

    public Character() {
    }

    public Character(String name, double health, int armor, double damage) {
        this.name = name;
        this.health = health;
        this.armor = armor;
        this.damage = damage;
    }
}
