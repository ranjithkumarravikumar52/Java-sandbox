package designpatterns.openclosedprinciple.main.User;

import designpatterns.openclosedprinciple.main.controller.RemoteControl;
import designpatterns.openclosedprinciple.main.devices.Device;
import designpatterns.openclosedprinciple.main.devices.Projector;
import designpatterns.openclosedprinciple.main.devices.TV;

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
