package lectureCode.lecture20240215.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("요소1");
        stringSet.add("요소2");
        stringSet.add("요소3");
        stringSet.add("요소1");
        System.out.println(stringSet);

        boolean a = stringSet.contains("요소");
        System.out.println(a);

        //객체검색
        Iterator<String> iterator = stringSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            iterator.remove();
            System.out.println(stringSet.size());
        }
        System.out.println(stringSet.size());

        boolean isRmoved = stringSet.remove("요소1");
        System.out.println(isRmoved);
        stringSet.clear();
        System.out.println(stringSet);
        // 객체 삭제

        //향상 for문
        for (String str : stringSet) {
            System.out.println(str);
            stringSet.remove(str);
        }

        Set<Person> personSet = new HashSet<>();
        personSet.add(new Person());

    }
}
