public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Задача 1");
        int[] payments = {12_567, 43_321, 21_000, 56_550, 45_000};
        int summa = 0;
        for (int i = 0; i < payments.length; i++) {
            summa = summa + payments[i];
        }
        System.out.println("Сумма трат за месяц составила " + summa);

        System.out.println();
        System.out.println("Задача 2");
        int[] paymentsMinMax = {12_567, 43_321, 21_000, 56_550, 45_000};
        int maxSum = -1;
        int mimSum = 456_000;
        for (int i = 0; i < paymentsMinMax.length; i++) {
            if (paymentsMinMax[i] > maxSum) {
                maxSum = paymentsMinMax[i];
            }
            if (paymentsMinMax[i] < mimSum) {
                mimSum = paymentsMinMax[i];
            }
        }
        System.out.println("Минимальная сумма за месяц " + mimSum + ". А максимальная сумма за месяц " + maxSum);


        System.out.println();
        System.out.println("Задача 3");
        int[] money = {20_000, 15_000, 35_000, 25_999, 50_000};
        int suma = 0;
        for (int i = 0; i < money.length; i++) {
            suma = summa + money[i];
        }
        double average = (double) suma / 20;
        System.out.println("Средняя сумма трат за месяц составила " + average);

        System.out.println();
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);

        }
    }
}