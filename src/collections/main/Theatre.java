package collections.main;

import java.util.ArrayList;
import java.util.List;

public class Theatre {
    private final String theatreName;
    private List<Seat> seats = new ArrayList<>();

    public Theatre(String theatreName, int numRows, int seatsPerRow) {
        this.theatreName = theatreName;

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

    public boolean reserveSeat(String seatNumber) {
        Seat requestedSeat = searchSeat(seatNumber);
        if (requestedSeat == null) {
            System.out.println("seat " + seatNumber + " not found!");
            return false;
        }
        return requestedSeat.reserve();

    }

    private Seat searchSeat(String seatNumber) {
        Seat requestedSeat = null;
        for (Seat seatIndex : seats) {
            if (seatIndex.getSeatNumber().equals(seatNumber)) {
                requestedSeat = seatIndex;
                break;
            }
        }
        return requestedSeat;
    }
}
