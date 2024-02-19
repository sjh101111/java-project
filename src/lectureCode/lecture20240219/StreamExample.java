package lectureCode.lecture20240219;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        String[] arr = {"첫번째", "두번쨰"};
        Stream<String> stream= Arrays.stream(arr);
        stream.forEach(System.out::println);

        IntStream intStream = IntStream.range(1, 5);
        LongStream longStream = LongStream.rangeClosed(1,5);
        DoubleStream doubleStream = DoubleStream.of(1.1, 2.2);
        doubleStream.forEach(System.out::println);

        List<String> list = Arrays.asList("a", "b", "b", "c", "d,");
        list.stream().distinct().forEach(System.out::println);


    }
}
