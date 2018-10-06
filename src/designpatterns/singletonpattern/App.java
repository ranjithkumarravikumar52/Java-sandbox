package designpatterns.singletonpattern;

public class App {
    public static void main(String[] args) {
//        SingletonTest test = new SingletonTest()
        SingletonTest test1 = SingletonTest.getINSTANCE();
        System.out.println(test1.getCounter());

        SingletonTest test2 = SingletonTest.getINSTANCE();
        System.out.println(test2.getCounter());

        SingletonTest test3 = SingletonTest.getINSTANCE();
        System.out.println(test3.getCounter());
    }
}
