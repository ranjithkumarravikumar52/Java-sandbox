package ocpPractice.main.controller;

import ocpPractice.main.devices.Device;

/**
 * This class should handle responsibilities about the RemoteControl class only.
 * This class shouldn't be aware of the other class details
 * All the methods in this class should be static as we have only ONE remote that is universally connected to multiple devices
 */
public class RemoteControl {

    /**
     * A static method that universally controls any Device.
     * This method should also follows Singleton Design Pattern.
     * Check the state of the device connection - if already connected ignore
     * Else connect to the device
     * How ?
     * Why ?
     * Where ?
     */
    public static boolean connectToDevice(Device theDevice){
        if(theDevice == null){
            System.out.println("No Device object present");
            return false;
        }
        if(!theDevice.isConnectedToRemote() && theDevice != null){
            theDevice.setConnectedToRemote(true);
            System.out.println("Connected to "+theDevice);
            return true;
        }
        System.out.println("Device status already connected: "+theDevice.isConnectedToRemote());
        return false;
    }

    public static boolean disconnectTheDevice(Device theDevice){
        if(theDevice == null){
            System.out.println("No Device object present");
            return false;
        }
        if(theDevice.isConnectedToRemote() && theDevice != null){
            theDevice.setConnectedToRemote(false);
            System.out.println("Disconnect from "+theDevice);
            return true;
        }
        System.out.println("Device status already connected: "+theDevice.isConnectedToRemote());
        return false;
    }

    /**
     * Any Device that is connected to RemoteControl should be able to turnOn the device
     * @param theDevice
     */
    public static boolean turnOnDevice(Device theDevice){
        if(theDevice.isConnectedToRemote()){
            if (!theDevice.isTurnedOn()){
                theDevice.setTurnedOn(true);
                System.out.println("Turned on the device: "+theDevice);
                return true;
            }
            System.out.println("Device is already turned on "+theDevice.isTurnedOn());
            return false;
        }
        System.out.println("Can't modify the state of the device when the device is not connected to remote "+theDevice.isConnectedToRemote());
        return false;
    }

    /**
     * Any Device that is connected to RemoteControl should be able to turnOff the device
     * @param theDevice
     */
    public static boolean turnOffDevice(Device theDevice){
        if(theDevice.isConnectedToRemote()){
            if (theDevice.isTurnedOn()){
                theDevice.setTurnedOn(false);
                System.out.println("Turned off the device...: "+theDevice);
                return true;
            }
            System.out.println("Device is already off");
            System.out.println("Device turn on status: "+theDevice.isTurnedOn());
            return false;
        }
        System.out.println("Device is not connected to remote");
        return false;
    }

}
