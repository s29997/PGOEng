package PGO8.Lecture;
public class Car extends Vehicle {
    private boolean IsEletric;
    public Car(String brand, String model, String registrationNumber, Integer yearOfProduction, boolean IsElectric) {
        super(brand, model, registrationNumber, yearOfProduction);
        this.setEletric(IsEletric);
    }
    public void setEletric(boolean eletric) {
        IsEletric = eletric;
    }
}
