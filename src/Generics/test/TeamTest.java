package Generics.test;

import Generics.main.Team;
import org.junit.Test;

import static org.junit.Assert.*;

public class TeamTest {

    @Test
    public void teamWon() {
        Team team1 = new Team("arsenal") ;
        team1.teamWon();
    }

    @Test
    public void teamLost() {
    }
}