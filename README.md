# Coffee Shop - Strategy Pattern

## Description

This is a simple Java application that demonstrates
the Strategy Design Pattern.

The application calculates coffee prices using
different discount strategies.

## Strategies

1. NoDiscount - 0% discount
2. StudentDiscount - 10% discount
3. RegularCustomerDiscount - 20% discount

## Technologies

- Java 17
- IntelliJ IDEA
- Strategy Design Pattern

## Project Structure

- DiscountStrategy.java - Strategy interface
- NoDiscount.java - First strategy
- StudentDiscount.java - Second strategy
- RegularCustomerDiscount.java - Third strategy
- CoffeeShop.java - Context
- Main.java - Client

## How to Run

1. Open the project in IntelliJ IDEA.
2. Make sure JDK 17 is selected.
3. Open Main.java.
4. Click Run.

Alternatively, open a terminal in the project folder:

javac -d out src/*.java

java -cp out Main

## How to Add a New Strategy

1. Create a new Java class.
2. Implement the DiscountStrategy interface.
3. Override the calculatePrice() method.
4. Use setStrategy() to select the new strategy.

No changes to CoffeeShop.java are required.

## Strategy Pattern

The Strategy Pattern allows the application
to change discount algorithms at runtime.

Each discount has its own class.

The CoffeeShop class does not need to know
how each discount is calculated.
