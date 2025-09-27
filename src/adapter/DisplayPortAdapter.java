package adapter;

import ports.VideoPort;
import device.DisplayPortDevice;

public class DisplayPortAdapter implements VideoPort {
    private final DisplayPortDevice displayPortDevice;

    public DisplayPortAdapter(DisplayPortDevice displayPortDevice) {
        this.displayPortDevice = displayPortDevice;
    }

    @Override
    public void connect(String monitor) {
        System.out.println("Using adapter to convert DisplayPort → HDMI");
        displayPortDevice.connectDisplayPort(monitor);
    }
}
