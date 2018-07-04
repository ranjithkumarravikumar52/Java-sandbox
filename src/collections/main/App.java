package collections.main;

import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("AMC Charlotte", 4, 3);
//        theatre.displaySeats();

        //conversion constructor
        List<Seat> copy = new LinkedList<>(theatre.getSeats());
//        displaySeats(copy);

        //checking if changes in copy affects original
        copy.get(0).reserve();
        theatre.displaySeats();
        displaySeats(copy);
    }

    private static void displaySeats(List<Seat> copy) {
        System.out.println("Seats in copy..");
        for(Seat s: copy){
            System.out.println(s);
        }
        System.out.println();
    }
}
