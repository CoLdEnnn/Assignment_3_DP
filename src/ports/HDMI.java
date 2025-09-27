package ports;

public class HDMI implements VideoPort {
    @Override
    public void connect(String monitor) {
        System.out.println("Connected to " + monitor + " via HDMI");
    }
}
