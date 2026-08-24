
import java.util.*;

public class Arrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of element");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the element ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the target value");
        int d = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == d) {
                    System.out.println(arr[i] + "+" + arr[j] + "=" + d);
                }
            }
        }
    }
}
