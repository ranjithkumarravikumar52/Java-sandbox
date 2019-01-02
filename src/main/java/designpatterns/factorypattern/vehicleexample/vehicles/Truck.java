package designpatterns.factorypattern.vehicleexample.vehicles;

public class Truck implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Started truck engine");
    }
}
