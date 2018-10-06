package designpatterns.factorypattern.vehiclefactory;

import designpatterns.factorypattern.vehicles.*;

public class VehicleFactory {
    public Vehicle getVehicle(String vehicleType){
        if(vehicleType.equalsIgnoreCase("TRUCK")){
            return new Truck();
        }else if(vehicleType.equalsIgnoreCase("BUS")){
            return new Bus();
        }else if(vehicleType.equalsIgnoreCase("CAR")){
            return new Car();
        }else if(vehicleType.equalsIgnoreCase("ELECTRIC")){
            return new ElectricCar();
        }
        else
            return null;
    }
}
