package Tests.Test1;

public class Jetski extends Watercraft{
    private int EnginePower;

    public Jetski(String color, String model, String registrationNumber, Integer yearOfProduction, int enginePower) {
        super(color, model, registrationNumber, yearOfProduction);
        this.setEnginePower(enginePower);
    }
///
    public void setEnginePower(int enginePower) {
        if (enginePower <= 0) {
            throw new IllegalArgumentException("cant be negative power");
        }else {
            EnginePower = enginePower;
        }
    }
///
    public int getEnginePower() {
        return EnginePower;
    }
///
    @Override
    public void DisplayInfo() {
        super.DisplayInfo();
        System.out.println(EnginePower);
        }
}

