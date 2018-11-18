package designpatterns.singletonpattern;

public class SingletonTest {

    private static SingletonTest INSTANCE = null;

    //For debugpractice how many objects we have created
    private static int counter;

    //to deny access
    private SingletonTest(){
        counter++;
    }

    public static SingletonTest getINSTANCE(){
        if(INSTANCE == null){
            INSTANCE = new SingletonTest();
        }
        return INSTANCE;
    }

    public int getCounter() {
        return counter;
    }
}
