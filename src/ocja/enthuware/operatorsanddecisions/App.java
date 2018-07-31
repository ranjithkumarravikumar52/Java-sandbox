package ocja.enthuware.operatorsanddecisions;


interface I {
}

public class App {

    public static void main(String[] args) {
        System.out.println(new App().parseFloat("2"));
    }

    private float parseFloat(String s){
        float f = 0.0f;      // 1
        try{
            f = Float.valueOf(s);    // 2
//            return f ;      // 3
        }
        catch(NumberFormatException nfe){
            f = Float.NaN ;    // 4
            return f;     // 5
        }
        finally {
            return f;     // 6
        }
//        return f ;    // 7 unreachable code
    }


}


