
import java.util.HashMap;

public class Arrays {

    public static int[] HighestLowestFreq(int arr[]) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);

        }
        int HighestFreq = Integer.MIN_VALUE;
        int highestnum = -1;
        for (int key : freq.keySet()) {
            int currentkey = key;
            int currentfreq = freq.get(key);
            if (currentfreq > HighestFreq) {
                HighestFreq = currentfreq;
                highestnum = currentkey;
            }

        }
        int lowestfreq = Integer.MAX_VALUE;
        int lowestnum = -1;
        for (int key : freq.keySet()) {
            int currentkey = key;
            int currentfreq = freq.get(key);
            if (currentfreq < lowestfreq) {
                lowestfreq = currentfreq;
                lowestnum = currentkey;

            }

        }
        int ans[] = {highestnum, lowestnum};
        return ans;

    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 1, 2, 3, 4, 5, 5, 5, 3, 4, 5, 5};
        int ans[] = HighestLowestFreq(arr);
        System.out.println("highestfrequency" + ans[0]);
        System.out.println("lowestfrequency" + ans[1]);

    }
}
