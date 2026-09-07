
import java.util.*;

class Solutions {

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x != 0 && x % 10 == 0) {
            return false;
        }
        int original = x;
        int reverse = 0;

        while (x != 0) {
            int lastdigit = x % 10;
            reverse = reverse * 10 + lastdigit;
            x = x / 10;
        }
        return original == reverse;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of x");
        int x = sc.nextInt();
        System.out.println(isPalindrome(x));
    }

}
