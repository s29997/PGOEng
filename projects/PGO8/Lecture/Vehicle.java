package PGO8.Lecture;

public class Vehicle {
    private String brand;
    private String model;
    private String registrationNumber;
    private Integer yearOfProduction;

    public Vehicle(String brand, String model, String registrationNumber, Integer yearOfProduction) {
        this.brand = brand;
        this.model = model;
        this.registrationNumber = registrationNumber;
        this.setYearOfProduction(yearOfProduction);
    }

    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public Integer getYearOfProduction() {
        return yearOfProduction;
    }
    public String getRegistrationNumber() {
        return registrationNumber;
    }

///

    private void setBrand(String brand) {
        this.brand = brand;
    }
    private void setYearOfProduction(Integer yearOfProduction) {
        if (yearOfProduction >= 0){
            this.yearOfProduction = yearOfProduction;
        }else{
            throw new IllegalArgumentException("wrong");
        }
    }

    private void setModel(String model) {
        this.model = model;
    }
    private void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
    public void DisplayInfo() {
        System.out.println("Diz iz a Vegigle");
    }
}