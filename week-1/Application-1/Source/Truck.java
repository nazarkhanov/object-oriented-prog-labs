package Source;

import java.util.Scanner;

public class Truck extends Auto {
    private String model;
    private int power;
    private boolean trailer;

    public Truck() {
        super();
        this.model = "";
        this.power = 0;
        this.trailer = false;
    }

    public Truck(String firm, int maxSpeed, String id, String model, int power, boolean trailer) {
        super(firm, maxSpeed, id);
        this.model = model;
        this.power = power;
        this.trailer = trailer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public boolean isTrailer() {
        return trailer;
    }

    public void setTrailer(boolean trailer) {
        this.trailer = trailer;
    }

    public void setAllInfo() {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите фирму-производителя грузового авто: ");
        String firm = in.next();
        setFirm(firm);

        System.out.println("Введите макс. скорость грузового авто: ");
        int speed = in.nextInt();
        setMaxSpeed(speed);

        System.out.println("Введите модель грузового авто: ");
        String model = in.next();
        setModel(model);


        System.out.println("Введите мощность грузового авто: ");
        int power = in.nextInt();
        setPower(power);

        System.out.println("Введите признак прицепа грузового авто (true / false): ");
        boolean trailer = in.nextBoolean();
        setTrailer(trailer);
    }

    @Override
    public String toString() {
        return "Грузовик: \n" +
                "\t Фирма-производитель: " + getFirm() + '\n' +
                "\t Макс. скорость: " + getMaxSpeed() + '\n' +
                "\t Гос. номер: " + getGovId() + '\n' +
                "\t Модель: " + model + '\n' +
                "\t Мощность: " + power + '\n' +
                "\t Признак прицепа: " + trailer + '\n';

    }
}
