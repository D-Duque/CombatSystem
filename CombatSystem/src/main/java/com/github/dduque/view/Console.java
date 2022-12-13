package com.github.dduque.view;

public class Console
{
    public static final String CLEAR_SCREEN = "\033[H\033[2J";

    public static void clearScreen()
    {
        System.out.println(CLEAR_SCREEN);
    }

}
