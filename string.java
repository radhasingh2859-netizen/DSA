
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
        String result = " ";
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < arr[i].length(); j++) {

                if (arr[i].charAt(j) == 'e') {
                    result += 'i';

                } else {
                    result += arr[i].charAt(j);
                }
            }
        }

        System.out.println(result);
    }
}
