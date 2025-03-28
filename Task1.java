public class Task1 {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {10, 1, 32, 3, 45};
        printSmall(arr);

        double x = 10;
        double y = 4;
        System.out.println(x / y);

    }

    public static void printSmall(int[] arr) {
        //Предположим что первый элемент самый маленький
        int small = arr[0];
        //Проверка каждого элемента
        for (int i = 0; i < arr.length; i++) {
            if (small > arr[i]) { 
                small = arr[i];
            }
        }
        System.out.println(small);
    }
}
