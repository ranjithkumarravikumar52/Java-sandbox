package concurrency.basicconcepts.volatileconcepts;

import concurrency.util.ThreadColor;

/**
 * Volatile keyword makes the variable to be stored in the MAIN memory (where every thread can have access to) instead of a thread's cache memory<br><br>
 * <p>
 * But at the cost of slower performance. But helps in maintaining a common memory across all the threads. <br><br>
 * Example: States of threads can be maintained by using a boolean variable called isTerminated.
 *
 * <br><br>
 *     Kind of difficult to recreate
 */
public class volatileClass {
    public static void main(String[] args) throws InterruptedException {
        Worker worker1 = new Worker();
        Thread t1 = new Thread(worker1);
        Thread t2 = new Thread(() -> worker1.setTerminated(true));
        t1.start();
        t2.start();

        //gives mainthread some time to allow t1 to run
        Thread.sleep(3000);
//        worker1.setTerminated(true);

        System.out.println(ThreadColor.ANSI_GREEN + worker1.getCount()+" executed");
    }
}

class Worker implements Runnable {

    private boolean isTerminated = false;
    private int count;

    @Override
    public void run() {
        while (!isTerminated) {
            System.out.println(ThreadColor.ANSI_BLUE + "Hello from worker class");

            //to slow the output - laying foundation to understand volatile concepts
            try {
                Thread.sleep(3);
                count++;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public boolean isTerminated() {
        return isTerminated;
    }

    public void setTerminated(boolean terminated) {
        isTerminated = terminated;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
