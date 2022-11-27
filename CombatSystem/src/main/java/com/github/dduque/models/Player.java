package com.github.dduque.models;

public class Player {

    private String name;
    private double health = 100.0;
    private double damage = 1.0;
    private int armor = 0;

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

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
}
