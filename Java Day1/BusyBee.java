import java.util.Scanner;

class BusyBee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int res;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                res = (arr[i] + arr[j]) / 2;
                if (res >= m) {
                    System.out.print("(" + arr[i] + "," + arr[j] + ")");
                }
                res = 0;
            }

        }

    }
}