package com.github.dduque.models;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PlayerTest {

    Goblin testGoblin;
    Player testPlayer;

    @Before
    public void setUp(){
        testGoblin = new Goblin();
        testPlayer = new Player();
    }

    @Test
    public void attackEnemy_ShouldReduceHealthFromEnemy() {
        // Player damage = 1.0 ; Goblin Health = 10.0, Armor = 0.0
        // arrange
        double expectedhealth = 9.0;
        // act
        testPlayer.attackEnemy(testGoblin);
        double actualHealth = testGoblin.getHealth();
        // assert
        String message = "Because attacking a goblin without weapons when the goblin has no armor and a health pool of 10 should return 9";
        Assert.assertEquals(message, expectedhealth, actualHealth, 0.5);
    }

    public void attackEnemy_ShouldCheckIfPlayerDamageIsGreaterThanArmorBeforeReducingEnemyHealth()
    {
        // arrange
        double expectedHealth = 10.0;
        testGoblin.setArmor(2);
        // act
        testPlayer.attackEnemy(testGoblin);
        double actualHealth = testGoblin.getHealth();

        // assert
        String message = "Because an enemy with an armor rating higher than the player's damage should not have its health reduced.";
        Assert.assertEquals(message, expectedHealth, actualHealth, 0.5);

    }
}