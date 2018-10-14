package concurrency.diningphilosopher.domain;

import concurrency.diningphilosopher.util.State;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Consider this class a finite resource handling multiple requests. This will be your resource class.<br>
 * For a resource class we always need a Lock member variable. <br><br>
 * For this concurrent problem, we will be using Resource Hierarchy solution (partial ordering of resources). Hence we need id.
 */
public class Chopstick {
    private int id;
    private Lock lock;

    /**
     * We use reentrant lock in our simulation as it helps in acquiring and releasing in a completely different methods, unlike synchronized blocks where are locks are acquired and released in the same method<br><br>
     *
     * @param id We can't allow instantiation of Chopstick class without assigning an id to it
     */
    public Chopstick(int id) {
        this.id = id;
        lock = new ReentrantLock();
    }

    /**
     * Chopsticks can be picked up or put down by a philosopher. <br>
     * But is it going to be any chopstick across the table? <br>
     * No. A Philosopher can pick up only chopsticks adjacent to their plate (left or right chopsticks).<br>
     * How do we design these two methods now? HUEHUEHUE :)<br>
     * So, let's assume we are allowing a philosopher to pick up a chopstick for 10ms<br>
     * This means, within 10ms, if we are not able to acquire a chopstick then we return false>br>
     */
    public boolean pickUp(Philosopher philosopher, State state) throws InterruptedException {
        if (lock.tryLock(10, TimeUnit.MILLISECONDS)) {
//            System.out.println(philosopher + "picked up " + state.toString() + " " + this);
            return true;
        }
        return false;
    }

    /**
     * For this method, we just have to release the lock acquired by a philosopher<br>
     */
    public void putDown(Philosopher philosopher, State state) {
        lock.unlock();
//        System.out.println(philosopher + " put down " + this);
    }

    @Override
    public String toString() {
        return "Chopstick" + id;
    }
}
