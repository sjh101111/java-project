package quizPackage.weeklyQuiz.week2;

public class Cart {
    public Product [] products;

    public Cart( Product[] products) {
        this.products = products;
    }

    public int calculateDeliveryCharge() {
        int weight = 0;
        int price = 0;
        int deliveryCharge = 0;

        for (int i = 0; i < products.length; i++) {
            weight += products[i].getWeight();
            price += products[i].getPrice() - products[i].getDiscountAmount();
        }

        if (weight < 3) {
            deliveryCharge = 1000;
        } else if (weight >= 3 && weight < 10) {
            deliveryCharge = 5000;
        } else {
            deliveryCharge = 10000;
        }

        if (price < 30000) {
            deliveryCharge = deliveryCharge;
        } else if (price >= 30000 && price < 100000) {
            deliveryCharge = deliveryCharge - 1000;
        } else {
            deliveryCharge = 0;
        }
        return deliveryCharge;
    }
}
