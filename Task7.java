import java.util.Scanner;
/*
In this task we cannot use array data structures
So by using ReverseArray method(where recursion is being used) we can simply print reversed array

In the method:
    The base case say:
            when n will reach 0 stop 
    Recursive call:
    public static void ReverseArray(int n, Scanner sc) {
        if (n == 0){
            return;
        }
        int array_number = sc.nextInt();
        ReverseArray(n - 1, sc);
        System.out.print(array_number);
    }

    Here "int n" is a length of our array
    In ReverseArray method we are using recursion
    And lets me explain how that recursion will work
    So lets say we have a CallStack (which is like container) and input is 4 and 4 5 6 7
    Firstly we put 4
    then 5 
    then 6 
    at the end 7

    But from CallStack view it would be like
    |              | n = 0
    |      7       | n = 1
    |      6       | n = 2
    |      5       | n = 3
    |      4       | n = 4
    |______________|

    So when n reaches 0 we pop out every element but now starting from 7 then 6 5 and 4
    so you will get reversed array
*/
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
