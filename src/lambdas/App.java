package lambdas;

import java.util.ArrayList;
import java.util.List;

interface UpperConcat {
    String upperAndConcat(String s1, String s2);
}

public class App {
    public static void main(String[] args) {
//        usingLambdasExample1();

        AnotherClass anotherClass = new AnotherClass();
        System.out.println(anotherClass.doSomething());

    }

    private static void usingLambdasExample1() {
        //create Employee List
        Employee john = new Employee("John", 24);
        Employee tim = new Employee("Tim", 21);
        Employee jack = new Employee("jack", 22);

        //array List
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(john);
        employeeList.add(tim);
        employeeList.add(jack);

        System.out.println("With lambdas, comparing with name");
        employeeList.sort((employee1, employee2) ->
                employee1.getName().compareToIgnoreCase(employee2.getName()));
        printList(employeeList);

        System.out.println("With lambdas, comparing with age");
        employeeList.sort((employee1, employee2) ->
                Integer.compare(employee1.getAge(), employee2.getAge()));
        printList(employeeList);

        UpperConcat uc = (s1, s2) -> s1.toUpperCase() + " " + s2.toUpperCase();
        String randomString = doStringStuff(uc, john.getName(), tim.getName());
        System.out.println("using lambdas, randomString = " + randomString);
    }

    private static void printList(List<Employee> employeeList) {
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
        System.out.println();
    }

    static String doStringStuff(UpperConcat uc, String s1, String s2) {
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
        //Using lambda
        UpperConcat uc = (s1, s2) ->{
            System.out.println("The lambda's expression class's name: "+getClass().getSimpleName()); //AnotherClass
            return s1.toUpperCase() + s2.toUpperCase();
        };
        System.out.println("The another class's name: "+getClass().getSimpleName()); //AnotherClass
        return App.doStringStuff(uc, "String1", "String2");


//        System.out.println("The another class's name: "+getClass().getSimpleName()); //AnotherClass
//        return App.doStringStuff(new UpperConcat() {
//            @Override
//            public String upperAndConcat(String s1, String s2) {
//                System.out.println("The another class's name: "+getClass().getSimpleName()); // {empty}
//                return s1.toUpperCase() + s2.toUpperCase();
//            }
//        }, "String1", "String2");
    }
}
