package ocpPractice;

/**
 * This class should handle responsibilities about the RemoteControl class only.
 * This class shouldn't be aware of the other class details
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
    public static void connectToDevice(Device theDevice){
        if(!theDevice.isConnectedToRemote()){
            theDevice.setConnectedToRemote(true);
        }
    }

    /**
     * Any Device that is connected to RemoteControl should be able to turnOn the device
     * @param theDevice
     */
    public void turnOnDevice(Device theDevice){
        if(theDevice.isConnectedToRemote()){
            if (!theDevice.isTurnedOn()){
                theDevice.setTurnedOn(true);
            }
        }
    }

    /**
     * Any Device that is connected to RemoteControl should be able to turnOff the device
     * @param theDevice
     */
    public void turnOffDevice(Device theDevice){
        if(theDevice.isConnectedToRemote()){
            if (theDevice.isTurnedOn()){
                theDevice.setTurnedOn(false);
            }
        }
    }

}
