import Source.*;

public class Main {
    public static void main(String[] args) {
        TicketsService ts = new TicketsService();



        Airplane myPlane1 = new Airplane(
                1,
                "Almaty, KZ",
                "Astana, KZ",
                "11-01-2023",
                "12-01-2023",
                350.0,
                24000.0,
                150,
                974
        );
        ts.addVehicle(myPlane1);

        Airplane myPlane2 = new Airplane(
                2,
                "Moscow, RU",
                "Almaty, KZ",
                "11-01-2023",
                "12-01-2023",
                350.0,
                120000.0,
                120,
                544
        );
        ts.addVehicle(myPlane2);

        Airplane myPlane3 = new Airplane(
                3,
                "New York, USA",
                "Astana, KZ",
                "24-01-2023",
                "25-01-2023",
                350.0,
                589000.0,
                164,
                7891
        );
        ts.addVehicle(myPlane3);



        Auto myAuto1 = new Auto(
                43,
                "Almaty, Auezov district, st. Abay №31",
                "Almaty, Zhetysu district, st. Abakanskaya №24",
                "02-01-2023",
                "02-01-2023",
                70.0,
                3000.0,
                4,
                "Toyota Camry 30",
                "gas"
        );
        ts.addVehicle(myAuto1);

        Auto myAuto2 = new Auto(
                67,
                "Almaty, Microdistrict Aigerim 2, st. Zhana Gasyr №12",
                "Almaty, Bostandyksky district, st. Vinogradnaya №51",
                "04-01-2023",
                "04-01-2023",
                70.0,
                3400.0,
                4,
                "Tesla Model S",
                "electric"
        );
        ts.addVehicle(myAuto2);



        Train myTrain = new Train(
                67,
                "Almaty, KZ",
                "Moscow, RU",
                "07-01-2023",
                "09-01-2023",
                220.0,
                20000.0,
                320,
                3003,
                "lux"
        );
        ts.addVehicle(myTrain);



        System.out.println("# Before buying tickets\n");
        showCountOfVehiclesWithFreeSeats(ts);

        if (myPlane2.hasFreeSeats(120)) myPlane2.takeFreeSeats(120);
        if (myPlane3.hasFreeSeats(17)) myPlane3.takeFreeSeats(17);
        if (myAuto2.hasFreeSeats(4)) myAuto2.takeFreeSeats(4);
        if (myTrain.hasFreeSeats(24)) myTrain.takeFreeSeats(24);

        System.out.println("# After buying tickets\n");
        showCountOfVehiclesWithFreeSeats(ts);

        System.out.println("# Info about airplanes tickets with free seats\n");
        showInfoAboutAitplanesWithFreeSeats(ts);
    }

    public static void showCountOfVehiclesWithFreeSeats(TicketsService ts) {
        int airplaneCount = 0,
                autoCount = 0,
                trainCount = 0;

        int airplaneSeats = 0,
                autoSeats = 0,
                trainSeats = 0;

        for (Vehicle v : ts.vehicles) {
            if (v.hasFreeSeats(1)) {
                if (v instanceof Airplane) {
                    airplaneCount++;
                    airplaneSeats += v.getCurrentSeatsCount();
                }
                if (v instanceof Auto) {
                    autoCount++;
                    autoSeats += v.getCurrentSeatsCount();
                }
                if (v instanceof Train) {
                    trainCount++;
                    trainSeats += v.getCurrentSeatsCount();
                }
            }
        }

        System.out.println(
                "Total free vehicles count by type \n" +
                        "\t" + airplaneCount + " airplanes has totally: " + airplaneSeats + "\n" +
                        "\t" + autoCount + " autos has totally: " + autoSeats + "\n" +
                        "\t" + trainCount + " trains has totally: " + trainSeats + "\n"
        );
    }

    public static void showInfoAboutAitplanesWithFreeSeats(TicketsService ts) {
        for (Vehicle v : ts.vehicles) {
            if (!v.hasFreeSeats(1)) continue;
            if (!(v instanceof Airplane)) continue;
            System.out.println(
                "Airplane #" + v.getId() + " details:\n" +
                        "\tFrom: " + v.getPickUpPlace() + "\n" +
                        "\tTo: " + v.getDropOffPlace() + "\n" +
                        "\tDeparture date: " + v.getDepartureTime() + "\n" +
                        "\tArrival date: " + v.getArrivalTime() + "\n" +
                        "\tPrice: " + v.getPrice() + "\n" +
                        "\tSpeed: " + v.getSpeed() + "\n" +
                        "\tFree seats count: " + v.getCurrentSeatsCount() + "\n" +
                        "\tTotal seats count: " + v.getTotalSeatsCount() + "\n" +
                        "\tFlight: " + ((Airplane) v).getFlightId() + "\n"
            );
        }
    }
}