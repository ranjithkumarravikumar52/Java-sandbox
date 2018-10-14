package concurrency.diningphilosopher.domain;

import concurrency.diningphilosopher.util.State;

import java.util.Random;

/**
 * This class acts as a resource-accessing class. <br>
 * So what could be the attributes of our Philosopher class?<br>
 * We need a id for naming our philosopher class, remember this solution is of the type "Resource-hierarchy" solution.
 * <br><br>
 * Philosophers here can hold chopsticks. So we need Chopsticks.
 * <br>
 * They can eat/think and they can also be full. Also we can check how many times they have been eating. <br>
 * Random is for giving random opportunities for a philosopher to eat or think<br><br>
 * Why do we need volatile for isFull? because we need a common memory access variable to check if a given philosopher is full from any current thread. <br>
 */
public class Philosopher implements Runnable {
    private int id;
    private Chopstick leftChopstick, rightChopstick;
    private Random random;
    private int eatCounter;
    private volatile boolean isFull = false;

    //A philosopher class can be created ONLY by assigning their ids and their respective Chopsticks
    public Philosopher(int id, Chopstick leftChopstick, Chopstick rightChopstick) {
        this.id = id;
        this.leftChopstick = leftChopstick;
        this.rightChopstick = rightChopstick;
        this.random = new Random();
    }


    /**
     * Initially, the philosopher will think for a while. Once he is done thinking, then he will check if the leftChopstick chopstick is available<br>
     * If the leftChopstick chopstick is available then he will check for the rightChopstick one<br>
     * Only when both are available, he can eat.
     */
    @Override
    public void run() {
        try {
            while (!isFull) {
                think();
                if (this.leftChopstick.pickUp(this, State.LEFT)) {
                    if (this.rightChopstick.pickUp(this, State.RIGHT)) {
                        eat();
                        this.rightChopstick.putDown(this, State.RIGHT);

                    }
                    this.leftChopstick.putDown(this, State.LEFT);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setFull(boolean isFull) {
        this.isFull = isFull;
    }

    public int getEatCounter() {
        return eatCounter;
    }

    /**
     * Philosopher will be eating any time between 0 - 1000 ms<br>
     */
    private void eat() throws InterruptedException {
//        System.out.println(this + " is eating...");
        this.eatCounter++;
        Thread.sleep(random.nextInt(1000));
    }

    /**
     * Philosopher will be thinking any time between 0 - 1000 ms<br>
     */
    private void think() throws InterruptedException {
//        System.out.println(this + " is thinking...");
        Thread.sleep(random.nextInt(1000));
    }

    @Override
    public String toString() {
        return "Philosopher{" +
                "id=" + id +
                '}';
    }
}
