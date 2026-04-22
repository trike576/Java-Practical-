public abstract class Vehicle implements Parkable {
    String vehicleNumber;
    int entryTime;
    int exitTime;

    public Vehicle(String vehicleNumber, int entryTime) {
        this.vehicleNumber = vehicleNumber;
        this.entryTime = entryTime;
    }

    public void setExitTime(int exitTime) {
        this.exitTime = exitTime;
    }

    public abstract double calculateFee();

    @Override
    public void parkVehicle() {
        System.out.println("Vehicle " + vehicleNumber + " parked at time " + entryTime);
    }

    @Override
    public void exitVehicle() {
        System.out.println("Vehicle " + vehicleNumber + " exited at time " + exitTime);
    }
}
