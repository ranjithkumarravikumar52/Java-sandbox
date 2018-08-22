package collections.main;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
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
    private List<Seat> seats = new LinkedList<>();

    public Theatre(String theatreName, int numRows, int seatsPerRow) {
        this.theatreName = theatreName;
        initSeatsInTheatre(numRows, seatsPerRow);
    }

    private void initSeatsInTheatre(int numRows, int seatsPerRow) {
        for (char row = 'A'; row < 'A' + numRows; row++) {
            for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {

                double price = 12.00;

                if ((row < 'D') && (seatNum >= 4 && seatNum <= 9)) {
                    price = 14.00;
                } else if ((row > 'F') || seatNum < 4 || seatNum > 9) {
                    price = 7.00;
                }

                Seat seat = new Seat(row + String.format("%02d", seatNum), price);
                seats.add(seat);
            }
        }


    }

    public List<Seat> getSeats() {
        return seats;
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

    private void displaySeats() {
        seats.forEach(System.out::println);
        System.out.println();
    }

    /**
     * Implemented using anonymous class
     */
    public void displaySeatsByPrice() {
        this.seats.sort(Seat.SEAT_COMPARATOR_PRICE);
        System.out.println("DISPLAY BY PRICE");
        System.out.println("================");
        displaySeats();
    }

    public void displaySeatsBySeatNumber() {
        Collections.sort(seats);
        System.out.println("DISPLAY BY SEAT NUMBER");
        System.out.println("======================");
        displaySeats();
    }

    /**
     * Practice to implement comparator by reservation
     */
    public void displaySeatsByReservation() {
        final Comparator<Seat> seatComparator = (o1, o2) ->
                Boolean.compare(o1.isReserved(), o2.isReserved());
        seats.sort(seatComparator);
        System.out.println("DISPLAY SEATS BY RESERVATION");
        System.out.println("============================");
        displaySeats();
    }
}
