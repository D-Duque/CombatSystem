package com.github.dduque.models.items;

import com.github.dduque.models.Inventory;
import com.github.dduque.models.items.weapons.Sword;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class WeaponTest
{

    @Test
    public void equip_ShouldReplaceAnyEquippedWeaponsWithNewWeapon()
    {
        // arrange
        Sword sword1 = new Sword("sword1", 1.0, 1.0, 1, ItemType.WEAPON);
        Sword sword2 = new Sword("sword2", 1.0, 1.0, 1, ItemType.WEAPON);
        String expected = "sword2";
        // act
        sword1.equip(sword1);
        sword2.equip(sword2);

        String actual = Inventory.equippedWeapon[0].getName();
        // assert
        String message = "Because equipping sword2 should replace sword1 in equippedWeapon array.";
        Assert.assertEquals(message, expected, actual);
    }
}