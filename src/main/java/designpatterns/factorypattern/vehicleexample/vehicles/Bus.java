package designpatterns.factorypattern.vehicleexample.vehicles;

public class Bus implements Vehicle{

    @Override
    public void startEngine() {
        System.out.println("Started bus engine");
    }
}
