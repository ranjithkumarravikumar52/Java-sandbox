package Generics.main;

public class Team {
    private String teamName;
    private int numberOfGamesPlayed;
    private int numberOfGamesWon;
    private int numberOfGameLost;

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }
}
