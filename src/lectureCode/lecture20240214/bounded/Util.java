package lectureCode.lecture20240214.bounded;

public class Util {
    public static <T extends Number> int compare(T t1, T t2) {
        double value1 = t1.doubleValue();
        double value2 = t2.doubleValue();
        return Double.compare(value1, value2);
    }
}
