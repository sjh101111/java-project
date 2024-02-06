package quizPackage.dailyQuiz.dailyQuiz20240205;

public class Product  implements Promotion {
    private String name;
    private int price;
    private int weight;

    Product (String name, int price, int weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    String getName() {
        return name;
    }

    int getPrice() {
        return price;
    }

    int getWeight() {
        return weight;
    }
    @Override
    public int getDiscountAmount() {
       return 0;
    }
}

