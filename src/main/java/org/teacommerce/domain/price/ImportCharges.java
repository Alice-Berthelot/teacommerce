package org.teacommerce.domain.price;

import java.util.Currency;

public class ImportCharges {
    private final double amount;
    private final Currency currency;

    public ImportCharges(double amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }

//    pour le moment simple, mais pourrait évoluer car peut représenter plusieurs types de coûts
}
