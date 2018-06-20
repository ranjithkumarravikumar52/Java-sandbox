package Generics.test;

import Generics.main.LeagueTable;
import Generics.main.Team;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LeagueTableTest {

    private LeagueTable<Team> leagueTable;

    @Before
    public void setup() {
        leagueTable = new LeagueTable<>();
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
        assertFalse("Team name can't be empty",leagueTable.addTeamToTheLeague(brokenTeam));
    }

    @Test
    public void addNullTeamToTheLeague() {
        assertFalse(leagueTable.addTeamToTheLeague(null));
    }

    //adding duplicate team? HUH? Did ya think about it?

    @Test
    public void addDuplicateTeamToTheLeague(){
        leagueTable.addTeamToTheLeague(new Team("arsenal"));
        assertFalse("Cant add duplicate team", leagueTable.addTeamToTheLeague(new Team("arsenal")));
    }

}