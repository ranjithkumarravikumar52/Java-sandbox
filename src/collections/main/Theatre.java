package collections.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * When the following Concrete classes are used, it assigns values based on the underlying data structure
 * <ul>
 * <li>HashSet - unordered</li>
 * <li>LinkedHashSet - ordered</li>
 * <li>ArrayList - ordered</li>
 * <li>LinkedList - ordered</li>
 * <li>ArrayDeque - ordered</li>
 * <li>TreeSet - ordered; error if Comparable interface is not implemented</li>
 * </ul>
 */
public class Theatre {
    private final String theatreName;
    private List<Seat> seats = new ArrayList<>();

    public Theatre(String theatreName, int numRows, int seatsPerRow) {
        this.theatreName = theatreName;
        initSeatsInTheatre(numRows, seatsPerRow);
    }

    private void initSeatsInTheatre(int numRows, int seatsPerRow) {
        for (char row = 'A'; row < 'A' + numRows; row++) {
            for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
                Seat seat = new Seat(row + String.format("%02d", seatNum));
                seats.add(seat);
            }
        }
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

    public boolean reserveSeat(String seatNumber) {
        Seat requestedSeat = searchSeat(seatNumber);
        if (requestedSeat == null) {
            System.out.println("seat " + seatNumber + " not found!");
            return false;
        }
        return requestedSeat.reserve();

    }

    /**
     * <p>This method is used to practice implementing any search algorithms to get our requested seat in shortest amount of time</p>
     * <p>In addition, to check for how a search algorithm works for different underlying data structure</p>
     *
     * @param seatNumber
     * @return
     */
    private Seat searchSeat(String seatNumber) {
        Seat requestedSeat = new Seat(seatNumber);
        int result = Collections.binarySearch(seats, requestedSeat);
        if (result >= 0) {
            return seats.get(result);
        } else {
            return null;
        }
    }

    public void displaySeats() {
        for (Seat seatIndex : seats) {
            System.out.println(seatIndex + " ");
        }
        System.out.println();
    }
}
