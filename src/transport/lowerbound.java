
public class lowerbound {

    public static int getlowerbound(int arr[], int target) {
        int n = arr.length;
        int s = 0;
        int e = n - 1;
        int ans = -1;
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

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 3, 3, 4, 5, 6};
        int target = 3;
        System.out.println(getlowerbound(arr, target));
    }
}
