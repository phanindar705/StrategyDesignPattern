package com.StrategyDesign.demo;

import com.StrategyDesign.demo.Cart.Item;
import com.StrategyDesign.demo.Cart.ShoppingCart;
import com.StrategyDesign.demo.Stratagies.PaytmStrategy;
import com.StrategyDesign.demo.Stratagies.UpiStrategy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		ShoppingCart cart = new ShoppingCart();
		Item item1 = new Item ("book",100.0);
		Item item2 = new Item("pen",50);
		cart.additem(item1);
		cart.additem(item2);


		//cart.pay(new PaytmStrategy("phani@gmail","lucky"));
		cart.pay(new UpiStrategy("phani@upi","1111"));
	}

}
