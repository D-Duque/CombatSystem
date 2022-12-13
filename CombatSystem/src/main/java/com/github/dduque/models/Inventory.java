package com.github.dduque.models;

import com.github.dduque.models.items.Item;
import com.github.dduque.models.items.Weapon;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

    public static List<Item> playerInventory = new ArrayList<>();
    public static Weapon[] equippedWeapon = new Weapon[1];

    //TODO: Maybe create functionality to allow player to access their inventory when choosing to use an item in combat.
    public void listInventory()
    {
        for (Item item: playerInventory)
        {
            System.out.println(item);
        }
    }


}
