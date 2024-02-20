package lectureCode.lecture20240220;

import java.util.Arrays;
import java.util.List;

public class FlatmapExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello world", "java stream", "histream");
        list.stream()
                .flatMap(str -> Arrays.stream(str.split(" ")))
                .forEach(System.out::println);
    }
}
