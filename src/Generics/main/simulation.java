package Generics.main;

import java.util.Random;

public interface simulation<T extends Team> {

    default Integer simulateAMatch(T team1, T team2) {
        int matchResult = getMatchResult();

        if (matchResult == 0) {
            team1.teamWon();
            team2.teamLost();
            return 0;
        }
        if (matchResult == 1) {
            team2.teamWon();
            team1.teamLost();
            return 1;
        }
        return null;
    }

    default int getMatchResult() {
        Random random = new Random();
        return random.nextInt(1) + 1;
    }
}
