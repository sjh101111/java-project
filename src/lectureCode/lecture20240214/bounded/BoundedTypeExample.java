package lectureCode.lecture20240214.bounded;

public class BoundedTypeExample {
    public static void main(String[] args) {
//        String str = Util.compare("d", "d");
        int result1 = Util.compare(1, 2);
        System.out.println(result1);
        int result2 = Util.compare(4.5, 3);            // double -> Double (자동 Boxing)
        System.out.println(result2);
    }
}
