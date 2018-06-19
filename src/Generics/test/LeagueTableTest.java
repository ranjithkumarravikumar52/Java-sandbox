package Generics.test;

import Generics.main.LeagueTable;
import Generics.main.Team;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LeagueTableTest {

    private LeagueTable leagueTable;

    @Before
    public void setup() {
        leagueTable = new LeagueTable();
    }

    @Test
    public void addArsenalToTheLeague() {
        Team arsenal = new Team("arsenal");
        assertTrue(leagueTable.addTeamToTheLeague(arsenal));
    }

    @Test
    public void addManUToTheLeague() {
        Team manU = new Team("manU");
        assertTrue(leagueTable.addTeamToTheLeague(manU));
    }

    @Test
    public void addManCityToTheLeague() {
        Team manCity = new Team("manCity");
        assertTrue(leagueTable.addTeamToTheLeague(manCity));
    }

    @Test
    public void addLiverpoolToTheLeague() {
        Team liverpool = new Team("liverpool");
        assertTrue(leagueTable.addTeamToTheLeague(liverpool));
    }

    @Test
    public void addEmptyTeamToTheLeague() {
        Team brokenTeam = new Team("");
        assertFalse(leagueTable.addTeamToTheLeague(brokenTeam));
    }

    @Test
    public void addNullTeamToTheLeague() {
        assertFalse(leagueTable.addTeamToTheLeague(null));
    }

}