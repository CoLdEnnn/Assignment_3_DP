package laptop;

import ports.HDMI;
import ports.VideoPort;

public class OfficeLaptop implements Laptop {
    private final VideoPort port = new HDMI();

    @Override
    public void connectToMonitor(String monitor) {
        System.out.println("Office Laptop:");
        port.connect(monitor);
    }
}
