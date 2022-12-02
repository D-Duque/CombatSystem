package com.github.dduque.models.items;

public class Weapon {

    private String name;

    private double damageBonus = 0.0;

    private double healBonus = 0.0;

    private int weight = 0;


    public String getName() {
        return name;
    }

    public double getDamageBonus() {
        return damageBonus;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setDamageBonus(double damageBonus) {
        this.damageBonus = damageBonus;
    }

    public void setHealBonus(double healBonus) {
        this.healBonus = healBonus;
    }

    public double getHealBonus() {
        return healBonus;
    }

    public int getWeight() {
        return weight;
    }

    public Weapon() {
    }

    public Weapon(String name, double damageBonus, double healBonus, int weight) {
        this.name = name;
        this.damageBonus = damageBonus;
        this.healBonus = healBonus;
        this.weight = weight;
    }
}
