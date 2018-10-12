package recursion.addnumbers;

public class Algorithm {

    public int sumIterative(int N) {
        int result = 0;
        for (int i = 1; i <= N; i++) {
            result = result + i;
        }
        return result;
    }

    public int sumRecursive(int N){
        //WHAT'S THE BASE CASE?
        if(N <= 1) return 1;


        //IS THIS STATE?
        System.out.println("Performing recursiveCall("+N+")");

        //WHAT'S THE RECURSIVE CALL AND SUB-PROBLEM
        //HOW DO WE "STACK' RECURSIVE CALLS WITH SUB-PROBLEMS
        return sumRecursive(N-2) +  N;

    }
}
