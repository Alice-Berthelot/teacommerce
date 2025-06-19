package org.teacommerce.domain.price;

import java.util.Currency;

// Represents the price excluding import charges, discounts, and VAT

public class NetPrice {
    private final double amount;
    private final Currency currency;

    public NetPrice(double amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }

//    add getter/method to get either amount only or amount + currency
}
