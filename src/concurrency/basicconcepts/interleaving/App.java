package concurrency.basicconcepts.interleaving;

/**
 * Laying foundation to the concept of synchronization. To appreciate the understanding of synchronization, we need to understand the concept of "interleaving" <br><br>
 * Interleaving happens when multiple threads have access to a same resource allowing inconsistent modification when acted together (Not thread-safe)<br><br>
 */
public class App {
    public static int counter = 0;

    public static void process()  {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                increment();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                increment();
            }
        });

        //start two threads
        t1.start();
        t2.start();

        //main thread wait till t1 and t2 gets executed
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    private static void increment() {
        counter++;
    }

    public static void main(String[] args){
        process();
        System.out.println(counter); //notice how counter sometimes doesn't get equal to 200 (check for huge data-input like 20000) because of interleaving
    }
}
