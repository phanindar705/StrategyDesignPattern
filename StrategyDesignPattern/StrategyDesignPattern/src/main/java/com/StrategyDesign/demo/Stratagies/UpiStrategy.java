package com.StrategyDesign.demo.Stratagies;

import com.StrategyDesign.demo.Istrategy.PaymentStrategy;

public class UpiStrategy implements PaymentStrategy {

    private String UpiId;
    private  String pin;

    public UpiStrategy(String upiId, String pin) {
        UpiId = upiId;
        this.pin = pin;
    }

    public String getUpiId() {
        return UpiId;
    }

    public void setUpiId(String upiId) {
        UpiId = upiId;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    @Override
    public void pay(double amount) {
        System.out.println(amount + " Transaction Successful");
    }
}
