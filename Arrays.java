
public class Arrays {

    public static int uniqueelement(int arr[]) {
        int sum = 0;
        for (int elem : arr) {
            sum = sum ^ elem;

        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 3, 4, 4};
        int ans = uniqueelement(arr);

        System.out.println(ans);

    }
}
