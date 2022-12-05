package com.github.dduque;

import com.github.dduque.models.Enemy;
import com.github.dduque.models.Goblin;
import com.github.dduque.models.Player;
import com.github.dduque.models.UI.UserInput;
import com.github.dduque.models.UI.UserOutput;
import com.github.dduque.models.items.weapons.Sword;

public class Main {

    public static void main(String[] args) {
        Player player = new Player();
        // display intro to prompt user for enemy choice
        UserOutput.displayIntro();
        // list out enemies
        UserOutput.displayEnemyList();
        // accept user input
        char enemySelection = UserInput.getEnemySelection();
        // display enemy choice
        UserOutput.displayEnemySelection(enemySelection);
        // initialize combat loop
        UserOutput.displayCombatBegin();

        Sword sword = new Sword();
        sword.addToInventory(sword);
        Goblin goblin = new Goblin();

        Player.attackEnemy(goblin);

    }

    public static void initiateCombat(Player player, Enemy enemy)
    {
        boolean isEnemyAlive = true;

        while(isEnemyAlive)
        {
            /* combat code here

             */
        }
    }
}