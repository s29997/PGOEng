package PGO11.Task3;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();

        for (int i = 1; i <= 15; i++) {
            items.add(new Item(i, "Item" + i));
        }

        List<Item> firstFiveItems = items.subList(0, 5);
        HashSet<Item> itemSet = new HashSet<>(firstFiveItems);

        for (Item item : itemSet) {
            item.show();
        }
    }
}
