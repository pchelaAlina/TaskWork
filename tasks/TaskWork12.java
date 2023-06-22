import java.util.Scanner;

public class TaskWork12 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        //Напишите программу, принимающую на вход строку “I like Java!!!”
        System.out.println("Введите текст с экрана:  \"I like Java!!!\"");
        String str = scan.nextLine();
        //без этого цикла не контролит регистр
        if (str.equals("I like Java!!!")) {
            boolean a = str.contains("Java");// содержится ли подстрока(строка - последовательность символов. подстрока - последовательность подряд идущих символов в строке)
            boolean b = str.startsWith("I like");//начинается ли строка с таких символов
            boolean c = str.endsWith("!!!");//позволяет определить, заканчивается ли строка символами указанными в скобках
            //цикл проверяет равенство между результатами искомымых значений
            if (a && b && c) {
                System.out.println("Ключевые слова найдены и совпадают)");
                //вывод преобразованной строки
                System.out.println(str.toUpperCase());
            }
            String str1 = str.substring(7, 11);
            String str2 = str1.replace('a', 'o');
            System.out.println(str2);
        } else
            System.out.println("Вы ввели текст не равный \"I like Java!!!\""); //завершение. иначе ошибка, если не соответсвует описанным сверху условиям
    }
}

