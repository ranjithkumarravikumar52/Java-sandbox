package collections.main;

import java.util.LinkedList;
import java.util.List;

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
//        System.out.println("Min value(by seat name) " +Collections.min(theatre.getSeats()).getSeatNumber());
//        System.out.println("Max value(by seat name) " +Collections.max(theatre.getSeats()).getSeatNumber());
//
//        System.out.println();
//        Collections.swap(theatre.getSeats(), 0, theatre.getSeats().size() - 1);
//        theatre.displaySeats();

        List<Seat> newList = new LinkedList<>(theatre.getSeats());
//        Collections.copy(newList, theatre.getSeats());

        newList.get(0).reserve();

        for(Seat s: newList){
            System.out.println(s+" ");
        }
        System.out.println();
        theatre.displaySeats();

    }
}
