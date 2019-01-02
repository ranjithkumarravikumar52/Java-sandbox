package designpatterns.factorypattern.vehicleexample.vehiclefactory;

import designpatterns.factorypattern.vehicleexample.vehicles.*;

public enum VehicleType{
    BUS{
        public Vehicle getVehicle(){
            return new Bus();
        }
    },
    TRUCK{
        public Vehicle getVehicle(){
            return new Truck();
        }
    },
    CAR{
        public Vehicle getVehicle(){
            return new Car();
        }
    },
    ELECTRIC_CAR{
        public Vehicle getVehicle(){
            return new ElectricCar();
        }
    };


    abstract Vehicle getVehicle();
}
