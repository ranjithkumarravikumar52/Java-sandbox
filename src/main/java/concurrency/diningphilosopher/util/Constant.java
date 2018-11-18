package concurrency.diningphilosopher.util;

/**
 * This class is used for accessing our Constant used for running our simulation. <br>
 * Does this mean we can allow for instantiation? Nope.
 */
public class Constant {

    public static final int NUMBER_OF_PHILOSOPHERS = 5;
    public static final int NUMBER_OF_CHOPSTICKS = 5;
    public static final int SIMULATION_RUNTIME = 30 * 1000; //time in ms
    private Constant() {

    }

}
