package quizPackage.dailyQuiz.dailyQuiz20240219;

import java.util.function.IntBinaryOperator;

public class number5 {
    private static int[] scores = {10, 50, 3};

    public static int maxOrMin(IntBinaryOperator operator) {
        int result = scores[0];
        for (int score : scores) {
            result = operator.applyAsInt(result, score);
        }
        return result;
    }

    public static void main(String[] args) {
        int max = maxOrMin(Math::max);
        System.out.println("최대값 : " + max);

        int min = maxOrMin(Math::min
        );
        System.out.println("최소값: " + min);
    }
}
