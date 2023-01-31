package Source;

public class Train extends Vehicle {
    private int runId = 0;
    private String wagonType = "";

    public Train() {
        super();
    }

    public Train(int id, String pickUpPlace, String dropOffPlace, String departureTime, String arrivalTime, double speed, double price, int totalSeatsCount, int runId, String wagonType) {
        super(id, pickUpPlace, dropOffPlace, departureTime, arrivalTime, speed, price, totalSeatsCount);
        this.runId = runId;
        this.wagonType = wagonType;
    }

    public int getRunId() {
        return runId;
    }

    public void setRunId(int runId) {
        this.runId = runId;
    }

    public String getWagonType() {
        return wagonType;
    }

    public void setWagonType(String wagonType) {
        this.wagonType = wagonType;
    }
}
