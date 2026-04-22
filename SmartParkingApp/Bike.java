public class Bike extends Vehicle {

    public Bike(String vehicleNumber, int entryTime) {
        super(vehicleNumber, entryTime);
    }

    @Override
    public double calculateFee() {
        int duration = exitTime - entryTime;
        if (duration < 0) {
            throw new IllegalArgumentException("Invalid time duration.");
        }
        return duration * 10;
    }
}
