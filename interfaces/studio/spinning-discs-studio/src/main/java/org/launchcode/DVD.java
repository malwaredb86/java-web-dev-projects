package org.launchcode;

public class DVD extends BaseDisc implements OpticalDisc{

    public DVD(String name, int capacity, String discType, String contents){
        super(name, capacity, discType, contents);

    }

    @Override
    public void writeData() {
        System.out.println(this.name + " is writing at 120 mB/s");
    }

    @Override
    public void readData() {
        System.out.println(this.name + " is reading at 420 kB/s");

    }

    @Override
    public void spinDisc() {
        System.out.println(this.name + " is spinning at rpm");

    }


    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
