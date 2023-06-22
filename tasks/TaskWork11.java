import java.text.DecimalFormat;
import java.util.Scanner;

public class TaskWork11 {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Эта программа сравнивает два числа. Выполните действия указанные на экране: ");
        System.out.println("Введите первое число: ");
        String str = scn.nextLine();
        double a = Double.valueOf(str);

        System.out.println("Введите второе число");
        int b = scn.nextInt();

        System.out.println("Вывод максимального значения");
        System.out.println(Math.max(a,b));

        System.out.println("Вывод минимального значения");
        double z = Math.min(a,b);
        System.out.println(z);
    }
}
