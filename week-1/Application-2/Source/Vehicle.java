package Source;

public class Vehicle {
    private int id = 0;
    private double speed = 0;
    private double price = 0;
    private int totalSeatsCount = 0;
    private int currentSeatsCount = 0;
    private String departureTime = "";
    private String arrivalTime = "";
    private String pickUpPlace = "";
    private String dropOffPlace = "";

    public Vehicle() {
    }

    public Vehicle(int id, String pickUpPlace, String dropOffPlace, String departureTime, String arrivalTime, double speed, double price, int totalSeatsCount) {
        this.id = id;
        this.dropOffPlace = departureTime;
        this.pickUpPlace = arrivalTime;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
        this.speed = speed;
        this.price = price;
        this.totalSeatsCount = totalSeatsCount;
        this.currentSeatsCount = totalSeatsCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getTotalSeatsCount() {
        return totalSeatsCount;
    }

    public void setTotalSeatsCount(int totalSeatsCount) {
        this.totalSeatsCount = totalSeatsCount;
    }

    public int getCurrentSeatsCount() {
        return currentSeatsCount;
    }

    public void setCurrentSeatsCount(int currentSeatsCount) {
        if (0 <= currentSeatsCount && currentSeatsCount <= totalSeatsCount) this.currentSeatsCount = currentSeatsCount;
    }

    public void takeFreeSeats(int count) {
        if (0 <= currentSeatsCount - count && currentSeatsCount - count <= totalSeatsCount) this.currentSeatsCount = currentSeatsCount - count;
    }

    public boolean hasFreeSeats(int count) { return 0 <= currentSeatsCount - count && currentSeatsCount - count <= totalSeatsCount; }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getPickUpPlace() {
        return pickUpPlace;
    }

    public void setPickUpPlace(String pickUpPlace) {
        this.pickUpPlace = pickUpPlace;
    }

    public String getDropOffPlace() {
        return dropOffPlace;
    }

    public void setDropOffPlace(String dropOffPlace) {
        this.dropOffPlace = dropOffPlace;
    }
}
