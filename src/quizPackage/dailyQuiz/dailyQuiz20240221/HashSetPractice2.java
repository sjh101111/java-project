package quizPackage.dailyQuiz.dailyQuiz20240221;

import java.security.Security;
import java.util.HashSet;
import java.util.Set;

public class HashSetPractice2 {
    public static void main(String[] args) {
        Set<Member> members = new HashSet<>();
        members.add(new Member("a", 1));
        members.add(new Member("a", 1));

        System.out.println(members.size());

    }
}
