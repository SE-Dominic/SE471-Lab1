public class Product {
    public static int counter = 0;
    private final int id;
    private String name;
    private double price;

    public Product(String n, double p) {
        this.name = n;
        this.price = p;
        this.id = ++counter;
    }

    int getID() {
        return this.id;
    }

    String getName() {
        return this.name;
    }

    double getPrice() {
        return this.price;
    }
}
