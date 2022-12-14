package com.github.dduque.UI;

import com.github.dduque.models.Enemy;
import com.github.dduque.models.Goblin;
import com.github.dduque.models.Player;
import com.github.dduque.view.Colors;

import java.util.Scanner;

public class UserOutput {
    private static Scanner playerInput = new Scanner(System.in);

    public void displayMainMenu()
    {
        System.out.println("1. Select your name");
        System.out.println("2. Select your weapon");
        System.out.println("3. Select your enemy");
        System.out.println("4. Start combat");
        System.out.println("5. exit");
    }

    public void displayName() {
        System.out.println("What is your name?");

    }
    public void displayIntro()
    {
        System.out.println("Welcome to this combat system! To begin, what is your name: ");
    }

    public void displayWeaponSelectionMenu()
    {
        System.out.println("Now, choose your weapon: ");
        System.out.println("1. Sword");
        System.out.println("2. Bow (Not implemented.)");
        System.out.println("3. Staff (Not implemented.)");
    }

    public void displayEnemyList()
    {
        System.out.println("Now, select your enemy: ");
        System.out.println("1. Goblin");
        System.out.println("2. Bugbear (Not implemented.)");
        System.out.println("3. Dragon (Not implemented.)");
    }

    public Enemy displayEnemySelection(int enemySelection)
    {
        if (enemySelection == 1)
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
        double halfEnemyMaxHealth = enemy.getMaxHealth() / 2;
        double halfPlayerMaxHealth = player.getMaxHealth() / 2;
        String playerHealth = (player.getCurrentHealth() >= halfPlayerMaxHealth)
                            ? Colors.GREEN + player.getCurrentHealth() + Colors.RESET
                            : Colors.RED + player.getCurrentHealth() + Colors.RESET;

        String enemyHealth = (enemy.getCurrentHealth() >= halfEnemyMaxHealth)
                            ? Colors.GREEN + enemy.getCurrentHealth() + Colors.RESET
                            : Colors.RED + enemy.getCurrentHealth() + Colors.RESET;

        System.out.println("Player health: " + playerHealth + "  ||  " + "Enemy health: " + enemyHealth);
    }

    public void displayPlayerTurnMenu()
    {
        System.out.println("What would you like to do on your turn?");
        System.out.println("1. Attack");
        System.out.println("2. Defend");
        System.out.println("3. Use Item (Not implemented yet.)");
    }

    public void displayEnemyAttackSuccess(String name, double damage)
    {
        System.out.println(name + " deals " + damage + " damage to you!");
        playerInput.nextLine();
    }

    public void displayEnemyAttackFail()
    {
        System.out.println("The enemy misses you!");
        playerInput.nextLine();
    }

    public void displayCombatResults(Player player, Enemy enemy, boolean isEnemyAlive)
    {
        if (!isEnemyAlive)
        {
            String playerName = player.getName();
            System.out.println(playerName + ", you have defeated: " + enemy.getName() + " !");
            System.out.println();
        }
        else
        {
            System.out.println(enemy.getName() + " has defeated you!");
            System.out.println();
        }
    }

}
