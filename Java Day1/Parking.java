import java.util.Scanner;

class Parking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        int mc = 0;
        int f = 0;

        for (char c : arr) {
            if (c == 'S') {
                f += 1;
                mc = Math.max(mc, f);
            } else {
                f = 0;
            }
        }

        System.out.println(mc);
    }
}
