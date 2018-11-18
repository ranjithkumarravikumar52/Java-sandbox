package collections.basicoperations;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        //1. append a specified element at the end of a hash set
        Set<String> set  = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("E");

        //to convert our hashset to an array
        String[] strings = new String[set.size()];
        set.toArray(strings);
        System.out.println(Arrays.toString(strings));
    }
}
