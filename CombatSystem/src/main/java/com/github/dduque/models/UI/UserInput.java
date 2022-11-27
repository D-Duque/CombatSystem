package com.github.dduque.models.UI;

import com.github.dduque.models.Enemy;
import com.github.dduque.models.Player;

import java.util.Scanner;

public class UserInput {

    private static Scanner input = new Scanner(System.in);

    public static char getEnemySelection() {
        char enemySelection = input.nextLine().trim().charAt(0);
        return enemySelection;
    }

}
