package arraylist;
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        // By default, ArrayList has capacity 10 (can grow dynamically)
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(1, 80); // Insert 80 at index 1

        // Normal for loop
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i)); // fixed: i instead of 1
        }

        System.out.println("---- Enhanced For Loop ----");

        // Enhanced for loop (for-each)
        for (int i : arr) {
            System.out.println(i);
        }

        // Printing size and specific element
        System.out.println("Size: " + arr.size());
        System.out.println("Element at index 1: " + arr.get(1));
    }
}
