package quizPackage.weeklyQuiz.week5MiddelTest.primeNumberDistinction;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int number = scanner.nextInt();
            if (number == 2 || number == 3) {
                System.out.println("true");
            } else if (1 <= number && number <= 100 && number % 2 != 0 && number % 3 != 0) {
                System.out.println(true);
            } else if (1 <= number && number <= 100 && number % 2 == 0 || number % 3 == 0) {
                System.out.println("false");
            } else if (number == 101) {
                break;
            }
        }
    }
}
