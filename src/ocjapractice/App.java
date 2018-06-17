package ocjapractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App {

    public static void main(String[] args) {

        //nested for-loop
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++) {
                System.out.println("i = " + i + ", j = " + j);
                //some other code goes here
            }

        System.out.println();

        //nested for-loop
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 2; j++) {
                System.out.println("i = " + i + ", j = " + j);
                //some other code goes here
            }
        }

    }

    private static void initMutliDimenArray() {
        //create and initialize a 1-d array
        int[] oneD = new int[]{
                1, 2, 3, 4
        };

        //create and initialize a 2-d array
        int[][] twoD = new int[][]{
                {1, 2, 3},
                {4, 5, 6}
        };

        //create and initialize a 3-d array
        //3d    -> an array of 2-d arrays
        //      -> an array of (an array of 1-d arrays)
        int[][][] threeD = new int[][][]{
                {{1, 2, 3}, {4, 5, 6}},
                {{7, 8, 9}}, {{10, 11, 12}}
        };
    }

    private static int count(boolean b, boolean... booleans) {
        System.out.println("b = " + booleans.length);
        return booleans.length;
    }


    private static int[] doSomething(int[] ints) {
        ints = new int[]{1, 2, 3, 4, 5, 6, 6, 7};
        return ints;
    }

    private static void arrayList() {
        List<String> strings = new ArrayList<>();

        strings.add("Pug");
        strings.add("Husky");
        strings.add("Doberman");


//        System.out.println("strings = " + strings+"\n");
//
//        for (int i = 0; i < strings.size(); i++) {
////            System.out.println("strings["+i+"] = " + strings.get(i));
//            strings.remove(i);
//        }
//
//        System.out.println(strings);

//        for(String s: strings){
//            strings.remove(s);
//        }


        for (Iterator<String> stringIterator = strings.iterator(); stringIterator.hasNext(); ) {
            System.out.println(stringIterator.next());
        }
    }

    private static void strings() {
        String[] strings = {"John", "Jim", "Jack"};
        int[] ints = {1, 2, 3};

        for (String s : strings) {
            for (int i : ints) {
                System.out.println("Inside inner loop -> " + i);
                if (s.equals("Jim")) {
                    continue;
                }
                System.out.print(s + " ");
                System.out.print(i + "\n");
            }
            System.out.println();
        }
    }

    private static void ocjaStrings() {
        /*str.length()
        str.charAt(i)
        str.indexOf('char')
        str.indexOf('char', fromIndex: 2)
        str.substring(start)
        str.substring(start, end) //test the range of start, end
        str.toUpperCase
        str.toLowerCase
        str.equals()
        str.equalsIgnoreCase()
        str.startsWith()
        str.endsWith()
        str.contains()
        str.replace(oldChar, newChar)
        str.replace(stringVariable, stringVariable)
        str.replace(literal, literal)
        str.trim() - removes starting and ending empty spaces*/

        String hello = " Hello World, This is Java Speaking                                         ";

        //length
        System.out.println(hello.length());

        //charAt
        System.out.println(hello.charAt(hello.length() / 3));

        //substring
        System.out.println(hello.substring(10));
        System.out.println(hello.substring(10, 15));
        System.out.println(hello.substring(10, 10));

        //lower and upper cases
        System.out.println("Lower case: " + hello.toLowerCase());
        System.out.println("Upper case: " + hello.toUpperCase());
        System.out.println();

        //equals - expected to have tricky questions here
        /*String fakeHello = hello;
        System.out.println("hello.equals(fakeHello) "+hello.equals(fakeHello));
        System.out.println("fakeHello.equals(hello) "+fakeHello.equals(hello));
        System.out.println();*/

        //changing fakeHello to check if hello changes
        /*hello = hello.trim();
        System.out.println("hello.equals(fakeHello) "+hello.equals(fakeHello));
        System.out.println("fakeHello.equals(hello) "+fakeHello.equals(hello));
        System.out.println("fakeHello = " + fakeHello.length());
        System.out.println("hello = " + hello.length());*/

        System.out.println(hello.trim().equals(hello.trim()));

        System.out.println(hello.startsWith(" "));
        System.out.println(hello.endsWith(" "));

        System.out.println(hello.contains("T"));
        System.out.println(hello.replace('T', '?'));
        String var1 = "This";
        String var2 = "WAHAT";

        System.out.println(hello.replace(var1, var2));
    }
}
