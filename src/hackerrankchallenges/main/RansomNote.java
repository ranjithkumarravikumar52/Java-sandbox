package hackerrankchallenges.main;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class RansomNote {
    public static void main(String[] args) {
        //we have the magazine which contains String[]

        //we have the ransom note which contains String[]

        //Two Strings are equal/YES if
        //case sensitive

//        String[] ransomNote = {
//                "give", "one", "grand", "today"
//        };

        String[] ransomNote = {
                "two", "times", "two", "is", "four"
        };

//        String[] magazine = {
//                "give", "me", "one", "grand", "today", "night"
//        };

        String[] magazine = {
                "two", "times", "three", "is", "not", "four"
        };

        /**
         * Optimised solution is
         * use HashMap to check the frequency count of each word in both the String Array
         *
         */
        System.out.println(optimised(ransomNote, magazine));

        //if not, false





    }

    private static String optimised(String[] ransomNote, String[] magazine) {
        Map<String, Integer> stringIntegerMapRansomNote = new LinkedHashMap<>();
        for(String a: ransomNote){
            stringIntegerMapRansomNote.put(a, stringIntegerMapRansomNote.get(a) == null ? 1 : stringIntegerMapRansomNote.get(a)+1);
        }

        Map<String, Integer> stringIntegerMapMagazine = new LinkedHashMap<>();
        for(String a: magazine){
            stringIntegerMapMagazine.put(a, stringIntegerMapMagazine.get(a) == null ? 1 : stringIntegerMapMagazine.get(a)+1);
        }


        for(String s : stringIntegerMapRansomNote.keySet()){
            if(stringIntegerMapMagazine.containsKey(s)){
                if(!stringIntegerMapRansomNote.get(s).equals(stringIntegerMapMagazine.get(s))){
                    return "fail";
                }
            }
        }
        return "YES";
    }

    private static String bruteForce(String[] ransomNote, String[] magazine) {

        for (String aRansomNote : ransomNote) {

            for (String aMagazine : magazine) {
                int counter = 0;
                if (aRansomNote.equals(aMagazine)) {
                    break;
                } else {
                    if (++counter == magazine.length) {
                        return "NO";
                    }
                }
            }
        }
        return "YES";
    }
}
