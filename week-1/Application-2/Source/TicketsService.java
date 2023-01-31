package Source;

import java.util.ArrayList;

public class TicketsService {
    public ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {
        vehicles.remove(vehicle);
    }
}
