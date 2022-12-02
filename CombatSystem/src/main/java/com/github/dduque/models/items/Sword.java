package com.github.dduque.models.items;

public class Sword extends Weapon{

    private double damageBonus = 2.0;

    private int weight = 5;

    public Sword()
    {
        setDamageBonus(damageBonus);
        setWeight(weight);
    }

    public Sword(double damageBonus, int weight) {
        this.damageBonus = damageBonus;
        this.weight = weight;
    }

    // TODO: refactor into Weapon instead. Maybe interface??
    public static void addSwordToInventory(Weapon weapon)
    {
        Inventory.weaponsList.add(weapon);
    }

}
