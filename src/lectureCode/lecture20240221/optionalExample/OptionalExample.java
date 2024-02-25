package lectureCode.lecture20240221.optionalExample;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(1,4);
        String str = "" + list.get(0);
        list.remove(0);
        list.remove(4);


        OptionalDouble average = list.stream()
                .mapToInt(Integer::intValue)
                .average();
        average
                .ifPresent(avg -> System.out.println(avg));
    }
}
