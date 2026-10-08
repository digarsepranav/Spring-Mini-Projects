package SOLID.O;

public class RegularDiscount implements Discount{
    @Override
    public double calculate(double price) {
        return 0.1 * price;
    }
}
