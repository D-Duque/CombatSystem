package com.github.dduque.models.items;

import com.github.dduque.models.Inventory;

public abstract class Item implements Storable
{
    private String name;

    private double minDamageBonus;

    private double maxDamageBonus;

    private double minHealBonus;

    private double maxHealBonus;



    private int weight = 0;

    private ItemType itemType;


    public Item()
    {

    }

    public Item(String name, double minDamageBonus, double maxDamageBonus, double minHealBonus, double maxHealBonus, int weight, ItemType itemType)
    {
        this.name = name;
        this.minDamageBonus = minDamageBonus;
        this.maxDamageBonus = maxDamageBonus;
        this.minHealBonus = minHealBonus;
        this.maxHealBonus = maxHealBonus;
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

    public double getMinDamageBonus()
    {
        return minDamageBonus;
    }

    public void setMinDamageBonus(double minDamageBonus)
    {
        this.minDamageBonus = minDamageBonus;
    }

    public double getMaxDamageBonus() {
        return maxDamageBonus;
    }

    public void setMaxDamageBonus(double maxDamageBonus) {
        this.maxDamageBonus = maxDamageBonus;
    }

    public double getMinHealBonus()
    {
        return minHealBonus;
    }

    public void setMinHealBonus(double minHealBonus)
    {
        this.minHealBonus = minHealBonus;
    }

    public double getMaxHealBonus() {
        return maxHealBonus;
    }

    public void setMaxHealBonus(double maxHealBonus) {
        this.maxHealBonus = maxHealBonus;
    }

    public int getWeight()
    {
        return weight;
    }

    public ItemType getItemType()
    {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    public void addToInventory(Item item)
    {
        Inventory.itemList.add(item);
    }
}
