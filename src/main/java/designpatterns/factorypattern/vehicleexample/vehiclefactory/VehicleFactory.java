package designpatterns.factorypattern.vehicleexample.vehiclefactory;

import designpatterns.factorypattern.vehicleexample.vehicles.*;

public class VehicleFactory {

    public Vehicle getVehicle(VehicleType vehicleType) {
       /* if (vehicleType.equalsIgnoreCase("TRUCK")) {
            return new Truck();
        } else if (vehicleType.equalsIgnoreCase("BUS")) {
            return new Bus();
        } else if (vehicleType.equalsIgnoreCase("CAR")) {
            return new Car();
        } else if (vehicleType.equalsIgnoreCase("ELECTRIC")) {
            return new ElectricCar();
        } else
            return null*/;
            return vehicleType.getVehicle();
    }
}
