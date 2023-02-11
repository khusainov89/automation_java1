import java.util.Comparator;

public class PurchaseNameComparator implements Comparator <Purchase> {
    @Override
    public int compare(Purchase o1, Purchase o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
