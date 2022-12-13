package com.github.dduque.models;

public class Goblin extends Enemy {

    private double maxHealth = 10.0;
    private double currentHealth = 10.0;
    private double damage = 2.0;
    private int armor = 0;

    public Goblin() {

    }

    public Goblin(String name) {
        super(name);
        setCurrentHealth(currentHealth);
        setMaxHealth(maxHealth);
        setDamage(damage);
        setArmor(armor);
    }

    public Goblin(String name, double currentHealth, double damage, int armor) {
        super(name, currentHealth, damage, armor);
    }
}
