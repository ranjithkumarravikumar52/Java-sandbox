package concurrency.basicconcepts.threadsrunnable;


import concurrency.util.ThreadColor;

class Runner1 implements Runnable {

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println(ThreadColor.ANSI_BLUE + "Runner1: " + i);
        }

    }
}

class Runner2 implements Runnable {

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println(ThreadColor.ANSI_RED + "Runner2: " + i);
        }

    }
}


/**
 * Basic program to launch into multi-threading/concurrency concepts, and we start with an understanding of how sequential execution works. <br><br>
 * Once sequential execution concepts is well-laid, we jump into next application where we start with multi-threading concepts <br><br>
 * Looking at the output, we get runner1 and then followed by runner2. <br><br>
 * But how do we get parallel execution? <br><br>
 * It's pretty simple. Implement Runnable interfaces for both classes Runner1 and Runner2. <br><br>
 * Override their run(). Using start() will create new 2 distinct threads that prints out "i" value simultaneously (random order) <br><br>
 *     NOTE: There is a subtle difference in thread creation using runnable interfaces vs extending thread class.<br><br>
 *         Thread t1 = new Thread(new Runner1()); //where new Runner1() is an class object that implements Runnable Interface
 */
public class App {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runner1());
        Thread t2 = new Thread(new Runner2());

        t1.start();
        t2.start();
    }
}

