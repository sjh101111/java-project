package lectureCode.lecture20240216.functionInterface;

public class LambdaExample {
        int max(int a, int b) {
            return a > b ? a : b;
        }
//    (a,b)-> a>b ? a: b;
        int print(String name, int i) {
            System.out.println(name + "=" + i);
            return 0;
        }
        // (name, i ) -> System.out.println(name + "=" + i);
        int square(int x) {
            return x * x;
        }
        //x -> x * x;

}
