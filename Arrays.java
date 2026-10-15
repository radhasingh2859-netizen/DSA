
public class Arrays {

    public static int[] numOfzeroAndOne(int arr[]) {
        int zero = 0;
        int one = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zero++;
                System.out.println(".()");

            } else if (arr[i] == 1) {
                one++;

            }
        }
        int ans[] = {zero, one};
        return ans;

    }

    public static void main(String args[]) {
        int arr[] = {1, 0, 0, 1, 3, 9, 1};
        int ans[] = numOfzeroAndOne(arr);
        System.out.println("number of zeroes" + ans[0]);
        System.out.println("number of ones" + ans[1]);
    }
}
