
public class Arrays {

    public static void main(String[] args) {
        int arr[] = {10, 25, 3, 48, 17};
        int smallest = arr[0];
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];

            }
            if (arr[i] > largest) {
                largest = arr[i];
            }

        }
        System.out.println("smallest" + smallest);
        System.out.println("largest" + largest);
    }

}
