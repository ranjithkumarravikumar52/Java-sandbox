package collections.main;

import java.util.*;

public class Theatre {
    private final String theatreName;
    private Collection<Seat> seats = new LinkedHashSet<>();

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

    public Collection<Seat> getSeats() {
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

   public void displaySeats(){
        for(Seat seatIndex: seats){
            System.out.println(seatIndex);
        }
   }
}
