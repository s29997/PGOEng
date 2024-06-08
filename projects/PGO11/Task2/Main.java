package PGO11.Task2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();

        items.add(new Item(1, "Item1"));
        items.add(new Item(2, "Item2"));
        items.add(new Item(3, "Item3"));
        items.add(new Item(4, "Item4"));
        items.add(new Item(5, "Item5"));

        for (int i = 0; i < items.size(); i++) {
            items.get(i).show();
        }

        HashMap<Integer, String> itemMap = new HashMap<>();
        for (int i = 0; i < items.size(); i++) {
            Item item = items.get(i);
            itemMap.put(item.getId(), item.getName());
        }

        for (Map.Entry<Integer, String> entry : itemMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
