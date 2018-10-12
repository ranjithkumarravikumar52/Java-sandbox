package ocppractice.main.User;

import ocppractice.main.controller.RemoteControl;
import ocppractice.main.devices.Device;
import ocppractice.main.devices.Projector;
import ocppractice.main.devices.TV;

public class Person {

    public static void main(String[] args) {
        Device theDevice = new TV("Apple TV");
        System.out.println("Device connection: "+RemoteControl.connectToDevice(theDevice));
        RemoteControl.turnOnDevice(theDevice);
        RemoteControl.turnOffDevice(theDevice);

        theDevice = new Projector("LG Projector");
        System.out.println("Device connection: "+RemoteControl.connectToDevice(theDevice));
        RemoteControl.turnOnDevice(theDevice);
        RemoteControl.turnOffDevice(theDevice);


        //TODO Connect -> Turn on -> Turn off
    }
}
