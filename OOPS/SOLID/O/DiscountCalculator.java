package SOLID.O;

public class DiscountCalculator {
    double calculate(Discount discount, double price) {
        return discount.calculate(price);
    }
}
