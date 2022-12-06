package com.github.dduque.models.UI;

import com.github.dduque.models.Enemy;
import com.github.dduque.models.Player;

import java.util.Locale;
import java.util.Scanner;

public class UserInput {

    private static Scanner input = new Scanner(System.in);

    public void setPlayerName(Player player)
    {
        player.setName(input.nextLine().trim());
    }


    public int getWeaponSelection() {
        int weaponSelection = Integer.parseInt(input.nextLine());
        return weaponSelection;
    }
    public char getEnemySelection() {
        char enemySelection = input.nextLine().trim().charAt(0);
        return enemySelection;
    }

    public int getTurnSelection() {
        int turnSelection = Integer.parseInt(input.nextLine());
        return turnSelection;
    }

}
