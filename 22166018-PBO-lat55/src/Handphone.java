public class Handphone {

    private String manufaktur = "Samsung";
    private String os = "Android";
    private String model = "Grand";
    private int harga = 3000000;
    private String androidKeyStore = "234ibfd3840fo";

    public void displayProduct() {
        System.out.println("Manufaktur: " + manufaktur);
        System.out.println("OS: " + os);
        System.out.println("Model: " + model);
        System.out.println("Harga: " + harga);
        System.out.println("Android Key Store: " + androidKeyStore);
    }

    public static void main(String[] args) {
        Handphone hp = new Handphone();
        hp.displayProduct();
    }
}
