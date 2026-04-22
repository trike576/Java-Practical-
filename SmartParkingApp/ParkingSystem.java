import java.util.ArrayList;
import java.util.Scanner;

public class ParkingSystem {

    static final int CAPACITY = 2;
    static ArrayList<Vehicle> parkedVehicles = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            while (true) {
                System.out.println("1. Park Car");
                System.out.println("2. Park Bike");
                System.out.println("3. Exit Vehicle");
                System.out.println("4. Exit System");

                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        parkCar(sc);
                        break;

                    case 2:
                        parkBike(sc);
                        break;

                    case 3:
                        exitVehicle(sc);
                        break;

                    case 4:
                        return;

                    default:
                        System.out.println("Invalid choice.");
                }
            }

        } catch (ParkingFullException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    static void parkCar(Scanner sc) throws ParkingFullException {
        System.out.print("Enter car number: ");
        String number = sc.next();

        System.out.print("Enter entry time: ");
        int time = sc.nextInt();

        if (time < 0) {
            throw new IllegalArgumentException("Invalid entry time.");
        }

        Vehicle car = new Car(number, time);
        parkVehicle(car);
    }

    static void parkBike(Scanner sc) throws ParkingFullException {
        System.out.print("Enter bike number: ");
        String number = sc.next();

        System.out.print("Enter entry time: ");
        int time = sc.nextInt();

        if (time < 0) {
            throw new IllegalArgumentException("Invalid entry time.");
        }

        Vehicle bike = new Bike(number, time);
        parkVehicle(bike);
    }

    static void parkVehicle(Vehicle v) throws ParkingFullException {
        if (parkedVehicles.size() >= CAPACITY) {
            throw new ParkingFullException("Parking is full.");
        }
        parkedVehicles.add(v);
        v.parkVehicle();
    }

    static void exitVehicle(Scanner sc) {
        System.out.print("Enter vehicle number: ");
        String number = sc.next();

        for (Vehicle v : parkedVehicles) {
            if (v.vehicleNumber.equals(number)) {
                System.out.print("Enter exit time: ");
                int exitTime = sc.nextInt();

                v.setExitTime(exitTime);
                v.exitVehicle();

                try {
                    double fee = v.calculateFee();
                    System.out.println("Parking Fee: " + fee);
                } catch (IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage());
                }

                parkedVehicles.remove(v);
                return;
            }
        }

        System.out.println("Vehicle not found.");
    }
}