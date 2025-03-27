import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ReverseArray(n, sc);
    }

    public static void ReverseArray(int n, Scanner sc) {
        if (n == 0){
            return;
        }
        int array_number = sc.nextInt();
        ReverseArray(n - 1, sc);
        System.out.print(array_number);
    }
}
