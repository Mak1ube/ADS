public class Task2 {
    public static void main(String[] args) {
        int n = 4;
        int[] arr = {3, 2, 4, 1};
        Average(arr, n);
    }

    public static void Average(int[] arr, int n) {
        double sum = 0;
        //Сумируем каждый элемент листа
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        // Находим среднее
        double average = sum / n;
        System.out.println(average);
    }
}
