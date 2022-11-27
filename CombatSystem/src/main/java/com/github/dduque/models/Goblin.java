package com.github.dduque.models;

public class Goblin extends Enemy {

    private double health = 10.0;
    private double damage = 2.0;
    private int armor = 0;

    public Goblin() {

    }

    public Goblin(String name) {
        super(name);
        setHealth(health);
        setDamage(damage);
        setArmor(armor);
    }

    public Goblin(String name, double health, double damage, int armor) {
        super(name, health, damage, armor);
    }
}
