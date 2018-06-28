package innerclasses.main;

public class App {
    public static void main(String[] args) {
        Gearbox mcLaren = new Gearbox(6);

        //how to create gear class
        Gearbox.Gear firstGear = mcLaren.new Gear(1, 12.3);
        System.out.println(firstGear.driveSpeed(1000));

//        Gearbox.Gear secondGear = new Gearbox.Gear(.1, 12.3); //not an enclosing class error


    }
}
