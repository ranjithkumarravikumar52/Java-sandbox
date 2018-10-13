package concurrency.parallelcomputing.countdivisors.main;

import java.util.*;

import static concurrency.parallelcomputing.countdivisors.util.DivisorCalculation.countHighestDivisorCount;
import static concurrency.parallelcomputing.countdivisors.util.DivisorCalculation.getHighestDivisorCountInARange;

public class App {

    public static List<Integer> countList = new Vector<>();
    public static List<Integer> numberList = new Vector<>();
    public static int minNumber = 1;
    public static int maxNumber = 100_000;

    public static void main(String[] args) throws InterruptedException {
//        int minNumber = askUserMinValueInDataRange();
//        int maxNumber = askUserMaxValueInDataRange(minNumber);

        System.out.println("Number of available processors: " + Runtime.getRuntime().availableProcessors());

        long startTime = System.currentTimeMillis();

        //partition the given range in 10 numbers each
        parallelComputationByPartition(minNumber, maxNumber);
//        Thread.sleep(5000);
//        System.out.println("Max count: " + Collections.max(countList));
//        System.out.println("Max number: " + Collections.max(numberList));

        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("elapsedTime = " + elapsedTime);
    }

    private static void parallelComputationByPartition(int minNumber, int maxNumber) {
        while(minNumber + 10 <= maxNumber){
            int finalMinNumber = minNumber;
            new Thread(() -> {
                countList.add(countHighestDivisorCount(finalMinNumber, finalMinNumber + 10));
                numberList.add(getHighestDivisorCountInARange(finalMinNumber, finalMinNumber + 10));
            }).start();
            minNumber += 10;
        }
        if(maxNumber - minNumber > 0){
            int finalMinNumber1 = minNumber;
            new Thread(() -> {
                countList.add(countHighestDivisorCount(finalMinNumber1, maxNumber));
                numberList.add(getHighestDivisorCountInARange(finalMinNumber1, maxNumber));
            }).start();
        }
    }

    private static int askUserMaxValueInDataRange(int minNumber) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the max number in the data range");
        int max = scanner.nextInt();
        if (max < 0 || (max - minNumber) < 0) {
            return -1;
        }
        return max;


    }

    private static int askUserMinValueInDataRange() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the min number in the data range");
        int min = scanner.nextInt();
        if (min < 0) {
            return -1;
        }
        return min;

    }


}
