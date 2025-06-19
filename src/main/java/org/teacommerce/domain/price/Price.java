package org.teacommerce.domain.price;

// TODO: replace double by object
// TODO: constructor

import org.teacommerce.domain.product.Ratio;

public class Price {
    private NetPrice base;
    private ImportCharges importCharges;
    private Discount discount;
    private Ratio vatRate;

    public Price(NetPrice base, ImportCharges importCharges, Discount discount, Ratio vatRate) {
        this.base = base;
        this.importCharges = importCharges;
        this.discount = discount;
        this.vatRate = vatRate;
    }

    public double getTaxFreePrice() {
        return ((base + importCharges) * discount);
    }

    public double getFinalPrice() {
        return (((base + importCharges) * discount) * vatRate);
    }
}
