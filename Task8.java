import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int length = s.length();
        if (AllDigits(s, length))
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    public static boolean AllDigits(String s, int length) {
        if (length == 0) {
            return true;
        }

        if (!Character.isDigit(s.charAt(length - 1))) {
            return false;
        }
        return AllDigits(s, length - 1);
    }
}