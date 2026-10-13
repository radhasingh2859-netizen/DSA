
public class Arrays {

    public static int SumOfPosNeg(int arr[]) {
        int pos = 0;
        int neg = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                neg += arr[i];
            } else {
                pos += arr[i];
            }
        }

        return pos + neg;
    }

    public static void main(String args[]) {
        int arr[] = {1, -3, -2, -5, 4, 6};
        System.out.println(SumOfPosNeg(arr));
    }
}
