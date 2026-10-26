public class Main {

    public static void main(String[] args) {

        CoffeeShop shop = new CoffeeShop(new NoDiscount());

        double coffeePrice = 2000;

        System.out.println("Welcome to Coffee Shop!");
        System.out.println("Coffee: Cappuccino");
        System.out.println("Original price: " + coffeePrice + " KZT");

        System.out.println();

        System.out.println("No discount:");
        System.out.println("Final price: " + shop.calculatePrice(coffeePrice) + " KZT");

        shop.setStrategy(new StudentDiscount());

        System.out.println();

        System.out.println("Student discount (10%):");
        System.out.println("Final price: " + shop.calculatePrice(coffeePrice) + " KZT");

        shop.setStrategy(new RegularCustomerDiscount());

        System.out.println();

        System.out.println("Regular customer discount (20%):");
        System.out.println("Final price: " + shop.calculatePrice(coffeePrice) + " KZT");
    }
}