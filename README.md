# Java Sandox

### Branch: TestingPractice
#### Introduction to debugging
* One special case about debugging is to understand third-party classes in your application when you don't have it's source code. Then debugging can help give us an higher understanding by examining the values we pass into those classes
* Debuggers uses "socket" to latch on to the application where we can stop, continue or append the application to examine its details
* To stop the application at a certain line of code, we use the help of `breakpoint`
    * An application can have more than one breakpoints
    * Be wary where the execution stop when a break point is set, is it at the breakpoint or before the line of breakpoint
* `Frames`
    * Execution stack trace (each time a method is called, the method is added to the stack trace)
    *  Can also use frame to select a specific thread for us to debug (another way is to use "threads" pane in the debugger window)
* `Variables`
    * Can examine all the variables in a method from a stack trace (Frames)
    * Checkout the icons or logo for each variable to knows its type in the variables window during debug mode
        * `P` = parameters
        * `Watch`(More like glass) Icon = watches

#### Helpful tips, check out for
* `Show execution point` - cursor jumps to the execution point
* `Step over`
* `Step into` - intellij skips going into jdk method calls (assumes that the bug might not be there in JDK)
* `Force step into` - to "step into" JDK methods or any third party method calls
* `Step out` - return to the caller from the current method
* `Drop frame` - drops the current frame (check the "frames" window)
    * Can't drop all kinds (exception: database connection, network traffic etc.)
    * Only changes to local variables will be reverted
* `Run to cursor`
* ALWAYS use `resume program` to finish off the debugging flow
    * To avoid any problems with applications that has any network or database connections
* `Resume program` and `Run program` are entirely different
* `Add variable` to `watch point` to examine its value during debug
* `Field watch points` - whenever the value is changed, the application suspends
    * Use `ALT+left click` to set up field watch point.
* `Smart step into` - gives us options to choose the method to step into

### Source Code analysis for the Branch:TestingPractice
* Run the source code for this branch and observe the execution fails
* Use debugger to examine where it went wrong
    * Should notice that instance variable and local variable inside add char method points to same object
    * Value gets appended to this object repeatedly till the memory is full
    * Method runs indefinitely because the exit condition for the loop has failed (length always remains zero in here)

### Branch: JUnit
* Unit testing generally is first line of defense in Testing
* Mostly done by developers/programmers themselves
* Old-school testing was done by manually sending test values to a method and check if expected and actual results are same
* However, it becomes a problematic if the method changes, then the test values has to be re-changed
* To avoid, people make use of testing framework.
* In this branch we gonna use java's testing framework called JUnit to run automated tests in our code





### Thanks and Credits
* Inspired and learned these information from [Tim Buchalka](https://www.udemy.com/java-the-complete-java-developer-course/learn/v4/overview)
