package idkSomeLostFiles;

import idkSomeLostFiles.Container;

public class Ship {
    public String Name;
    public int Serial;
    public int MaxLoad;
    public int MaxContainers;
    public Container[] containers;

    public void AddContainer(Container container) {
        if (containers == null) {
            containers = new Container[MaxContainers];
        }

        int currentWeightShip = 0;
        for (int i = 0; i < nextEmptyIndex; i++) {
            currentWeightShip += container.currentWeight;
        }

        if (currentWeightShip + container.currentWeight > MaxLoad) {
            throw new IllegalArgumentException("Cargo exceed the max weight");
        }
        if (containers.length + 1 > MaxContainers) {
            throw new IllegalArgumentException("too many containers!");
        }
        containers[nextEmptyIndex] = container;
        z++;
    }
}