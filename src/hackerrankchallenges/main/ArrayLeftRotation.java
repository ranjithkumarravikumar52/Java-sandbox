package hackerrankchallenges.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayLeftRotation {
    public static void main(String[] args) {
        int[] a = new int[10];
        for(int i =0; i<a.length; i++){
            a[i] = i;
        }

//        //how to convert out int array to List
//        List<Integer> integerList = new ArrayList<>();
//        for(int i =0; i<a.length; i++){
//            integerList.add(a[i]);
//        }
//
//        //use collections rotate
//        Collections.rotate(integerList, 2);
//
//        //convert the list to int[]
//        Integer[] returnArray = new Integer[a.length];
//        returnArray = integerList.toArray(returnArray);
//
//        printArray(returnArray);


    }

    private static void printArray(int[] a) {
        for(int i =0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
    }
}
