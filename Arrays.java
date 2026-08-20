
import java.util.*;

public class Arrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size = sc.nextInt();

        int sum = 0;
        double average = 0;

        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
            average = (double) sum / size;

        }
        System.out.println("sum:" + sum);
        System.out.println("average" + average);

    }

}
