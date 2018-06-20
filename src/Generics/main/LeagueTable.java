package Generics.main;

import java.util.ArrayList;
import java.util.List;

public class LeagueTable<T extends Team> implements simulation<T> {

    private List<T> teamList;

    public LeagueTable() {
        this.teamList = new ArrayList<>(4);
    }

    public boolean addTeamToTheLeague(T team) {
        boolean success;
        if (team != null && !team.getTeamName().isEmpty()) {
            teamList.add(team);
            success = true;
        } else {
            success = false;
        }
        return success;
    }


    //3. Create a logic to implement ranking based on your defined conditions.
    // Your class should have a method to print out the teams in order, with the team at the top of the league printed first.
    // The order should be based on the number of games won by using collections.sort()


}
