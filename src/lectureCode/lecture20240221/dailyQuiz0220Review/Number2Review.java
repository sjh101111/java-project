package lectureCode.lecture20240221.dailyQuiz0220Review;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Number2Review {
    public int[] solution(int[] array1, int[] array2) {
        int[] result = new int[array1.length + array2.length];

        // 코드 작성
        int index = 0, i = 0, j = 0;
        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                result[index] = array1[i];
                index++;
                i++;
            } else {
                result[index] = array2[j];
                index++; j++;
            }
        }
        while (i < array1.length) {
            result [index] = array1[i];
            index++;
            i++;
        }

        while (j < array2.length) {
            result [index] = array1[i];
            index++; j++;
        }

//        return IntStream.concat(Arrays.stream(array1), Arrays.stream(array2))
//                .sorted()
//                .toArray();

        return result;
    }

    public static void main(String[] args) {
        Number2Review number2Review = new Number2Review();
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

        for (int x : number2Review.solution(array, array2)) {
            System.out.print(x + " ");
        }
    }
}
