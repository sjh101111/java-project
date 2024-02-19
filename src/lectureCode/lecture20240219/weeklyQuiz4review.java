package lectureCode.lecture20240219;

import java.util.Stack;

public class weeklyQuiz4review {
    public static void main(String[] args) {
        System.out.println(isExactBracket("((()))(()"));
        System.out.println(isExactBracket("((()()"));
        System.out.println(isExactBracket("(()())"));
    }

    static boolean isExactBracket(String bracket) {
        Stack<Character> stack = new Stack<>();
//        char[] chars = bracket.toCharArray();

        for (char ch : bracket.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }

        }

        if (stack.isEmpty()) {
            return true;
        }

        return false;
    }
}
