package org.teacommerce.domain.price;

// TODO: replace double by object
// TODO: constructor

public class Price {
    private double base;
    private double importCost;
    // should be between 0.00 et 1.00:
    private double discount;
    // should be between 0.00 et 1.00:
    private double vatRate;

    public Price(double base, double importCost, double discount, double vatRate) {
        this.base = base;
        this.importCost = importCost;
        this.discount = discount;
        this.vatRate = vatRate;
        // require();
    }

    public double getTaxFreePrice() {
        return ((base + importCost) * discount);
    }

    public double getFinalPrice() {
        return (((base + importCost) * discount) * vatRate);
    }
}
