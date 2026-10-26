public class StudentDiscount implements DiscountStrategy {

    @Override
    public double calculatePrice(double price) {
        return price * 0.90;
    }
}