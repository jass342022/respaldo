package Java;

public class Uberx extends Card{
    String brand;
    String model;

    public Uberx(String license, Account driver, String brand, String model) {
        super(license, driver);
        this.brand= brand;
        this.model = model;
    }
    @Override
    void printDataCar() {
        System.out.println("Model " +model + "Brand " + brand);
     
    }
}
