package org.teacommerce.domain.product;

import java.util.List;
import java.util.UUID;

// TODO: se renseigner sur les identifiants uniques
// TODO: créer un objet Price
// TODO: qu'est-ce qu'oxydation ? qu'est-ce qu'un flavour?
// TODO: kata

public class Tea {
    private UUID id; // pour le constructeur : this.id = UUID.randomUUID();
    private String name;
    private String brand;
    private Category category;
    private Origin origin;
    private List<String> flavours;
    private int oxydation;
    private SteepingRules steepingRules;
    private double taxFreePricePerGram; // autre objet

    public boolean isFlavoured() {
        return !flavours.isEmpty();
    }

    public double taxFreePriceBy(int quantity) {
        return quantity * taxFreePricePerGram;
    }

//    public boolean isInfused(int quantity, int currentTime) {
//        int requiredTime = (steepingTime * quantity) / 3;
//
//        if (currentTime >= requiredTime) {
//            return true;
//        } else {
//            int remainingTime = requiredTime - currentTime;
//            System.out.println("You must wait for " + remainingTime + " more minutes.");
//            return false;
//        }
//    }

}

