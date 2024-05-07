package PGO8Lecture;

public class Main {
    public static void main(String[] args) {
        Vehicle v= new Vehicle("Ford", "AAA", "wege354", 2004);
        Truck t = new Truck("Ford", "AAA", "wege354", 2004, 58);
        Car c = new Car("dsjyr","vgj","tdhy57",6885,true);
        garage g = new garage("asd", "gwrgwrg 23", 3);
        g.addVehicle(c);
        g.addVehicle(t);
        g.addVehicle(v);
        v.DisplayInfo();
    }
}
