package Generics.main;

import java.util.Random;

public interface simulation<T extends Team> {

    default Integer simulateAMatch(T team1, T team2) {
        int matchResult = getMatchResult();

        incrementGamesPlayedCount(team1, team2);

        if (matchResult == 0) {
            return team1Won(team1, team2);
        }
        if (matchResult == 1) {
            return team2Won(team1, team2);
        }
        return null;
    }

    default Integer team1Won(T team1, T team2) {
        team1.setNumberOfGamesWon(team1.getNumberOfGamesWon() + 1);
        team2.setNumberOfGamesLost(team1.getNumberOfGamesLost() - 1);
        return 0;
    }

    default Integer team2Won(T team1, T team2) {
        team2.setNumberOfGamesWon(team1.getNumberOfGamesWon() + 1);
        team1.setNumberOfGamesLost(team1.getNumberOfGamesLost() - 1);
        return 1;
    }

    default void incrementGamesPlayedCount(T team1, T team2) {
        team1.setNumberOfGamesPlayed(team1.getNumberOfGamesPlayed() + 1);
        team2.setNumberOfGamesPlayed(team1.getNumberOfGamesPlayed() + 1);
    }

    default int getMatchResult() {
        Random random = new Random();
        return random.nextInt(1) + 1;
    }
}
