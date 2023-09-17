public class Laptop extends Computer{
    private String manufacturer;
    private double screenSize;

    public Laptop(String aModel, String aManufacturer) {
        super(aModel);
        manufacturer = aManufacturer;
    }

    public boolean isGaming() {
        return screenSize > 24 && isInternet();
    }
}
