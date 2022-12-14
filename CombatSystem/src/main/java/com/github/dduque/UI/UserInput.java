package com.github.dduque.UI;

import com.github.dduque.models.Player;
import java.util.Scanner;

public class UserInput {

    private static Scanner input = new Scanner(System.in);

    public void setPlayerName(Player player)
    {
        player.setName(input.nextLine().trim());
    }

    public int getSelection()
    {
        return Integer.parseInt(input.nextLine().trim());
    }

}
