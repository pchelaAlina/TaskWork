import java.util.Arrays;
import java.util.Random;

public class TaskWork3 {
    public static void main(String args[]){
        int[] mas={1,2,3,4,5};
        mas[0]=5;
        mas[4]=1;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < mas.length; i++) {

            if (mas[i] < min) min = mas[i];
            if (mas[i] > max) max = mas[i];
        }

        // начало магии
        int delta = Integer.MAX_VALUE;
        int index = 0;
        int aver = (max + min) / 2;
        for (int i = 0; i < mas.length; i++) {
            int d = Math.abs(mas[i] - aver);
            if (d < delta) {
                delta = d;
                index = i;
            }
        }
        System.out.println("Суммы первого и среднего элемента: "+ (mas[0]+mas[index]));
    }
}
