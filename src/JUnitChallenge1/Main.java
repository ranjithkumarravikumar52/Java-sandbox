package JUnitChallenge1;

public class Main {

    public static void main(String[] args) {
        Utilities util = new Utilities();

        //Input: h, e, l, l, o; n = 2
        char[] input = {'h', 'e', 'l', 'l', 'o'};
        int n = 2;

        //expected: e, l
        char[] output = {'e', 'l'};

        //test
        System.out.println(util.everyNthChar(input, n));
    }
}
