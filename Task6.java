import java.util.Scanner;
/*
Firstly user write two numbers for example n and m
in order to get n in the power of m

after that we are using method "exponential"
from here we could break/divide our problem into several parts
so we use recursion.
if (m == 0){
            return 1;
        }
here we writing base case that says when m becomes 0 it will return 1

 return n * exponential(n, m - 1);

On the top, Main recursive call
lets say n is 5 and m is 3
so first one would look like this
5 * exp(5, 2)
than it would be
25 * exp(5, 1)
and lastly
125 * exp(5,0)
so when m == 0
125 * 1 = 125

*/
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
