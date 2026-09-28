
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        int[] arr = {2, 7, 11, 15};

        int target = 9;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            int required = target - arr[i];

            if (map.containsKey(required)) {

                System.out.println("Index 1 = " + map.get(required));
                System.out.println("Index 2 = " + i);

                System.out.println(
                    "Numbers = " + required + " + " + arr[i]
                );

                return;
            }

            map.put(arr[i], i);
        }

        System.out.println("No pair found");
    }
}