package lambdas;

import java.util.ArrayList;
import java.util.List;

interface UpperConcat {
    String upperAndConcat(String s1, String s2);
}

public class App {
    public static void main(String[] args) {
//        new Thread(new CodeRun()).start();
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Printing from runnable using anonymous class");
//            }
//        }).start();
//
//        //Every lambda expression contains three parts
//        //1. arg list
//        //2. arrow token
//        //3. body
//        new Thread(() -> System.out.println("Printing this using lambda")).start();
//
//        //() -> System.out.println("Printing this using lambda")
//        //1. empty arg list
//        //2. arrow token
//        //3. sout statement in the body
//
//        //how to include multiple lines of code inside a lambda expression
//        new Thread(() -> {
//            System.out.println("Inside lambda expression");
//            System.out.println("This is a second line inside lambda expression");
//        }).start();

        //create Employee List
        Employee john = new Employee("John", 24);
        Employee tim = new Employee("Tim", 21);
        Employee jack = new Employee("jack", 22);

        //array List
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(john);
        employeeList.add(tim);
        employeeList.add(jack);

//        //LETS SORT !!! without lambda's
//        employeeList.sort(new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return o1.getName().compareToIgnoreCase(o2.getName());
//            }
//        });
//        System.out.println("With anonymous class");
//        printList(employeeList);

        System.out.println("With lambdas, comparing with name");
        employeeList.sort((employee1, employee2) ->
                employee1.getName().compareToIgnoreCase(employee2.getName()));
        printList(employeeList);

//        System.out.println("With anonymous class");
//        employeeList.sort(new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return Integer.compare(o1.getAge(), o2.getAge());
//            }
//        });
//        printList(employeeList);

        System.out.println("With lambdas, comparing with age");
        employeeList.sort((employee1, employee2) ->
                Integer.compare(employee1.getAge(), employee2.getAge()));
        printList(employeeList);

//        String randomString = doStringStuff(new UpperConcat() {
//                                                @Override
//                                                public String upperAndConcat(String s1, String s2) {
//                                                    return s1.toUpperCase() + " " + s2.toUpperCase();
//                                                }
//                                            },
//                john.getName(), tim.getName());
//        System.out.println("Printing randomString with anonymous class = " + randomString);

        //compiler infers the argument type for s1 and s2
        UpperConcat uc = (s1, s2) -> s1.toUpperCase() + " " + s2.toUpperCase();
        String randomString = doStringStuff(uc, john.getName(), tim.getName());
        System.out.println("randomString = " + randomString);


    }

    private static void printList(List<Employee> employeeList) {
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
        System.out.println();
    }

    /**
     * Method that accepts an object of an interface uc and two string parameters s1 and s2
     *
     * @param uc
     * @param s1
     * @param s2
     * @return
     */
    public static String doStringStuff(UpperConcat uc, String s1, String s2) {
        return uc.upperAndConcat(s1, s2);
    }
}

class Employee {
    private String name;
    private int age;

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

}

class AnotherClass {
    public String doSomething() {
        return App.doStringStuff(new UpperConcat() {
            @Override
            public String upperAndConcat(String s1, String s2) {
                return s1.toUpperCase() + s2.toUpperCase();
            }
        }, "String1", "String2");
    }
}
