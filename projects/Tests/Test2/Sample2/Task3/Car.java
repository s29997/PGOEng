package Tests.Test2.Sample2.Task3;

class Car extends Vehicle implements DriveStop {
    private double maxSpeed;
    private boolean isDriving;

    public Car(double fuelTankCapacity, int numberOfSeats, double maxSpeed) {
        super(fuelTankCapacity, numberOfSeats);
        this.maxSpeed = maxSpeed;
        this.isDriving = false;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void startDriving() {
        if (isDriving) {
            throw new IllegalStateException("Car is already driving.");
        }
        isDriving = true;
    }

    @Override
    public void stopDriving() {
        if (!isDriving) {
            throw new IllegalStateException("Car is not driving.");
        }
        isDriving = false;
    }

    public boolean isDriving() {
        return isDriving;
    }
}
