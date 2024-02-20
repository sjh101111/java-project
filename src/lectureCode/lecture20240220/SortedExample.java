package lectureCode.lecture20240220;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedExample {
    public static void main(String[] args) {
        //오름차순
        List<Integer> list = Arrays.asList(12, 4, 2, 8, 11);
        list.stream().sorted().forEach(System.out::println);

        List<String> list1 = Arrays.asList("e", "a", "c", "z", "d");
        list.stream().sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}
