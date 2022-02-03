package com.StrategyDesign.demo.carttest;

import com.StrategyDesign.demo.Cart.Item;
import com.StrategyDesign.demo.Cart.ShoppingCart;
import com.StrategyDesign.demo.Stratagies.CreditcardStrategy;
import com.StrategyDesign.demo.Stratagies.PaytmStrategy;
import com.StrategyDesign.demo.Stratagies.UpiStrategy;

public class Shoppingcarttest {
    public static void main(String[]args){
        ShoppingCart cart = new ShoppingCart();
        Item item1 = new Item ("book",100.0);
        Item item2 = new Item("pen",50);
        cart.additem(item1);
        cart.additem(item2);


        cart.pay(new PaytmStrategy("phani@gmail","lucky"));
        cart.pay(new UpiStrategy("phani@upi","1111"));
        cart.pay(new CreditcardStrategy("phani","12345678","111","12/30"));
    }
}
