package org.launchcode;

public class InterfaceStudioMain {
    public static void main(String[] args) {

        CD myCd = new CD("Rumors - Fleetwood Mac", 9, "CD", "Alt Rock Music");

        DVD myDvd = new DVD("The Little Mermaid", 1, "DVD", "Disney movie");

        myCd.spinDisc();
        myDvd.spinDisc();

        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.
    }
}