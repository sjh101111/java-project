package lectureCode.lecture20240216;

import java.util.*;

public class listQuiz {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = Arrays.asList(3, 3, 5, 8, 2, 2);
        for (int number : list) {
            map.put(number, map.getOrDefault(number, 0) + 1);
        }

        System.out.println(map);

    }

}
