package Source;

public class Car extends  Auto {
    private String model;
    private int numDoors;
    private boolean fullTime;

    public Car() {
        super();
        this.model = "";
        this.numDoors = 4;
        this.fullTime = false;
    }

    public Car(String firma, int speed, String id, String name, int n, boolean f) {
        super(firma, speed, id);
        this.model = name;
        this.numDoors = n;
        this.fullTime = f;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    public boolean isFullTime() {
        return fullTime;
    }

    public void setFullTime(boolean fullTime) {
        this.fullTime = fullTime;
    }

    @Override
    public String toString() {
        return "Машина: \n" +
            "\t Фирма-производитель: " + getFirm() + '\n' +
            "\t Макс. скорость: " + getMaxSpeed() + '\n' +
            "\t Гос. номер: " + getGovId() + '\n' +
            "\t Модель: " + model + '\n' +
            "\t Кол-во дверей: " + numDoors + '\n' +
            "\t Полный привод: " + fullTime + '\n';
    }
}
