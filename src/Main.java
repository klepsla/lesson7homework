import java.util.Arrays;

public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main(String[] args) {
    int[] arr = generateRandomArray();
        //Задание № 1
        int spending = 0;
        for (int i = 0; i < arr.length; i++) {
                spending = spending + arr[i];
        }
        {
            System.out.println("Cумма трат за месяц составила " + spending + " рублей.");
        }
        //Задание № 2
        arr = generateRandomArray();
        int maxSpending = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxSpending)
                maxSpending = arr[i];
        }
        {
            System.out.println("Максимальная сумма трат за месяц составила " + maxSpending + " рублей.");
        }
        arr = generateRandomArray();
        int minSpending = 200000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minSpending)
                minSpending = arr[i];
        }
            {
                System.out.println("Минимальная сумма трат за месяц составила " + minSpending + " рублей.");
            }
        //Задание № 3
        arr = generateRandomArray();
        double middleSpending = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > middleSpending)
                middleSpending = spending / 30;
        }
            {
                System.out.println("Средняя сумма трат за месяц составила " + middleSpending + " рублей.");
            }
        //Задание № 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}










