public class ConverterFactory {
    public Converter getConverter(String measurementType) {
        if  (measurementType.equals("length")) {
            return new Length();
        } else if (measurementType.equals("mass")) {
            return new Mass();
        }
        return null;
    }
}
