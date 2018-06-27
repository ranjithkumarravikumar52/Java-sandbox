package collections.main;

import java.util.Collections;

public class App {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("AMC Charlotte", 4, 3);

        System.out.println("Shuffle");
        Collections.shuffle(theatre.getSeats());
        theatre.displaySeats();

        System.out.println();

        System.out.println("Sorted");
        Collections.sort(theatre.getSeats());
        theatre.displaySeats();

        System.out.println();

        System.out.println("Reverse");
        Collections.reverse(theatre.getSeats());
        theatre.displaySeats();

    }
}
