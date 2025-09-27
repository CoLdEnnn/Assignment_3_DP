package laptop;

import adapter.DisplayPortAdapter;
import ports.VideoPort;
import device.DisplayPortDevice;

public class GamingLaptop implements Laptop {
    private final VideoPort port = new DisplayPortAdapter(new DisplayPortDevice());

    @Override
    public void connectToMonitor(String monitor) {
        System.out.println("\nGaming Laptop:");
        port.connect(monitor);
    }
}
