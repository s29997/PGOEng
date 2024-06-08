package Tests.Test1;

public class Main {
    public static void main(String[] args) {
        Marina Marina1 = new Marina("Alpha", "sdfgefw", 50);
        Watercraft w1 = new Watercraft("yellow", "submarine", "OceanGate 1", 2019);
        Yacht y1 = new Yacht("white", "grer", "wfewefwef", 2000, 3245,"ambigous");
        Jetski j1 = new Jetski("blue", "wef", "wrgrgw",2345, 3425);
        Marina1.addWatercraft(w1);
        y1.DisplayInfo();
        j1.DisplayInfo();
        Marina1.removeWatercraft(w1);
    }
}
