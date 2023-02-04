package Notebook;

import org.apache.log4j.Logger;

import java.util.List;

public class Notebook {
     static Logger logger = Logger.getLogger(Enums.Main.class);

    private String model;
    private int price;
    private static int maxPrice;
    private static String modelWithMaxPrice = null;

    public Notebook(String model, int price) {
        this.model = model;
        this.price = price;
    }
    public String getModel() {
        return this.model;
    }
    public int getPrice() {
        return this.price;
    }

    public static String getMaxPrice (List <Notebook> notebooks){
        for (Notebook notebook : notebooks) {
            if (notebook.getPrice() > maxPrice) {
                modelWithMaxPrice = notebook.getModel();
            }
        }
        logger.info("Most expensive model: " + modelWithMaxPrice);
        return modelWithMaxPrice;
    }

    public static String printMacPrice (List<Notebook> notebooks){
        for (Notebook notebook : notebooks) {
            if (notebook.getModel().equalsIgnoreCase("macbook")){
                logger.info("Macbook price: " + notebook.getPrice());
            }
        }
        return null;
    }
}
