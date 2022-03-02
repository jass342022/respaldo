package Java;

class Main {
    public static void main(String[] args) {
        byte i = 1; byte j = 1; byte k = i+j;
        System.out.println(k);
        Uberx uberx = new Uberx("AMQSe", new Account("jsua", "jsudd33sss"), "XX", "zz");
        uberx.setPassger(4);

        uberx.printDataCar();

        UberVan uberVan  = new UberVan ("122ff333", new Account("jsua", "jsudd33sss"));
        uberVan.setPassger(4);
        uberVan.printDataCar();
    }
}