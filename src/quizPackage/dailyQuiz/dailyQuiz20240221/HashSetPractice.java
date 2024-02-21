package quizPackage.dailyQuiz.dailyQuiz20240221;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetPractice {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("Spring");
        set.add("Servlet/JSP");
        set.add("Java");
        set.add("DBMS");

        System.out.println("총 객체수: " + set.size());

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            System.out.println("\t" + str);
        }
            set.remove("DBMS");
            set.remove("JAVA");
            System.out.println("\t" + set.size());

            if (set.contains("Spring")) {
                System.out.println("자바있음");
            }

            set.clear();

            if (set.isEmpty()) {
                System.out.println("비어있음");
            }


        }
    }

