package SOLID.O;

public class VipDiscount implements Discount{
    @Override
    public double calculate(double price) {
        return 0.40 * price;
    }
}
