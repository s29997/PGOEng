package Tests.Test2.Test.Task3;
interface StartStopEngine {
    void startEngine();
    void stopEngine();
}
interface Refuel {
    void refuel(double liters);
}
interface DriveStop {
    void startDriving();
    void stopDriving();
}
interface Swim {
    void startSwimming();
    void stopSwimming();
}
interface DriveAndSwim extends DriveStop, Swim {
}