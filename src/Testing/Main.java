package Testing;

public class Main {

    public static void main(String[] args) {
        StringUtilities utils = new StringUtilities();
        StringBuilder sb = new StringBuilder();

        //runs this code to yield error.
        while (sb.length() < 10) {
            utils.addChar(sb, 'a');
        }
        System.out.println(sb);
    }
}
