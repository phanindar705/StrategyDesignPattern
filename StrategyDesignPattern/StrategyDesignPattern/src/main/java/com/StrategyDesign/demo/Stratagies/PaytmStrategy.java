package com.StrategyDesign.demo.Stratagies;

import com.StrategyDesign.demo.Istrategy.PaymentStrategy;

public class PaytmStrategy implements PaymentStrategy {
    private  String emailid;
    private String password;

    public PaytmStrategy(String emailid, String password) {
        this.emailid = emailid;
        this.password = password;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void pay(double amount) {
        System.out.println(amount + " paid using PayTM");
    }
}
