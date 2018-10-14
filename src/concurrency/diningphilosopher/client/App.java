package concurrency.diningphilosopher.client;


import concurrency.diningphilosopher.domain.Chopstick;
import concurrency.diningphilosopher.domain.Philosopher;
import concurrency.diningphilosopher.util.Constant;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * The best way to create and manipulate multiple threads is by using ExecutorService class. Brush up on this concept if your knowledge is little rusty. But this pretty important. <br>
 */
public class App {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = null;
        Philosopher[] philosophers = null;
        Chopstick[] chopsticks = null;

        try{

            philosophers = new Philosopher[Constant.NUMBER_OF_PHILOSOPHERS];
            chopsticks = new Chopstick[Constant.NUMBER_OF_CHOPSTICKS];

            //initializing chopsticks with their id.
            for(int i = 0; i < Constant.NUMBER_OF_CHOPSTICKS; i++){
                chopsticks[i] = new Chopstick(i);
            }

            executorService = Executors.newFixedThreadPool(Constant.NUMBER_OF_PHILOSOPHERS);
            //left chopstick is the current index, and right chopstick is the next index
            for(int i = 0; i < Constant.NUMBER_OF_PHILOSOPHERS; i++){
                philosophers[i] = new Philosopher(i, chopsticks[i], chopsticks[(i+1) % Constant.NUMBER_OF_CHOPSTICKS]);
                executorService.execute(philosophers[i]);
            }

            Thread.sleep(Constant.SIMULATION_RUNTIME);

            //the simulation ends for a philosopher when he's full
            for(Philosopher p : philosophers){
                p.setFull(true);
            }


        }finally{
            executorService.shutdown();
            while(!executorService.isTerminated()){
                Thread.sleep(1000);
            }

            for(Philosopher p: philosophers)
                System.out.println(p + " ate: "+p.getEatCounter()+" times");
        }
    }
}
