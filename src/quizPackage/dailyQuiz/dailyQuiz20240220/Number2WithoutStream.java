package quizPackage.dailyQuiz.dailyQuiz20240220;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Number2WithoutStream {
    public static int[] solution(int[] array1, int[] array2) {
        int[] result = new int[array1.length + array2.length];

        // 코드 작성
        int i = 0, j = 0, k = 0;

        // 두 배열의 요소를 비교하며 결과 배열에 추가
        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                result[k++] = array1[i++];
            } else {
                result[k++] = array2[j++];
            }
        }

        // array1에 남은 요소가 있다면 결과 배열에 추가
        while (i < array1.length) {
            result[k++] = array1[i++];
        }

        // array2에 남은 요소가 있다면 결과 배열에 추가
        while (j < array2.length) {
            result[k++] = array2[j++];
        }

        return result;

    }

    public static void main(String[] args) {
        Number2WithoutStream ascendingSort = new Number2WithoutStream();
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int[] array = new int[number];

        for (int i = 0; i < number; i++) {
            array[i] = scanner.nextInt();
        }

        int number2 = scanner.nextInt();
        int[] array2 = new int[number2];

        for (int i = 0; i < number2; i++) {
            array2[i] = scanner.nextInt();
        }

        for (int x : Number2WithoutStream.solution(array, array2)) {
            System.out.print(x + " ");
        }

//        IntStream.range(0, array.length + array2.length)
//                .filter()
    }
}
