package concurrency.multiplethreads;

import concurrency.util.ThreadColor;

/**
 * In this code, we gonna implement two threads that are going to countdown using a local variable
 */
public class App {
    public static void main(String[] args) throws InterruptedException {
        Countdown countdown = new Countdown();

        //create two threads (subclass of Thread method)
        CountdownThread thread1 = new CountdownThread(countdown);
        thread1.setName("Thread 1");
        CountdownThread thread2 = new CountdownThread(countdown);
        thread2.setName("Thread 2");

        thread1.start();
        thread2.start();


    }
}

class Countdown {
    private int i;

    public void doCountdown() {
        String color;

        switch (Thread.currentThread().getName()) {
            case "Thread 1":
                color = ThreadColor.ANSI_CYAN;
                break;
            case "Thread 2":
                color = ThreadColor.ANSI_PURPLE;
                break;
            default:
                color = ThreadColor.ANSI_GREEN;

        }
        //what is the common object shared by every thread
        synchronized(this){
            for (i = 10; i > 0; i--) {
                System.out.println(color + Thread.currentThread().getName() + ": " + i);
            }
        }

    }
}

/**
 * Class that extends Thread
 */
class CountdownThread extends Thread {
    private Countdown countdown;

    CountdownThread(Countdown countdown) {
        this.countdown = countdown;
    }

    public void run() {
        countdown.doCountdown();
    }
}
