package collections.main;

import java.util.Objects;

public class Seat implements Comparable<Seat> {

    private String seatNumber;
    private boolean reserved;

    public Seat(String seatNumber) {
        this.seatNumber = seatNumber;
        reserved = false;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public boolean reserve() {
        if (!reserved) {
            reserved = true;
            System.out.println("seatNumber = " + seatNumber + " is reserved");
            return true;
        }
        System.out.println("Seat already reserved");
        return false;
    }

    public boolean cancel() {
        if (reserved) {
            reserved = false;
            System.out.println("seatNumber = " + seatNumber + " canceled");
            return true;
        }

        System.out.println("seatNumber = " + seatNumber + " is not reserved to cancel");
        return false;
    }


    @Override
    public String toString() {
        return "Seat{" +
                "seatNumber='" + seatNumber + '\'' +
                ", reserved=" + reserved +
                '}';
    }


    @Override
    public int compareTo(Seat o) {
        return this.seatNumber.compareToIgnoreCase(o.getSeatNumber());
    }

}
