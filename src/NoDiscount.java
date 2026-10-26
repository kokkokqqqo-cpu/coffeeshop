public class NoDiscount implements DiscountStrategy {

    @Override
    public double calculatePrice(double price) {
        return price;
    }
}