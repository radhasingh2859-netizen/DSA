
public class solution {

    static int[] twoSum(int arr[], int target) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    static void main(String[] args) {
        int arr[] = {1, 4, 6, 4, 5};
        int ans[] = twoSum(arr, 8);
        System.out.println(java.util.Arrays.toString(ans));
    }
}
