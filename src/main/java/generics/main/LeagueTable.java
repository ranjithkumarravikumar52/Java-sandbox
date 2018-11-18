package generics.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class LeagueTable<T extends Team> implements simulationMatchResult {

    private List<T> teamList;

    public LeagueTable() {
        this.teamList = new ArrayList<>();
    }

    public boolean addTeamToTheLeague(T team) {
        if (team != null && !team.getTeamName().isEmpty() && !isDuplicateTeam(team)) {
            teamList.add(team);
            return true;
        }
        return false;
    }

    private boolean isDuplicateTeam(T team) {
        ListIterator<T> teamListIterator = teamList.listIterator();
        while (teamListIterator.hasNext()) {
            if (team.getTeamName().equals(teamListIterator.next().getTeamName())) {
                return true;
            }
        }
        return false;

    }

    public Integer simulateAMatch(T team1, T team2) {
        if (teamList.contains(team1) && teamList.contains(team2)) {
            int matchResult = getMatchResult();

            if (matchResult == 0) {
                team1.teamWon();
                team2.teamLost();
                restructureLeagueTable();
                return 0;
            }
            if (matchResult == 1) {
                team2.teamWon();
                team1.teamLost();
                restructureLeagueTable();
                return 1;
            }
            return null;
        }
        return null;
    }

    /**
     * Assuming season contains 2 * number of teams in the league table
     * <br>
     * For example, lets say we have 4 teams (0-based)
     * <br>
     * 0 -> 1, 2, 3<br>
     * 1 -> 0, 2, 3<br>
     * 2 -> 0, 1, 3<br>
     * 3 -> 0, 1, 2<br>
     *
     * @return true if successful simulation of the Simulation
     */
    public boolean simulateCompleteSeason() {
        for (int i = 0; i < teamList.size(); i++) {
            for (int j = 0; j < teamList.size(); j++) {
                if (i != j) {
                    simulateAMatchForCompleteSeason(teamList.get(i), teamList.get(j));
                }
            }
        }
        restructureLeagueTable();
        return true;
    }

    private Integer simulateAMatchForCompleteSeason(T team1, T team2) {

        int matchResult = getMatchResult();
        System.out.println("Simulating " + team1.getTeamName() + " and " + team2.getTeamName()+"....");
        if (matchResult == 0) {
            team1.teamWon();
            team2.teamLost();
            System.out.println("Match Result: "+team1.getTeamName()+" won.");
            System.out.println();
            return 0;
        }
        else if (matchResult == 1) {
            team2.teamWon();
            team1.teamLost();
            System.out.println("Match Result: "+team2.getTeamName()+" won.");
            System.out.println();
            return 1;
        }
        return null;
    }

    private void restructureLeagueTable() {
        Collections.sort(teamList);
        Collections.reverse(teamList);
    }

    public void printLeagueTable() {
        System.out.println("DA REAL LEAGUE FINAL STANDINGS");
        for (Team team : teamList) {
            System.out.println(team);
        }
    }

    public List<T> getTeamList() {
        return teamList;
    }
}
