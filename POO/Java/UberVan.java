package Java;

import java.util.ArrayList;
import java.util.Map;

public class UberVan extends Card {
    
    Map<String, Map<String, Integer>> typeCarAccepted; 
    ArrayList<String>  seatsMaterial;
    private Integer passegenger;

       public UberVan(String license, Account driver, Map<String, Map<String, Integer>> typeCarAccepted, 
        ArrayList<String>  seatsMaterial) {
           super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
       }
       public UberVan(String license, Account driver) {
          super(license, driver);
      }
      @Override
      public void setPassger(Integer passegenger) {
         if(passegenger == 6){
            this.passegenger = passegenger; 
       }
       else{ 
           System.out.println("Debe ser 4 passajero");
       }
      }
}
