package designpatterns.factorypattern.pointexample;


enum CoordinateSystem{
    CARTESIAN,
    POLAR
}

public class Point {
    private double x;
    private double y;

    private Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //    private Point(double a, double b, CoordinateSystem coordinateSystem) {
//        switch(coordinateSystem){
//            case CARTESIAN:
//                x = a;
//                y = b;
//                break;
//            case POLAR:
//                x = a * Math.cos(b);
//                y = a * Math.sin(b);
//                break;
//        }
//    }

    public static Point newCartesianPoint(double x, double y){
        return new Point(x, y);
    }

    public static Point newPolarPoint(double rho, double theta){
        return new Point(rho * Math.cos(theta), rho * Math.sin(theta));
    }
}
