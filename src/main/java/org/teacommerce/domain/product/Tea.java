package org.teacommerce.domain.product;

import org.teacommerce.domain.price.Price;

import java.util.List;
import java.util.UUID;

// TODO: que faire des pourcentages ?
// TODO: ajouter raccourci pour rename
// TODO: constructor
// TODO: voir pour ajouter test avec JUnit5 (https://www.baeldung.com/junit-5)
// cf require() envoyée par Benoît
// TODO: kata

public class Tea {
    private UUID id; // pour le constructeur : this.id = UUID.randomUUID();
    private String name;
    private String brand;
    private Category category;
    private Origin origin;
    private List<String> flavours;
    private double oxydation;
    private SteepingRules steepingRules;
    private Price price;

    public double taxFreePriceBy(int quantity) {
        return quantity * price.getTaxFreePrice();
    }

}

