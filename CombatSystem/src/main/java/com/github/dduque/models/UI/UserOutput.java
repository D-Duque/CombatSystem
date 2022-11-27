package com.github.dduque.models.UI;

import com.github.dduque.models.Goblin;

import java.util.Scanner;

public class UserOutput {
    private static Scanner playerInput = new Scanner(System.in);
    public static void displayIntro()
    {
        System.out.println("Welcome to this combat system! To begin, select your enemy: ");
    }

    public static void displayEnemyList()
    {
        System.out.println("1. Goblin");
        System.out.println("2. Dragon (Not implemented)");
        System.out.println("3. Hag (Not implemented)");
    }

    public static void displayEnemySelection(char enemySelection)
    {
        if (enemySelection == '1')
        {
            Goblin goblin1 = new Goblin("Binkus");
            String goblinName = goblin1.getName();
            System.out.println("You have chosen to do combat with: " + goblinName + " the Goblin.");
        }
    }

    public static void displayCombatBegin()
    {
        System.out.println("Press enter once you are ready to begin combat...");
        playerInput.nextLine();
    }
}
