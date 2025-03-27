import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int results = BinomialCoefficient(n, k);
        System.out.println(results);
    }

    public static int BinomialCoefficient(int n, int k) {
        if (k == 0 || n == k) {
            return 1;
        }
        return BinomialCoefficient(n - 1, k - 1) + BinomialCoefficient(n - 1, k);
    }
}
