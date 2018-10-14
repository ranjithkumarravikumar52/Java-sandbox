package recursion.factorial;

public class App {
    public static void main(String[] args) {
        try{
            Algorithm algorithm = new Algorithm();
            long startTime = System.currentTimeMillis();
            System.out.println(algorithm.recursiveFactorial(30));
            long elapsedTime = System.currentTimeMillis();
            final long totalTime = elapsedTime - startTime;
            System.out.println("Total Time (Recursion): " + totalTime);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
