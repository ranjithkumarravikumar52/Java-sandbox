package concurrency.basicconcepts.sequentialexecution;

import concurrency.util.ThreadColor;

class Runner1{
    public void startRunning(){
        for(int i = 0; i < 10; i++){
            System.out.println(ThreadColor.ANSI_BLUE+"Runner1: "+i);
        }
    }
}

class Runner2{
    public void startRunning(){
        for(int i = 0; i < 10; i++){
            System.out.println(ThreadColor.ANSI_RED+"Runner2: "+i);
        }
    }
}


/**
 * Basic program to launch into multi-threading/concurrency concepts, and we start with an understanding of how sequential execution works. <br>
 *     Once sequential execution concepts is well-laid, we jump into next application where we start with multi-threading concepts <br>
 *         Looking at the output, we get runner1 and then followed by runner2. But how do we get parallel execution?
 */
public class App {
    public static void main(String[] args) {
        Runner1 runner1 = new Runner1();
        Runner2 runner2 = new Runner2();
        runner1.startRunning();
        runner2.startRunning();
    }
}
