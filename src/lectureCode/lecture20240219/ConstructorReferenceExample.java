package lectureCode.lecture20240219;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReferenceExample {
    public static void main(String[] args) {
        Function<String, Member> f = x -> new Member(x);
        //클래스명::new / Member::new
        f.apply("name");

        BiFunction<String, String, Member> f2 = (x, y) -> {
            return new Member(x, y);
        };
        f2.apply("name", "id");

        Supplier<Member> s = () -> {
            return new Member();
        }; // Member::new
        Member member = s.get();

        Consumer<String> con = System.out::println;
        con.accept("값 출력");

        List<Integer> list = Arrays.asList(1,2,3,4,5);

    }
}
