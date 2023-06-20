import java.util.Scanner;

public class Clone {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите кол-во строк - ");
        int N = in.nextInt(); //Введите число с клавы(кол-во строк)
        System.out.print("Введите кол-во столбцов - ");
        int M = in.nextInt(); //Введите число с клавы(кол-во стобцов)
        int[][] mass = new int[N][M]; //Создаем двухмерный массив
        System.out.println(); //Вывод на экран пустую строку

        for (int i = 0; i < mass.length; i++) { //создаем цикл
            for (int j = 0; j < mass[i].length; j++) { //создаем цикл в цикле
                System.out.print("Enter number in massive - "); //Вывод на экран
                int a = in.nextInt(); //Вводим число с клавы
                mass[i][j] = a; //Добаляем число в двухмерный массив
            }
        }
        for (int i = 0; i < mass.length; i++) { //создаем цикл
            for (int j = 0; j < mass[i].length; j++) { //создаем цикл в цикле
                System.out.print(mass[0][j] + " "); //Вывод на экран массив через пробел
            }
            System.out.println(); //Вывод на экран
        }

        System.out.println(); //Вывод на экран пустую строку
        System.out.print("Sum elements massive - "); //Вывод на экран
        sumDimArray(mass); //запускаем метод sumDimArray который считает сум.массива(mass)
    }

    public static void sumDimArray(int[][] mass) { //
        int sum = 0; //создаем перем.для хранения сум.эллементов массива
        for (int i = 0; i < mass.length; i++) { //Создаем цикл
            for (int j = 0; j < mass[i].length; j++) { //Создаем цикл в цикле
                sum = sum + mass[i][j]; //находим сумму эл.массива
            }
        }
        System.out.println(sum); //Вывод на экран сумму
    }
}
