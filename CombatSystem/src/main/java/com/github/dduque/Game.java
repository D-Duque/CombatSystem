package com.github.dduque;

import com.github.dduque.models.Enemy;
import com.github.dduque.models.Goblin;
import com.github.dduque.models.Player;
import com.github.dduque.models.UI.UserInput;
import com.github.dduque.models.UI.UserOutput;
import com.github.dduque.models.items.Item;
import com.github.dduque.models.items.Weapon;
import com.github.dduque.models.items.weapons.Bow;
import com.github.dduque.models.items.weapons.Staff;
import com.github.dduque.models.items.weapons.Sword;

public class Game
{
    UserOutput userOutput = new UserOutput();
    UserInput userInput = new UserInput();

    public static void main(String[] args) {
       Game game = new Game();
       game.run();
    }

    private void run()
    {
        Player player = new Player();
        int menuSelection = -1;

        // prompt user for name
        userOutput.displayIntro();
        userOutput.displayName();
        userInput.setPlayerName(player);

        //prompt user for weapon choice
        userOutput.displayWeaponSelectionMenu();

        while (menuSelection != 0)
        {
            menuSelection = userInput.getWeaponSelection();
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
        // list out enemies
        userOutput.displayEnemyList();
        // accept user input
        char enemySelection = userInput.getEnemySelection();
        // display enemy choice
       Enemy enemy = userOutput.displayEnemySelection(enemySelection);

       initiateCombat(player, enemy);
    }


    public void initiateCombat(Player player, Enemy enemy)
    {
        boolean isEnemyAlive = true;
        boolean isPlayerAlive = true;
        userOutput.displayCombatBegin();

        while(isEnemyAlive && isPlayerAlive)
        {
            userOutput.displayHealth(player, enemy);

            // For now, player turn first. TODO: implement initiative.
            // Prompt player for what they'd like to do on their turn
            userOutput.displayPlayerTurnMenu();
            int turnSelection = userInput.getTurnSelection();

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
            if (enemy.getHealth() <= 0) {isEnemyAlive = false;}
            else {enemy.attackPlayer(player);}

            if (player.getHealth() <= 0) {isPlayerAlive = false;}
        }
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