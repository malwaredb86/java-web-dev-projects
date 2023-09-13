package org.launchcode;
import java.time.LocalDate;

import java.util.ArrayList;

public class Restaurant {

    public static void main(String[] args) {
        MenuItem menuItem1 = new MenuItem("Apple pie", 5.99, "delicious apple pie, just like grandma's", "Dessert", true);
        MenuItem menuItem2 = new MenuItem("Spaghetti", 15.99, "noodles and sauce", "Main Course", true);
        MenuItem menuItem3 = new MenuItem("Gyoza", 5.99, "pork filled dumpling", "Appetizer", true);
        MenuItem menuItem4 = new MenuItem("Gyro", 10.99, "pita pocket filled with lamb", "Main Course", true);



        Menu menu1 = new Menu(LocalDate.now(), new ArrayList<MenuItem>()) ;

        menu1.addItem(menuItem1);
        menu1.addItem(menuItem2);
        menu1.addItem(menuItem3);
        menu1.addItem(menuItem4);

        menu1.getItems();

        menu1.getItem();

        menu1.removeItem(menuItem4);

        menu1.getItems();



        MenuItem menuItem5 = new MenuItem("Spaghetti", 15.99, "noodles and sauce", "Main Course", true);



    }
}
