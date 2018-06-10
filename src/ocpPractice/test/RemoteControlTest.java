package ocpPractice.test;

import ocpPractice.main.Device;
import ocpPractice.main.RemoteControl;
import ocpPractice.main.TV;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoteControlTest {

    /**
     * Test if a remote control can connect to TV
     */
    @Test
    public void connectToDevice_TV_for_the_first_time() {
        Device tv = new TV("apple tv");
        boolean actual = RemoteControl.connectToDevice(tv);
        assertEquals(true, actual);
    }

    @Test
    public void connectToDevice_TV_when_device_is_connected() {
        Device tv = new TV("apple tv");
        RemoteControl.connectToDevice(tv);
        assertEquals(false, RemoteControl.connectToDevice(tv));
    }

    @Test
    public void turnOnDevice_when_connected_to_remote() {
        Device tv = new TV("apple tv");
        RemoteControl.connectToDevice(tv);
        boolean actual = RemoteControl.turnOnDevice(tv);
        assertEquals(true, actual);
    }

    @Test
    public void turnOnDevice_when_not_connected_to_remote() {
        Device tv = new TV("apple tv");
//        RemoteControl.connectToDevice(tv);
        boolean actual = RemoteControl.turnOnDevice(tv);
        assertEquals(false, actual);
    }

    @Test
    public void turnOffDevice_when_connected_to_remote() {
        Device tv = new TV("apple tv");
        RemoteControl.connectToDevice(tv);
        boolean actual = RemoteControl.turnOffDevice(tv);
        assertEquals(false, actual);
    }

    @Test
    public void turnOffDevice_when_not_connected_to_remote() {
        Device tv = new TV("apple tv");
//        RemoteControl.connectToDevice(tv);
        boolean actual = RemoteControl.turnOffDevice(tv);
        assertEquals(false, actual);
    }

    @Test
    public void turnOffDevice_when_connected_to_remote_and_turnedOn_is_on() {
        Device tv = new TV("apple tv");
        RemoteControl.connectToDevice(tv);
        RemoteControl.turnOnDevice(tv);
        boolean actual = RemoteControl.turnOffDevice(tv);
        assertEquals(true, actual);
    }

    @Test
    public void turnOffDevice_when_connected_to_remote_and_turnedOn_is_off() {
        Device tv = new TV("apple tv");
        RemoteControl.connectToDevice(tv);
        boolean actual = RemoteControl.turnOffDevice(tv);
        assertEquals(false, actual);
    }
}