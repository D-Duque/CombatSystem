package com.github.dduque.models;

import com.github.dduque.UI.UserOutput;

public class Enemy {

    private String name;
    private static double maxHealth = 100.0;
    private static double currentHealth = 100.0;
    private static double damage = 2.0;
    private static int armor = 0;

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public double getCurrentHealth() {return currentHealth;}
    public void setCurrentHealth(double health) {Enemy.currentHealth = health;}

    public double getMaxHealth() {return maxHealth;}
    public void setMaxHealth(double maxHealth) {Enemy.maxHealth = maxHealth;}

    public double getDamage() {return damage;}
    public void setDamage(double damage) {Enemy.damage = damage;}

    public double getArmor() {return armor;}
    public void setArmor(int armor) {Enemy.armor = armor;}

    public Enemy()
    {

    }

    public Enemy(String name)
    {
        this.name = name;
    }

    public Enemy(String name, double maxHealth, double damage, int armor)
    {
        this.name = name;
        this.maxHealth = maxHealth;
        this.damage = damage;
        this.armor = armor;
    }

    public void attackPlayer(Player player)
    {
        UserOutput userOutput = new UserOutput();

        if (damage > player.getArmor())
        {
            // if damage > armor, reduce enemy health
            player.setCurrentHealth(player.getCurrentHealth() - (damage - player.getTotalArmor()));
            userOutput.displayEnemyAttackSuccess(getName(), damage);
        }
        else {
            // if not, print attack did not land message.
            userOutput.displayEnemyAttackFail();
        }
        System.out.println();

    }

}
