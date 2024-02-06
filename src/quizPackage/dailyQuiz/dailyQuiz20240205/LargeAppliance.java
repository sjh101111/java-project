package quizPackage.dailyQuiz.dailyQuiz20240205;

public class LargeAppliance extends Product {
    LargeAppliance (String name, int price, double weight) {
        super(name, price, (int) weight);
    }

    @Override
    public int getDiscountAmount() {
        return 0;
    }
}
