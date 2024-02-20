package quizPackage.dailyQuiz.dailyQuiz20240220;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Number1WithStream {
//    public List<Integer> solution(int n, int[] array) {return 0}

        // 두 번째 수부터 비교 시작

        public static void main (String[]args){

            List<Integer> answer = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);

            int number = scanner.nextInt();
            int[] array = new int[number];

            for (int i = 0; i < number; i++) {
                array[i] = scanner.nextInt();
            }

            IntStream.range(0, number) // 0부터 n-1까지의 인덱스에 대한 스트림 생성
                    .filter(i -> i == 0 || array[i] > array[i - 1]) // 첫 번째 요소이거나 바로 앞 요소보다 큰 경우
                    .mapToObj(i -> array[i]) // 필터링된 인덱스에 해당하는 요소 값을 스트림으로 변환
                    .forEach(x -> System.out.print(x + " "));
        }
    }
