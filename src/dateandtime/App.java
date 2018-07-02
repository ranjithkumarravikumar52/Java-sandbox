package dateandtime;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class App {

    public static void main(String[] args) {
//        periods();
        //format date and time
        LocalDate date = LocalDate.of(2011, Month.AUGUST, 4);
        LocalTime localTime = LocalTime.of(14, 56, 32);
        LocalDateTime localDateTime = LocalDateTime.of(date, localTime);

        //format type
        System.out.println(localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        System.out.println(localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(localDateTime.format(DateTimeFormatter.ISO_LOCAL_TIME));
    }

    private static void periods() {
        LocalDate start = LocalDate.of(2017, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2017, Month.APRIL, 3);

//        System.out.println(start.toEpochDay()+" days");

        cleanAnimalCage(start, end);
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


