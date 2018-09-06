package concurrency.parallelcomputing.divisors.util;

public class DivisorCalculation {

    /**
     * Counts number of divisors for a given non-negative number
     *
     * @param number
     * @return 0 if number is 0, -1 if number is a negative number, positive number with a count for the total number of divisors for a given count
     */
    public static int countDivisorsOfANumber(int number) {
        if (number == 0) {
            return 0;
        }
        if (number < 0) {
            return -1;
        }

        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        return count;
    }

    /**
     * Data range is between minNumber inclusive and maxNumber inclusive
     * @param minNumber
     * @param maxNumber
     * @return
     */
    public static int countHighestDivisorCount(int minNumber, int maxNumber){

        if((minNumber < 0 || maxNumber < 0) || (maxNumber - minNumber) < 0){
            return -1;
        }

        int max = Integer.MIN_VALUE;
        int count = 0;

        for(int i = minNumber; i <= maxNumber; i++){
            count = Integer.max(countDivisorsOfANumber(i), max);
        }

        return count;
    }

    /**
     * returns the number of the first highestDivisorCount
     * @param minNumber
     * @param maxNumber
     * @return
     */
    public static int getHighestDivisorCountInARange(int minNumber, int maxNumber){
        if((minNumber < 0 || maxNumber < 0) || (maxNumber - minNumber) < 0){
            return -1;
        }

        int highestDivisorCountNumber = Integer.MIN_VALUE;
        int maxCounter = 0;

        for(int i = minNumber; i <= maxNumber; i++){
            int count = countDivisorsOfANumber(i);
            if(count > maxCounter){
                maxCounter = count;
                highestDivisorCountNumber = i;
            }
        }

        return highestDivisorCountNumber;
    }
}
