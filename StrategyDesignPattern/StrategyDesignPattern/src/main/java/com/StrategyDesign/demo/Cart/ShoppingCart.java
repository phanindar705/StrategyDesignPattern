package com.StrategyDesign.demo.Cart;

import com.StrategyDesign.demo.Istrategy.PaymentStrategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Item>itemslist;

    public ShoppingCart() {
        this.itemslist = new ArrayList<Item>();
    }

    public void additem(Item item){
        this.itemslist.add(item);
    }
    public void removeitem(Item item){
        this.itemslist.remove(item);
    }

    public double calculatetotal(){
        double sum = 0;
        for(Item item : itemslist){
            sum += item.getPrice();}
            return  sum;
    }

    public  void pay(PaymentStrategy paymentmethod){
        double amount = calculatetotal();
        paymentmethod.pay(amount);
    }
}
