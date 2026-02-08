import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world.");
    }

}

class Product {
    private static int id = 0;
    private String name;
    private double price;

    public Product(String n, double p) {
        this.name = n;
        this.price = p;
        Product.id++;
    }

    int getID() {
        return Product.id;
    }

    String getName() {
        return this.name;
    }

    double getPrice() {
        return this.price;
    }
}

class SortingUtility {
    private static List<Product> bubbleSort(ArrayList<Product> list) {
        int n = list.size();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j).getPrice() > list.get(j + 1).getPrice()) {
                    Collections.swap(list, i, j);
                }
            }
        }
        return list;
    }

    // private List<Product> quickSort(List<Product> list) {}
    // public List<Product> sort(List<Product> items, int sortApproach);
    public SortingUtility() {

    }
}