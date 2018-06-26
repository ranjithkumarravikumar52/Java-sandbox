package collections.main;

public class App {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("AMC Charlotte", 4, 3);
        theatre.displaySeats();
        System.out.println(theatre.reserveSeat("D03"));
        System.out.println(theatre.reserveSeat("D03"));
    }
}
