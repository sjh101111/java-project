package lecture20240205.dailyQuiz;

public class Cart {
    private Product[] products;

    public Cart(Product[] products) {
        this.products = products;
    }

    public int calculateDeliveryCharge() {
        int totalWeight = 0;
        int totalPrice = 0;
        int totalDiscount = 0;

        for (Product product : products) {
            totalWeight += product.getWeight();
            totalPrice += product.getPrice();
            totalDiscount += product.getDiscountAmount();
        }

        int deliveryCharge = calculateBaseDeliveryCharge(totalWeight) - totalDiscount;
        if (totalPrice >= 100000) {
            deliveryCharge = 0;
        }

        return deliveryCharge;
    }

    private int calculateBaseDeliveryCharge(int totalWeight) {
        if (totalWeight < 3) {
            return 1000;
        } else if (totalWeight < 10) {
            return 5000;
        } else {
            return 10000;
        }
    }

}


