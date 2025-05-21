package org.teacommerce.domain.product;

import java.util.List;

public class Tea {
    // getter for all: we might need the info later
    private String brand; // Setter: no, a brand name is not modifiable
    private Category category; //Setter: no, category names are strictly enumerated
    private String name; //Setter: no, a tea name is not modifiable
    private Origin origin; //Setter: no, tea origins are strictly enumerated
    private List<String> flavours; // Setter: not necessary, as it is a list elements can be added or deleted withtou a setter,
    // and it could be better to avoid the list to be fully replaced by a new one
    private int oxydation; // Setter: no, the oxydation is roughly the same all the time
    private int temperature; // Setter: no, the temperature is generally based on the category, and category is not modifiable
    private int steepingTime; // Setter: yes, the steeping time could be modified depending on the harvest year for the tea...
    private double price;  // Setter: yes, the price is fixed at first but can be modified by some events (e.g. extra taxes)
    private int quantity; // Setter: yes, quantity can vary on various factors

    public Tea(String brand, Category category, String name, Origin origin, List<String> flavours, int oxydation, int temperature, int steepingTime, double price, int quantity) {
        this.brand = brand;
        this.category = category;
        this.name = name;
        this.origin = origin;
        this.flavours = flavours;
        this.oxydation = oxydation;
        this.temperature = temperature;
        this.steepingTime = steepingTime;
        this.price = price;
        this.quantity = quantity;
    }

    public boolean isFlavoured() {
        return !flavours.isEmpty();
    }

    // Assuming that the price refers to 100g
    public double totalPrice(int inputQuantity) {
        return inputQuantity * (price / 100);
    }

    public void infuse(int inputQuantity) {
        System.out.print(name + ": Infuse during " + steepingTime + "min, with a water temperature of " + temperature + "degrees");
    }

    // Assuming that the steeping time refers to 3g
    public boolean isInfused(int inputQuantity, int currentTime) {
        int requiredTime = (steepingTime * inputQuantity) / 3;

        if (currentTime >= requiredTime) {
            return true;
        } else {
            int remainingTime = requiredTime - currentTime;
            System.out.println("You must wait for " + remainingTime + " more minutes.");
            return false;
        }
    }

}

