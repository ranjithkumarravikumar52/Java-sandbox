package designpatterns.factorypattern.vehicles;

public class Car implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Started car engine");
    }
}
