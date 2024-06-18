package Tests.Test2.Test.Task5;

class Ship extends Vehicle implements Swim {
    private boolean isSwimming;

    public Ship(double fuelTankCapacity, int numberOfSeats) {
        super(fuelTankCapacity, numberOfSeats);
        this.isSwimming = false;
    }

    @Override
    public void startSwimming() {
        if (isSwimming) {
            throw new IllegalStateException("Ship is already swimming.");
        }
        isSwimming = true;
    }

    @Override
    public void stopSwimming() {
        if (!isSwimming) {
            throw new IllegalStateException("Ship is not swimming.");
        }
        isSwimming = false;
    }

    public boolean isSwimming() {
        return isSwimming;
    }

    public void setTargetCoordinates(int x, int y) {
        // Implementation to set target coordinates (x, y)
    }
}
