package Tests.Test2.Test.Task5;

abstract class Vehicle implements StartStopEngine, Refuel {
    private double fuelTankCapacity;
    private int numberOfSeats;
    private boolean isEngineOn;

    public Vehicle(double fuelTankCapacity, int numberOfSeats) {
        this.fuelTankCapacity = fuelTankCapacity;
        this.numberOfSeats = numberOfSeats;
        this.isEngineOn = false;
    }

    public double getFuelTankCapacity() {
        return fuelTankCapacity;
    }

    public void setFuelTankCapacity(double fuelTankCapacity) {
        this.fuelTankCapacity = fuelTankCapacity;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public boolean isEngineOn() {
        return isEngineOn;
    }

    public void setEngineOn(boolean engineOn) {
        isEngineOn = engineOn;
    }

    @Override
    public void startEngine() {
        if (isEngineOn) {
            throw new IllegalStateException("Engine is already running.");
        }
        isEngineOn = true;
    }

    @Override
    public void stopEngine() {
        if (!isEngineOn) {
            throw new IllegalStateException("Engine is not running.");
        }
        isEngineOn = false;
    }

    @Override
    public void refuel(double liters) {
        if (liters > fuelTankCapacity) {
            throw new IllegalArgumentException("Cannot refuel more than the tank's capacity.");
        }
        // Add fuel logic here (not specified in the task, so just a placeholder)
    }
}
