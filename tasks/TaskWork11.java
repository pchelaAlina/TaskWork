import java.text.DecimalFormat;
import java.util.Scanner;

public class TaskWork11 {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Сравним числа и выведем их  ");
        System.out.println("Введите первое число: ");
        int a = scn.nextInt();
       // DecimalFormat numberFormat = new DecimalFormat("##,###");
        //String str = numberFormat.format(a);
        System.out.println("Введите второе число");
        int b = scn.nextInt();
        //System.out.println(a.toString());
        System.out.println("Вывод максимального значения");
        System.out.println(Math.max(a,b));
        //System.out.println();
        System.out.println("Вывод минимального значения");
        double z = Math.min(a,b);
        System.out.println(z);
    }
}
