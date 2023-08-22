package org.launchcode;

import java.util.Scanner;
public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have been driven:");
        Double miles = input.nextDouble();
        System.out.println("How much gas has been consumed:");
        Double gallons = input.nextDouble();
        input.close();

        Double mpg = miles / gallons;
        System.out.println("You are running on " + mpg + " mpg");
    }

}
