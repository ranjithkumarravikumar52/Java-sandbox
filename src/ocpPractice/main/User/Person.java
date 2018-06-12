package ocpPractice.main.User;

import ocpPractice.main.controller.RemoteControl;
import ocpPractice.main.devices.Device;
import ocpPractice.main.devices.Projector;
import ocpPractice.main.devices.TV;

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
