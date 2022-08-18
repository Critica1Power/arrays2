public class Main {
    public static void main(String[] args) {
        int[] array1 = generateRandomArray();
        // Задание 1
        System.out.println("Задание 1");
        int summa = 0;
        for (int spendingDay : array1) {
            summa += spendingDay;
        }
        System.out.println("Сумма трат за месяц составила " + summa + " рублей.");

        // Задание 2
        System.out.println("Задание 2");
        int min = array1[0];
        int max = array1[0];
        for (int i = 1; i < array1.length; i++) {
            if (min > array1[i]) {
                min = array1[i];
            } else if (max < array1[i]) {
                max = array1[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. " + "Максимальная сумма трат за день составила " + max + " рублей");
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}