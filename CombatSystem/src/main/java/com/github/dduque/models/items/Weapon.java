package com.github.dduque.models.items;

public abstract class Weapon extends Item {

    private String name;

    private double damageBonus = 0.0;

    private double healBonus = 0.0;

    private int weight = 0;

    private ItemType itemType = ItemType.WEAPON;

    private boolean isEquipped = false;

    public boolean isEquipped() {return isEquipped;}

    public void setEquipped(boolean equipped) {isEquipped = equipped;}

    // constructors
    public Weapon() {
    }

    public Weapon(String name, double damageBonus, double healBonus, int weight, ItemType itemType) {
        this.name = name;
        this.damageBonus = damageBonus;
        this.healBonus = healBonus;
        this.weight = weight;
        this.itemType = itemType;
    }

    // methods

}
