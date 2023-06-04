import java.util.Scanner;

public class TaskWork4 {
    public static void main(String args[]) {
        //ввод 3 символов с консоли
        Scanner num = new Scanner(System.in);
        System.out.println("Введите 3 числа: x, y, z");
        double x, y, z;
        x = num.nextDouble();
        y = num.nextDouble();
        z = num.nextDouble();
        //поиск среднего арифметического
        double aver = (x + y + z) / 3;
        System.out.println("Среднее арифметическое " + aver);
        //делим полученное на 2 и округляем в меньшую сторону (целочисленное значение)
        double count = 10;
        double rnd = Math.floor(aver / 2);
        System.out.println("Мы разделили среднее арифметическое на 2 и округлили в меньшую сторону:" + rnd);
        if (rnd > 3)
            System.out.println("Программа выполнена корректно!");
    }
}
