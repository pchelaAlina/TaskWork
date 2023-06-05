import java.util.Scanner;

public abstract class Converter {
    private String fromUnit;
    private String toUnit;
    private double value;
    private Scanner input;

    /**
     * Инициализация преобразователя
     */
    public Converter() {
        this.input = new Scanner(System.in);
        this.fromUnit = "";
        this.toUnit = "";
        this.value = 0;
    }

    /**
     * @return возвращает единицу измерения которую хочет преобразовать пользователь
     */
    public String getFromUnit() {
        return this.fromUnit;
    }

    /**
     * @return возвращает единицу измерения которую хочет получить пользователь
     */
    public String getToUnit() {
        return this.toUnit;
    }

    /**
     * @return значение для преобразования(цифры)
     */
    public double getValue() {
        return this.value;
    }

    /**
     * Наводящие вопросы для пользователя на консоли
     */
    public void userInput() {
        System.out.println("Преобразовать");
        System.out.print("из: ");
        this.fromUnit = input.nextLine();
        System.out.print("в:   ");
        this.toUnit = input.nextLine();
        System.out.print("Значение ");
        this.value = input.nextDouble();
        input.nextLine();
    }

    /**
     * Вывод итога
     */
    public abstract void unitsInfo();

    /**
     *
     *
     * @return значение после конвертации
     */
    public abstract double convert();
}

