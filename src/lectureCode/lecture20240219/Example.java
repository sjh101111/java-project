package lectureCode.lecture20240219;

import java.util.function.*;

public class Example {
    public static void main(String[] args) {
        Runnable r = () -> System.out.println("출력문테스트");
        r.run();

        Supplier<String> s = () -> "리턴값";

        System.out.println(s.get());

        Consumer<Integer> c = x -> System.out.println(x);
        c.accept(3);

        Consumer<Double> cd = x -> System.out.println(x);

        DoubleConsumer d = x -> System.out.println(x);
        d.accept(4.5);

        Function<String, Integer> f = y -> {
            System.out.println(Integer.parseInt(y));
            return Integer.parseInt(y);
        };
        f.apply("1234");

        Function<Integer, String> f2  = z -> {
            return String.valueOf(z);
        };
        f2.apply(1);

        Predicate<Integer> p = a -> a%2==0;
        Predicate<Integer> b = a -> {
            boolean is = false;

            is = a % 2 ==0;

            return is;
        };
        System.out.println(p.test(10));

        LongSupplier ls = () -> {
            return 1;
        };
        LongSupplier ls1 = new LongSupplier() {
            @Override
            public long getAsLong() {
                return 0;
            }
        };

        System.out.println(ls1.getAsLong());

        IntBinaryOperator operator = (e, a) -> Math.max(e, a);


        }
        boolean isEven (int x){
            return x % 2 == 0;

    }
}
