
import java.util.*;

public class Arrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of element");
        int n = sc.nextInt();
        System.out.println("enter the value of d to move to left ");
        int d = sc.nextInt();
        int arr[] = new int[n];
        int arr1[] = new int[n + d];

        System.out.print("enter the element");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length + d; i++) {
            arr1[i] = arr[(i + d) % n];

        }
        for (int i = 0; i < n + d; i++) {
            System.out.print(arr1[i]);
        }
    }
}
