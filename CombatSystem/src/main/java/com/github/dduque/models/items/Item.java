package com.github.dduque.models.items;

import com.github.dduque.models.Inventory;

public abstract class Item implements Storable
{
    private String name;

    private double damageBonus;

    private double healBonus;

    private int weight = 0;

    private ItemType itemType;


    public Item()
    {

    }

    public Item(String name, double damageBonus, double healBonus, int weight, ItemType itemType)
    {
        this.name = name;
        this.damageBonus = damageBonus;
        this.healBonus = healBonus;
        this.weight = weight;
        this.itemType = itemType;
    }

    public void setWeight(int weight)
    {
        this.weight = weight;
    }

    public String getName()
    {
        return name;
    }

    public double getDamageBonus()
    {
        return damageBonus;
    }

    public void setDamageBonus(double damageBonus)
    {
        this.damageBonus = damageBonus;
    }

    public double getHealBonus()
    {
        return healBonus;
    }

    public void setHealBonus(double healBonus)
    {
        this.healBonus = healBonus;
    }

    public int getWeight()
    {
        return weight;
    }

    public ItemType getItemType()
    {
        return itemType;
    }


    public void addToInventory(Item item)
    {
        Inventory.itemList.add(item);
    }
}
