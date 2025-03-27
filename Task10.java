import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd = Euclid(a, b);
        System.out.print(gcd);
    }

    public static int Euclid(int a, int b) {
        if (b == 0){
            return a;
        }
        return Euclid(b, a % b);
    }
}
