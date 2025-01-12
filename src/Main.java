import java.util.*;

import VehicleControlSystems.Car;
import VehicleControlSystems.Bicycle;
import VehicleControlSystems.Motorcycle;
import VehicleControlSystems.Transport;

public class Main {
    public static void main(String[] args) {
        ArrayList<Transport> transports = new ArrayList<>();
        transports.add(new Bicycle());
        transports.add(new Motorcycle());
        transports.add(new Car());

        test_transport(transports);

    }
    public static void test_transport(ArrayList<Transport> transports) {
        for (Transport t : transports) {
            System.out.println(t.move());
            System.out.println(t.stop());
            System.out.println(t.info());

            System.out.println("");
        }
    }
}