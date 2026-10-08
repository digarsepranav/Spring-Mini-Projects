package SOLID.O;

public class StudentDiscount implements Discount{

    @Override
    public double calculate(double price) {
        return 0.20 * price;
    }
}
