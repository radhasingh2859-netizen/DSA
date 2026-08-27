
import java.util.*;

public class string {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the string array ");
        int a = sc.nextInt();
        String arr[] = new String[a];
        for (int i = 0; i < a; i++) {
            arr[i] = sc.next();

        }
        int b = 0;
        for (int i = 0; i < a; i++) {
            b = b + arr[i].length();

        }
        System.out.println(b);

    }
}
