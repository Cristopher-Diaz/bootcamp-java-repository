import java.util.ArrayList;
import java.util.List;

public class Bolsa<T> {
    private List<T> items;
    private int maxSize;

    public Bolsa(int maxSize) {
        this.maxSize = maxSize;
        this.items = new ArrayList<>();
    }

    public void addItem(T item) {
        if (items.size() < maxSize) {
            items.add(item);
            System.out.println("Item added to the bag.");
        } else {
            System.out.println("The bag is full. Cannot add more items.");
        }
    }

    public void printItems() {
        if (items.isEmpty()) {
            System.out.println("The bag is empty.");
        } else {
            System.out.println("Items in the bag:");
            for (T item : items) {
                System.out.println(item);
            }
        }
    }
}

