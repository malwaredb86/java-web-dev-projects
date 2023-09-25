package org.launchcode;

import java.util.ArrayList;

public class CD extends BaseDisc implements OpticalDisc{


    public CD(String name, int capacity, String discType, String contents){
        super(name, capacity, discType, contents);


    }



    @Override
    public void writeData() {
        System.out.println(this.name + " is writing at 420 kB/s");
    }

    @Override
    public void readData() {
        System.out.println(this.name + " is reading at 120 mB/s");
    }

    @Override
    public void spinDisc() {
        System.out.println(this.name + " is spinning at another rpm");
    }




    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
