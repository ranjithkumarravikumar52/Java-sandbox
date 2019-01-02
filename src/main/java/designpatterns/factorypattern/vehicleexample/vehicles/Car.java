package designpatterns.factorypattern.vehicleexample.vehicles;

public class Car implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Started car engine");
    }
}
