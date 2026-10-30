
class Binarysearch {

    public static void main(String[] args) {

        int arr[] = {5, 10, 15, 20, 25, 30, 35};
        int target = 25;

        int low = 0;
        int high = arr.length - 1;
        int found = -1;

        for (int i = low; low <= high; i++) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                found = mid;
                break;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (found != -1) {
            System.out.println("Element found at index: " + found);
        } else {
            System.out.println("Element not found");
        }
    }
}
