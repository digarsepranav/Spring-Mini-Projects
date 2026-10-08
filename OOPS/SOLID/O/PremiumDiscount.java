package SOLID.O;

public class PremiumDiscount implements Discount{
    @Override
    public double calculate(double price) {
        return price * 0.20;
    }
}
