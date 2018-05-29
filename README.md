# Java Sandox

#### Branch: TestingPractice
* Introduction to debugging
    * One special case about debugging is to understand third-party classes in your application when you don't have it's source code. Then debugging can help give us an higher understanding by examining the values we pass into those classes
    * Debuggers uses "socket" to latch on to the application where we can stop, continue or append the application to examine its details
    * To stop the application at a certain line of code, we use the help of "breakpoint"
        * An application can have more than one breakpoints
        * Be wary where the execution stop when a break point is set, is it at the breakpoint or before the line of breakpoint
    * Frames
        * Execution stack trace (each time a method is called, the method is added to the stack trace)
        *  Can also use frame to select a specific thread for us to debug (another way is to use "threads" pane in the debugger window)
    * Variables
        * Can examine all the variables in a method from a stack trace (Frames)
        * Checkout the icons or logo for each variable to knows its type in the variables window during debug mode
            * P = parameters
            * Watch Icon = watches

#### Thanks and Credits
* Inspired and learned these information from [Tim Buchalka](https://www.udemy.com/java-the-complete-java-developer-course/learn/v4/overview)

