import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world.");
        Product p1 = new Product("banana", 0.50);
        Product p2 = new Product("apple", 1.0);
        Product p3 = new Product("rasberry", 1.50);
        Product p4 = new Product("coco", 1.750);
        Product p5 = new Product("berry", 3.50);
        ArrayList<Product> lst = new ArrayList<>();
        lst.add(p1);
        lst.add(p3);
        lst.add(p2);
        lst.add(p5);
        lst.add(p4);
        SortingUtility su = new SortingUtility();

        su.sort(lst, 2);
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
    private static ArrayList<Product> bubbleSort(ArrayList<Product> list) {
        int n = list.size();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j).getPrice() > list.get(j + 1).getPrice()) {
                    Collections.swap(list, j, j + 1); // Collections module has swap function
                }
            }
        }
        return list;
    }

    private static int partition(ArrayList<Product> l, int lo, int hi) {
        Product pivot = l.get(hi);
        double pivot_price = pivot.getPrice();
        int i = lo - 1;
        // loop through from lo to hi and if current element is smaller or equal to
        // pivot
        for (int j = lo; j < hi; j++) {
            if (l.get(j).getPrice() < pivot_price) {
                i++;
                Collections.swap(l, i, j);
            }
        }
        Collections.swap(l, i + 1, hi);
        return i + 1;
    }

    private static ArrayList<Product> quickSort(ArrayList<Product> list, int low, int high) {
        if (low < high) {
            int part = partition(list, low, high);
            // left side of list
            quickSort(list, low, part - 1);
            // right side of list
            quickSort(list, part + 1, high);
        }
        return list;
    }

    public List<Product> sort(ArrayList<Product> items, int sortApproach) {
        if (sortApproach == 1) {
            ArrayList<Product> sorted = bubbleSort(items);
            for (int i = 0; i < items.size(); i++) {
                System.out.println(sorted.get(i).getName());
            }
        } else if (sortApproach == 2) {
            System.out.println("2nd option chosen.");
            ArrayList<Product> sorted = quickSort(items, 0, items.size() - 1);
            for (int i = 0; i < items.size(); i++) {
                System.out.println(sorted.get(i).getName());
            }
        } else {
            System.out.println("Invalid response.");
        }
        return items;
    }

    public SortingUtility() {
    }
}