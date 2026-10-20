
public class Arrays {

    public static int[] Sorting(int arr[]) {
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
                j++;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {1, 0, 0, 0, 1, 1, 0, 0, 1};

        int ans[] = Sorting(arr);

        System.out.println(java.util.Arrays.toString(ans));
    }
}
