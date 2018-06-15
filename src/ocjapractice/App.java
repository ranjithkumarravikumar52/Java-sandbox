package ocjapractice;

public class App {
    public static void main(String[] args) {
        /*str.length()
        str.charAt(i)
        str.indexOf('char')
        str.indexOf('char', fromIndex: 2)
        str.substring(start)
        str.substring(start, end) //test the range of start, end
        str.toUpperCase
        str.toLowerCase
        str.equals()
        str.equalsIgnoreCase()
        str.startsWith()
        str.endsWith()
        str.contains()
        str.replace(oldChar, newChar)
        str.replace(stringVariable, stringVariable)
        str.replace(literal, literal)
        str.trim() - removes starting and ending empty spaces*/

        String hello = " Hello World, This is Java Speaking                                         ";

        //length
        System.out.println(hello.length());

        //charAt
        System.out.println(hello.charAt(hello.length()/3));

        //substring
        System.out.println(hello.substring(10));
        System.out.println(hello.substring(10, 15));
        System.out.println(hello.substring(10, 10));

        //lower and upper cases
        System.out.println("Lower case: "+ hello.toLowerCase());
        System.out.println("Upper case: "+ hello.toUpperCase());
        System.out.println();

        //equals - expected to have tricky questions here
        /*String fakeHello = hello;
        System.out.println("hello.equals(fakeHello) "+hello.equals(fakeHello));
        System.out.println("fakeHello.equals(hello) "+fakeHello.equals(hello));
        System.out.println();*/

        //changing fakeHello to check if hello changes
        /*hello = hello.trim();
        System.out.println("hello.equals(fakeHello) "+hello.equals(fakeHello));
        System.out.println("fakeHello.equals(hello) "+fakeHello.equals(hello));
        System.out.println("fakeHello = " + fakeHello.length());
        System.out.println("hello = " + hello.length());*/

        System.out.println(hello.trim().equals(hello.trim()));

        System.out.println(hello.startsWith(" "));
        System.out.println(hello.endsWith(" "));

        System.out.println(hello.contains("T"));
        System.out.println(hello.replace('T', '?'));
        String var1 = "This";
        String var2 = "WAHAT";

        System.out.println(hello.replace(var1, var2));



    }
}
