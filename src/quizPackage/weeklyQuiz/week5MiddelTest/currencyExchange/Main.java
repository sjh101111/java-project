package quizPackage.weeklyQuiz.week5MiddelTest.currencyExchange;

import java.util.Scanner;

public class Main {
    final double USD = 0.00075;
    final double JPY = 0.11;
    double usdKRW;
    double jpyKRW;

    public double getUsdKRW(double num) {
        this.usdKRW = num * USD ;
        return usdKRW;
    }

    public double getJpyKRW(double num) {
        this.jpyKRW = num * JPY / 1000;
        return jpyKRW;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextDouble();
        String calResult = String.format(
                "달러($) = %1.2f / JPY = %2.2f",main.getUsdKRW(num), main.getJpyKRW(num) );
        System.out.println(calResult);
    }
}
