package dateandtime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class App {

    public static void main(String[] args) {
//        periods();
        //format date and time
        LocalDate date = LocalDate.of(2011, Month.AUGUST, 4);
        LocalTime localTime = LocalTime.of(14, 56, 32);
        LocalDateTime localDateTime = LocalDateTime.of(date, localTime);

        //format type
//        System.out.println(localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
//        System.out.println(localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE));
//        System.out.println(localDateTime.format(DateTimeFormatter.ISO_LOCAL_TIME));

        //format length
//        System.out.println(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL).format(localDateTime));
//        System.out.println(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG).format(localDateTime));
        System.out.println(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).format(localDateTime));
        System.out.println(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).format(localDateTime));

        //custom format
        DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("dd MM YYYY, hh:mm:ss a");
        System.out.println(customFormatter.format(localDateTime));

        //parse date of the type String
        String userInputDate = "1992/08/04";
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("YYYY MM dd");
        userInputDate = userInputDate.replaceAll("[/]", " ");

        LocalDate date1 = LocalDate.parse(userInputDate, customFormatter);
        System.out.println(date1);
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


