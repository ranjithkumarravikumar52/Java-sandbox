package Generics.main;

import java.util.Random;

public interface simulationMatchResult {

    default int getMatchResult() {
        Random random = new Random();
        int i = Math.abs(random.nextInt());
//        System.out.println("i = " + i);
        return i % 2;
    }
}
