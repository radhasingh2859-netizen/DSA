
      
public static int[] shiftArray(int arr[]) {
        int first = arr[0];

        for (int idx = 0; idx < arr.length - 1; idx++) {
            arr[idx] = arr[idx + 1];
        }

        arr[arr.length - 1] = first;

        return arr;
    }

    public static void main(String args[]) {
        int arr[] = {1, 4, 2, 7, 4, 5, 7};

        shiftArray(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
