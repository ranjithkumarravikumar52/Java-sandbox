package dateandtime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class App {

    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2017, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2017, Month.APRIL, 3);

//        System.out.println(start.toEpochDay()+" days");

        cleanAnimalCage(start,end);
    }

    /**
     * Clean the cage for every month
     *
     * @param start
     * @param end
     */
    public static void cleanAnimalCage(LocalDate start, LocalDate end) {

        Period period = Period.ofDays(5);

        while (start.isBefore(end)) {
            System.out.println("Need to clean the cage on: " + start);
            start = start.plus(period);
        }
    }
}


