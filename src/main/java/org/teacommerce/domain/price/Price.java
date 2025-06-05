package org.teacommerce.domain.price;

public class Price {
    double netPrice;
    double importCost;
    double discount;
    double shippingCost;
    double vatRate;

    // service CurrencyConversionService

    public double getFinalPriceWithTax() {
        double priceBeforeVat = netPrice + importCost + shippingCost - discount;
        return priceBeforeVat * (1 + vatRate / 100);
    }
}
