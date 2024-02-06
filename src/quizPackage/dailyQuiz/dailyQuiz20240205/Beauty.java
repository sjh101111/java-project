package quizPackage.dailyQuiz.dailyQuiz20240205;

public class Beauty extends Product {
    Beauty(String name, int price, int weight) {
        super(name, price, weight);
    }

    @Override
    public int getDiscountAmount() {
        return 10000;
    }
}
