package quizPackage.weeklyQuiz.week1;

public class Beauty extends Product {
    public Beauty(String name, int price, double weight) {
        super(name, price, weight);
    }

    public int getPrice(){
        return price;
    }

    public double getWeight() {
        return weight;
    }
}
