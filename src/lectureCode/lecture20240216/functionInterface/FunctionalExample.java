package lectureCode.lecture20240216.functionInterface;

public class FunctionalExample {
    public static void main(String[] args) {
       MyFunction f = () -> {
            System.out.println("람다식");
        };

       f.test();

       MyFunction f1 = new MyFunction() {
           @Override
           public void test() {
               System.out.println("람다식");
           }
       };
       MyFunction2 function2 = (a) -> {
        int result = a * 5;
           System.out.println(result);
        };
       MyFunction3 myFunction3 = (a, b) -> {
           return a*b;
       };
       myFunction3 = (a, b) -> a * b;
    }
}
