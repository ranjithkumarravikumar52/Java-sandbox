package collections.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("AMC Charlotte", 4, 3);
//        theatre.displaySeats();
        theatre.reserveSeat("C01");
//        theatre.displaySeats();

//      The Collection interface is used to pass around collections of objects where maximum generality is desired.
//      For example, by convention all general-purpose collection implementations have a constructor that takes a Collection argument.
        List<Seat> seatList = new ArrayList<>(theatre.getSeats());
//        for (Seat seat : seatList) {
//            System.out.println("seat = " + seat);
//        }

        Object[] seats =  seatList.toArray();
        for(int i =0; i < seats.length; i++){
            System.out.println("seats = " + seats[i]);
        }

    }
}
