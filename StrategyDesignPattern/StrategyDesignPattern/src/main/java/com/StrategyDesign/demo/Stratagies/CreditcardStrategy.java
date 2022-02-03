package com.StrategyDesign.demo.Stratagies;

import com.StrategyDesign.demo.Istrategy.PaymentStrategy;

public class CreditcardStrategy implements PaymentStrategy {
    private String CardHolderName;
    private String CardNumber;
    private String CVV;
    private String DateOfExpiry;


    public CreditcardStrategy(String cardHolderName, String cardNumber, String CVV, String dateOfExpiry) {
        CardHolderName = cardHolderName;
        CardNumber = cardNumber;
        this.CVV = CVV;
        DateOfExpiry = dateOfExpiry;
    }

    public String getCardHolderName() {
        return CardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        CardHolderName = cardHolderName;
    }

    public String getCardNumber() {
        return CardNumber;
    }

    public void setCardNumber(String cardNumber) {
        CardNumber = cardNumber;
    }

    public String getCVV() {
        return CVV;
    }

    public void setCVV(String CVV) {
        this.CVV = CVV;
    }

    public String getDateOfExpiry() {
        return DateOfExpiry;
    }

    public void setDateOfExpiry(String dateOfExpiry) {
        DateOfExpiry = dateOfExpiry;
    }

    @Override
    public void pay(double amount) {
        System.out.println(amount + " paid with creditcard");
    }
}
