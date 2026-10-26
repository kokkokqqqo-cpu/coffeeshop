public class RegularCustomerDiscount implements DiscountStrategy {

    @Override
    public double calculatePrice(double price) {
        return price * 0.80;
    }
}