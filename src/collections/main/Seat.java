package collections.main;

import java.util.Comparator;

public class Seat implements Comparable<Seat> {

    private String seatNumber;
    private double price;
    private boolean reserved;

    static final Comparator<Seat> SEAT_COMPARATOR_PRICE = new Comparator<Seat>() {
        @Override
        public int compare(Seat o1, Seat o2) {
            return Double.compare(o1.getPrice(), o2.getPrice());
        }
    };

    public Seat(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public Seat(String seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
        reserved = false;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public double getPrice() {
        return price;
    }

    public boolean isReserved() {
        return reserved;
    }

    public boolean reserve() {
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
        return seatNumber+", " + price +", "+ reserved+"; ";
    }

    @Override
    public int compareTo(Seat o) {
        return this.seatNumber.compareToIgnoreCase(o.getSeatNumber());
    }



}
