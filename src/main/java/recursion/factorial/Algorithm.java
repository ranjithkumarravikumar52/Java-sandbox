package recursion.factorial;

public class Algorithm {
    long iterativeFactorial(long n){
        long product = 1;
        if(n == 0 || n == 1){
            return 1;
        }
        for(long i = 2; i <=n; i++){
            product = product * i;
        }
        return product;
    }

    long recursiveFactorial(long n){
        if(n == 0 || n == 1){
            return 1;
        }
        return n * recursiveFactorial(n - 1);
    }
}
