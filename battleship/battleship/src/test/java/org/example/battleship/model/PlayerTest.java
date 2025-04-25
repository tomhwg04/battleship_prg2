package org.example.battleship.model;
import org.testng.annotations.Test;
import org.testng.Assert;

public class PlayerTest {

    @Test
    public void testInverse() {
        Assert.assertEquals(Player.FIRST, Player.SECOND.inverse());
        Assert.assertEquals(Player.SECOND, Player.FIRST.inverse());
    }
}