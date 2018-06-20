package Generics.test;

import Generics.main.Team;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TeamTest {
    Team team1;

    @Before
    public void setup(){
        team1 = new Team("Test Team");
    }

    @Test
    public void teamWonTest() {
        team1.teamWon();

        //test TotalGamesCount increased by 1
        assertEquals(1, team1.getNumberOfGamesPlayed());

        //test TotalGamesWon increased by 1
        assertEquals(1, team1.getNumberOfGamesWon());

        //test TotalGamesLost has no change
        assertEquals(0, team1.getNumberOfGamesLost());
    }

    @Test
    public void teamLostTest() {
        team1.teamLost();

        //test TotalGamesCount increased by 1
        assertEquals(1, team1.getNumberOfGamesPlayed());

        //test TotalGamesWon increased by 1
        assertEquals(0, team1.getNumberOfGamesWon());

        //test TotalGamesLost has no change
        assertEquals(1, team1.getNumberOfGamesLost());
    }
}