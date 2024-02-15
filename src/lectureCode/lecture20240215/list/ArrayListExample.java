package lectureCode.lecture20240215.list;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add(0,"첫 번째");
        list.add(0,"두 번째");
        list.add("세 번째");

        String element = list.get(0);
        boolean isContains = list.contains("첫 번째");
        System.out.println(element);
        System.out.println("isContains = " + isContains);

        System.out.println(list);
        list.remove(0);
        System.out.println(list);

        list.clear();
        list = null;
        if (list == null || list.isEmpty()) {
            //isEmpty를 먼저 배치할 경우 NullPointException 발생
                System.out.println("list가 비어있습니다.");
        }
//        System.out.println(list);
//        for (String str : list) {
//            System.out.println(str);
//        }
    }
}
