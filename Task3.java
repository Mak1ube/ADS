import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (Prime(n)){
            System.out.println("Prime");
        }
        else{
            System.out.println("Composite");
        }
    }

    public static boolean Prime(int n) {
        if (n <= 1) {
            return false;
        }
        // Проверяем есть ли делитиль для введенного числа
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
