package ocpPractice.main.devices;

/**
 * This class is super-class or parent of all the Devices. Helps with the OCP design principle
 * <ul>
 *     <li>TV</li>
 *     <li>SoundSystem</li>
 *     <li>Projector</li>
 *     <li>Future devices</li>
 * </ul>
 */
public class Device {
    //properties - keep in mind that these variables will be inherited by child class
    private String deviceName;
    private boolean isTurnedOn;
    private boolean isConnectedToRemote;

    /**
     *
     * Any device that is brought into this world should be forced to instantiated by the following.
     * This of this constructor as a new device just got into the house and connected to power supply and just ready to use.
     * This implies that deviceName is the only argument client is forced to send in the main. The other parameters are set to false by default
     * @param deviceName Name of the device
     */
    public Device(String deviceName) {
        this.deviceName = deviceName;
        this.isTurnedOn = false;
        this.isConnectedToRemote = false;
    }

    //====== SETTERS AND GETTERS ======
    public boolean isTurnedOn() {
        return isTurnedOn;
    }

    public void setTurnedOn(boolean turnedOn) {
        isTurnedOn = turnedOn;
    }

    public boolean isConnectedToRemote() {
        return isConnectedToRemote;
    }

    public void setConnectedToRemote(boolean connectedToRemote) {
        isConnectedToRemote = connectedToRemote;
    }

    @Override
    public String toString() {
        return "{deviceName='" + deviceName + "'}";
    }
}
