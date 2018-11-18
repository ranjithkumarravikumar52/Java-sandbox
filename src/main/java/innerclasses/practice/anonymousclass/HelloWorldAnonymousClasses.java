package innerclasses.practice.anonymousclass;

/**
 * <p>While local classes are class declarations, anonymous classes are expressions, which means that you define the class in another expression.</p>
 * <p> The following example, HelloWorldAnonymousClasses, uses anonymous classes in the initialization statements of the local variables frenchGreeting and spanishGreeting, but uses a local class for the initialization of the variable englishGreeting:</p>
 */
public class HelloWorldAnonymousClasses {

    //method to implement one local class - english greeting and two anonymous classes - frenchGreeting and spanishGreeting
    public void sayHello() {

        class EnglishGreeting implements HelloWorld {
            @Override
            public void greet() {
                System.out.println("Inside english greet method");

            }

            @Override
            public void greetSomeone(String someone) {
                System.out.println("Inside english greeting, someone = " + someone);
            }
        }

        HelloWorld englishGreeting = new EnglishGreeting();
        englishGreeting.greet();
        englishGreeting.greetSomeone("Give me tea!");

        /**
         * <p>Notice the difference between the below anonymous class and the above local class.</p>
         * <p>Anonymous class can be declared and instantiated at once, whereas local class has to be defined first and then instantiated separately</p>
         */
        HelloWorld frenchGreeting = new HelloWorld() {
            @Override
            public void greet() {
                System.out.println("Inside french greet method");
            }

            @Override
            public void greetSomeone(String someone) {
                System.out.println("Inside french greeting, someone = " + someone);
            }
        };

        frenchGreeting.greet();
        frenchGreeting.greetSomeone("Juma pel claude! (LOL)");
    }

    interface HelloWorld {
        void greet();

        void greetSomeone(String someone);
    }

}
