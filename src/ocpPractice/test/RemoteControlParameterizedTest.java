package ocpPractice.test;

import ocpPractice.main.controller.RemoteControl;
import ocpPractice.main.devices.Device;
import ocpPractice.main.devices.Projector;
import ocpPractice.main.devices.SoundSystem;
import ocpPractice.main.devices.TV;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class RemoteControlParameterizedTest {

    private Device theDevice;

    public RemoteControlParameterizedTest(Device theDevice) {
        this.theDevice = theDevice;
    }

    public Device getTheDevice() {
        return theDevice;
    }

    @Before
    public void setup() {
        System.out.println("\nInside setup");
        theDevice = this.getTheDevice();
    }

    @After
    public void disconnect(){
        System.out.println("\nInside disconnect");
        if(theDevice.isTurnedOn()){
            RemoteControl.turnOffDevice(theDevice);
        }
        if(theDevice.isConnectedToRemote()){
            RemoteControl.disconnectTheDevice(theDevice);
        }
    }

    /**
     * This method is called only once.
     * Create all your objects in here to execute the test suite
     * @return
     */
    @Parameterized.Parameters
    public static Collection<Object> testCondition(){
        System.out.println("Inside parameters\n");
        Object[] returnList = {
                new TV("Apple TV"),
                new SoundSystem("Apple Sound System"),
                new Projector("LG Projector")
        };
        return Arrays.asList(returnList);
    }

    //TODO how to link all test cases in one single method. Try to apply OCP
    @Test
    public void connectToDevice_for_the_first_time() {
        assertEquals(true, RemoteControl.connectToDevice(theDevice));
    }

    @Test
    public void connectToDevice_for_device_isNull() {
        assertEquals(false, RemoteControl.connectToDevice(null));
    }

    @Test
    public void connectToDevice_when_device_is_connected() {
        RemoteControl.connectToDevice(theDevice);
        assertEquals(false, RemoteControl.connectToDevice(theDevice));
    }

    @Test
    public void turnOnDevice_when_connected_to_remote() {
        RemoteControl.connectToDevice(theDevice);
        assertEquals(true, RemoteControl.turnOnDevice(theDevice));
    }

    @Test
    public void turnOnDevice_when_not_connected_to_remote() {
        assertEquals(false, RemoteControl.turnOnDevice(theDevice));
    }

    @Test
    public void turnOffDevice_when_connected_to_remote() {
        RemoteControl.connectToDevice(theDevice);
        assertEquals(false, RemoteControl.turnOffDevice(theDevice));
    }

    @Test
    public void turnOffDevice_when_not_connected_to_remote() {
        assertEquals(false, RemoteControl.turnOffDevice(theDevice));
    }

    @Test
    public void turnOffDevice_when_connected_to_remote_and_turnedOn_is_true() {
        RemoteControl.connectToDevice(theDevice);
        RemoteControl.turnOnDevice(theDevice);
        assertEquals(true, RemoteControl.turnOffDevice(theDevice));
    }

    @Test
    public void turnOffDevice_when_connected_to_remote_and_turnedOn_is_false() {
        RemoteControl.connectToDevice(theDevice);
        assertEquals(false, RemoteControl.turnOffDevice(theDevice));
    }

}