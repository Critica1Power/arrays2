public class Main {
    public static void main(String[] args) {
        int[] array1 = generateRandomArray();
        // Задание 1
        System.out.println("Задание 1");
        int summa = 0;
        for (int i = 0; i < array1.length; i++) {
            summa += array1[i];
        }
        System.out.println("Сумма трат за месяц составила " + summa + " рублей.");
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