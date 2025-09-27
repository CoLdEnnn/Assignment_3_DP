import laptop.GamingLaptop;
import laptop.Laptop;
import laptop.OfficeLaptop;

public class Main {
    public static void main(String[] args) {
        Laptop officeLaptop = new OfficeLaptop();
        officeLaptop.connectToMonitor("Office Monitor");

        Laptop gamingLaptop = new GamingLaptop();
        gamingLaptop.connectToMonitor("Gaming Monitor");
    }
}
