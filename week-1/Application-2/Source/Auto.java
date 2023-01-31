package Source;

public class Auto extends Vehicle {
    private String model = "";
    private String engine = "";

    public Auto() {
        super();
    }

    public Auto(int id, String pickUpPlace, String dropOffPlace, String departureTime, String arrivalTime, double speed, double price, int totalSeatsCount, String model, String engine) {
        super(id, pickUpPlace, dropOffPlace, departureTime, arrivalTime, speed, price, totalSeatsCount);
        this.model = model;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }
}
