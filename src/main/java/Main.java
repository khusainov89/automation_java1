import java.util.ArrayList;
import java.util.HashSet;
import java.util.*;
import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(String.valueOf(Main.class));
    public static Scanner scanner = new Scanner(System.in);
    static boolean isRun = true;
    static List <Purchase> purchases = new ArrayList<>();
    public static <set> void main(String[] args) {

        
        Set <Purchase> purchaseHashSet = new HashSet<>();
        Set <Purchase> purchasesLinked = new LinkedHashSet<>();
        Set <Purchase> purchasesThreeSet = new TreeSet<>();
        Set <Purchase> purchaseSortedByName = new TreeSet<>(new PurchaseNameComparator());
        Set <Purchase> purchaseSortedByNumber = new TreeSet<>(new PurchaseNameComparator());

        while (isRun){
            logger.info("Enter purchase: ");
            String name = scanner.next();
            if (name.equalsIgnoreCase("stop")){
                break;
            }
            logger.info("Enter price: ");
            int number = scanner.nextInt();
            Purchase purchase = new Purchase(name, number);
            purchases.add(purchase);
            purchaseHashSet.add(purchase);
            purchasesLinked.add(purchase);
            purchasesThreeSet.add(purchase);
            purchaseSortedByName.add(purchase);
            purchaseSortedByNumber.add(purchase);
        }
        logger.info("1: " + purchaseHashSet);
        logger.info("2: " + purchasesLinked);
        logger.info("3: " + purchasesThreeSet);
        logger.info("4: " + purchaseSortedByName);
        logger.info("5: " + purchaseSortedByNumber);
    }
}
