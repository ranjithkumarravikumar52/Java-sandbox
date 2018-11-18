package collections.main;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class App {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("AMC Charlotte", 10, 10);

        printSeatsUsingFunctionalPredicate(theatre,
                s -> s.getSeatNumber().equals("B10"),
                s -> System.out.println(s));
    }


    /**
     * Approach 1: Create Methods That Search for Members That Match One Characteristic using naive approach
     */
/*    private static void printSeatsByExactPrice(Theatre theatre, double price){
        for (Seat s: theatre.getSeats()){
            if(s.getPrice() == price){
                System.out.println(s);
            }
        }
    }*/

    /**
     * Approach 3: Specify search criteria code using local class
     *
     * Process: Instead of creating one specific method for each search criteria, here we use the help of local class and an interface. The class that implements the interface defines the search criteria that we wanna use. In addition, when we call the method, we need to pass the object that implements the interface.
     * <br>
     *     This approach still has a overhead of creating a class, interface. This can be avoided by using anonymous class
     */
   /* private static void printSeats(Theatre theatre, CheckSeat tester){
        for(Seat s: theatre.getSeats()){
            if (tester.test(s)) {
                System.out.println(s);
            }
        }
    }

    @Override
    public boolean test(Seat seat) {
        return seat.getPrice() == 14.0;
    }*/

    /**
     * Approach 4: Specify Search Criteria Code in an
     *
     * <br>
     *     This approach is much better than using local class and interface. Less code and flexibility to add your search criteria
     */
   /* private static void printSeatsUsingAnonymousInnerClass(Theatre theatre, CheckSeat c1){
        for(Seat s: theatre.getSeats()){
            if(c1.test(s)){
                System.out.println(s);
            }
        }
    }*/

    /**
     * Approach 5: Specify search criteria using Functional predicate from Java JDK
     */
    private static void printSeatsUsingFunctionalPredicate(Theatre theatre, Predicate<Seat> seatPredicate, Consumer<Seat> block) {
        for (Seat s : theatre.getSeats()) {
            if (seatPredicate.test(s)) {
                block.accept(s);
            }
        }
    }

}
