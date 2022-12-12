package com.github.dduque.models;

import com.github.dduque.models.items.Item;
import com.github.dduque.models.items.ItemType;

public class Player extends Character {
    private double health = 10.0;
    private static double damage = 0.0;
    private int tempArmor;
    private int equippedArmor;


    public int getTempArmor() {return tempArmor;}

    public void setTempArmor(int tempArmor) {this.tempArmor = tempArmor;}


    public int getEquippedArmor() {return equippedArmor;}

    public void setEquippedArmor(int equippedArmor) {this.equippedArmor = equippedArmor;}


    public int getTotalArmor() {return tempArmor + equippedArmor;}

    public Player() {
        super();
        setHealth(health);
        setDamage(damage);
    }

    public Player(String name, double health, int totalArmor, double damage) {
        super(name, 100.0, 1, 1.0);
    }

    // attack
    public void attackEnemy(Enemy enemy)
    {

        // calculate weapon damage
        double totalWeaponDamage = 0;
        for (Item item : Inventory.equippedWeapon)
        {
            double minWepDamageBonus = item.getMinDamageBonus();
            double maxWepDamageBonus = item.getMaxDamageBonus();
            ItemType itemType = item.getItemType();
            if (itemType == ItemType.WEAPON)
            {
                totalWeaponDamage += Math.floor(Math.random()*(maxWepDamageBonus - minWepDamageBonus + 1) + minWepDamageBonus);
            }
        }

        // calculate total player damage
        double totalDamage  = damage + totalWeaponDamage;
        // compare damage against enemy armor
        if (totalDamage > enemy.getArmor())
            {
            // if damage > armor, reduce enemy health
                if (totalDamage > enemy.getHealth())
                {
                    enemy.setHealth(0);
                }
                else {enemy.setHealth(enemy.getHealth() - (totalDamage - enemy.getArmor()));}
                System.out.println("You slice with your weapon and deal:  " + totalDamage + " damage!");
            }
        else {
            // if not, print attack did not land message.
            System.out.println("Sorry, your attack did not land!");
        }
        System.out.println();
    }
    // defend
    public void defend()
    {
        // check for any equipped shields, if shield is equipped, defend bonus is greater.
        setTempArmor(2);
    }
    // heal
}
