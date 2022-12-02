package com.github.dduque.models.items.weapons;

import com.github.dduque.models.items.Weapon;

public class Sword extends Weapon
{

    private double damageBonus = 2.0;

    private int weight = 5;

    public Sword()
    {
        setDamageBonus(damageBonus);
        setWeight(weight);
    }



}
