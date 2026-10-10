
import java.util.*;

public class Arrays {

    public static void multiplication(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] * 10;
        }
        return;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the arr");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("enter the element of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        multiplication(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);

        }

    }
}
