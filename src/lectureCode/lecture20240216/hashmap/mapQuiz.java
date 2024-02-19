package lectureCode.lecture20240216.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class mapQuiz {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"레드향");
        map.put(2,"사과");
        map.put(3,"바나나");
        map.put(4,"샤인머스켓");

        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        for (Map.Entry<Integer, String> entry : entrySet) {
            System.out.println("[Key]:" + entry.getKey() + " [Value]:" + entry.getValue());
        }

//        Set<Integer> keySet = map.keySet();
//        Iterator<Integer> iterator = keySet.iterator();
//        while (!iterator.hasNext()) {
//            Integer key = iterator.next();
//            String value = map.getOrDefault(key, "");
//            System.out.println("[Key");
//        }

    }
}

