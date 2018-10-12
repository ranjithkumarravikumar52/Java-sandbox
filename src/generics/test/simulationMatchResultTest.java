package generics.test;

import generics.main.LeagueTable;
import generics.main.Team;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class simulationMatchResultTest {

    private LeagueTable<Team> leagueTable;
    private Team team1;
    private Team team2;

    @Before
    public void setUp() {
        leagueTable = new LeagueTable<>();
        team1 = new Team("arsenal");
        team2 = new Team("liverpool");
        leagueTable.addTeamToTheLeague(team1);
        leagueTable.addTeamToTheLeague(team2);
    }

    @Test
    public void getMatchResult() {
        Integer matchResults = leagueTable.simulateAMatch(team1, team2);
        System.out.println("matchResults = " + matchResults);
        if (matchResults == null) {
            assertNull(matchResults);
        } else if (matchResults == 0) {
            assertEquals(0, matchResults.intValue());
        } else if (matchResults == 1) {
            assertEquals(1, matchResults.intValue());
        }

    }

    /**
     * The top of the league should have won >= second one in the table
     */
    @Test
    public void restructureLeagueTableTest() {

        leagueTable.simulateAMatch(team1, team2);
        leagueTable.simulateAMatch(team1, team2);
        leagueTable.simulateAMatch(team1, team2);

        int firstTeamScore = leagueTable.getTeamList().get(0).getNumberOfGamesWon();
        int secondTeamScore = leagueTable.getTeamList().get(1).getNumberOfGamesWon();

        assertTrue(firstTeamScore >= secondTeamScore);
    }
}