package Java;

public class Card {
    private Integer id;
    private String license;
    private Account driver;
    private Integer passegenger;

    public Card( String license,   Account driver){
            this.license = license;
            this.driver = driver;                                                                                                                                        
    }

    void printDataCar() {
    
        System.out.println("License: " + license + " Name Driver " + driver.name + " Passegenger " + passegenger);
    }
    public Integer getPasseger(){
        return passegenger;
    }
    public void setPassger( Integer passegenger ){
        if(passegenger == 4){
             this.passegenger = passegenger; 
        }
        else{ 
            System.out.println("Debe ser 4 passajero");
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Account getDriver() {
        return driver;
    }

    public void setDriver(Account driver) {
        this.driver = driver;
    }

}
