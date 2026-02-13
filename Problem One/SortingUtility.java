import java.util.ArrayList;
import java.util.Collections;

public class SortingUtility {
     private ArrayList<Product> bubbleSort(ArrayList<Product> list) {
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

    private int partition(ArrayList<Product> l, int lo, int hi) {
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

    private ArrayList<Product> quickSort(ArrayList<Product> list, int low, int high) {
        if (low < high) {
            int part = partition(list, low, high);
            // left side of list
            quickSort(list, low, part - 1);
            // right side of list
            quickSort(list, part + 1, high);
        }
        return list;
    }

    public ArrayList<Product> sort(ArrayList<Product> items, int sortApproach) {
        if (sortApproach == 1) {
            System.out.println("Bubble Sort: ");
            ArrayList<Product> sorted = bubbleSort(items);
            return sorted;
        } else if (sortApproach == 2) {
            System.out.println("Quick Sort: ");
            ArrayList<Product> sorted = quickSort(items, 0, items.size() - 1);
            return sorted;
        } else {
            System.out.println("Invalid response.");
        }
        return items;
    }
}
