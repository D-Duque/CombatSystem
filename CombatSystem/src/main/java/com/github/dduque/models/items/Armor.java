package com.github.dduque.models.items;

public class Armor {

    private String name;
    private int armorBonus = 0;
    private int weight = 0;

    public String getName() {return name;}

    public int getArmorBonus() {return armorBonus;}

    public int getWeight() {return weight;}

    public Armor()
    {

    }

    public Armor(String name, int armorBonus, int weight)
    {
        this.name = name;
        this.armorBonus = armorBonus;
        this.weight = weight;
    }
}
