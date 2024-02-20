package lectureCode.lecture20240220.lectureQuiz;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Quiz {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 1, 2, 2, 2, 3, 4, 5, 5, 5);
        List<String> stringList =
        integerList.stream()
                .distinct()
                .map(String::valueOf)
                //(element -> ""+element), (element -> String.valueOf(element))
//                .toList();
                .peek(System.out::println)
        .collect(Collectors.toList());
        stringList.forEach(System.out::println);
    }
}
