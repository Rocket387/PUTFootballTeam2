package org.example;


import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class FootballTeam2Test

{

    @Test
    public void constructorShouldSetGamesWon() {
        FootballTeam2 team = new FootballTeam2(3);
        assertEquals(3, team.getGamesWon());
    }
}
