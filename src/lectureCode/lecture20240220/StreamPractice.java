package lectureCode.lecture20240220;
import java.util.Arrays;
import java.util.List;

public class StreamPractice {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 10, 4, 5, 1, 2);
        list.stream().distinct().forEach(System.out::println);

        List<String> list1 = Arrays.asList("a", "b", "c", "d", "e");
        list1.stream().map(x -> x.toUpperCase()).forEach(System.out::println);
    }
}
