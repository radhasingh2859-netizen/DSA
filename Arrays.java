
public class Arrays {

    public int UnsortedElement(int arr[]) {
        for (int i = 0; i < arr.length; i++) {

            if (arr[i + 1] < arr[i]) {
                return arr[i + 1];

            }
        }
        return -1;
    }

    public void main(String[] args) {
        int arr[] = {1, 6, 3, 4, 2, 4};
        System.out.println("unsorSted element is:" + UnsortedElement(arr));

    }
}
