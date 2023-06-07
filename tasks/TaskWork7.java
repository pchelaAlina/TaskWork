import java.util.Scanner;

public class TaskWork7 {
    public static void main(String args[]) {
        int x = 10;//объявили константы =
        int y = 8;
        int z = 2;
        Scanner input = new Scanner(System.in); //чтение с консоли размер массива
        System.out.println("Введите размер массива: ");
        int size = input.nextInt();//размер определяется введеным значением с консоли
        int[] array = new int[size];//введенное значение определяет размер массива
        System.out.println("Введите элементы массива: ");
        //для перебора по всему размеру массива
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        //перебор переменных массива по объявленным константам
        for (int i = 0; i < size; i++) {
            if (array[i] == x | array[i] == y | array[i] == z) {
                System.out.println("Данное значение имеется в константах");
                break;//если не указать то текст предупреждения выйдет в количестве совпадения

            }
        }
    }
}
