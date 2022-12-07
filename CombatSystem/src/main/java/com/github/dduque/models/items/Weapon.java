package com.github.dduque.models.items;

import com.github.dduque.models.Inventory;

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
    public void equip(Weapon weapon)
    {
        // check if list size is > 0
        // if size is greater than 0, retrieve item and move to player inventory
        if (Inventory.equippedWeapon.length > 0) {Inventory.playerInventory.add(Inventory.equippedWeapon[0]);}
        // Add weapon to equippedWeapon
        Inventory.equippedWeapon[0] = weapon;
    }
}
