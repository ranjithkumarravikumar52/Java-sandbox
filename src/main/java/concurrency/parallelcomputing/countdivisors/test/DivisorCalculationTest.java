package concurrency.parallelcomputing.countdivisors.test;

import concurrency.parallelcomputing.countdivisors.util.DivisorCalculation;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DivisorCalculationTest {

    @Test
    public void count_Divisors_Of_A_Number_Test_Zero() {
        assertEquals(0, DivisorCalculation.countDivisorsOfANumber(0));
    }

    @Test
    public void count_Divisors_Of_A_Number_Test_Negative_Number() {
        assertEquals(-1, DivisorCalculation.countDivisorsOfANumber(-10));
    }

    @Test
    public void count_Divisors_Of_A_Number_Test_1() {
        assertEquals(1, DivisorCalculation.countDivisorsOfANumber(1));
    }

    @Test
    public void count_Divisors_Of_A_Number_Test_2() {
        assertEquals(2, DivisorCalculation.countDivisorsOfANumber(2));
    }

    @Test
    public void count_Divisors_Of_A_Number_Test_3() {
        assertEquals(2, DivisorCalculation.countDivisorsOfANumber(3));
    }

    @Test
    public void count_Divisors_Of_A_Number_Test_4() {
        assertEquals(3, DivisorCalculation.countDivisorsOfANumber(4));
    }

    @Test
    public void count_Highest_Divisor_Count_0_0(){
        assertEquals(0, DivisorCalculation.countHighestDivisorCount(0, 0));
    }

    @Test
    public void count_Highest_Divisor_Count_minMaxDifferenceIsNegative(){
        assertEquals(-1, DivisorCalculation.countHighestDivisorCount(-1, 10));
    }

    @Test
    public void count_Highest_Divisor_Count_maxIsLessThanMin(){
        assertEquals(-1, DivisorCalculation.countHighestDivisorCount(10, 7));
    }

    @Test
    public void count_Highest_Divisor_Count_Positive_Test_Case_0(){
        assertEquals(2, DivisorCalculation.countHighestDivisorCount(1, 2));
    }

    @Test
    public void count_Highest_Divisor_Count_Positive_Test_Case_1(){
        assertEquals(2, DivisorCalculation.countHighestDivisorCount(1, 3));
    }

    //getHighestDivisorCountInARange
    @Test
    public void getHighestDivisorCountInARange_Negative_Test_Case_0(){
        assertEquals(-1, DivisorCalculation.getHighestDivisorCountInARange(-1, -1));
    }

    @Test
    public void getHighestDivisorCountInARange_Negative_Test_Case_1() {
        assertEquals(-1, DivisorCalculation.getHighestDivisorCountInARange(7, 5));
    }

    @Test
    public void getHighestDivisorCountInARange_Negative_Test_Case_2() {
        assertEquals(6, DivisorCalculation.getHighestDivisorCountInARange(5 , 7));
    }

    @Test
    public void getHighestDivisorCountInARange_Negative_Test_Case_3() {
        assertEquals(2, DivisorCalculation.getHighestDivisorCountInARange(1, 3));
    }

    @Test
    public void getHighestDivisorCountInARange_Postive_Test_Case_1() {
        assertEquals(4, DivisorCalculation.getHighestDivisorCountInARange(1, 5));
    }
}