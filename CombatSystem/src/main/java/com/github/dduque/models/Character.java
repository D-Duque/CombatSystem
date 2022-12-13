package com.github.dduque.models;

public abstract class Character {
    private String name;
    private double maxHealth;
    private double currentHealth;
    private double damage;
    private int armor;

    public String getName() {return name;}
    public void setName(String name)
    {
        this.name = name;
    }

    public double getMaxHealth()
    {
        return maxHealth;
    }

    public void setMaxHealth(double maxHealth)
    {
        this.maxHealth = maxHealth;
    }

    public double getCurrentHealth()
    {
        return currentHealth;
    }

    public void setCurrentHealth(double currentHealth)
    {
        this.currentHealth = currentHealth;
    }

    public int getArmor() {return armor;}

    public double getDamage() {return damage;}
    public void setDamage(double damage) {this.damage = damage;}

    public Character() {
    }

    public Character(String name, double maxHealth, double currentHealth, int armor, double damage) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.currentHealth = currentHealth;
        this.armor = armor;
        this.damage = damage;
    }
}
