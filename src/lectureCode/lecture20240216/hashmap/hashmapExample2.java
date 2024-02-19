package lectureCode.lecture20240216.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashmapExample2 {
        //hashmapExample 복습
        public static void main(String[] args) {
            // 1. Map 컬렉션 생성
            Map<String, Integer> map = new HashMap<>();

            map.put("홍길동", 80);
            map.put("카리나", 85);
            map.put("제시카", 95);
            map.put("홍길동", 80);
            System.out.println(map.size());
            // 2. 객체 찾기
            System.out.println("\t홍길동: " + map.get("홍길동"));
            System.out.println();
            // 3. 객체를 하나씩 처리
            Set<String> keySet = map.keySet();
            Iterator<String> iterator = keySet.iterator();
            while (iterator.hasNext()) {
                String key = iterator.next();
                Integer value = map.getOrDefault(key,0);
                System.out.println("/t" + key + ": " + value);
            }
            System.out.println();
            // 4. 객체 삭제
            map.remove("홍길동");
            System.out.println(map.size());
            // 5. 객체를 하나씩 처리
            Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
            for (Map.Entry<String, Integer> entry : entrySet) {
                String key = entry.getKey();
                Integer value = entry.getValue();
                System.out.println("|t" + key + ": " + value);
            }
            System.out.println();
            // 6. 모든 Map.Entry 삭제
            map.clear();
            System.out.println(map.size());
        }
    }

