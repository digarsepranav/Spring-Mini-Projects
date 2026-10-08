package SOLID.O;

public class Main {
    static void main(String[] args) {
        DiscountCalculator dc = new DiscountCalculator();
        Discount regular = new RegularDiscount();
        System.out.println(dc.calculate(regular, 1300));
    }
}
