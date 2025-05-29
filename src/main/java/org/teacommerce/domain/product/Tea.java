package org.teacommerce.domain.product;

import java.util.List;

// TODO: se renseigner sur les identifiants uniques
// TODO: créer un objet Price
// TODO: qu'est-ce qu'oxydation ? qu'est-ce qu'un flavour?
// TODO: kata

public class Tea {

    private String brand;
    private Category category;
    private String name; // serait bien d'avoir un identifiant unique
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

