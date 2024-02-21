package lectureCode.lecture20240221.dailyQuiz0220Review;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Number1 {
    public List<Integer> solution(int n, int[] array) {
        List<Integer> answer = new ArrayList<>();
        answer.add(array[0]);

//        for (int i = 1; i < n; i++) {
//            if (array[i] > array[i - 1]) {
//                answer.add(array[i]);
//            }
//        }
        // 코드 작성
        List<Integer> collect = IntStream.range(1, n)
                .filter(index -> array[index] > array[index - 1])
                .mapToObj(x -> array[x])
                .collect(Collectors.toList());
        answer.addAll(collect);
        return answer;
    }

    public static void main(String[] args) {

        Number1 printMoreBigNumber = new Number1();
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int[] array = new int[number];

        for (int i = 0; i < number; i++) {
            array[i] = scanner.nextInt();
        }

        for (int x : printMoreBigNumber.solution(number, array)) {
            System.out.print(x + " ");
        }
    }
}
