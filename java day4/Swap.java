import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int arr[] = {0, 1, 1, 1, 0, 1, 0, 2, 1, 2};
        System.out.println("Original array: " + Arrays.toString(arr));
        
        sortColors(arr);
        
        System.out.println("After sorted array: " + Arrays.toString(arr));
    }

    private static void sortColors(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;

        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    swap(arr, mid, low);
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(arr, mid, high);
                    high--;
                    break;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
