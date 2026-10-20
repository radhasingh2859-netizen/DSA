
public class Arrays {

    public static int missing(int arr[]) {
        int sum = 0;
        int n = arr.length;
        for (int value : arr) {
            sum = sum ^ value;

        }
        for (int idx = 0; idx < arr.length; idx++) {
            sum = sum ^ idx;

        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 4, 6};
        int ans = missing(arr);
        System.out.println(ans);
    }
}
