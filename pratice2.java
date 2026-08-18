
import java.util.*;

public class pratice2 {

    public static void main(String[] args) {
        System.out.println("Enter a number: ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = Math.abs(n);
        int count = 0;
        if (num == 0) {
            count = 1;
        } else {
            while (n != 0) {
                n = n / 10;
                count++;

            }
        }
        System.out.println("Number of digits: " + count);
    }

}
