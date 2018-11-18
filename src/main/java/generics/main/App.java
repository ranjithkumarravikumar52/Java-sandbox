package generics.main;

public class App {
    public static void main(String[] args) {
        // Create a generic class to implement a league table for a sport.
        // Let's consider the champions league table for easy relevance
        LeagueTable<Team> leagueTable = new LeagueTable<>();

        //Teams
        Team team1 = new Team("Arsenal");
        Team team2 = new Team("Man United");
        Team team3 = new Team("Man City");
        Team team4 = new Team("Liverpool");
        Team team5 = new Team("Chelsea");
        Team team6 = new Team("Swansea City");
        Team team7 = new Team("Burnley");
        Team team8 = new Team("Crystal Palace");

        // The class should allow teams to be added to the list, and store
        // a list of teams that belong to the league.
        leagueTable.addTeamToTheLeague(team1);
        leagueTable.addTeamToTheLeague(team2);
        leagueTable.addTeamToTheLeague(team3);
        leagueTable.addTeamToTheLeague(team4);
        leagueTable.addTeamToTheLeague(team5);
        leagueTable.addTeamToTheLeague(team6);
        leagueTable.addTeamToTheLeague(team7);
        leagueTable.addTeamToTheLeague(team8);


        // Your class should have a method to print out the teams in order,
        // with the team at the top of the league printed first.
        leagueTable.simulateCompleteSeason();
        leagueTable.printLeagueTable();


        // Only teams of the same type should be added to any particular
        // instance of the league class - the program should fail to compile
        // if an attempt is made to add an incompatible team.

    }
}
