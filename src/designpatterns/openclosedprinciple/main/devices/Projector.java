package designpatterns.openclosedprinciple.main.devices;

public class Projector extends Device {
    /**
     * Any device that is brought into this world should be forced to instantiated by the following.
     * This of this constructor as a new device just got into the house and connected to power supply and just ready to use.
     * This implies that deviceName is the only argument client is forced to send in the main. The other parameters are set to false by default
     *
     * @param deviceName Name of the device
     */
    public Projector(String deviceName) {
        super(deviceName);
    }

    @Override
    public void turnOn() {
        System.out.println("Projector screen is down...");
    }

    @Override
    public void turnOff() {
        System.out.println("Projector screen is up....");
    }
}
