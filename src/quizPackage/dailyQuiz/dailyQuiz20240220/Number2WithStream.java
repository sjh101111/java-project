package quizPackage.dailyQuiz.dailyQuiz20240220;

import java.util.Scanner;

public class Number2WithStream {
    public static int[] solution(int[] array1, int[] array2) {
        int[] result = new int[array1.length + array2.length];

        // 코드 작성
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] < array2[j]) {
                    result[i] = array1[i];
                } else if (array1[i] > array2[j]) {
                    result[i] = array2[j];
                } else {
                    result[i] = array1[i];
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Number2WithStream ascendingSort = new Number2WithStream();
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

        for (int x : Number2WithStream.solution(array, array2)) {
            System.out.print(x + " ");
        }

//        IntStream.range(0, array.length + array2.length)
//                .filter()
    }
}
