import java.util.*;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int[] arr = {1, 2, 2, 3, 1, 2};

        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        System.out.println(map);
    }
}