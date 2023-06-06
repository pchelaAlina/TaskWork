import java.util.Scanner;

public class TaskWork6 {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in); //возвращает значение с консоли
        //обозначаем переменные
        double ans = 0;//исключает это значение из переменной и указывает на корень уровнения (для ответов с плавающей запятой)
        int qth = 0;//для выбора вида измерения целочисленное
        boolean isTrue = false;
        //ввод переменной для типа числа
        while (isTrue == false) {
            System.out.println("Выберите тип величины. 1 - Длина, 2 - Масса");
            qth = scn.nextInt();//считает целое число с консоли
            if (qth >= 1 && qth <= 2) {
                isTrue = true;
            }

        }
//Ввод переменной самого числа
        System.out.println("Введите число для конвертации: ");
        ans = scn.nextDouble();
        //Конвертация числа
        if (qth == 1) {
            System.out.println("Метр: " + ans);
            System.out.println("Миля: " + (ans / 1609));
            System.out.println("Ярд: " + (ans * 1.094));
            System.out.println("Дюйм: " + (ans * 39.37));
        }
        if (qth == 2) {
            System.out.println("Тонна: " + ans);
            System.out.println("Килограмм: " + (ans * 1000));
            System.out.println("Английская тонна: " + (ans / 1.016));
            System.out.println("Фунт: " + (ans * 2205));
        }
    }
}


