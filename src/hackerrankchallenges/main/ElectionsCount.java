package hackerrankchallenges.main;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ElectionsCount {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        String[] votes = null;

        for(String index: votes){
            if(!map.containsKey(index)){
                map.put(index, 1);
            }else{
                map.put(index, map.get(index)+ 1);
            }
        }

        //Getting highest count
        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();

        while(iterator.hasNext()){
            String firstCandidate = iterator.next();
            int firstCandidateCount = map.get(firstCandidate);

            //scan all the elements which matches firstCandidateCount

            while(iterator.hasNext()){
                String nextCandidate = iterator.next();
                int nextCandidateCount = map.get(nextCandidate);
                if(firstCandidateCount == nextCandidateCount){
                    //do nothing
                }
                if(firstCandidateCount > nextCandidateCount){
//                    return firstCandidate;
                }
            }
        }
    }
}
