package collections.main;

import java.util.Comparator;

public class Seat implements Comparable<Seat> {

    static final Comparator<Seat> SEAT_COMPARATOR_PRICE = Comparator.comparingDouble(Seat::getPrice);
    private String seatNumber;
    private double price;
    private boolean reserved;

    public Seat(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public Seat(String seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
        reserved = false;
    }

    private String getSeatNumber() {
        return seatNumber;
    }

    private double getPrice() {
        return price;
    }

    boolean isReserved() {
        return reserved;
    }

    boolean reserve() {
        if (!reserved) {
            reserved = true;
//            System.out.println("seatNumber = " + seatNumber + " is reserved");
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
        return seatNumber + ", " + price + ", " + reserved + "; ";
    }

    @Override
    public int compareTo(Seat o) {
        return this.seatNumber.compareToIgnoreCase(o.getSeatNumber());
    }


}
