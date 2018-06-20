package Generics.main;

public class Team {
    private String teamName;
    private int numberOfGamesPlayed;
    private int numberOfGamesWon;
    private int numberOfGamesLost;

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }

    public int getNumberOfGamesPlayed() {
        return numberOfGamesPlayed;
    }

    public void setNumberOfGamesPlayed(int numberOfGamesPlayed) {
        this.numberOfGamesPlayed = numberOfGamesPlayed;
    }

    public int getNumberOfGamesWon() {
        return numberOfGamesWon;
    }

    public void setNumberOfGamesWon(int numberOfGamesWon) {
        this.numberOfGamesWon = numberOfGamesWon;
    }

    public int getNumberOfGamesLost() {
        return numberOfGamesLost;
    }

    public void setNumberOfGamesLost(int numberOfGameLost) {
        this.numberOfGamesLost = numberOfGameLost;
    }
}
