package designpatterns.factorypattern.vehicleexample.client;

import designpatterns.factorypattern.vehicleexample.vehiclefactory.VehicleFactory;
import designpatterns.factorypattern.vehicleexample.vehiclefactory.VehicleType;
import designpatterns.factorypattern.vehicleexample.vehicles.Vehicle;

public class App {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();
//        Vehicle vehicle = vehicleFactory.getVehicle("CAR");
//        vehicle.startEngine();
//
//        vehicle = vehicleFactory.getVehicle("ELECTRIC");
//        vehicle.startEngine();
        Vehicle vehicle = vehicleFactory.getVehicle(VehicleType.CAR);
        vehicle.startEngine();

    }
}
