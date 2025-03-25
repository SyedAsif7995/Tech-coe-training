import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Chocolate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int m = sc.nextInt();
        int mx, mn, di;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i; j < i + 3; j++) {
                arr1.add(arr[j]);
            }
            mx = Collections.max(arr1);
            mn = Collections.min(arr1);
            di = mx - mn;
            res.add(di);
            arr1.clear();
        }

        System.out.println(Collections.min(res));
    }
}
