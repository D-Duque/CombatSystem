package com.github.dduque;

import com.github.dduque.models.Goblin;
import com.github.dduque.models.Player;
import com.github.dduque.models.UI.UserInput;
import com.github.dduque.models.UI.UserOutput;

public class Main {

    public static void main(String[] args) {
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


    }
}