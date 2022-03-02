package Java;

public class UberlPool extends Card
{
    
    String brand;
    String model;

    public UberlPool(String license, Account driver, String brand, String model) {
        super(license, driver);
        this.brand= brand;
        this.model = model;
    }
}
