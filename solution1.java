
import java.util.ArrayList;
import java.util.List;

class solution1 {

    public List<List<Integer>> threeSum(int arr[], int target) {
        List<List<Integer>> result = new ArrayList<>();

        int n = arr.length;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        List<Integer> triplet = new ArrayList<>();
                        triplet.add(arr[i]);
                        triplet.add(arr[j]);
                        triplet.add(arr[k]);
                        result.add(triplet);

                    }

                }

            }

        }
        return new ArrayList<>(result);

    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        List<List<Integer>> ans = new solution1().threeSum(arr, 6);
        System.out.println(ans);
    }

}
