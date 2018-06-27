package collections.main;

import java.util.Collections;

public class App {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("AMC Charlotte", 4, 3);

//        System.out.println("Shuffle");
//        Collections.shuffle(theatre.getSeats());
//        theatre.displaySeats();
//
//        System.out.println();
//
//        System.out.println("Sorted");
//        Collections.sort(theatre.getSeats());
//        theatre.displaySeats();
//
//        System.out.println();
//
//        System.out.println("Reverse");
//        Collections.reverse(theatre.getSeats());
//        theatre.displaySeats();
//
//        System.out.println("Min value(by seatname) " +Collections.min(theatre.getSeats()).getSeatNumber());
//        System.out.println("Max value(by seatname) " +Collections.max(theatre.getSeats()).getSeatNumber());

        System.out.println();
        Collections.swap(theatre.getSeats(), 0, theatre.getSeats().size() - 1);
        theatre.displaySeats();

    }
}
