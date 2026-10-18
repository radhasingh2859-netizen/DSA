
import java.util.HashMap;

public class Arrays {

    public static int getmode(int arr[]) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int mode = arr[0];
        int maxCount = 0;

        for (int num : freq.keySet()) {
            if (freq.get(num) > maxCount) {
                maxCount = freq.get(num);
                mode = num;
            }
        }

        return mode;
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 1, 2, 3, 3, 3, 5, 5, 5, 5, 3, 2, 5};
        int ans = getmode(arr);
        System.out.println(ans);
    }
}
