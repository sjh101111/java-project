package lecture20240205.dailyQuiz;

public class LargeAppliance extends Product {
    LargeAppliance (String name, int price, int weight) {
        super(name, price, weight);
    }

    @Override
    public int getDiscountAmount() {
        return 2000;
    }
}
