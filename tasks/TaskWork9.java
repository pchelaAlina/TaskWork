import java.util.Scanner;

public class TaskWork9 {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите количество переменных: ");
        int size = scn.nextInt();
        int[] array = new int[size];
        System.out.println("Введите переменные: ");
        double sum = 0;
        for (int i = 0; i < size; i++) {
            array[i] = scn.nextInt();
        }
        for (double x : array) {
            sum += x;
        }
        sum = (sum / size) * sum;
        System.out.println("Сумма введенных переменных, умноженное на их среднее арифметическое: " + sum);

    }
}