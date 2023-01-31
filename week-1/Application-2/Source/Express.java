package Source;

public class Express extends Train {
    private boolean smokingRoom = false;
    private boolean washingRoom = false;

    public Express() {
        super();
    }

    public Express(int id, String pickUpPlace, String dropOffPlace, String departureTime, String arrivalTime, double speed, double price, int totalSeatsCount, int runId, String coupeType, boolean smokingRoom, boolean washingRoom) {
        super(id, pickUpPlace, dropOffPlace, departureTime, arrivalTime, speed, price, totalSeatsCount, runId, coupeType);
        this.smokingRoom = smokingRoom;
        this.washingRoom = washingRoom;
    }

    public boolean hasSmokingRoom() {
        return smokingRoom;
    }

    public void setSmokingRoom(boolean smokingRoom) {
        this.smokingRoom = smokingRoom;
    }

    public boolean hasWashingRoom() {
        return washingRoom;
    }

    public void setWashingRoom(boolean washingRoom) {
        this.washingRoom = washingRoom;
    }
}
