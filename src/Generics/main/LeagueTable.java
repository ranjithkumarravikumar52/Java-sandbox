package Generics.main;

import java.util.ArrayList;
import java.util.List;

public class LeagueTable {

    // 1. Create a generic class called LeagueTable

    // 2. Define the fields of this class
    private List<Team> teamList;
    //ranking based on number of the games they won

    public LeagueTable() {
        this.teamList = new ArrayList<>(4);
    }


    // 3. Define the methods for the class
    public boolean addTeamToTheLeague(Team team) {
        boolean success;
        if (team != null && !team.getTeamName().isEmpty()) {
            teamList.add(team);
            success = true;
        } else {
            success = false;
        }
        return success;
    }

    // Your class should have a method to print out the teams in order,
    // with the team at the top of the league printed first.
    // 4. Create a logic to implement ranking based on your defined conditions


}
