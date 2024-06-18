package Tests.Test2.Sample;

public interface Car
{

    void load(int weight, boolean isLiquid, boolean isDangerous);
    boolean canHandle(int weight, boolean isLiquid, boolean isDangerous);
    void unload();
    String getId();
    int getMaxWeight();
    int getCapacity();
    boolean isDangerous();
}
