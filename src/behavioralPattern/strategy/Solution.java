package behavioralPattern.strategy;

import behavioralPattern.strategy.customer.Customer;
import behavioralPattern.strategy.shop.Item;
import behavioralPattern.strategy.shop.ShoppingCart;
import behavioralPattern.strategy.strategies.CashStrategy;
import behavioralPattern.strategy.strategies.CreditCardStrategy;
import behavioralPattern.strategy.strategies.PaymentStrategy;
import behavioralPattern.strategy.strategies.PaypalStrategy;

import java.time.LocalDate;

import static java.util.Calendar.SEPTEMBER;
import static behavioralPattern.strategy.shop.PaymentType.*;

/* 
Стратегический шопинг
*/

public class Solution {

    public static void main(String[] args) {
        Customer customer = new Customer("Панас Мирный", "panas.m@example.com", "1234-5678-9012-3456", 786, LocalDate.of(2026, SEPTEMBER, 1), "mypwd");

       // ShoppingCart cart1 = new ShoppingCart(customer, CASH);
        ShoppingCart cart1 = new ShoppingCart(new CashStrategy());
        cart1.addItem(new Item(847, "Электрическая зубная щетка", 12));
        cart1.addItem(new Item(939, "Триммер", 19));
        cart1.pay();

       // ShoppingCart cart2 = new ShoppingCart(customer, PAYPAL);
        ShoppingCart cart2 = new ShoppingCart( new PaypalStrategy(customer));
        cart2.addItem(new Item(2621, "Электрический термометр", 9));
        cart2.addItem(new Item(923, "Купальный костюм", 39));
        cart2.pay();

        //ShoppingCart cart3 = new ShoppingCart(customer, CREDIT_CARD);
        ShoppingCart cart3 = new ShoppingCart( new CreditCardStrategy(customer));
        cart3.addItem(new Item(285, "Блайзер", 5));
        cart3.addItem(new Item(266, "Велосипед", 149));
        cart3.pay();
    }
}
