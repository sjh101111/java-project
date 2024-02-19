package lectureCode.lecture20240219;

public class FunctionExample {
    int test(int a, int b) {
        return 1;
    }

    MyFunctionalInterface2 f2 = () -> {
    };

    MyFunctionalInterface2 m = new MyFunctionalInterface2() {
        @Override
        public void method() {
            System.out.println("hi");
        }
    };

}
