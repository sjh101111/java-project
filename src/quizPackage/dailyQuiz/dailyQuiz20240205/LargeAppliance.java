package quizPackage.dailyQuiz.dailyQuiz20240205;

public class LargeAppliance extends Product {
    LargeAppliance(String name, int price, int weight) {
        super(name, price, weight);
    }

    @Override
    public int getDiscountAmount() {
        return 0;
    }
}
