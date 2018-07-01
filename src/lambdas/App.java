package lambdas;

public class App {
    public static void main(String[] args) {
        new Thread(new CodeRun()).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Printing from runnable using anonymous class");
            }
        }).start();

        //Every lambda expression contains three parts
        //1. arg list
        //2. arrow token
        //3. body
        new Thread(() -> System.out.println("Printing this using lambda")).start();

        //() -> System.out.println("Printing this using lambda")
        //1. empty arg list
        //2. arrow token
        //3. sout statement in the body

        //how to include multiple lines of code inside a lambda expression
        new Thread(() -> {
            System.out.println("Inside lambda expression");
            System.out.println("This is a second line inside lambda expression");
        }).start();
    }
}

class CodeRun implements Runnable{
    @Override
    public void run() {
        System.out.println("Printing from runnable");
    }
}
