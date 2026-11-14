
public class TotalOccurance {

    public static int lowerBound(int arr[], int target) {
        int n = arr.length;
        int s = 0;
        int e = n - 1;
        int ans = n;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] >= target) {
                ans = mid;

                e = mid - 1;

            } else {
                s = mid + 1;

            }

        }
        return ans;

    }

    public static int upperBound(int arr[], int target) {
        int n = arr.length;
        int s = 0;
        int e = n - 1;
        int ans = n;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] <= target) {

                s = mid + 1;

            } else {
                ans = mid;
                e = mid - 1;

            }

        }
        return ans;

    }

    public static void main(String args[]) {
        int arr[] = {1, 2, 2, 2, 3, 3, 4, 5};

        int lower = lowerBound(arr, 2);
        int upper = upperBound(arr, 2);
        int ans = upper - lower;
        System.out.println(ans);

    }
}
