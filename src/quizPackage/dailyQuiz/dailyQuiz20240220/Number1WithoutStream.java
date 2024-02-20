package quizPackage.dailyQuiz.dailyQuiz20240220;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Number1WithoutStream {
    public List<Integer> solution(int n, int[] array) {
        List<Integer> answer = new ArrayList<>();
        answer.add(array[0]);

        // 두 번째 수부터 비교 시작
        for (int i = 1; i < n; i++) {
            // 자신의 바로 앞 수보다 큰 수만 리스트에 추가
            if (array[i] > array[i - 1]) {
                answer.add(array[i]);
            }
        }

        return answer;
        // 코드 작성
    }

        public static void main (String[]args){
            Number1WithoutStream number1 = new Number1WithoutStream();
            Scanner scanner = new Scanner(System.in);

            int number = scanner.nextInt();
            int[] array = new int[number];

            for (int i = 0; i < number; i++) {
                array[i] = scanner.nextInt();
            }

            for (int x : number1.solution(number, array)) {
                System.out.print(x + " ");
            }
        }
    }
