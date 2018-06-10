package ocpPractice;

/**
 * This class should handle responsibilities about the RemoteControl class only.
 * This class shouldn't be aware of the other class details
 */
public class RemoteControl {

    /**
     * A static method that universally controls any Device.
     * This method should also follows Singleton Design Pattern.
     * How ?
     * Why ?
     * Where ?
     */
    public static void connectToDevice(Device theDevice){

    }

    /**
     * Any Device that is connected to RemoteControl should be able to turnOn the device
     * @param theDevice
     */
    public void turnOnDevice(Device theDevice){

    }

    /**
     * Any Device that is connected to RemoteControl should be able to turnOff the device
     * @param theDevice
     */
    public void turnOffDevice(Device theDevice){

    }

}
