package Test1;

public class Boat extends Watercraft {
    private boolean IsEletric;
    public Boat(String brand, String model, String registrationNumber, Integer yearOfProduction, boolean IsElectric) {
        super(brand, model, registrationNumber, yearOfProduction);
        this.setEletric(IsEletric);
    }
    public void setEletric(boolean eletric) {
        IsEletric = eletric;
    }
}
