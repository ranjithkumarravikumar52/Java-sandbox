package ocpPractice.main.devices;

public class TV extends Device {

    /**
     * Any device that is brought into this world should be forced to instantiated by the following.
     * This of this constructor as a new device just got into the house and connected to power supply and just ready to use.
     * This implies that deviceName is the only argument client is forced to send in the main. The other parameters are set to false by default
     *
     * @param deviceName Name of the device
     */
    public TV(String deviceName) {
        super(deviceName);
    }

    @Override
    public void turnOn() {
        System.out.println("TV is on...");
    }

    @Override
    public void turnOff() {
        System.out.println("TV is off..");
    }
}
