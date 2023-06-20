import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.Scanner;

public class TaskWork10 {
    public static void main(String[] args) {
        // подключаем класс дял ввода данных через консоль
        Scanner in = new Scanner(System.in);
        //объявляем массив для выбора размера матрицы
        System.out.println("Укажите размер матрицы, где 1-ая переменная это - количество строк, а 2-ая переменная - это количество столбцов: ");
        int width = in.nextInt();
        int leng = in.nextInt();
        int[][] matrix = new int[width][leng];
        System.out.println();
        // цикл инициализирующий элементы массива: i = по строкам, с = по столбцам
        for (int i = 0; i < matrix.length; i++) {
            for (int c = 0; c < matrix[i].length; c++) {
                System.out.print("Введите " + (i + 1) + " элемент строки:");
                System.out.print("Введите " + (c + 1) + " элемент столбца:");
                //ввод элементов и умножение их на 3
                matrix[i][c] = (in.nextInt() * 3);
            }
        }
        //цикл выводящий результат 1 строки матрицы
        for (int i = 0; i < matrix[0].length; i++) {
            System.out.print(matrix[0][i] + " ");
        }
        System.out.println();
    }
}



