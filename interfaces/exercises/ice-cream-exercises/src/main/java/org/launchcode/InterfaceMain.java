package org.launchcode;

import java.util.ArrayList;
import java.util.Comparator;

public class InterfaceMain {
    public static void main(String[] args) {
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        ArrayList<Topping> toppings = menu.getToppings();

        flavors.sort(new FlavorComparator());
        cones.sort(new ConeComparator());
        toppings.sort(new ToppingComparator());

        System.out.println(toppings);

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name' field.

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost' field.

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
    }
}