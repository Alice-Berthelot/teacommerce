package org.teacommerce.domain.product;

import org.teacommerce.domain.price.Price;

import java.util.List;
import java.util.UUID;

// TODO: que faire des pourcentages ?
// TODO: ajouter raccourci pour rename  - OK(⇧F6)
// TODO: constructor
// TODO: voir pour ajouter test avec JUnit5 (https://www.baeldung.com/junit-5)
// TODO: lire https://www.linkedin.com/posts/anthony-cyrille_la-semaine-dernière-je-vous-disais-que-la-activity-7338429780498821120-8icT?utm_source=share&utm_medium=member_desktop&rcm=ACoAACxYMAoB21x5SN0WRg3Tddp5v043r4OUbnE
// cf require() envoyée par Benoît
// TODO: kata

public class Tea {
    private UUID id;
    private String name;
    private String brand;
    private Category category;
    private Origin origin;
    private List<String> flavours;
    private Ratio oxydation;
    private SteepingRules steepingRules;
    private Price price;

    public Tea(UUID id, String name, String brand, Category category, Origin origin, List<String> flavours, Ratio oxydation, SteepingRules steepingRules, Price price) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.category = category;
        this.origin = origin;
        this.flavours = flavours;
        this.oxydation = oxydation;
        this.steepingRules = steepingRules;
        this.price = price;
    }

    public double taxFreePriceBy(int quantity) {
        return quantity * price.getTaxFreePrice();
    }

}

