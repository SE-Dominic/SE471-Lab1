import java.util.ArrayList;

public class SortingProxy implements SortIF{
    SortingUtility util = new SortingUtility();
    
    @Override
    public ArrayList<Product> sort(ArrayList<Product> items, int sortApproach) {
        if (sortApproach == 1) {
            return util.sort(items, 1);
        } else if (sortApproach == 2) {
            return util.sort(items, 2);
        } else {
            System.err.println("Invalid input.");
            return null;
        }
    }

    @Override
    public void log(ArrayList<Product> items,int approach) {
        ArrayList<Product> tmp = sort(items, approach);
        if(approach == 1) {
            for(Product p : tmp) {
                System.out.println("ID(" + p.getID() + "), " + p.getName() + ", $" + p.getPrice());
            }
        } else if (approach == 2) {
            for (Product p : tmp) {
                System.out.println(p.getName() + ", " + "id(" + p.getID() + ")" + ", $" + p.getPrice());
            }
        } else {
            System.out.println("Invalid input.");
        }
    }
}
