package designpatterns.openclosedprinciple.test;

import designpatterns.openclosedprinciple.main.controller.RemoteControl;
import designpatterns.openclosedprinciple.main.devices.Device;
import designpatterns.openclosedprinciple.main.devices.Projector;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoteControlTest {

    private Device theDevice;

    @Before
    public void setup() {
//        theDevice = new TV("apple TV");
        theDevice = new Projector("Apple Projector");
    }

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