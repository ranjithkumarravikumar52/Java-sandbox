package concurrency.basicconcepts.join;

import concurrency.util.ThreadColor;

class Runner1 extends Thread {

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println(ThreadColor.ANSI_BLUE + "Runner1: " + i);
        }

    }
}

class Runner2 extends Thread {

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println(ThreadColor.ANSI_RED + "Runner2: " + i);
        }

    }
}


/**
 * INFORMATION TO BE READ BEFORE THE DAY OF THE INTERVIEW<br><br><hr>
 * Basic program to launch into multi-threading/concurrency concepts, and we start with an understanding of how sequential execution works. <br><br>
 * Once sequential execution concepts is well-laid, we jump into next application where we start with multi-threading concepts <br><br>
 * Looking at the output, we get runner1 and then followed by runner2. <br><br>
 * But how do we get parallel execution? <br><br>
 * It's pretty simple. Implement Runnable interfaces for both classes Runner1 and Runner2. <br><br>
 * Override their run(). Using start() will create new 2 distinct threads that prints out "i" value simultaneously (random order by TIME-SLICING) <br><br>
 * NOTE: There is a subtle difference in thread creation using runnable interfaces vs extending thread class.<br><br>
 * <ol>
 * <li>Thread t1 = new Thread(new Runner1()); //where new Runner1() is an class object that implements Runnable Interface<br>t1.start();</li>
 * <li>Runner1 runner1 = new Runner1(); <br>runner1.start();</li>
 * </ol><br><br>
 *  Notice how the main thread continues to execute when both runner1 and runner2 threads are continuing to execute? <br>How to do we make the main thread to wait till runner1 and runner2 threads are executed? <br><br>By using join(), notice how the "executed" statement in main-thread gets printed at last, after both threads get executed.
 */
public class App {
    public static void main(String[] args) throws InterruptedException {
        Runner1 runner1 = new Runner1();
        Runner2 runner2 = new Runner2();

        runner1.start();
        runner2.start();

        runner1.join();
        runner2.join();

        System.out.println(ThreadColor.ANSI_GREEN + "executed");
    }
}
