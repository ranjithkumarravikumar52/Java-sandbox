package hackerrankchallenges.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayLeftRotation {
    public static void main(String[] args) {
        int[] ints = { 1, 2, 3, 4, 5};
        int d = 4;

        System.out.println("Before Rotation");
        printArray(ints);

        int[] newInts = arrayLeftRotation(ints, d);
        System.out.println("After rotation");
        printArray(newInts);


    }

    private static int[] arrayLeftRotation(int[] old, int d) {
        int[] newInts = new int[old.length];
        for(int i = d, j = 0; j < old.length; i++, j++){
            newInts[j] = old[i];
            if(i == old.length - 1){
                i = -1;
            }
        }
        return  newInts;

    }

    private static void printArray(int[] ints) {
        for(int i: ints){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
