import java.util.Scanner;

public class TaskWork8 {
    public static void main(String args[]) {
        System.out.println("Введите любое целое положительное число");//действия пользователя предлагаем
        Scanner scn = new Scanner(System.in);//подключаем сканнер из бибилиотеки java.util
        int n = scn.nextInt(); //чтение целого числа
        //объявляем переменную перед циклом
        int sum = 0;
        //конструкция цикла for,
        for (int i=1; i<= n; i++){
            if (i%2!=0){
                sum = sum + i;
            }
        }
        System.out.println (sum);
    }
}



