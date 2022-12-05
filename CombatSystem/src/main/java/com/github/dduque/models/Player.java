package com.github.dduque.models;

import com.github.dduque.models.items.Character;
import com.github.dduque.models.items.Item;
import com.github.dduque.models.items.ItemType;

public class Player extends Character {
    private String name;
    private double health = 100.0;
    private static double damage = 1.0;
    private int armor = 1;


    public Player() {
        super();
        setHealth(health);
        setDamage(damage);
        setArmor(armor);
    }

    public Player(String name, double health, int armor, double damage) {
        super(name, 100.0, 1, 1.0);
    }

    public void setName(String name)
    {
        this.name = name;
    }

    // attack
    public static void attackEnemy(Enemy enemy)
    {
        System.out.println("Beginning enemy health: " + enemy.getHealth());
        // calculate weapon damage
        double totalWeaponDamage = 0;
        for (Item item : Inventory.itemList)
        {
            double minWepDamageBonus = item.getMinDamageBonus();
            double maxWepDamageBonus = item.getMaxDamageBonus();
            ItemType itemType = item.getItemType();
            if (itemType == ItemType.WEAPON)
            {
                totalWeaponDamage += Math.floor(Math.random()*(maxWepDamageBonus - minWepDamageBonus + 1) + minWepDamageBonus);
                System.out.println("total weapon damage: " + totalWeaponDamage);
            }
        }

        // calculate total player damage
        double totalDamage  = damage + totalWeaponDamage;
        // compare damage against enemy armor
        if (totalDamage > enemy.getArmor())
            {
            // if damage > armor, reduce enemy health
                enemy.setHealth(enemy.getHealth() - (totalDamage - enemy.getArmor()));
                System.out.println("Total damage done: " + totalDamage);
                System.out.println("Remaining enemy health: " + enemy.getHealth());
            }
        else {
            // if not, print attack did not land message.
            System.out.println("Sorry, your attack did not land!");
        }
        System.out.println();
    }
    // defend

    // heal
}
