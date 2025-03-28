import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = Factorial(n);
        System.out.println(fact);
    }

    public static int Factorial(int n){
        // Base case :)
        if (n <= 1) return 1;
        // Recursive one
        return Factorial(n -1) * n;
    }
}
