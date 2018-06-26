package collections.main;

public class App {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("AMC Charlotte", 4, 3);
//        theatre.displaySeats();
        theatre.reserveSeat("C01");
        theatre.displaySeats();


    }
}
