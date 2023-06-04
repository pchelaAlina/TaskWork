import java.util.Scanner;

public class TaskWork5 {
    public static void main(String[] args) {
        double num1;
        double num2;
        double ans;
        char op;
        Scanner reader = new Scanner(System.in);
        System.out.print("Введите два числа через Enter: ");
        num1 = reader.nextDouble();
        num2 = reader.nextDouble();
        System.out.print("\nВыберите опреацию (+, -, *, /): ");
        op = reader.next().charAt(0);
        switch (op) {
            case '+':
                ans = num1 + num2;
                break;
            case '-':
                ans = num1 - num2;
                break;
            case '*':
                ans = num1 * num2;
                break;
            case '/':
                ans = num1 / num2;
                break;
            default:
                System.out.printf("Ошибка! Выберите верный символ операции");
                return;
        }
        System.out.print("\nРезультат расчета:\n");
        System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
    }
}
