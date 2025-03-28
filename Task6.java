import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int NinM = exponential(n, m);
        System.out.println(NinM);
    }

    public static int exponential(int n, int m) {
        // Base case
        if (m == 0){
            return 1;
        }
        // ReCuRsIvE CaLl
        return n * exponential(n, m - 1);
    }
}
