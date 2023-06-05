import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UnitConverter {
    public static final Map<String, String> MEASUREMENT;

    static {
        MEASUREMENT = new HashMap<String, String>();
        MEASUREMENT.put("len", "length");
        MEASUREMENT.put("m", "mass");
    }

    ;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean flag = true;

        intro();

        while (flag) {
            String answer = "";

            convertingProcess(input);
            //возобновление конвертации
            System.out.print("Вы хотите выбрать другой вид измерения? Да(y) or Нет(n)? ");
            answer = input.nextLine();

            while (!answer.toLowerCase().startsWith("n") && !answer.toLowerCase().startsWith("y")) {
                System.out.println("Выберите пожалуйста: Да(y) or Нет(n)!");
                System.out.print("Вы хотите выбрать другой тип измерения? Да(y) or Нет(n)? ");
                answer = input.nextLine();
            }

            if (answer.toLowerCase().startsWith("n")) {
                flag = false;
            }
        }
    }

    /**
     * Introduce the UnitConverter program
     */
    public static void intro() {
        System.out.println();
        System.out.println("Эта программа умеет конвертировать физические единицы измерения,");
        System.out.println("такие как: Масса и Длина");
        System.out.println("Для начала работы, пользователю необходимо ввести выбранный вид измерения для конвертации ");
        System.out.println();
    }

    public static Converter getMeasurementConverter(Scanner input) {
        String type = "";
        ConverterFactory converterFactory = new ConverterFactory();
        System.out.println("Доступные типы измерений");
        System.out.println("    - Длина (len)");
        System.out.println("    - Масса (m)");
        System.out.println();

        System.out.print("Какой тип измерения вы хотите использовать? ");
        type = input.nextLine();
        while (!MEASUREMENT.containsKey(type)) {
            System.out.println("Ваш ввод был неправильным! Пожалуйста, повторите свой выбор!");
            System.out.print("Какой тип измерения вы хотите использовать? ");
            type = input.nextLine();
        }

        return converterFactory.getConverter(MEASUREMENT.get(type));
    }

    public static void convertingProcess(Scanner input) {
        Converter converter = getMeasurementConverter(input);
        boolean temp = true;

        while (temp) {
            String reply = "";

            System.out.println("Виды измерений по выбранному типу");

            converter.unitsInfo();
            converter.userInput();

            System.out.printf("Значение после преобразования составляет %.3f", converter.convert());
            System.out.println();

            System.out.print("Вы хотите преобразовать другую единицу? ? Да(y) or Нет(n)? ");
            reply = input.nextLine();

            while (!reply.toLowerCase().startsWith("n") && !reply.toLowerCase().startsWith("y")) {
                System.out.println("Выберите пожалуйста: Да(y) or Нет(n)!");
                System.out.print("Вы хотите преобразовать другую единицу? Да(y) or Нет(n)? ");
                reply = input.nextLine();
            }

            if (reply.toLowerCase().startsWith("n")) {
                temp = false;
            }
        }
    }
}

