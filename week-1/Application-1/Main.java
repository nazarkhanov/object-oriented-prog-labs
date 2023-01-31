import Source.Auto;
import Source.Car;
import Source.Truck;
import Source.Garage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // testAutoWithoutInput();
        // testAutoWithInput();
        // System.out.println();
        // testCarWithInput();
        // System.out.println();
        // testTruckWithInput();
        // System.out.println();
        testGarage();
    }

    public static void testAutoWithoutInput() {
        Auto myAuto = new Auto("Ford", 180, "A003");
        System.out.println(myAuto.getFirm() + " " + myAuto.getMaxSpeed());
    }

    public static void testAutoWithInput() {
        Scanner in = new Scanner(System.in);
        Auto myAuto = new Auto();

        System.out.println("Введите фирму-производителя: ");
        String firm = in.next();
        myAuto.setFirm(firm);

        System.out.println("Введите макс. скорость: ");
        int speed = in.nextInt();
        myAuto.setMaxSpeed(speed);

        System.out.println("Авто: \n" +
                "\t Фирма-производитель: " + myAuto.getFirm() + '\n' +
                "\t Макс. скорость: " + myAuto.getMaxSpeed() + '\n');
    }

    public static void testCarWithInput() {
        Scanner in = new Scanner(System.in);
        Car myCar1 = new Car("Ford", 200, "F203", "Mustang", 2, false);
        Car myCar2 = new Car();

        System.out.println("Введите фирму-производителя легкового авто: ");
        String firm = in.next();
        myCar2.setFirm(firm);

        System.out.println("Введите макс. скорость легкового авто: ");
        int speed = in.nextInt();
        myCar2.setMaxSpeed(speed);

        System.out.println("Введите модель легкового авто: ");
        String model = in.next();
        myCar2.setModel(model);


        System.out.println("Введите кол-во дверей легкового авто: ");
        int power = in.nextInt();
        myCar2.setNumDoors(power);

        System.out.println("Введите признак полного привода легкового авто (true / false): ");
        boolean trailer = in.nextBoolean();
        myCar2.setFullTime(trailer);

        System.out.println(myCar1.toString() + '\n');
        System.out.println(myCar2.toString() + '\n');
    }

    public static void testTruckWithInput() {
        Truck myTruck = new Truck();
        myTruck.setAllInfo();
        System.out.println(myTruck.toString() + '\n');
    }

    public static void testGarage() {
        Garage myGarage = new Garage();

        Car myCar1 = new Car("Ford", 180, "B002", "Mustang", 2, false);
        myGarage.add(myCar1);

        Car myCar2 = new Car("LADA", 150, "D231", "Kalina", 4, false);
        myGarage.add(myCar2);

        Truck myTruck = new Truck("Dove", 150, "P043", "DTS", 10, true);
        myGarage.add(myTruck);

        myGarage.remove(myCar1);
        myGarage.print();

        System.out.println("Есть ли моя машина 2 в гараже? " + (myGarage.find(myCar2) ? "Да" : "Нет") + '\n');

        for(int i = 0; i < myGarage.list.size(); i++) {
            Auto auto = myGarage.list.get(i);
            System.out.print("Типа авто " + (i + 1) + ": ");
            if (auto instanceof Car) System.out.println("Это легковая машина");
            if (auto instanceof Truck) System.out.println("Это грузовая машина");
        }
    }
}