package quizPackage.weeklyQuiz.week4;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StackAlgorithm {
    public static void main(String[] args) {

        Stack<String> stringStack = new Stack<>();
        List<String> stringList = new ArrayList<>();

        stringList.add("(");
        stringList.add("(");
        stringList.add("(");
        stringList.add(")");
        stringList.add(")");
        stringList.add(")");
        stringList.add("(");

        for (String list : stringList) {
            if (list.equals("(")) {
                stringStack.push(list);
            } else if (list.equals(")") && stringStack.isEmpty()) {
                System.out.println("순서 혹은 짝이 맞지 않습니다.");
                System.exit(1);
                return;
            } else if (list.equals(")") && !stringStack.isEmpty()) {
                stringStack.pop();
            }
            } if (!stringStack.isEmpty()) {
                System.out.println("짝이 맞지 않습니다.");
            } else if (stringStack.isEmpty()) {
                System.out.println("짝이 맞습니다.");
        }
    }
}
