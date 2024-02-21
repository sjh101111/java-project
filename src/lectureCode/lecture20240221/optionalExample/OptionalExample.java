package lectureCode.lecture20240221.optionalExample;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        OptionalDouble average = list.stream()
                .mapToInt(Integer::intValue)
                .average();
        average
                .ifPresent(avg -> System.out.println(avg));
    }
}
