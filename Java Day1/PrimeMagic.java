import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class PrimeMagic {
    public static boolean isPrime(int n) {
        if (n < 2)
            return false;
        if (n == 2)
            return true;
        if (n % 2 == 0)
            return false;

        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        List<Integer> primeSums = new ArrayList<>();
        int sum = 0, count = 0;
        for (int i = 2; sum + i <= N; i++) {
            if (isPrime(i)) {
                sum += i;
                primeSums.add(sum);
            }
        }

        for (int ps : primeSums) {
            if (ps >= 3 && ps <= N && isPrime(ps)) {
                count++;
            }
        }

        System.out.println(count);
    }
}
