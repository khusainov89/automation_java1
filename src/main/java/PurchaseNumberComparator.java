import java.util.Comparator;

public class PurchaseNumberComparator implements Comparator <Purchase> {
    @Override
    public int compare(Purchase o1, Purchase o2) {
        return o1.getNumber().compareTo(o2.getNumber());
    }
}
