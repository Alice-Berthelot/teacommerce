package org.teacommerce.domain.product;

import static org.teacommerce.utils.Preconditions.require;

public class Ratio {
    private final double value;

    public Ratio(double value, String label) {
        require (value >= 0 && value <= 1, label + " must be between 0 and 1.");
        this.value = value;
    }

    // peut-être prévoir méthode pour retourner une valeur en pourcentage avec NumberFormat
}
