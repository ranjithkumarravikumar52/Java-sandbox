# Java Sandbox

### Oracle certified associate
* [Topics](https://education.oracle.com/pls/web_prod-plq-dad/db_pages.getpage?page_id=5001&get_params=p_exam_id:1Z0-808) 
***
### OCJA-Basics
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
* What is a static import?
    * Example when we use `Math.min()`, is there a way around to just call it `min()`
    * import static methods?
    * import static variables?
***
* Primitives

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

***
* What is a literal?
    * Syntactic representation of primitive
* Default interpretation of literals?
* 123,456,678 = 123_456_678
* is _2 valid?
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
* Can't use true or false as keywords
* Variables can begin with $ or _ sign
    * But can't start with a number
* Default initialization of variables
    * Local variables don't have any default initialization and its a compiler if we try to access it
    * Static variables in default or set to zero or false(boolean) or 0.0 (double and float)
    * Static objects are initialized to null by default
    * However for char it as default value of empty char
* Variable scope/code blocks
    * Two variables can have same name if they have different scopes
* Ordering elements in a class
    * Can we put import statement before the package statement?
    * Can we have methods outside the class ?
    * Can we have multiple classes inside a file?
        * Yes. But only public class and the rest has to be non-public
    * PIC - Package,Import,Class
* Unboxing
    * Integer -> int
* Boxing (putting a primitive type in a wrapper)
    * int -> Integer
* Autoboxing
    * Converting primitive to wrapper or vice-versa automatically by the compiler

***
### OCJA-control-flow
* basic if-else work flow
* complex if-else work flows
* Ternary operators
    * Use different datatypes in the ternary operator
    * Need to have same datatypes on both sides
    * Short circuit ternary operator evaluation
    * Ternary operator with unary operator
        * f = 3; f = f++; 
            * f = 3 or 4 ?
            * 3
* switch case
    * supported data types
        * int, short, char, byte and their wrappers (for the exam)
    * what's the minimum number of cases/branches that is allowed in Java?
    * pitfalls of switch case
    * case variables should always be constants
* while loop/do-while/for loop
    * infinite loop
    * never-executing loop
    * scope of loop variables
    * does the body of the loop executes at least once? 
    
* for a nested for-loop, curly braces for the outer loop is not needed
`   //nested for-loop
            for (int i = 0; i < 2; i++)
                for (int j = 0; j < 2; j++) {
                    System.out.println("i = " + i + ", j = " + j);
                    //some other code goes here
                }
    
            System.out.println();
    
            //nested for-loop
            for (int i = 0; i < 2; i++){
                for (int j = 0; j < 2; j++) {
                    System.out.println("i = " + i + ", j = " + j);
                    //some other code goes here
                }
            }
`
***
#### OCJA operations
* [Types of operators - I](https://www.javatpoint.com/operators-in-java)
* [Types of operators - II](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html)
***
* Operators can be applied to one, two or three operands
* Java follows operator precedence when two operators have same precedence
    * It evaluates from left to right
***
* `int a  = 3 - 2 + 2 * 2 + 3`
    * a = 8;
* `int a  = 4 / 2 + 1 - 4 * 2 + 10`
    * a = 5;
* `int a  = 4 `, `int b = 3 - 2 * --a`
    * a = 3, b = -3
* `int a  = 4 `, `int b = 3 - 2 * a--`
    * a = 3, b = -5
* `long c = 2`, `long d = 4 + 3 * c++`
    * c = 3, d = 10
* `result = 10 - 3 * (2 + 1) - 4 / (1 + 3)`
    * 0
* `int i = 10 % 2`
    * 0
* `int j = 10 % 3`
    * 1
* `int f = 12`, `int g = 5`, `int h = 2`
    * `int m = f / 2 - 10 % (4 + 3) - 2 * f % g - h * 3`
    * -7
***
* Promotion - When two values have different data types, Java will promote one of the values to the larger data type
* In other words, converting "smaller" type to "bigger" type
    * `int x = 5`, `double y = 10.55`, `double result = x + y`;
        * 15.55 or 15 ? 
        * 15.55
* Casting - opposite of promotion
* Converting "bigger" type to "smaller" type
    * `int x = 5`, `double y = 10.55`, `int result = (int) (x + y)`;
        * 15 or 15.55
        * 15
* Be mindful of assigning expression which is smaller and bigger data type to a smaller data type as this will lead to a compilation error unless "cast" is done
* Overflow of data types
* Underflow of data types
***
* Unary operators 
* Wrapper class pool values
    * Integer i1 = 10; 
    * Integer i2 = 10; 
    * i1==i2, i1.equalsTo(i2)
* equalto vs ==
***
### OCJA-strings
* String is a special object that can be created just by using string literal
    * Even though new can be used to create string, it is redundant, however it legal, because of **string pool**
***
* Be careful about "+" operator present in between operands type
    * if both operands are int/numeric addition takes place
    * if one of them is string then concatenation
        * NOTE: the order in which the string type detected matters!
* Immutable strings
    * not changeable strings
    * once the object is created it cannot be changed
    * almost every method that is called upon a string variable will return a new string while keeping the "called" string variable intact, unless it is de-referenced and assigned it itself
* String concatenation 
    * Can be done using "+" operator
    * Can be done using concat() 
* To "check" the memory address of any object/variable use
    * `System.identityHashCode(variable)`
* String pool
    * combination of string literal and string variable
    * check if the memory locations are same
    * `str1 = "abc"`, `str2 = "ab"`, `str3 = str2 + "c"`, `str4 = "ab" + "c"`
        * is `str1 == str3`
        * is `str1 == str4`
***
* String methods (13) - sequence of char, immutable strings
    * str.length()
    * str.charAt(i)
    * str.indexOf('char')
    * str.indexOf('char', fromIndex: 2)
    * str.substring(start)
    * str.substring(start, end) //test the range of start, end
    * str.toUpperCase
    * str.toLowerCase
    ***
    * str.equals()
    * str.equalsIgnoreCase()
    ***
    * str.startsWith()
    * str.endsWith()
    ***
    * str.contains()
    ***
    * str.replace(oldChar, newChar)
    * str.replace(stringVariable, stringVariable)
    * str.replace(literal, literal)
    ***
    * str.trim() - removes starting and ending empty spaces
***
* chaining methods
    * Can be done only on methods that returns some object
***
* String builder
    * Not immutable 
    * Helps avoid create multiple objects when used only with String methods 
    * sb.append()
    * **Careful about trick question on string builder immutability**   
***
### OCJA-Arrays
* Confused on how to create and initialize multi-dimensional arrays? 
`
        //create and initialize a 1-d array
        int[] oneD = new int[]{
                1,2,3,4
        };

        //create and initialize a 2-d array
        int[][] twoD = new int[][]{
                {1,2,3},
                {4,5,6}
        };

        //create and initialize a 3-d array
        //3d    -> an array of 2-d arrays
        //      -> an array of (an array of 1-d arrays)
        int[][][] threeD = new int[][][]{
                {{1,2,3}, {4,5,6}},
                {{7,8,9}}, {{10,11,12}}
        };`
* when declaring and setting a size for a muti-dimensional array, the size of the first dimension should be mentioned while the rest could be optional
    * `int[][] a = new int[2][];` legal
    *  `int[][] a = new int[][];` illegal 
* [More info on Arrays](https://www.quora.com/What-is-the-difference-between-multi-dimensional-arrays-in-Java-vs-C)
* Does Arrays have size() or capacity()? 
    * No
***
### OCJA-ArrayList
* Can we directly an element into an arrayList using = operator
    * `ArrayList<Integer> list = new ArrayList<>();
    list[0] = 1; //not valid
    list.add(1); //valid
    ` 
* Collections.sort()
* Collections.binarySearch()
* Arrays.asList()
    * This new list IS fixed size
    * Can modify the current element but can't add new elements
* _.toArray()
* Difference b/w
    * for, for-each, iterator, ListIterator
    * concurrent modification exception
***
* Two arrayLists are equal if they have same elements and same order, whereas two arrays are equal if they have same elements even if they don't have same order - DOUBT
    * 
    ` int[] myArray = new int[]{1,2};
             int[] myAnotherArray = new int[]{1,2};
     
             System.out.println(Arrays.equals(myArray, myAnotherArray));
     
             List<Integer> myArrayList = new ArrayList<>();
             List<Integer> myAnotherArrayList = new ArrayList<>();
     
             myArrayList.add(1);
             myArrayList.add(2);
     
             myAnotherArrayList.add(1);
             myAnotherArrayList.add(2);
     
             System.out.println(myArrayList.equals(myAnotherArrayList));` 
***             
### OCJA-methods
* `[Access modifier][optional modifer 1][optional modifer 2][return type][methodname](param1, param2, ... param n)`
* Order of the access modifier and optional ones can be interchanged
* Return type MUST be always be before the method name
* Method name follows java variable naming standards
* Variable args
    * int... args
    * only ONE var args is allowed in the method declaration
    * if multiple exists, then var args should at the end of the list
* Access modifiers for the methods
    * public 
    * protected
    * - (No mention - default modifier)
    * private
* Is default a keyword? 
    * yes, switch cases
* Java methods follows copy-by-value passing 
    * Exact type
    * Promotional type
    * Autoboxing
    * Var-args
    * If none exists then compiler error
***   
### OCJA-class design
* why is private constructor used? 
    * Singleton Pattern - check [this](https://stackoverflow.com/questions/17342815/what-is-the-use-of-private-constructor-in-java)
* this()
    * to optimize overloaded constructors by removing duplicate code
    * should be the first line of code in any constructor. 
    * never ending constructor chaining is a compiler error not a run-time exception
***
* Order of initialization
    * super()
    * static (in the order they appear)
    * instance (in the order they appear)
    * constructor
***
* Data Encapsulation
    * Hiding implementation details
    * Done using setters and getters
    * Also called POJO - Plain Old Java Objects
    * EJB is someother Java Object
    ***
    * Helps in
        * Maintainability 
        * Flexibility
        * Re-usability
        * Avoid erros
    ***
    * Can be Read-Only
        * If only getters are used
    ***
    * Can be Write-Only
        * If only setters are used
    ***
    * Example
        * Collection.sort(obj)
        * Here we don't have to know the implementation details
        * But it gets the work done
***
* Immutable Classes
    * Can't change/modify classes
    * Remove setters
    * All field variables are final and private
***
* Any operation should return a new object just like string methods, while keeping the current object fields intact
* Example
    * ``String s = "Hello; String newS = s.toLowerCase(); ``
    * Here s still remains "Hello", while the method returns a new String Object
***
* Inheritance
    * Remember, how order of constructors is executed in chain of sub-classes
    * First order is super()
***
* Constructor Definition Rules
    1. The first statement of every constructor is a call to another constructor within the same class using this(), or a call to a parent class using super()
    2. If super() call is NOT declared in a constructor, compiler will insert no-argument super() as first statement of the constructor
    3. The super() can't be used after the first statement of the constructor
    4. If the parent class does not have no-arg constructor and the child does not define any constructor, compiler will show error and try to insert a default no-argument constructor into child class
    5. If the parent does not have no-arg constructor, the compiler requires an explicit call to a parent constructor in each child class. 
*** 

### Method-overriding
* When overriding parent class methods, using the super. keyword, it doesn't have be the first line in the method unlike super(), which has to be on the first line in a constructor body. 
* final methods can't be overridden
    * why? 
* static methods can't be overridden
    * why? 
* private methods can't be overridden
    * why? 
* can we have static abstract methods? 
    * no
* Always use higher access modifier when overriding methods [Check this](https://stackoverflow.com/questions/215497/in-java-difference-between-package-private-public-protected-and-private)
    * public 
    * protected
    * no modifier
    * private 
***
### Interfaces
* All the variables/fields/variables defined inside the interface are constants
* Using public, static and final for these constants are redundant
***
* Methods inside public and abstract don't have a body
***
* Java 8 has a default interface methods
* They always have a body
* Don't be confused when a method declaration shows `default public [return_type][method_name]`
* since Java 8, methods inside interface are not abstract implicitly
    * Cos we have default and static interface methods now
* Interfaces don't extends/implement object class unlike inheritance through class "extends"
***
* static interface methods
* have to be referenced using the class variable
* Can't be overridden
* Always has a body
***
* Be mindful about the situation where a class extends two interfaces with exact same default methods. 
    * Extend one interface with another to avoid confusion
***
* Abstract classes vs interface methods
***

#### Day of the exam Tips
* Use paper-pen to untangle complicated code or ugly code
    * Check out for any missing braces before understanding the code
    * No need to worry about different numeric system conversions
***
**END OF OCJA**
***

***
### Introduction to debugging
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
***
### Debugging Tips and Tricks
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
***
### Debugging challenge
* Run the source code for this branch and observe the execution fails
* Use debugger to examine where it went wrong
    * Should notice that instance variable and local variable inside add char method points to same object
    * Value gets appended to this object repeatedly till the memory is full
    * Method runs indefinitely because the exit condition for the loop has failed (length always remains zero in here)
***
### JUnit
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
    * runs before every test method
* `@After`
  * runs after every test method
* `@BeforeClass`
    * runs only once before any test method
* `@AfterClass`
    * runs only once after every test method
* Writing Tests for methods which throws exception
    * In the annotation include, `(excpeted = typeofexception.class)`
    * Or can also use try-catch block
***
* Parameterized Tests
    * Motivation: How do we test five different values of deposits in our sample code?
    * We can write five different test methods for each of these deposit values. However, this will make Test class really long and harder to maintain
***
* Steps
    * Use `@RunWith(Parameterized.class)` to enable the class as parameterized
    * Write the constructor for the class, as newly created objects can be instantiated through this constructor from multiple parameterized method
    * Write `@Parameterized.Parameters` to enable `static` parameters to be passed into a test case

***
### Generics
* since 1.5
* Before generics, class case exception was a major run-time nightmare for many
***
* Generics can be applied to class, methods and interfaces
***
* Comparable interface
    * Restricting to compare two classes with the same type parameters
    * Comparing Football Team with Football Team not with Baseball Team
    * Logic is implemented by overriding compareTo() abstract method  
    * Collections.sort() depends on this method
***
* Be careful of using raw types in your code, which will give you a warning of "unchecked warning"
    * Resolve that warning using Generics
* There's a much better java doc by oracle which does a great job explaining these concepts
    * ["Basic Generics"](https://docs.oracle.com/javase/tutorial/java/generics/why.html)
    * ["Advanced Generics"](https://docs.oracle.com/javase/tutorial/extra/generics/index.html)
***
* Challenge
* `      // Create a generic class to implement a league table for a sport.
         // The class should allow teams to be added to the list, and store
         // a list of teams that belong to the league.
         //
         // Your class should have a method to print out the teams in order,
         // with the team at the top of the league printed first.
         //
         // Only teams of the same type should be added to any particular
         // instance of the league class - the program should fail to compile
         // if an attempt is made to add an incompatible team.`

***
### Collections
* The main component for collection framework is [interfaces](https://docs.oracle.com/javase/tutorial/collections/interfaces/index.html) 
    * Collection
    * Set
        * SortedSet
    * List
    * Queue
    * Deque
    * Map
        * SortedMap
* There is a interface hierarchy in collection framework
* Set
    * HashSet
    * TreeSet
    * LinkedHashSet
* List
    * ArrayList
    * LinkedList
* Queue
    * LinkedList
* Deque
    * LinkedList
    * ArrayDeque
* Map 
    * HashMap
    * TreeMap
    * LinkedHashMap
* Questions to practice
    * [Link](https://docs.oracle.com/javase/tutorial/collections/interfaces/QandE/questions.html)
***
#### Collections Interface
* Conversion constructor returns a copy of the collection with a newly created instance variable pointing to the original object. In other words, changes in the copy will affect the original 
* The Collection interface contains methods that perform basic operations, such as 
    * int size(),
    * boolean isEmpty(),
    * boolean contains(Object element),
    * boolean add(E element),
    * boolean remove(Object element),
    * Iterator<E> iterator().
    * Notice how there is no get method to retrieve a specified object
***
* It also contains methods that operate on entire collections,
    * boolean containsAll(Collection<?> c),
    * boolean addAll(Collection<? extends E> c),
    * boolean removeAll(Collection<?> c),
    * boolean retainAll(Collection<?> c), and
    * void clear().
***
* Additional methods for array operations
    * Object[] toArray() 
    * <T> T[] toArray(T[] a)
***
#### Set Interface [Link](https://docs.oracle.com/javase/tutorial/collections/interfaces/set.html)
* The Set interface contains **only** methods inherited from Collection and adds the restriction that duplicate elements are prohibited.
* Implemented by
    * HashSet
    * TreeSet
    * LinkedHashSet
* The Java platform contains three general-purpose Set implementations: HashSet, TreeSet, and LinkedHashSet. HashSet, which stores its elements in a hash table, is the best-performing implementation; however it makes no guarantees concerning the order of iteration. TreeSet, which stores its elements in a red-black tree, orders its elements based on their values; it is substantially slower than HashSet. LinkedHashSet, which is implemented as a hash table with a linked list running through it, orders its elements based on the order in which they were inserted into the set (insertion-order). LinkedHashSet spares its clients from the unspecified, generally chaotic ordering provided by HashSet at a cost that is only slightly higher.

***
* Aggregate operations 
* Algorithms 
* All the main operations will be practiced using a sample project called "Seat Reservation System"
* [Doc Link](https://docs.oracle.com/javase/tutorial/collections/intro/index.html) 
***
* Important Notes
    * Two List objects are equal if they contain the same elements in the same order.
    * Collections.BinarySearch needs the list to be sorted first
    * Collections.min or max doesn't need the list to be sorted first
    * Add method of collection is generally defined to add duplicates as well

***
### Inner Classes
* [Doc for Inner Class](https://docs.oracle.com/javase/tutorial/java/javaOO/nested.html)
* Why do we need inner class? 
    * It is a way of logically grouping classes that are only used in one place
    * It increases encapsulation:
    * It can lead to more readable and maintainable code
***
### Local Classes
* Can we declare interfaces inside a local class? 
    * [NO!](https://docs.oracle.com/javase/tutorial/java/javaOO/localclasses.html)
* Can we declare static methods inside a local class? 
    * [NO!](https://docs.oracle.com/javase/tutorial/java/javaOO/localclasses.html)
* The only static type allowed inside a local class is of the type static variable which are constants or final or compile time constant expressions
***
### Anonymous class
* Anonymous classes enable you to make your code more concise. They enable you to declare and instantiate a class at the same time. 
* They are like local classes except that they do not have a name. Use them if you need to use a local class only once. [Link](https://docs.oracle.com/javase/tutorial/java/javaOO/anonymousclasses.html)
* Can we declare constructors inside an anonymous class? 
    * NO!
***
* Notes
    * Non-static inner class are used when the inner class has no purpose without the outer class
    * Shadowing variables
    * Non-static variable cannot be accessed from a static context
***
### Lambda expressions
* One issue with anonymous classes is that if the implementation of your anonymous class is very simple, such as an interface that contains only one method, then the syntax of anonymous classes may seem unwieldy and unclear. 
* In these cases, you're usually trying to pass functionality as an argument to another method, such as what action should be taken when someone clicks a button. 
* Lambda expressions enable you to do this, to treat functionality as method argument, or code as data. 
* The previous section, Anonymous Classes, shows you how to implement a base class without giving it a name. 
* Although this is often more concise than a named class, for classes with only one method, even an anonymous class seems a bit excessive and cumbersome. 
* Lambda expressions let you express instances of single-method classes more compactly.
***
* Notes
    * Interfaces with only one abstract method are also functional interfaces
    * Every lambda expression contains three parts
        * arg list
        * arrow token
        * body
    * `//() -> System.out.println("Printing this using lambda")
               //1. empty arg list
               //2. arrow token
               //3. sout statement in the body`
    * `new Thread(() -> System.out.println("Printing this using lambda")).start();`
        * We don't need a semicolon inside the lambda expression when the body includes only one statement and in fact we can't use it either
        * When we use curly brace for the body, don't forget to write 'return' statement
        * When parameter type is mentioned, it should always be enclosed in parenthesis
        * Cannot define a new variable inside the body which has been used by the argument type
        * Cannot define a new variable inside the body which has been used by the argument type
    * When checking for a method can be used by lambda expression check the documentation of that method for the annotation
        * @FunctionalInterface
***
### Data and time (Java 8)
* [Doc](https://docs.oracle.com/javase/tutorial/datetime/)
* 
***
### Java Concurrency
* To "run" a new thread use start() rather than directly calling run() method (calling run() directly will not create a new thread but instead the method gets executed in the current thread)
* What does join() do?
    * Calling thread(method) gets suspended till called thread either gets executed completely or timed out
    * Helps in maintaining an order of execution
* Sample exercise
    * Implement two threads that provides a countdown functionality based on a local variable vs instance variables. Are the results same in both cases?
    * Results: Threads can be suspended between 2 statements. 
* What is interleaving? What is thread-interference? What is a share-condition?
* What is synchronization? 
    * Process of controlling a shared resource by the threads 
    * Can we provide synchrozination to constructors? 
        * No, only to statements and methods
    * Primitive types dont have an intrinsic locks
    
***
### Day of the exam tips
* You may get a few very simple questions about operator preference. Simple school math trick of BODMAS can be used to evaluate the expressions.  
    * B Brackets first 
    * O Orders (i.e. Powers and Square Roots, etc.) 
    * DM Division and Multiplication (left-to-right) 
    * AS Addition and Subtraction (left-to-right) 
* When shadowing is present use the `this` operator
* While overloading methods, compiler doesn't care about the method return type
* But when overriding methods, return types should match
***
### IntelliJ Tips
* Auto format in IntelliJ - `Ctrl + Alt + L`
* Auto import `Ctrl + Alt + O` 
* Using "structure" in the intellij to understand hierarchy and visibility of the classes. 
* Use "messages" to check for any warnings and always aim to write a "good" code by making sure a green tick is shown at the top right of the screen
***
### Issues
* [Unable to push using git in IntelliJ](https://intellij-support.jetbrains.com/hc/en-us/community/posts/115000126424-Intermittent-failure-using-Git-unable-to-read-askpass)
* [When you should use static methods in a class](https://stackoverflow.com/questions/2671496/java-when-to-use-static-methods)

### Thanks and Credits
* Inspired and learned these information from [Tim Buchalka](https://www.udemy.com/java-the-complete-java-developer-course/learn/v4/overview)
