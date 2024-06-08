package Tests.Test1;

public class Watercraft {
    private String color;
    private String model;
    private String registrationNumber;
    private Integer yearOfProduction;

    public Watercraft(String color, String model, String registrationNumber, Integer yearOfProduction) {
        this.color = color;
        this.model = model;
        this.registrationNumber = registrationNumber;
        this.setYearOfProduction(yearOfProduction);
    }
///
    public String getColor() {
        return color;
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
    private void setColor(String color) {
        this.color = color;
    }
    private void setYearOfProduction(Integer yearOfProduction) {
        if (yearOfProduction >= 0){
            this.yearOfProduction = yearOfProduction;
        }else{
            throw new IllegalArgumentException("wrong year!");
        }
    }
    private void setModel(String model) {
        this.model = model;
    }
    private void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
///
    public void DisplayInfo() {
        System.out.println(color);
        System.out.println(model);
        System.out.println(yearOfProduction);
        System.out.println(registrationNumber);
    }
}