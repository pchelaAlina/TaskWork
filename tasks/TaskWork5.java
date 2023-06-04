import java.util.Scanner;

public class TaskWork5 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            //программа работает бесконечно
            System.out.println("Выберите операцию");
            System.out.println("1. Сложение");
            System.out.println("2. Вычитание");
            System.out.println("3. Умножение");
            System.out.println("4. Деление");
            System.out.println("5. Выйти");
            int person = scanner.nextInt();
            int result;
            if (person == 5) {
                break;
            } else if (person == 1) {
                System.out.println("Введите первое число: ");
                int a = scanner.nextInt();
                System.out.println("Введите второе число: ");
                int b = scanner.nextInt();
                System.out.println("a: " + a);
                System.out.println("b: " + b);
                result = a + b;
                System.out.println("Ответ: " + result);
            } else if (person == 2) {
                System.out.println("Введите первое число: ");
                int a = scanner.nextInt();
                System.out.println("Введите второе число: ");
                int b = scanner.nextInt();
                System.out.println("a: " + a);
                System.out.println("b: " + b);
                result = a - b;
                System.out.println("Ответ: " + result);
            }else if (person == 3) {
                System.out.println("Введите первое число: ");
                int a = scanner.nextInt();
                System.out.println("Введите второе число: ");
                int b = scanner.nextInt();
                System.out.println("a: " + a);
                System.out.println("b: " + b);
                result = a * b;
                System.out.println("Ответ: " + result);
            } else if (person == 4) {
                System.out.println("Введите первое число: ");
                int a = scanner.nextInt();
                System.out.println("Введите второе число: ");
                int b = scanner.nextInt();
                if (b == 0) {
                    System.out.println("На НОЛЬ делить нельзя!");
                }
                System.out.println("a: " + a);
                System.out.println("b: " + b);
                result = a / b;
                System.out.println("Ответ: " + result);
            } else {
                System.out.println("Ошибка!");//выбор числа не из меню
            }
        }
        System.out.println("Программа завершена"); //описан в конце, так как имеет отношение ко всему операциям
    }
}

