package com.github.dduque.models.UI;

import com.github.dduque.models.Enemy;
import com.github.dduque.models.Goblin;
import com.github.dduque.models.Player;

import java.util.Scanner;

public class UserOutput {
    private static Scanner playerInput = new Scanner(System.in);
    public void displayIntro()
    {
        System.out.println("Welcome to this combat system! To begin, what is your name: ");
    }

    public void displayWeaponSelectionMenu()
    {
        System.out.println("Now, choose your weapon: ");
        System.out.println("1. Sword");
        System.out.println("2. Bow");
        System.out.println("3. Staff");
    }

    public void displayEnemyList()
    {
        System.out.println("Now, select your enemy: ");
        System.out.println("1. Goblin");
        System.out.println("2. Dragon (Not implemented)");
        System.out.println("3. Hag (Not implemented)");
    }

    public Enemy displayEnemySelection(char enemySelection)
    {
        if (enemySelection == '1')
        {
            Goblin goblin = new Goblin("Binkus");
            String goblinName = goblin.getName();
            System.out.println("You have chosen to do combat with: " + goblinName + " the Goblin.");
            return goblin;
        }
        return null;
    }

    public void displayCombatBegin()
    {
        System.out.println("Press enter once you are ready to begin combat...");
        playerInput.nextLine();
    }

    public void displayHealth(Player player, Enemy enemy)
    {
        System.out.println("Player health: " + player.getHealth() + "  ||  " + "Enemy health: " + enemy.getHealth());
    }

    public void displayPlayerTurnMenu()
    {
        System.out.println("What would you like to do on your turn?");
        System.out.println("1. Attack");
        System.out.println("2. Defend");
        System.out.println("3. Use Item");
    }

}
