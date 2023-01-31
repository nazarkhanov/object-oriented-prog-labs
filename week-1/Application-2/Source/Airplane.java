package Source;

public class Airplane extends Vehicle {
    private int flightId = 0;

    public Airplane() {
        super();
    }

    public Airplane(int id, String pickUpPlace, String dropOffPlace, String departureTime, String arrivalTime, double speed, double price, int totalSeatsCount, int flightId) {
        super(id, pickUpPlace, dropOffPlace, departureTime, arrivalTime, speed, price, totalSeatsCount);
        this.flightId = flightId;
    }

    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }
}
