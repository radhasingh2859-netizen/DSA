
import java.util.*;

public class framework {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        // Add
        list.add(10);
        list.add(20);
        list.add(30);

        // Add at index
        list.add(1, 15);

        // Access
        System.out.println(list.get(2));

        // Update
        list.set(0, 100);

        // Remove
        list.remove(1);

        // Size
        System.out.println(list.size());

        // Print
        System.out.println(list);
    }
}
