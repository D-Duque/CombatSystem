package com.github.dduque.controllers;

import com.github.dduque.UI.UserInput;
import com.github.dduque.UI.UserOutput;
import com.github.dduque.models.Enemy;
import com.github.dduque.models.Player;
import com.github.dduque.models.items.weapons.Sword;
import com.github.dduque.view.Console;

public class GameController
{
    UserOutput userOutput = new UserOutput();
    UserInput userInput = new UserInput();

    public void run()
    {
        Console.clearScreen();
        mainMenu();
    }

    public void mainMenu()
    {
        Player player = new Player();
        Enemy enemy = new Enemy();
        int menuSelection = -1;


        while (menuSelection != 0)
        {
            userOutput.displayMainMenu();
            menuSelection = userInput.getSelection();

            if (menuSelection == 1)
            {
                // Set Name menu
                nameScreen(player);
            }
            else if (menuSelection == 2)
            {
                // Select Weapon Menu
                weaponSelectMenu();
            }
            else if (menuSelection == 3)
            {
                enemy = enemySelectMenu();
            }
            else if (menuSelection == 4)
            {
                // Start Combat
                initiateCombat(player, enemy);
            }
            else if (menuSelection == 5)
            {
                // Exit program
                System.exit(0);
            }
            else
            {
                System.out.println("Invalid selection");
            }

        }
    }

    public void nameScreen(Player player)
    {
        // prompt user for name
        userOutput.displayIntro();
        userOutput.displayName();
        userInput.setPlayerName(player);
    }

    public void weaponSelectMenu()
    {
        //prompt user for weapon choice
        userOutput.displayWeaponSelectionMenu();

        int menuSelection = -1;

        while (menuSelection != 0)
        {
            menuSelection = userInput.getSelection();
            if (menuSelection == 1)
            {
                Sword sword = new Sword();
                sword.equip(sword);
                System.out.println("\nYou have selected a sword!\n");
                menuSelection = 0;
            }
            else if (menuSelection == 2)
            {
                // TODO: flesh out bow subclass
//                Bow bow = new Bow();
//                bow.addToInventory(bow);
//                System.out.println("\nYou have selected a bow!\n");
//                menuSelection = 0;
                System.out.println("Not implemented yet.");
            }
            else if (menuSelection == 3)
            {
                //TODO: flesh out staff subclass
//                Staff staff = new Staff();
//                staff.addToInventory(staff);
//                System.out.println("\nYou have selected a staff!\n");
//                menuSelection = 0;
                System.out.println("Not implemented yet.");
            }
            else {
                System.out.println("Not a valid selection.");
            }

        }
    }

    public Enemy enemySelectMenu()
    {
        userOutput.displayEnemyList();
        int enemySelection = userInput.getSelection();
        return userOutput.displayEnemySelection(enemySelection);
    }

    public void initiateCombat(Player player, Enemy enemy)
    {
        boolean isEnemyAlive = true;
        boolean isPlayerAlive = true;
        userOutput.displayCombatBegin();

        while(isEnemyAlive && isPlayerAlive)
        {
            Console.clearScreen();
            userOutput.displayHealth(player, enemy);

            // For now, player turn first. TODO: implement initiative.
            // Prompt player for what they'd like to do on their turn
            userOutput.displayPlayerTurnMenu();
            int turnSelection = userInput.getSelection();

            if (turnSelection == 1)
            { // attack
                player.attackEnemy(enemy);
            }
            else if (turnSelection == 2)
            { // defend
                player.defend();
            }
            else if (turnSelection == 3)
            { // use item
                System.out.println("This is not implemented yet.");
            }

            // Enemy attack, evaluate enemy health
            if (enemy.getCurrentHealth() <= 0) {isEnemyAlive = false;}
            else {enemy.attackPlayer(player);}

            if (player.getCurrentHealth() <= 0) {isPlayerAlive = false;}
        }
        userOutput.displayCombatResults(player, enemy, isEnemyAlive);
    }
}
