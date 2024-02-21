package quizPackage.dailyQuiz.dailyQuiz20240221;

import java.util.ArrayList;
import java.util.List;

public class ListPractice2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(30);
        list.add("Java");
        list.add("Spring");
        list.add("Servlet/JSP");
        list.add("DBMS");
        list.add("JPA");

        int size = list.size();
        System.out.println("총 객체 수: " + size);
        System.out.println();

        String skill = list.get(0);
        System.out.println("Skill 1: " + skill);
        System.out.println();

        for (int i = 0; i<list.size(); i++) {
            System.out.println(i+": " + list.get(i));
        }
        System.out.println();

        list.remove(2);
        list.remove(2);
        list.remove("Java");
        System.out.println(list);
    }
}
