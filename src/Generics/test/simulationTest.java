package Generics.test;

import Generics.main.LeagueTable;
import Generics.main.Team;
import org.junit.Before;
import org.junit.Test;

public class simulationTest {

    LeagueTable<Team> leagueTable;
    Team team1;
    Team team2;

    private int team1TotalGames;
    private int team1GamesWon;
    private int team1GamesLost;

    private int team2TotalGames;
    private int team2GamesWon;
    private int team2GamesLost;

    @Before
    public void setUp(){
        leagueTable = new LeagueTable<>();
        team1 = new Team("arsenal");
        team2 = new Team("liverpool");
        leagueTable.addTeamToTheLeague(team1);
        leagueTable.addTeamToTheLeague(team2);
    }


    @Test
    public void simulateAMatch() {
    }

    @Test
    public void team1Won() {
    }

    @Test
    public void team2Won() {
    }

    @Test
    public void incrementGamesPlayedCount() {
    }

    @Test
    public void getMatchResult() {
        Integer matchResults = leagueTable.simulateAMatch(team1, team2);
        if(matchResults == 0 ){
            //team 1 won
        }
        else if(matchResults == 1){
            //team 2 won
        }else{
            //match abandoned
        }
    }
}