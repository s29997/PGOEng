package Test1;

import java.util.ArrayList;
public class Marina {
    private String name;
    private String adress;
    private int MaxWatercraftCapacity;
    private ArrayList<Watercraft> watercrafts = new ArrayList<>();

    public Marina(String name, String adress, int maxWatercraftCapacity) {
        this.setName(name);
        this.setAdress(adress);
        this.setMaxWatercraftCapacity(maxWatercraftCapacity);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setMaxWatercraftCapacity(int maxWatercraftCapacity) {
        MaxWatercraftCapacity = maxWatercraftCapacity;
    }

    public int getMaxWatercraftCapacity() {
        return MaxWatercraftCapacity;
    }

    public void addVehicle(Watercraft watercraft) {
        if (watercrafts.size()>= getMaxWatercraftCapacity() ){
            throw new IllegalArgumentException("womp womp. not enough space");
        }else{
            watercrafts.add(watercraft);
        }
    }
}

