import java.util.Arrays;

class Zero {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 0, 1, 1 };
        int n = arr.length;
        int l = 0, r = n - 1;
        while (l < r) {
            while (arr[l] == 0 && l < r)
                l++;
            while (arr[r] == 1 && l < r)
                r--;
            if (l < r) {
                int t = arr[l];
                arr[l] = arr[r];
                arr[r] = t;
                l++;
                r--;
            }
        }
        System.out.println(Arrays.toString(arr));

    }

}