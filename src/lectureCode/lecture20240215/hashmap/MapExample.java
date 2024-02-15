package lectureCode.lecture20240215.hashmap;

import javax.swing.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> hashmap = new HashMap<>();
        hashmap.put("key1", 1);
        hashmap.put("key2", 2);
        hashmap.put("key3", 3);
        System.out.println(hashmap);

        boolean isContains = hashmap.containsKey("없는key");
        System.out.println("isContains = " + isContains);
        boolean containsValue = hashmap.containsValue(3);
        System.out.println("containsValue = " + containsValue);

        Set<String> keySet = hashmap.keySet();
        System.out.println(keySet);

        Iterator<String> iterator = hashmap.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            Integer value = hashmap.get(key);
            System.out.println(key + ":" + value);
        }
            Set<Map.Entry<String, Integer>> entrySet = hashmap.entrySet();
            for (Map.Entry<String, Integer> entry : entrySet) {
                String key = entry.getKey();
                Integer value = entry.getValue();
                System.out.println(key + ":" + value);
            }
        }
    }

