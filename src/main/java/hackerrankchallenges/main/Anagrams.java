package hackerrankchallenges.main;

import java.util.*;

public class Anagrams {
    public static void main(String[] args) {
        //we have to two Strings
        String a = "fcrxzwscanmligyxyvym";
        String b  = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";

        //sort

        //find the common characters in a given two strings
        //convert two Strings to char Array
        char[] aArray = a.toCharArray();
        char[] bArray = b.toCharArray();
        Arrays.sort(aArray);
        Arrays.sort(bArray);

        System.out.println(Arrays.toString(aArray));
        System.out.println(Arrays.toString(bArray));


        //use nested for loop to find the common character
        Map<Character, Integer> characterIntegerMap = new LinkedHashMap<>(a.length() + b.length());
        for(int i =0; i < aArray.length; i++){
            for(int j =0; j < bArray.length; j++){
                //if match found add it to HashMap<Character, Integer>
                if(aArray[i] == bArray[j]){
                    characterIntegerMap.put(aArray[i], (characterIntegerMap.get(aArray[i]) == null ? 1 : (characterIntegerMap.get(aArray[i])+1)));
                }
            }
        }

        //to get anagrams we have to delete un-common elements from both the Strings using the HashMap
        Set<Map.Entry<Character, Integer>> entrySet = characterIntegerMap.entrySet();
        Iterator<Map.Entry<Character, Integer>> characterIntegerIterator = entrySet.iterator();


        //take a integer counter to count the characters to be deleted as we make the comparisons
        int deleteCharCount = aArray.length + bArray.length;
        while(characterIntegerIterator.hasNext()){

            Character common = characterIntegerIterator.next().getKey();
            System.out.println("common = " + common);
            //check for String a
            for(int i =0; i < aArray.length; i++){
                if(aArray[i] != common){
                    deleteCharCount--;
                }
            }

            //check for string b
            for(int i =0; i < bArray.length; i++){
                if(bArray[i] != common){
                    deleteCharCount--;
                }
            }
        }

        //debug
        characterIntegerIterator = entrySet.iterator();
        while(characterIntegerIterator.hasNext()){
            System.out.println(characterIntegerIterator.next());
        }

        //print the integer counter
        System.out.println("deleteCharCount = " + deleteCharCount);

    }
}
