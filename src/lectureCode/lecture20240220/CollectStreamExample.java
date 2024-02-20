package lectureCode.lecture20240220;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.*;

public class CollectStreamExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c", "d");

        List<String> returnlist = list.stream()
                .collect(Collectors.toList());
        System.out.println(returnlist);

        Set<Integer> set = Arrays.asList(1,2,3,4,5).stream()
                .filter(n -> n % 2 == 1)
                .peek(System.out::println)
                .collect(Collectors.toSet());
//                .collect(Collectors.toCollection(HashSet::new));
        System.out.println(set);
        set.stream().forEach(System.out::println);  // {1, 3, 5}
    }

    List<Integer> list2 = Arrays.asList(1,1,2,2,3,4,5,5,5);
    Map<Integer, Long> result = list2.stream()
            .collect(
                    Collectors.groupingBy(
                            n->n,
                            Collectors.counting()
                    )
            );

}
