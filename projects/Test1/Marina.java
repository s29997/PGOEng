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
        this.setMaxWatercraftCapacity(50);
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Cant be null name");
        }else{
            this.name = name;
        }
    }

    public void setAdress(String adress) {
        if (adress == null) {
            throw new IllegalArgumentException("Cant be null adress");
        }else{
            this.adress = adress;
        }
    }

    public void setMaxWatercraftCapacity(int maxWatercraftCapacity) {
        if (maxWatercraftCapacity <= 0) {
            throw new IllegalArgumentException("Cant be negative capacity bruh");
        }else{
            MaxWatercraftCapacity = maxWatercraftCapacity;
        }
    }

    public int getMaxWatercraftCapacity() {
        return MaxWatercraftCapacity;
    }

    public void addWatercraft(Watercraft watercraft) {
        if (watercrafts.size()>= getMaxWatercraftCapacity() ){
            throw new IllegalArgumentException("womp womp. not enough space");
        }
        if (checkIfWatercraftIsInMarina(watercraft)) {
            throw new IllegalArgumentException("it's not minecraft. You can't duplicate items! (Watercraft is already in garage)");
        }
        watercrafts.add(watercraft);
    }
    public void removeWatercraft(Watercraft watercraft) {
        if (watercrafts.size() == 0) {
            throw new IllegalArgumentException("There's no watercrafts in this garage!");
        }
        if (!checkIfWatercraftIsInMarina(watercraft)){
            throw new IllegalArgumentException("There's no such vehicle to delete!");
        }
        this.watercrafts.remove(watercraft);
    }

    private boolean checkIfWatercraftIsInMarina(Watercraft watercraft){
        for (int i = 0; i < watercrafts.size(); i++) {
            Watercraft WatecraftInMarina = watercrafts.get(i);
            if (WatecraftInMarina.getRegistrationNumber().equals(watercraft.getRegistrationNumber()))
                return true;
        }
        return false;
    }
}