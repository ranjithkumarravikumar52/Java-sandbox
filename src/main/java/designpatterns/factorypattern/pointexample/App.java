package designpatterns.factorypattern.pointexample;

public class App {
    public static void main(String[] args) {

        /**
         * Using enum for calling an object which has logic inside in the constructor
         */
        /*Point pointCartesian = new Point(3, 4, CoordinateSystem.CARTESIAN);
        Point pointPolar = new Point(3, 40, CoordinateSystem.POLAR);*/

        /**
         * Using public static method to get our required object
         */
        Point cartesianPoint = Point.newCartesianPoint(3, 4);
        Point polarPoint = Point.newPolarPoint(10, 60);
    }
}
