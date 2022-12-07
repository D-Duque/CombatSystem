package com.github.dduque.models.items.weapons;

import com.github.dduque.models.items.ItemType;
import com.github.dduque.models.items.Weapon;

public class Sword extends Weapon
{
    private String name;

    private double minDamageBonus = 2.0;

    private double maxDamageBonus = 4.0;

    private int weight = 5;

    private ItemType itemType = ItemType.WEAPON;

    @Override
    public String getName()
    {
        return name;
    }

    public Sword()
    {
        setMinDamageBonus(minDamageBonus);
        setMaxDamageBonus(maxDamageBonus);
        setWeight(weight);
        setItemType(itemType);
    }
    public Sword(String name, double minDamageBonus, double maxDamageBonus, int weight, ItemType itemType) {
        this.name = name;
        this.minDamageBonus = minDamageBonus;
        this.maxDamageBonus = maxDamageBonus;
        this.weight = weight;
        this.itemType = itemType;
    }

    @Override
    public void addToInventory()
    {

    }
}
