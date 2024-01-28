package behavioralPattern.strategy.shop;

import behavioralPattern.strategy.customer.Customer;
import behavioralPattern.strategy.strategies.PaymentStrategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items = new ArrayList<>();
  //  private Customer customer;
//    private PaymentType type;
    private PaymentStrategy strategy;

    public ShoppingCart(PaymentStrategy strategy) {
        this.strategy = strategy;
       /* this.customer = customer;
        this.type = type;*/
    }

    public PaymentStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }
    public void addItem(Item item) {
        this.items.add(item);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }

    public int calculateTotal() {
        int sum = 0;
        for (Item item : items) {
            sum += item.getPrice();
        }
        return sum;
    }

    public void pay() {
        int amount = calculateTotal();
        strategy.pay(amount);
       /* switch (type) {
            case CASH:
                // много важного кода
                System.out.printf("Оплачено товаров на $%d наличными.\n", amount);
                break;
            case PAYPAL:
                // много важного кода
                System.out.printf("Оплачено товаров на $%d с помощью Paypal.\n", amount);
                break;
            case CREDIT_CARD:
                // много важного кода
                System.out.printf("Оплачено товаров на $%d кредитной картой %s.\n", amount, customer.getCardNumber());
                break;
        }*/
    }
}
