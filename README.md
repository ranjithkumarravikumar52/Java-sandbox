# Java Sandbox

### Oracle certified associate - Topics
#### Java Basics 
* Define the scope of variables 
* Define the structure of a Java class
* Create executable Java applications with a main method; run a Java program from the command line; produce console output
* Import other Java packages to make them accessible in your code
* Compare and contrast the features and components of Java such as: platform independence, object orientation, encapsulation, etc.

#### Notes on Java Basics Topic
* Classes are Java basic building blocks
* They have two main elements
    * Fields/Variables - Hold the state of the class
    * Methods - Operate on the state
* What is a method signature? 
* TIL- Writing java doc for every class and method and how it helps for documentation purposes
* Directory structure - what is src folder, child packages (package1.package2), how to compact packages in IDE, import a package, import all packages
* **Do we have to import System class for System.out.println()?**
    * Answer: Don't need to import java.lang classes
    * We can import it and it won't be an error but its just redundant
* How to import classes with same name but from different packages? For example, Date class from java.util and java.sql?
    * Answer: Use full class name for Both, don't import their packages
* Can we import classes from default non-root packages?
    * No.
* Auto format in IntelliJ - `Ctrl + Alt + L`
* Auto import `Ctrl + Alt + O`
* What is a static import? 
    * Example when we use `Math.min()`, is there a way around to just call it `min()`
    * import static methods?
    * import static variables?
 ### Primitives
| Keyword | Size | Examples |
| :---         |     :---:      |          ---: |
|  boolean  |   -   |     true|
|   byte   |     8-bits   |   1    |
|  short  |   16-bits   |   12  |
|   int   |   32-bits     |  100     |
| long   |   64-bits   |   12  |
|   float   |   32-bits     |    123.45   |
|  double  |   64-bits   |  123.4556789   |
|   char   |   16-bits     |    'a'   |
 
* What is a literal? 
    * Syntactic representation of primitive
* Default interpretation of literals?
* 123,456,678 = 123_456_678
* _2 valid?
* 2_300 valid?
* Octal presentation : 
    * int n = 08; valid? 
    * int n = 07; valid?
* Hexadecimal representation? 
    * (0-9 and A-F) -> 0-15
    * 0x1E
* binary representation?
    * 0b1001 -> 9 in decimal
    * 0b2 valid?
* Decimal literal
    * float f =  24.3 valid? 
    * can't put underscore before/after decimal point
    * not at the start or end of a literal either
        * float myNumeber 24_.3; valid? 
* Floating point decimals
    * double d = 24.3F; valid?
    * how to represent power of 10?
    * how to represent hex decimal power? 
        * p in 0x.....p1 represent hex decimal float point
        


#### Day of the exam Tips
* Use paper-pen to untangle complicated code or ugly code
    * Check out for any missing braces before understanding the code
    * No need to worry about different numeric system conversions

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
* Easiest way to create test class is using `Alt + Enter` on the current class
* Scope is `compile time` for the Test class
* Test methods should always be `public` and return type `void`
* Create a test method with annotations `@org.junit.Test` right above the method to enable IDE to test that method
* `Assert(expectedResult, actualResult)`
* We can have more than one assertion in a method, however it's a bad practice because
    * Test method should always be self-contained
    * Test method should run independently
* So, only one assert per test method/condition
* Using filters to examine all your tests
* When testing a value against true or false, use assertTrue or assertFalse
* `@Before` 
    * runs before every tests
* `@BeforeClass`
    * runs only once before any tests 
* `@AfterClass`
    * runs only once after every tests
* Writing Tests for methods which throws exception
    * In the annotation include, `(excpeted = typeofexception.class)`
    * Or can also use try-catch block
    
#### Parameterized Tests
* Motivation: How do we test five different values of deposits in our sample code? 
* We can write five different test methods for each of these deposit values. However, this will make Test class really long and harder to maintain
* Use `@RunWith(Parameterized.class)` to enable the class as parameterized





### Thanks and Credits
* Inspired and learned these information from [Tim Buchalka](https://www.udemy.com/java-the-complete-java-developer-course/learn/v4/overview)
