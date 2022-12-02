package com.github.dduque;

import com.github.dduque.models.Enemy;
import com.github.dduque.models.Goblin;
import com.github.dduque.models.Player;
import com.github.dduque.models.UI.UserInput;
import com.github.dduque.models.UI.UserOutput;
import com.github.dduque.models.items.Sword;

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
        Sword.addSwordToInventory(sword);
        Sword.addSwordToInventory(sword);
        Sword.addSwordToInventory(sword);

        double damage = Player.calculateDamage(sword);
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