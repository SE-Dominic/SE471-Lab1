import java.util.*;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("Harry Potter", 12.99);
        Product p2 = new Product("The Mapmaker", 9.75);
        Product p3 = new Product("Levi Backpack", 34.00);
        Product p4 = new Product("Happy Birthday Button", 5.2);
        Product p5 = new Product("Air Humidifier", 55.00);
        ArrayList<Product> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);
        SortIF sortClient = new SortingProxy();
        System.out.println("Client sorting using bubble sort: ");
        sortClient.log(list, 1);
        System.out.println("Client sorting using quick sort: ");
        sortClient.log(list, 2);
    }

}