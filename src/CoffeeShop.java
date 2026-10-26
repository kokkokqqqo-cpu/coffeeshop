public class CoffeeShop {

    private DiscountStrategy strategy;

    public CoffeeShop(DiscountStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(DiscountStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculatePrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }

        return strategy.calculatePrice(price);
    }
}