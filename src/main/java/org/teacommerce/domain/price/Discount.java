package org.teacommerce.domain.price;

import org.teacommerce.domain.product.Ratio;

public class Discount {
    private Ratio value;

    public Discount(Ratio value, String label) {
        this.value = value;
    }
}
