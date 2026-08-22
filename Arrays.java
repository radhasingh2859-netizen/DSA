
import java.util.*;

public class Arrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of first array");
        int n = sc.nextInt();
        System.out.println("enter the size of second array");

        int n1 = sc.nextInt();
        int arr1[] = new int[n];
        System.out.println("Enter the element in first array");

        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();

        }
        System.out.println("Enter the element in second array");
        int arr2[] = new int[n1];
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();

        }
        int arr3[] = new int[n + n1];
        for (int i = 0; i < n; i++) {

            arr3[i] = arr1[i];
        }
        for (int i = 0; i < n1; i++) {
            arr3[i + n1] = arr2[i];

        }
        System.out.println("merge array");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");

        }

    }
}
