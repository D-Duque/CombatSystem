package com.github.dduque.models.items.weapons;

import com.github.dduque.models.items.ItemType;
import com.github.dduque.models.items.Weapon;

public class Sword extends Weapon
{

    private double minDamageBonus = 2.0;

    private double maxDamageBonus = 4.0;

    private int weight = 5;

    private ItemType itemType = ItemType.WEAPON;

    public Sword()
    {
        setMinDamageBonus(minDamageBonus);
        setMaxDamageBonus(maxDamageBonus);
        setWeight(weight);
        setItemType(itemType);
    }

    @Override
    public void addToInventory()
    {

    }
}
