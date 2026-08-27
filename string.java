
import java.util.*;

public class string {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the email id ");
        String email = sc.next();
        String a = " ";
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                break;
            } else {
                a += email.charAt(i);

            }

        }

        System.out.println(a);
    }
}
