import java.util.Scanner;

public class TaskWork15 {
    public static void main(String[] args) {
        double amount;
        double USD;
        int choice;
        double var;
        Scanner scn = new Scanner(System.in);
        System.out.println("Для конвертации RUB(рубль) в USD(доллар), нажмите : 1");
        choice = scn.nextInt();
        System.out.println("Введите текущий курс USD по отношению к RUB");
        amount = scn.nextFloat();
        System.out.println("Введите сумму для конвертации ");
        var = scn.nextFloat();
       switch (choice) {
            case 1:
                USD = amount / var;
                System.out.println(amount/var + " " + "Доллар" + USD + " ");
                break;
        }
    }
}