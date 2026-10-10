
import java.util.*;

public class Arrays {

    public static double FindAverage(int[] arr, int n, int sum) {
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        return (double) sum / n;
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

        double average = FindAverage(arr, n, 0);
        System.out.println("Average = " + average);
    }
}
