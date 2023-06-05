public class Mass extends Converter{
    private String[] units;
    private double[] unitConstants;

    /**
     * Вывод на консоль видов измерения физической массы, после 1 выбора (масса или расстояние)
     */
    public Mass() {
        units = new String[] {
                "ton", "kg", "g", "mg", "lb", "oz"
        };

        unitConstants = new double[] {
                1000, 1, 0.001, 0.000001, 0.45359237, 0.0283495
        };
    }

    public void unitsInfo() {
        System.out.println("    - Metric ton (ton)");
        System.out.println("    - Kilogram (kg)");
        System.out.println("    - Gram (g)");
        System.out.println("    - Milligram (mg)");
        System.out.println("    - Pound (lb)");
        System.out.println("    - Ounce (oz)");
    }

    /**
     * код для возвращения значения
     */
    public double convert() {
        String fromUnit = getFromUnit();
        String toUnit = getToUnit();
        double value = getValue();
        int fromIndex = 0;
        int toIndex = 0;

        for (int i = 0; i < units.length; i++) {
            if (units[i].equals(fromUnit)) {
                fromIndex = i;
            }

            if (units[i].equals(toUnit)) {
                toIndex = i;
            }
        }
        value = value * unitConstants[fromIndex] / unitConstants[toIndex];

        return value;
    }
}
