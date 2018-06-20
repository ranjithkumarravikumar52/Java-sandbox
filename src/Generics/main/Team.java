package Generics.main;

public class Team implements Comparable<Team> {
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

    public int getNumberOfGamesWon() {
        return numberOfGamesWon;
    }


    public int getNumberOfGamesLost() {
        return numberOfGamesLost;
    }


    public void teamWon() {
//        System.out.println("Before incrementing variables in TeamWon: "+this);
        numberOfGamesPlayed++;
        numberOfGamesWon++;
//        System.out.println("After incrementing variables in TeamWon: "+this);
    }

    public void teamLost() {
//        System.out.println("Before incrementing variables in TeamLost: "+this);
        numberOfGamesPlayed++;
        numberOfGamesLost++;
//        System.out.println("After incrementing variables in TeamLost: "+this);
    }

    @Override
    public int compareTo(Team o) {
        if (this.numberOfGamesWon > o.numberOfGamesWon) {
            return 1;
        } else if (this.numberOfGamesWon < o.numberOfGamesWon) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Team{" +
                "teamName='" + teamName + '\'' +
                ", numberOfGamesPlayed=" + numberOfGamesPlayed +
                ", numberOfGamesWon=" + numberOfGamesWon +
                ", numberOfGamesLost=" + numberOfGamesLost +
                '}';
    }
}
