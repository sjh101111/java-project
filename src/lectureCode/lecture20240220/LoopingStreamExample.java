package lectureCode.lecture20240220;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class LoopingStreamExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

//        int sum = list.stream()
//                .mapToInt(n -> n)
//                .filter(n -> n % 2 == 0)
//                .peek(n -> System.out.println(n))   // [2, 4]
//                .sum();  // sum을 사용하지 않으면 peek은 동작하지 않음

        OptionalInt sum = list.stream()
                .mapToInt(n -> n)
                .filter(n ->n%2==0)
                                .max();

        System.out.println(sum);    // 6
    }

}
